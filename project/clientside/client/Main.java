import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Path;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.NoSuchFileException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    public static String promptUser(String testDir){
        Scanner sc = new Scanner(System.in);
        String testPath = "";
        do{
            System.out.print("\nEnter the name of a query in tests: ");  
            String testName = sc.nextLine();            
            Path path = FileSystems.getDefault().getPath(testDir+testName);
            CypherLexer lexer = null;
            if(testName.isEmpty()){
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

    public static Connection h2Connect(){
        // JDBC connection parameters
        String url = "jdbc:h2:tcp://h2/h2data"; // JDBC URL
        String user = "sa"; // Default H2 user
        String password = ""; // Default H2 password
        Connection connection = null;
        try {
            // Establish a connection to the H2 database
            connection = DriverManager.getConnection(url, user, password);

            createQueryCacheTable(connection);
            // Close the connection later
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Create the table if it doesn't exist
    private static void createQueryCacheTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS query_cache (query_hash VARCHAR(256) PRIMARY KEY, response_data BLOB)";
        Statement statement = connection.createStatement();
        statement.execute(createTableSQL);
        statement.close();
    }

    // Add a new entry to the cache
    private static void addEntryToCache(Connection connection, String query, byte[] responseData) throws SQLException {
        String insertSQL = "INSERT INTO query_cache (query_hash, response_data) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, hashQuery(query));
        preparedStatement.setBytes(2, responseData);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    // Retrieve a cached response
    private static byte[] getEntryFromCache(Connection connection, String query) throws SQLException {
        String selectSQL = "SELECT response_data FROM query_cache WHERE query_hash = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setString(1, hashQuery(query));
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return resultSet.getBytes("response_data");
        }

        return null;
    }

    // Delete all from the cache
    private static void invalidateCache(Connection connection) throws SQLException {
        String deleteSQL = "DELETE FROM query_cache";
        Statement Statement = connection.createStatement();
        Statement.execute(deleteSQL);
        Statement.close();
    }

    private static String hashQuery(String query) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(query.getBytes());
            StringBuilder hash = new StringBuilder();

            // Save bytes as 2 digit hexadecimal string
            for (byte b : hashBytes) {
                hash.append(String.format("%02x", b));
            }
            return hash.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean hasWrites(String s){
        String query = s.toLowerCase();
        return query.contains("create") || query.contains("delete") || query.contains("set") || query.contains("remove") || query.contains("foreach") || query.contains("merge") || query.contains("yield");
    }
    public static void main(String[] args) throws Exception {
        Connection h2conn = h2Connect();
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
        
        // See if file content has modifications... then invalidate
        if(hasWrites(fileContent)){
            System.out.println("- Invalidating cache");
            invalidateCache(h2conn);
        }
        // Check if response is cached already...
        else{
            byte[] resp = getEntryFromCache(h2conn, fileContent);
            if(resp != null){
                System.out.println("- Cached response found");
                System.out.println("Response JSON: " + new String(resp, StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(new FileWriter("/responses/current.response"));
                writer.write(new String(resp, StandardCharsets.UTF_8));
                writer.close();        
                continue;
            }
            System.out.println("- No result cached yet");
        }

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

        // Add JSON response to a file in responses
        BufferedWriter writer = new BufferedWriter(new FileWriter("/responses/current.response"));
        writer.write(response.toString());
        writer.close();

        // Print the JSON response
        System.out.println("Response JSON: " + response.toString());
        addEntryToCache(h2conn, fileContent, response.toString().getBytes());
        }

    }
}
