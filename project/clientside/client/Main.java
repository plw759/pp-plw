import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.NoSuchFileException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.util.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static String promptUser(String testDir){
        Scanner sc = new Scanner(System.in);
        String testPath = "";
        do{
            System.out.print("\nEnter the name of a query in tests: ");  
            String str= sc.nextLine();            
            Path path = FileSystems.getDefault().getPath(testDir+str);
            CypherLexer lexer = null;
            if(str.isEmpty()){
                System.out.println("ERROR - Try Again: No Test Found"); //empty input
                continue;
            }
            try{
                lexer = new CypherLexer(CharStreams.fromPath(path));
            }catch(Exception e){
                System.out.println("ERROR - Try Again: No Test Found"); //wrong test name
                continue;
            }
            System.out.println("- File located in tests!");

            lexer.removeErrorListeners();
            lexer.addErrorListener(MyLexListener.INSTANCE);
            CommonTokenStream cts = null;
            try{
                cts = new CommonTokenStream(lexer);
            }catch(ParseCancellationException e){
                System.out.println( e.getMessage() ); //lex error
                System.out.println("ERROR - Try Again: Input Invalid");
                continue;
            }
            CypherParser parser = new CypherParser(cts);
            parser.removeErrorListeners();
            parser.addErrorListener(MyErrorListener.INSTANCE);
            ParseTree tree = null;
            try{
                tree = parser.oC_Cypher();
            }catch(ParseCancellationException a){
                System.out.println( a.getMessage()); //parse error
                System.out.println("ERROR - Try Again: Input Invalid");
                continue;
            }
            System.out.println("- Valid query");
            testPath = path.toString();
            break;
        }while(true);    
        return testPath;  

    }

    public static String readTest(String testPath){
        // Read in query as a string
        String fileContent = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(testPath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\\n");
            }

            br.close();

            fileContent = content.toString();
            System.out.println("File Content:\n" + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public static void main(String[] args) throws Exception {
        while(true){
        // Connect to server
        URL url = new URL("http://server:8080/query");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // Set the HTTP request method to POST
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        // Prompt for valid queries until one passes the lexer and parser
        String testPath = promptUser(args[0]);

        // Read in query from testPath
        String fileContent = readTest(testPath);

        // Create a JSON payload containing query
        String jsonInputString = "{\"query\": \"" + fileContent + "\"}";

        // Write the JSON query to the request body
        try (DataOutputStream out = new DataOutputStream(con.getOutputStream())) {
            out.writeBytes(jsonInputString);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
            continue;
        } 
        // Part 3: accept response from server

        // Check the response code
        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("- Connection is successful (HTTP 200 OK)");
        } else {
            System.out.println("- Connection failed with response code: " + responseCode);
            continue;
        }
        
        // Read the response content
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        // Print the JSON response
        System.out.println("Response JSON: " + response.toString());
        }

    }
}
