// Generated from code/SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangParser extends Parser {
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
		VOID=37, IMPLEMENTS=38, Ident=39, SPACE=40, Comment=41, OTHER=42;
	public static final int
		RULE_parse = 0, RULE_constDecl = 1, RULE_enumDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_interfaceDecl = 5, RULE_interfaceMethodDecl = 6, 
		RULE_methodDecl = 7, RULE_formPars = 8, RULE_type = 9, RULE_statement = 10, 
		RULE_designatorStatement = 11, RULE_actPars = 12, RULE_condition = 13, 
		RULE_condTerm = 14, RULE_condFact = 15, RULE_expr = 16, RULE_term = 17, 
		RULE_factor = 18, RULE_designator = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "constDecl", "enumDecl", "varDecl", "classDecl", "interfaceDecl", 
			"interfaceMethodDecl", "methodDecl", "formPars", "type", "statement", 
			"designatorStatement", "actPars", "condition", "condTerm", "condFact", 
			"expr", "term", "factor", "designator"
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
			"Ident", "SPACE", "Comment", "OTHER"
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

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(SimpleLangParser.PROJECT, 0); }
		public TerminalNode Ident() { return getToken(SimpleLangParser.Ident, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<InterfaceDeclContext> interfaceDecl() {
			return getRuleContexts(InterfaceDeclContext.class);
		}
		public InterfaceDeclContext interfaceDecl(int i) {
			return getRuleContext(InterfaceDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROJECT);
			setState(41);
			match(Ident);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << ENUM) | (1L << CONST) | (1L << Ident))) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(42);
					constDecl();
					}
					break;
				case ENUM:
					{
					setState(43);
					enumDecl();
					}
					break;
				case Ident:
					{
					setState(44);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(45);
					classDecl();
					}
					break;
				case INTERFACE:
					{
					setState(46);
					interfaceDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__0);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==Ident) {
				{
				{
				setState(53);
				methodDecl();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimpleLangParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public List<TerminalNode> Assignop() { return getTokens(SimpleLangParser.Assignop); }
		public TerminalNode Assignop(int i) {
			return getToken(SimpleLangParser.Assignop, i);
		}
		public List<TerminalNode> NumConst() { return getTokens(SimpleLangParser.NumConst); }
		public TerminalNode NumConst(int i) {
			return getToken(SimpleLangParser.NumConst, i);
		}
		public List<TerminalNode> BooleanConst() { return getTokens(SimpleLangParser.BooleanConst); }
		public TerminalNode BooleanConst(int i) {
			return getToken(SimpleLangParser.BooleanConst, i);
		}
		public List<TerminalNode> CharConst() { return getTokens(SimpleLangParser.CharConst); }
		public TerminalNode CharConst(int i) {
			return getToken(SimpleLangParser.CharConst, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CONST);
			setState(62);
			type();
			setState(63);
			match(Ident);
			setState(64);
			match(Assignop);
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumConst) | (1L << BooleanConst) | (1L << CharConst))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(66);
				match(Comma);
				setState(67);
				match(Ident);
				setState(68);
				match(Assignop);
				setState(69);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumConst) | (1L << BooleanConst) | (1L << CharConst))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SimpleLangParser.ENUM, 0); }
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public List<TerminalNode> Assignop() { return getTokens(SimpleLangParser.Assignop); }
		public TerminalNode Assignop(int i) {
			return getToken(SimpleLangParser.Assignop, i);
		}
		public List<TerminalNode> NumConst() { return getTokens(SimpleLangParser.NumConst); }
		public TerminalNode NumConst(int i) {
			return getToken(SimpleLangParser.NumConst, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ENUM);
			setState(78);
			match(Ident);
			setState(79);
			match(T__0);
			setState(80);
			match(Ident);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assignop) {
				{
				setState(81);
				match(Assignop);
				setState(82);
				match(NumConst);
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(85);
				match(Comma);
				setState(86);
				match(Ident);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assignop) {
					{
					setState(87);
					match(Assignop);
					setState(88);
					match(NumConst);
					}
				}

				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(Ident);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(100);
				match(T__3);
				setState(101);
				match(T__4);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(107);
				match(Comma);
				setState(108);
				match(Ident);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(109);
					match(T__3);
					setState(110);
					match(T__4);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SimpleLangParser.CLASS, 0); }
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public TerminalNode EXTENDS() { return getToken(SimpleLangParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(SimpleLangParser.IMPLEMENTS, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CLASS);
			setState(124);
			match(Ident);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(125);
				match(EXTENDS);
				setState(126);
				match(Ident);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(129);
				match(IMPLEMENTS);
				setState(130);
				match(Ident);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(131);
					match(Comma);
					setState(132);
					match(Ident);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
			match(T__0);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ident) {
				{
				{
				setState(141);
				varDecl();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(147);
				match(T__0);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOID || _la==Ident) {
					{
					{
					setState(148);
					methodDecl();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__1);
				}
			}

			setState(157);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(SimpleLangParser.INTERFACE, 0); }
		public TerminalNode Ident() { return getToken(SimpleLangParser.Ident, 0); }
		public List<InterfaceMethodDeclContext> interfaceMethodDecl() {
			return getRuleContexts(InterfaceMethodDeclContext.class);
		}
		public InterfaceMethodDeclContext interfaceMethodDecl(int i) {
			return getRuleContext(InterfaceMethodDeclContext.class,i);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(INTERFACE);
			setState(160);
			match(Ident);
			setState(161);
			match(T__0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==Ident) {
				{
				{
				setState(162);
				interfaceMethodDecl();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(SimpleLangParser.Ident, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public InterfaceMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfaceMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfaceMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfaceMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclContext interfaceMethodDecl() throws RecognitionException {
		InterfaceMethodDeclContext _localctx = new InterfaceMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceMethodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				{
				setState(170);
				type();
				}
				break;
			case VOID:
				{
				setState(171);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
			match(Ident);
			setState(175);
			match(T__5);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ident) {
				{
				setState(176);
				formPars();
				}
			}

			setState(179);
			match(T__6);
			setState(180);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(SimpleLangParser.Ident, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				{
				setState(182);
				type();
				}
				break;
			case VOID:
				{
				setState(183);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(Ident);
			setState(187);
			match(T__5);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ident) {
				{
				setState(188);
				formPars();
				}
			}

			setState(191);
			match(T__6);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ident) {
				{
				{
				setState(192);
				varDecl();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__0);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << Ident))) != 0)) {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFormPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFormPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			type();
			setState(208);
			match(Ident);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(209);
				match(T__3);
				setState(210);
				match(T__4);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(216);
				match(Comma);
				setState(217);
				type();
				setState(218);
				match(Ident);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(219);
					match(T__3);
					setState(220);
					match(T__4);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(SimpleLangParser.Ident, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<DesignatorStatementContext> designatorStatement() {
			return getRuleContexts(DesignatorStatementContext.class);
		}
		public DesignatorStatementContext designatorStatement(int i) {
			return getRuleContext(DesignatorStatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SimpleLangParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleLangParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(SimpleLangParser.FOR, 0); }
		public TerminalNode BREAK() { return getToken(SimpleLangParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SimpleLangParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(SimpleLangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(SimpleLangParser.READ, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(SimpleLangParser.PRINT, 0); }
		public TerminalNode Comma() { return getToken(SimpleLangParser.Comma, 0); }
		public TerminalNode NumConst() { return getToken(SimpleLangParser.NumConst, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				designatorStatement();
				setState(234);
				match(T__2);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(IF);
				setState(237);
				match(T__5);
				setState(238);
				condition();
				setState(239);
				match(T__6);
				setState(240);
				statement();
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(241);
					match(ELSE);
					setState(242);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(FOR);
				setState(246);
				match(T__5);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ident) {
					{
					setState(247);
					designatorStatement();
					}
				}

				setState(250);
				match(T__2);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << NumConst) | (1L << BooleanConst) | (1L << CharConst) | (1L << NEW) | (1L << Ident))) != 0)) {
					{
					setState(251);
					condition();
					}
				}

				setState(254);
				match(T__2);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ident) {
					{
					setState(255);
					designatorStatement();
					}
				}

				setState(258);
				match(T__6);
				setState(259);
				statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(BREAK);
				setState(261);
				match(T__2);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(CONTINUE);
				setState(263);
				match(T__2);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(RETURN);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << NumConst) | (1L << BooleanConst) | (1L << CharConst) | (1L << NEW) | (1L << Ident))) != 0)) {
					{
					setState(265);
					expr();
					}
				}

				setState(268);
				match(T__2);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				match(READ);
				setState(270);
				match(T__5);
				setState(271);
				designator();
				setState(272);
				match(T__6);
				setState(273);
				match(T__2);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				match(PRINT);
				setState(276);
				match(T__5);
				setState(277);
				expr();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(278);
					match(Comma);
					setState(279);
					match(NumConst);
					}
				}

				setState(282);
				match(T__6);
				setState(283);
				match(T__2);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(285);
				match(T__0);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << Ident))) != 0)) {
					{
					{
					setState(286);
					statement();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorStatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode Assignop() { return getToken(SimpleLangParser.Assignop, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Plusplus() { return getToken(SimpleLangParser.Plusplus, 0); }
		public TerminalNode Minusminus() { return getToken(SimpleLangParser.Minusminus, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorStatementContext designatorStatement() throws RecognitionException {
		DesignatorStatementContext _localctx = new DesignatorStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_designatorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			designator();
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assignop:
				{
				setState(296);
				match(Assignop);
				setState(297);
				expr();
				}
				break;
			case T__5:
				{
				setState(298);
				match(T__5);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << NumConst) | (1L << BooleanConst) | (1L << CharConst) | (1L << NEW) | (1L << Ident))) != 0)) {
					{
					setState(299);
					actPars();
					}
				}

				setState(302);
				match(T__6);
				}
				break;
			case Plusplus:
				{
				setState(303);
				match(Plusplus);
				}
				break;
			case Minusminus:
				{
				setState(304);
				match(Minusminus);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitActPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitActPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expr();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(308);
				match(Comma);
				setState(309);
				expr();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> Logicalor() { return getTokens(SimpleLangParser.Logicalor); }
		public TerminalNode Logicalor(int i) {
			return getToken(SimpleLangParser.Logicalor, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			condTerm();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Logicalor) {
				{
				{
				setState(316);
				match(Logicalor);
				setState(317);
				condTerm();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondTermContext extends ParserRuleContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> Logicaland() { return getTokens(SimpleLangParser.Logicaland); }
		public TerminalNode Logicaland(int i) {
			return getToken(SimpleLangParser.Logicaland, i);
		}
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			condFact();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Logicaland) {
				{
				{
				setState(324);
				match(Logicaland);
				setState(325);
				condFact();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondFactContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Relop() { return getToken(SimpleLangParser.Relop, 0); }
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condFact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			expr();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Relop) {
				{
				setState(332);
				match(Relop);
				setState(333);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> Addop() { return getTokens(SimpleLangParser.Addop); }
		public TerminalNode Addop(int i) {
			return getToken(SimpleLangParser.Addop, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(336);
				match(T__7);
				}
			}

			setState(339);
			term();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Addop) {
				{
				{
				setState(340);
				match(Addop);
				setState(341);
				term();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> Mulop() { return getTokens(SimpleLangParser.Mulop); }
		public TerminalNode Mulop(int i) {
			return getToken(SimpleLangParser.Mulop, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			factor();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Mulop) {
				{
				{
				setState(348);
				match(Mulop);
				setState(349);
				factor();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode NumConst() { return getToken(SimpleLangParser.NumConst, 0); }
		public TerminalNode CharConst() { return getToken(SimpleLangParser.CharConst, 0); }
		public TerminalNode BooleanConst() { return getToken(SimpleLangParser.BooleanConst, 0); }
		public TerminalNode NEW() { return getToken(SimpleLangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				designator();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(356);
					match(T__5);
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << NumConst) | (1L << BooleanConst) | (1L << CharConst) | (1L << NEW) | (1L << Ident))) != 0)) {
						{
						setState(357);
						actPars();
						}
					}

					setState(360);
					match(T__6);
					}
				}

				}
				break;
			case NumConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(NumConst);
				}
				break;
			case CharConst:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(CharConst);
				}
				break;
			case BooleanConst:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				match(BooleanConst);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				match(NEW);
				setState(367);
				type();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(368);
					match(T__3);
					setState(369);
					expr();
					setState(370);
					match(T__4);
					}
				}

				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(T__5);
				setState(375);
				expr();
				setState(376);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(SimpleLangParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(SimpleLangParser.Ident, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(Ident);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__8) {
				{
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(381);
					match(T__8);
					setState(382);
					match(Ident);
					}
					break;
				case T__3:
					{
					setState(383);
					match(T__3);
					setState(384);
					expr();
					setState(385);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\3\4\5\4\\\n\4\7\4^\n\4\f\4\16\4a\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\5\3\5\7\5r"+
		"\n\5\f\5\16\5u\13\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5"+
		"\6\u0082\n\6\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\5\6\u008d"+
		"\n\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6\7\6\u0098\n\6\f"+
		"\6\16\6\u009b\13\6\3\6\5\6\u009e\n\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00a6"+
		"\n\7\f\7\16\7\u00a9\13\7\3\7\3\7\3\b\3\b\5\b\u00af\n\b\3\b\3\b\3\b\5\b"+
		"\u00b4\n\b\3\b\3\b\3\b\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\t\5\t\u00c0\n\t"+
		"\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\t\3\t\7\t\u00cb\n\t\f\t\16"+
		"\t\u00ce\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e0\n\n\f\n\16\n\u00e3\13\n\7\n\u00e5\n\n"+
		"\f\n\16\n\u00e8\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f6\n\f\3\f\3\f\3\f\5\f\u00fb\n\f\3\f\3\f\5\f\u00ff\n\f\3\f\3\f"+
		"\5\f\u0103\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011b\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u0122\n\f\f\f\16\f\u0125\13\f\3\f\5\f\u0128\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u012f\n\r\3\r\3\r\3\r\5\r\u0134\n\r\3\16\3\16\3\16\7\16\u0139"+
		"\n\16\f\16\16\16\u013c\13\16\3\17\3\17\3\17\7\17\u0141\n\17\f\17\16\17"+
		"\u0144\13\17\3\20\3\20\3\20\7\20\u0149\n\20\f\20\16\20\u014c\13\20\3\21"+
		"\3\21\3\21\5\21\u0151\n\21\3\22\5\22\u0154\n\22\3\22\3\22\3\22\7\22\u0159"+
		"\n\22\f\22\16\22\u015c\13\22\3\23\3\23\3\23\7\23\u0161\n\23\f\23\16\23"+
		"\u0164\13\23\3\24\3\24\3\24\5\24\u0169\n\24\3\24\5\24\u016c\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0177\n\24\3\24\3\24\3\24"+
		"\3\24\5\24\u017d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0186\n"+
		"\25\f\25\16\25\u0189\13\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\3\3\2\25\27\2\u01b7\2*\3\2\2\2\4?\3\2\2\2\6O\3\2\2\2\b"+
		"d\3\2\2\2\n}\3\2\2\2\f\u00a1\3\2\2\2\16\u00ae\3\2\2\2\20\u00ba\3\2\2\2"+
		"\22\u00d1\3\2\2\2\24\u00e9\3\2\2\2\26\u0127\3\2\2\2\30\u0129\3\2\2\2\32"+
		"\u0135\3\2\2\2\34\u013d\3\2\2\2\36\u0145\3\2\2\2 \u014d\3\2\2\2\"\u0153"+
		"\3\2\2\2$\u015d\3\2\2\2&\u017c\3\2\2\2(\u017e\3\2\2\2*+\7\30\2\2+\63\7"+
		")\2\2,\62\5\4\3\2-\62\5\6\4\2.\62\5\b\5\2/\62\5\n\6\2\60\62\5\f\7\2\61"+
		",\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7\3\2"+
		"\2\679\5\20\t\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:"+
		"\3\2\2\2=>\7\4\2\2>\3\3\2\2\2?@\7\36\2\2@A\5\24\13\2AB\7)\2\2BC\7\21\2"+
		"\2CJ\t\2\2\2DE\7\f\2\2EF\7)\2\2FG\7\21\2\2GI\t\2\2\2HD\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\5\2\2N\5\3\2\2\2OP\7\34"+
		"\2\2PQ\7)\2\2QR\7\3\2\2RU\7)\2\2ST\7\21\2\2TV\7\25\2\2US\3\2\2\2UV\3\2"+
		"\2\2V_\3\2\2\2WX\7\f\2\2X[\7)\2\2YZ\7\21\2\2Z\\\7\25\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2]W\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"a_\3\2\2\2bc\7\4\2\2c\7\3\2\2\2de\5\24\13\2ej\7)\2\2fg\7\6\2\2gi\7\7\2"+
		"\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kx\3\2\2\2lj\3\2\2\2mn\7\f\2"+
		"\2ns\7)\2\2op\7\6\2\2pr\7\7\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2vm\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\7\5\2\2|\t\3\2\2\2}~\7\32\2\2~\u0081\7)\2\2\177\u0080\7"+
		"%\2\2\u0080\u0082\7)\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008c"+
		"\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0089\7)\2\2\u0085\u0086\7\f\2\2\u0086"+
		"\u0088\7)\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\7\3"+
		"\2\2\u008f\u0091\5\b\5\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009d\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0099\7\3\2\2\u0096\u0098\5\20\t\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\4\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\13\3\2\2"+
		"\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a7\7\3\2\2\u00a4\u00a6"+
		"\5\16\b\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab"+
		"\7\4\2\2\u00ab\r\3\2\2\2\u00ac\u00af\5\24\13\2\u00ad\u00af\7\'\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7)"+
		"\2\2\u00b1\u00b3\7\b\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\7\5"+
		"\2\2\u00b7\17\3\2\2\2\u00b8\u00bb\5\24\13\2\u00b9\u00bb\7\'\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7)"+
		"\2\2\u00bd\u00bf\7\b\2\2\u00be\u00c0\5\22\n\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\7\t\2\2\u00c2\u00c4\5\b"+
		"\5\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cc\7\3"+
		"\2\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\4\2\2\u00d0\21\3\2\2\2\u00d1\u00d2\5\24\13\2\u00d2"+
		"\u00d7\7)\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d6\7\7\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00e6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\5\24"+
		"\13\2\u00dc\u00e1\7)\2\2\u00dd\u00de\7\6\2\2\u00de\u00e0\7\7\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00da\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\23\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\25\3\2\2\2\u00eb\u00ec"+
		"\5\30\r\2\u00ec\u00ed\7\5\2\2\u00ed\u0128\3\2\2\2\u00ee\u00ef\7\37\2\2"+
		"\u00ef\u00f0\7\b\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\t\2\2\u00f2\u00f5"+
		"\5\26\f\2\u00f3\u00f4\7\35\2\2\u00f4\u00f6\5\26\f\2\u00f5\u00f3\3\2\2"+
		"\2\u00f5\u00f6\3\2\2\2\u00f6\u0128\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8\u00fa"+
		"\7\b\2\2\u00f9\u00fb\5\30\r\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7\5\2\2\u00fd\u00ff\5\34\17\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7\5\2\2\u0101"+
		"\u0103\5\30\r\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0105\7\t\2\2\u0105\u0128\5\26\f\2\u0106\u0107\7\31\2\2\u0107"+
		"\u0128\7\5\2\2\u0108\u0109\7&\2\2\u0109\u0128\7\5\2\2\u010a\u010c\7#\2"+
		"\2\u010b\u010d\5\"\22\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0128\7\5\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7\b"+
		"\2\2\u0111\u0112\5(\25\2\u0112\u0113\7\t\2\2\u0113\u0114\7\5\2\2\u0114"+
		"\u0128\3\2\2\2\u0115\u0116\7!\2\2\u0116\u0117\7\b\2\2\u0117\u011a\5\""+
		"\22\2\u0118\u0119\7\f\2\2\u0119\u011b\7\25\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\t\2\2\u011d\u011e\7\5"+
		"\2\2\u011e\u0128\3\2\2\2\u011f\u0123\7\3\2\2\u0120\u0122\5\26\f\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\7\4\2\2\u0127"+
		"\u00eb\3\2\2\2\u0127\u00ee\3\2\2\2\u0127\u00f7\3\2\2\2\u0127\u0106\3\2"+
		"\2\2\u0127\u0108\3\2\2\2\u0127\u010a\3\2\2\2\u0127\u010f\3\2\2\2\u0127"+
		"\u0115\3\2\2\2\u0127\u011f\3\2\2\2\u0128\27\3\2\2\2\u0129\u0133\5(\25"+
		"\2\u012a\u012b\7\21\2\2\u012b\u0134\5\"\22\2\u012c\u012e\7\b\2\2\u012d"+
		"\u012f\5\32\16\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0134\7\t\2\2\u0131\u0134\7\r\2\2\u0132\u0134\7\16\2\2\u0133"+
		"\u012a\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\31\3\2\2\2\u0135\u013a\5\"\22\2\u0136\u0137\7\f\2\2\u0137\u0139"+
		"\5\"\22\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\33\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0142"+
		"\5\36\20\2\u013e\u013f\7\17\2\2\u013f\u0141\5\36\20\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\35\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u014a\5 \21\2\u0146\u0147\7\20\2"+
		"\2\u0147\u0149\5 \21\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\37\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u0150\5\"\22\2\u014e\u014f\7\22\2\2\u014f\u0151\5\"\22\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151!\3\2\2\2\u0152\u0154\7\n\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015a\5$"+
		"\23\2\u0156\u0157\7\23\2\2\u0157\u0159\5$\23\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b#\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015d\u0162\5&\24\2\u015e\u015f\7\24\2\2\u015f\u0161"+
		"\5&\24\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163%\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016b\5(\25\2"+
		"\u0166\u0168\7\b\2\2\u0167\u0169\5\32\16\2\u0168\u0167\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\7\t\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u017d\3\2\2\2\u016d\u017d\7\25\2\2\u016e\u017d\7"+
		"\27\2\2\u016f\u017d\7\26\2\2\u0170\u0171\7 \2\2\u0171\u0176\5\24\13\2"+
		"\u0172\u0173\7\6\2\2\u0173\u0174\5\"\22\2\u0174\u0175\7\7\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017d\3\2\2\2\u0178"+
		"\u0179\7\b\2\2\u0179\u017a\5\"\22\2\u017a\u017b\7\t\2\2\u017b\u017d\3"+
		"\2\2\2\u017c\u0165\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u016e\3\2\2\2\u017c"+
		"\u016f\3\2\2\2\u017c\u0170\3\2\2\2\u017c\u0178\3\2\2\2\u017d\'\3\2\2\2"+
		"\u017e\u0187\7)\2\2\u017f\u0180\7\13\2\2\u0180\u0186\7)\2\2\u0181\u0182"+
		"\7\6\2\2\u0182\u0183\5\"\22\2\u0183\u0184\7\7\2\2\u0184\u0186\3\2\2\2"+
		"\u0185\u017f\3\2\2\2\u0185\u0181\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188)\3\2\2\2\u0189\u0187\3\2\2\2\63\61"+
		"\63:JU[_jsx\u0081\u0089\u008c\u0092\u0099\u009d\u00a7\u00ae\u00b3\u00ba"+
		"\u00bf\u00c5\u00cc\u00d7\u00e1\u00e6\u00f5\u00fa\u00fe\u0102\u010c\u011a"+
		"\u0123\u0127\u012e\u0133\u013a\u0142\u014a\u0150\u0153\u015a\u0162\u0168"+
		"\u016b\u0176\u017c\u0185\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}