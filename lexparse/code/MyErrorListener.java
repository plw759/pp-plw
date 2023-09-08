import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class MyErrorListener extends BaseErrorListener {

    public static final MyErrorListener INSTANCE = new MyErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new ParseCancellationException("PARSE ERROR");
    }
}