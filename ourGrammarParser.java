// Generated from ourGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, SYMBOLS=9, 
		NUM=10, NL=11, WS=12;
	public static final int
		RULE_start = 0, RULE_option = 1, RULE_workspace = 2, RULE_application = 3, 
		RULE_value = 4, RULE_nl = 5;
	public static final String[] ruleNames = {
		"start", "option", "workspace", "application", "value", "nl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings[\n'", "']\n'", "'='", "'workspace'", "'[\n'", "'{'", 
		"'}'", null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "SYMBOLS", "NUM", 
		"NL", "WS"
	};
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
	public String getGrammarFileName() { return "ourGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ourGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<WorkspaceContext> workspace() {
			return getRuleContexts(WorkspaceContext.class);
		}
		public WorkspaceContext workspace(int i) {
			return getRuleContext(WorkspaceContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				option();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(18);
			match(T__1);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				workspace();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ID);
			setState(25);
			match(T__2);
			setState(26);
			value();
			setState(27);
			match(NL);
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

	public static class WorkspaceContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ourGrammarParser.NUM, 0); }
		public List<ApplicationContext> application() {
			return getRuleContexts(ApplicationContext.class);
		}
		public ApplicationContext application(int i) {
			return getRuleContext(ApplicationContext.class,i);
		}
		public WorkspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterWorkspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitWorkspace(this);
		}
	}

	public final WorkspaceContext workspace() throws RecognitionException {
		WorkspaceContext _localctx = new WorkspaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_workspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__3);
			setState(30);
			match(NUM);
			setState(31);
			match(T__4);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				application();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(37);
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

	public static class ApplicationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourGrammarParser.ID, 0); }
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitApplication(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			nl();
			setState(41);
			match(T__5);
			setState(42);
			nl();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				option();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(48);
			nl();
			setState(49);
			match(T__6);
			setState(50);
			nl();
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ourGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ourGrammarParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ourGrammarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ourGrammarParser.NUM, i);
		}
		public List<TerminalNode> SYMBOLS() { return getTokens(ourGrammarParser.SYMBOLS); }
		public TerminalNode SYMBOLS(int i) {
			return getToken(ourGrammarParser.SYMBOLS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SYMBOLS) | (1L << NUM))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << SYMBOLS) | (1L << NUM))) != 0) );
				}
				break;
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

	public static class NlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ourGrammarParser.NL, 0); }
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitNl(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nl);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(NL);
				}
				break;
			case T__1:
			case T__5:
			case T__6:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\6\2\27\n\2\r\2\16\2\30\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4$\n"+
		"\4\r\4\16\4%\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\6\6:\n\6\r\6\16\6;\5\6>\n\6\3\7\3\7\5\7B\n\7\3\7"+
		"\2\2\b\2\4\6\b\n\f\2\3\3\2\n\fE\2\16\3\2\2\2\4\32\3\2\2\2\6\37\3\2\2\2"+
		"\b)\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2\16\20\7\3\2\2\17\21\5\4\3\2\20\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2\24\26\7"+
		"\4\2\2\25\27\5\6\4\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\3\3\2\2\2\32\33\7\n\2\2\33\34\7\5\2\2\34\35\5\n\6\2\35\36\7"+
		"\r\2\2\36\5\3\2\2\2\37 \7\6\2\2 !\7\f\2\2!#\7\7\2\2\"$\5\b\5\2#\"\3\2"+
		"\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\4\2\2(\7\3\2\2\2)*"+
		"\7\n\2\2*+\5\f\7\2+,\7\b\2\2,.\5\f\7\2-/\5\4\3\2.-\3\2\2\2/\60\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5\f\7\2\63\64\7\t\2\2\64"+
		"\65\5\f\7\2\65\t\3\2\2\2\66>\7\n\2\2\67>\7\f\2\28:\t\2\2\298\3\2\2\2:"+
		";\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=9\3\2"+
		"\2\2>\13\3\2\2\2?B\7\r\2\2@B\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\r\3\2\2\2\t"+
		"\22\30%\60;=A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
