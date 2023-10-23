package main

import (
    "fmt"
    "net/http"
    "io/ioutil"
	"encoding/json"
    "os"
    "github.com/neo4j/neo4j-go-driver/v5/neo4j"
    "context"
)

func getRoot(w http.ResponseWriter, r *http.Request) {
    fmt.Println("Received Empty Request!")
    fmt.Fprintln(w, "Empty Request!")
}

func queryHandler(w http.ResponseWriter, r *http.Request) {
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

    //Execute query
    jsonResponse, err := queryDatabase(cypherQuery)
	if err != nil {
		w.WriteHeader(http.StatusInternalServerError)
        w.Write([]byte("Database threw an error"))
		return
	}

    // Part 3, receive response from database and send it back to client
    w.Header().Set("Content-Type", "application/json")
    w.Write(jsonResponse)
    
}

// from neo4j documentation
func queryDatabase(query string) ([]byte, error){
    dbUri := "bolt://neo:7687"
    driver, err := neo4j.NewDriverWithContext(dbUri, neo4j.BasicAuth("neo4j", "asdfg123", ""))
    if err != nil {
        fmt.Println(err)
        return nil, err
    }
    ctx := context.Background()
    defer driver.Close(ctx) 
    result, err := executeQuery(query, ctx, driver)
    if err != nil {
        fmt.Println(err)
        return nil, err
    }

    // Create a slice to store the results
    var results []map[string]interface{}

    for _, record := range result.Records {
        recordMap := make(map[string]interface{})
        for i, key := range result.Keys {
            recordMap[key] = record.Values[i]
        }
        results = append(results, recordMap)
    }

    // Convert the results to JSON
    jsonData, err := json.Marshal(results)
    if err != nil {
        panic(err)
    }

    // Summary information
    fmt.Printf("\nThe query \n`%v` \nreturned %v records in %+v.\nAwaiting next query.\n",
        result.Summary.Query().Text(), len(result.Records),
        result.Summary.ResultAvailableAfter())

    return jsonData, nil
}

// from neo4j documentation
func executeQuery(query string, ctx context.Context, driver neo4j.DriverWithContext) (*neo4j.EagerResult, error) {
    result, err := neo4j.ExecuteQuery(ctx, driver,
        query, nil, neo4j.EagerResultTransformer)
    if err != nil {
        return nil, err
    }
    return result, nil
}

func main() {
    http.HandleFunc("/", getRoot)
    http.HandleFunc("/query", queryHandler)
    fmt.Println("Server is running on port 8080")
    err := http.ListenAndServe("0.0.0.0:8080", nil)
    if err != nil {
		fmt.Printf("error starting server: %s\n", err)
		os.Exit(1)
	}

}
