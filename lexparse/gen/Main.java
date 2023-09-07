import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import org.antlr.v4.runtime.tree.*;
public class Main {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 14; i ++){
        System.out.println(i + ".prog");
        
        Path path = FileSystems.getDefault().getPath("../tests/"+i+".prog");
        SimpleLangLexer lexer = new SimpleLangLexer(CharStreams.fromPath(path));

        SimpleLangParser parser = new SimpleLangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();

        // System.out.println("Entry Errors:");
        SimpleLangVisitor visitor = new EntryVisitor();
        visitor.visit(tree);

        // System.out.println("Var Errors:");
        SimpleLangListener listener = new VarListener();
        walker.walk(listener,tree);

        // System.out.println("Name Use Errors:");
        NameUseListener listener2 = new NameUseListener();
        walker.walk(listener2, tree);
        }
    }
}
