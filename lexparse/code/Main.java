import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
public class Main {

    public static void main(String[] args) throws Exception {
    for (int i = 1; i < 15; i ++){
        System.out.println(i + ".prog");
        
        Path path = FileSystems.getDefault().getPath("../tests/"+i+".prog");
        SimpleLangLexer lexer = new SimpleLangLexer(CharStreams.fromPath(path));
        lexer.removeErrorListeners();
        lexer.addErrorListener(MyLexListener.INSTANCE);
        CommonTokenStream cts = null;

        try{
            cts = new CommonTokenStream(lexer);
        }catch(ParseCancellationException e){
            System.out.println( e.getMessage() ); //lex error
            continue;
        }

        SimpleLangParser parser = new SimpleLangParser(cts);
        parser.removeErrorListeners();
        parser.addErrorListener(MyErrorListener.INSTANCE);

        ParseTree tree = null;
        
        try{
            tree = parser.parse();
            
        }catch(ParseCancellationException a){
            System.out.println( a.getMessage()); //parse error
            continue;
        }

        EntryVisitor visitor = new EntryVisitor();
        visitor.visit(tree);

        ParseTreeWalker walker = new ParseTreeWalker();

        VarListener listener = new VarListener();
        walker.walk(listener,tree);
        NameUseListener listener2 = new NameUseListener();
        walker.walk(listener2, tree);
        }
    }
}
