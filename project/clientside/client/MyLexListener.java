import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class MyLexListener extends BaseErrorListener {

    public static final MyLexListener INSTANCE = new MyLexListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new ParseCancellationException("Lex Error at line " + line + ", pos " + charPositionInLine + "\n "+msg);
    }
}