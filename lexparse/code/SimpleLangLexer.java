// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Comma=10, Plusplus=11, Minusminus=12, Logicalor=13, Logicaland=14, Assignop=15, 
		Relop=16, Addop=17, Mulop=18, NumConst=19, BooleanConst=20, CharConst=21, 
		PROJECT=22, BREAK=23, CLASS=24, INTERFACE=25, ENUM=26, ELSE=27, CONST=28, 
		IF=29, NEW=30, PRINT=31, READ=32, RETURN=33, FOR=34, EXTENDS=35, CONTINUE=36, 
		VOID=37, IMPLEMENTS=38, Ident=39, SPACE=40, Comment=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Comma", "Plusplus", "Minusminus", "Logicalor", "Logicaland", "Assignop", 
			"Relop", "Addop", "Mulop", "NumConst", "BooleanConst", "CharConst", "PROJECT", 
			"BREAK", "CLASS", "INTERFACE", "ENUM", "ELSE", "CONST", "IF", "NEW", 
			"PRINT", "READ", "RETURN", "FOR", "EXTENDS", "CONTINUE", "VOID", "IMPLEMENTS", 
			"Ident", "SPACE", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'['", "']'", "'('", "')'", "'-'", "'.'", 
			"','", "'++'", "'--'", "'||'", "'&&'", "'='", null, null, null, null, 
			null, null, "'project'", "'break'", "'class'", "'interface'", "'enum'", 
			"'else'", "'const'", "'if'", "'new'", "'print'", "'read'", "'return'", 
			"'for'", "'extends'", "'continue'", "'void'", "'implements'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Comma", 
			"Plusplus", "Minusminus", "Logicalor", "Logicaland", "Assignop", "Relop", 
			"Addop", "Mulop", "NumConst", "BooleanConst", "CharConst", "PROJECT", 
			"BREAK", "CLASS", "INTERFACE", "ENUM", "ELSE", "CONST", "IF", "NEW", 
			"PRINT", "READ", "RETURN", "FOR", "EXTENDS", "CONTINUE", "VOID", "IMPLEMENTS", 
			"Ident", "SPACE", "Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0082\n\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\7\24\u008a\n\24\f\24\16\24\u008d\13\24\3\24"+
		"\5\24\u0090\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009b"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u010f"+
		"\n(\f(\16(\u0112\13(\3)\6)\u0115\n)\r)\16)\u0116\3)\3)\3*\3*\3*\3*\7*"+
		"\u011f\n*\f*\16*\u0122\13*\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\f\4"+
		"\2--//\5\2\'\',,\61\61\3\2\63;\3\2\62;\3\2\62\62\4\2\13\f\17\17\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u012f\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5"+
		"W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21"+
		"c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2"+
		"\35r\3\2\2\2\37u\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2\2"+
		"\'\u008f\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u00a0\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00ae\3\2\2\2\63\u00b4\3\2\2\2\65\u00be\3\2\2\2\67\u00c3\3\2"+
		"\2\29\u00c8\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2?\u00d5\3\2\2\2A\u00db"+
		"\3\2\2\2C\u00e0\3\2\2\2E\u00e7\3\2\2\2G\u00eb\3\2\2\2I\u00f3\3\2\2\2K"+
		"\u00fc\3\2\2\2M\u0101\3\2\2\2O\u010c\3\2\2\2Q\u0114\3\2\2\2S\u011a\3\2"+
		"\2\2UV\7}\2\2V\4\3\2\2\2WX\7\177\2\2X\6\3\2\2\2YZ\7=\2\2Z\b\3\2\2\2[\\"+
		"\7]\2\2\\\n\3\2\2\2]^\7_\2\2^\f\3\2\2\2_`\7*\2\2`\16\3\2\2\2ab\7+\2\2"+
		"b\20\3\2\2\2cd\7/\2\2d\22\3\2\2\2ef\7\60\2\2f\24\3\2\2\2gh\7.\2\2h\26"+
		"\3\2\2\2ij\7-\2\2jk\7-\2\2k\30\3\2\2\2lm\7/\2\2mn\7/\2\2n\32\3\2\2\2o"+
		"p\7~\2\2pq\7~\2\2q\34\3\2\2\2rs\7(\2\2st\7(\2\2t\36\3\2\2\2uv\7?\2\2v"+
		" \3\2\2\2wx\7?\2\2x\u0082\7?\2\2yz\7#\2\2z\u0082\7?\2\2{\u0082\7@\2\2"+
		"|}\7@\2\2}\u0082\7?\2\2~\u0082\7>\2\2\177\u0080\7>\2\2\u0080\u0082\7?"+
		"\2\2\u0081w\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0082\"\3\2\2\2\u0083\u0084\t\2\2\2\u0084"+
		"$\3\2\2\2\u0085\u0086\t\3\2\2\u0086&\3\2\2\2\u0087\u008b\t\4\2\2\u0088"+
		"\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\t\6\2\2\u008f\u0087\3\2\2\2\u008f\u008e\3\2\2\2\u0090(\3\2\2\2"+
		"\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u009b"+
		"\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009b\7g\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2\2"+
		"\2\u009b*\3\2\2\2\u009c\u009d\7)\2\2\u009d\u009e\n\7\2\2\u009e\u009f\7"+
		")\2\2\u009f,\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7l\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7e\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7m\2\2\u00ad\60\3\2\2\2\u00ae"+
		"\u00af\7e\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7"+
		"p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\64\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7w\2\2\u00c1"+
		"\u00c2\7o\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c78\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd:\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7h\2\2\u00d0<\3\2\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7y\2\2\u00d4>\3\2\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\u00da\7v\2\2\u00da@\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7g\2"+
		"\2\u00dd\u00de\7c\2\2\u00de\u00df\7f\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7t\2\2\u00e5\u00e6\7p\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\u00ea\7t\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7z\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7f\2\2\u00f1\u00f2\7u\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7g\2\2\u00fbJ\3\2\2"+
		"\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100"+
		"\7f\2\2\u0100L\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7o\2\2\u0103\u0104"+
		"\7r\2\2\u0104\u0105\7n\2\2\u0105\u0106\7g\2\2\u0106\u0107\7o\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b\7u\2\2"+
		"\u010bN\3\2\2\2\u010c\u0110\t\b\2\2\u010d\u010f\t\t\2\2\u010e\u010d\3"+
		"\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"P\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\t\n\2\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\b)\2\2\u0119R\3\2\2\2\u011a\u011b\7\61\2\2\u011b"+
		"\u011c\7\61\2\2\u011c\u0120\3\2\2\2\u011d\u011f\n\13\2\2\u011e\u011d\3"+
		"\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b*\2\2\u0124T\3\2\2\2\n"+
		"\2\u0081\u008b\u008f\u009a\u0110\u0116\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}