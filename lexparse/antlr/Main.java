import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath("test.mu");
        SimpleLexer lexer = new SimpleLexer(CharStreams.fromPath(path));
        SimpleParser parser = new SimpleParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();

        SimpleVisitor visitor = new SimpleBaseVisitor();
        visitor.visit(tree);

        // SimpleVisitor visitor2 = new SimpleBaseNew();
        // visitor.visit(tree);
    }
}
