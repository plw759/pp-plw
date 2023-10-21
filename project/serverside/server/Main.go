package main

import (
    "fmt"
    "net/http"
    "io/ioutil"
	"encoding/json"
	"bytes"
    "os"
)

func queryHandler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintln(w, "Request received!", r.Body)

    // Check if the request method is POST
    if r.Method != http.MethodPost {
        w.WriteHeader(http.StatusMethodNotAllowed)
        return
    }

    // Read the request body
    body, err := ioutil.ReadAll(r.Body)
    if err != nil {
        w.WriteHeader(http.StatusInternalServerError)
        w.Write([]byte("Error reading request body"))
        return
    }

    // Parse the JSON request
    var query map[string]string
    if err := json.Unmarshal(body, &query); err != nil {
        w.WriteHeader(http.StatusBadRequest)
        w.Write([]byte("Invalid JSON request"))
        return
    }

    // Extract the query from the JSON
    cypherQuery, ok := query["query"]
    if !ok {
        w.WriteHeader(http.StatusBadRequest)
        w.Write([]byte("Missing 'query' in JSON request"))
        return
    }

    // You can now process the cypherQuery as needed and execute it with Neo4j
	fmt.Println("Query received: ",cypherQuery)
	jsonResponse, err := queryDatabase(cypherQuery)
	if err != nil {
		w.WriteHeader(http.StatusInternalServerError)
        w.Write([]byte("Database threw an error"))
		return
	}
	fmt.Println("Response from Neo4j: ", jsonResponse)

    // Part 3, receive response from database and send it back to client
}

func queryDatabase(query string) ([]byte, error){
    fmt.Println("Now querying neo4j")
	neo4jURL := "http://localhost:7474" // "or 7687 for bolt protocol"

	requestBody := []byte(fmt.Sprintf(`{"statements": [{"statement": "%s"}]}`, query))

	response, err := http.Post(neo4jURL, "application/json", bytes.NewBuffer(requestBody))
	if err != nil{
		return nil, err
	}
	defer response.Body.Close()

	responseBytes, err := ioutil.ReadAll(response.Body)
	if err != nil {
		return nil, err
	}

	return responseBytes, nil
}

func getRoot(w http.ResponseWriter, r *http.Request) {
    fmt.Fprintln(w, "Empty Request!")

}

func main() {
    http.HandleFunc("/", getRoot)
    http.HandleFunc("/query", queryHandler)
    port := 8080
    fmt.Printf("Server is running on port %d\n", port)
    err := http.ListenAndServe(fmt.Sprintf(":%d", port), nil)
    if err != nil {
		fmt.Printf("error starting server: %s\n", err)
		os.Exit(1)
	}

}
