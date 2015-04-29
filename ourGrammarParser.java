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
		NUM=10, WS=11;
	public static final int
		RULE_start = 0, RULE_option = 1, RULE_workspace = 2, RULE_application = 3, 
		RULE_appoption = 4, RULE_value = 5;
	public static final String[] ruleNames = {
		"start", "option", "workspace", "application", "appoption", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings'", "'['", "']'", "'='", "'workspace'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "SYMBOLS", "NUM", 
		"WS"
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
			setState(13);
			match(T__1);
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				option();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(19);
			match(T__2);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				workspace();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
			setState(25);
			match(ID);
			setState(26);
			match(T__3);
			setState(27);
			value();
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
			match(T__4);
			setState(30);
			match(NUM);
			setState(31);
			match(T__1);
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

	public static class ApplicationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourGrammarParser.ID, 0); }
		public List<AppoptionContext> appoption() {
			return getRuleContexts(AppoptionContext.class);
		}
		public AppoptionContext appoption(int i) {
			return getRuleContext(AppoptionContext.class,i);
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
			match(T__5);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				appoption();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(46);
			match(T__6);
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

	public static class AppoptionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AppoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).enterAppoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourGrammarListener ) ((ourGrammarListener)listener).exitAppoption(this);
		}
	}

	public final AppoptionContext appoption() throws RecognitionException {
		AppoptionContext _localctx = new AppoptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_appoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(T__3);
			setState(50);
			value();
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
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			int _alt;
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
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
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
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4$\n"+
		"\4\r\4\16\4%\3\4\3\4\3\5\3\5\3\5\6\5-\n\5\r\5\16\5.\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\6\7:\n\7\r\7\16\7;\5\7>\n\7\3\7\2\2\b\2\4\6\b\n\f\2"+
		"\3\3\2\n\f@\2\16\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b)\3\2\2\2\n\62\3\2"+
		"\2\2\f=\3\2\2\2\16\17\7\3\2\2\17\21\7\4\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\27\7\5\2"+
		"\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\3\3\2\2\2\33\34\7\n\2\2\34\35\7\6\2\2\35\36\5\f\7\2\36\5\3\2\2\2"+
		"\37 \7\7\2\2 !\7\f\2\2!#\7\4\2\2\"$\5\b\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\5\2\2(\7\3\2\2\2)*\7\n\2\2*,\7\b\2\2+-"+
		"\5\n\6\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\t"+
		"\2\2\61\t\3\2\2\2\62\63\7\n\2\2\63\64\7\6\2\2\64\65\5\f\7\2\65\13\3\2"+
		"\2\2\66>\7\n\2\2\67>\7\f\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<>\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=9\3\2\2\2>\r\3\2\2\2\b\23"+
		"\31%.;=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}