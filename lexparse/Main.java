import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath("../tests/0.prog");
        SimpleLangLexer lexer = new SimpleLangLexer(CharStreams.fromPath(path));
        
        SimpleLangParser parser = null;
        ParseTree tree = null;
        try {
            parser = new SimpleLangParser(new CommonTokenStream(lexer));
            tree = parser.parse();
        }catch(Exception e){
            System.out.println("PARSER ERROR");
        }

        System.out.println("Entry Errors:");
        SimpleLangVisitor visitor = new EntryVisitor();
        visitor.visit(tree);

        System.out.println("Name Use Errors:");
        SimpleLangVisitor visitor2 = new NameUseVisitor();
        visitor2.visit(tree);
    }
}
