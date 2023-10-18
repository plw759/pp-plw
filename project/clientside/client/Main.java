import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.NoSuchFileException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String testDir = args[0];
        Scanner sc = new Scanner(System.in);
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
            }catch(NoSuchFileException e){
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
            System.out.println("- Valid query:");
            System.out.println(CharStreams.fromPath(path));
            break;
        }while(true);      


    }
}
