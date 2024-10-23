// Generated from /Users/jiwonjeong/Documents/TheLittlePrince/src/main/java/PlanetaryGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PlanetaryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		STRING=18, DATE=19, WS=20;
	public static final int
		RULE_query = 0, RULE_whereClause = 1, RULE_logicalOp = 2, RULE_condition = 3, 
		RULE_field = 4, RULE_operator = 5, RULE_value = 6, RULE_sortClause = 7, 
		RULE_sortOrder = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "whereClause", "logicalOp", "condition", "field", "operator", 
			"value", "sortClause", "sortOrder"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'FIND'", "'events'", "'WHERE'", "'AND'", "'OR'", "'TYPE'", "'DATE'", 
			"'VISIBILITY'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'SORT BY'", 
			"'ASC'", "'DESC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "DATE", "WS"
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
	public String getGrammarFileName() { return "PlanetaryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlanetaryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PlanetaryGrammarParser.EOF, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(20);
				whereClause();
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(23);
				sortClause();
				}
			}

			setState(26);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__2);
			setState(29);
			condition();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(30);
				logicalOp();
				setState(31);
				condition();
				}
				}
				setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpContext extends ParserRuleContext {
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			field();
			setState(41);
			operator();
			setState(42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PlanetaryGrammarParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(PlanetaryGrammarParser.DATE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SortClauseContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SortOrderContext sortOrder() {
			return getRuleContext(SortOrderContext.class,0);
		}
		public SortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterSortClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitSortClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitSortClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortClauseContext sortClause() throws RecognitionException {
		SortClauseContext _localctx = new SortClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sortClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__14);
			setState(51);
			field();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__16) {
				{
				setState(52);
				sortOrder();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SortOrderContext extends ParserRuleContext {
		public SortOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).enterSortOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlanetaryGrammarListener ) ((PlanetaryGrammarListener)listener).exitSortOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlanetaryGrammarVisitor ) return ((PlanetaryGrammarVisitor<? extends T>)visitor).visitSortOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortOrderContext sortOrder() throws RecognitionException {
		SortOrderContext _localctx = new SortOrderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sortOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001\u0014:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016\b\u0000"+
		"\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001"+
		"\n\u0001\f\u0001%\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"6\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0005\u0001\u0000\u0004\u0005\u0001\u0000\u0006"+
		"\b\u0001\u0000\t\u000e\u0001\u0000\u0012\u0013\u0001\u0000\u0010\u0011"+
		"4\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000"+
		"\u0004&\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b,\u0001"+
		"\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000"+
		"\u000e2\u0001\u0000\u0000\u0000\u00107\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0001\u0000\u0000\u0013\u0015\u0005\u0002\u0000\u0000\u0014\u0016"+
		"\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0003\u000e\u0007\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0003\u0000\u0000\u001d#\u0003\u0006\u0003\u0000\u001e\u001f\u0003"+
		"\u0004\u0002\u0000\u001f \u0003\u0006\u0003\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000\'\u0005\u0001"+
		"\u0000\u0000\u0000()\u0003\b\u0004\u0000)*\u0003\n\u0005\u0000*+\u0003"+
		"\f\u0006\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0007\u0001\u0000\u0000"+
		"-\t\u0001\u0000\u0000\u0000./\u0007\u0002\u0000\u0000/\u000b\u0001\u0000"+
		"\u0000\u000001\u0007\u0003\u0000\u00001\r\u0001\u0000\u0000\u000023\u0005"+
		"\u000f\u0000\u000035\u0003\b\u0004\u000046\u0003\u0010\b\u000054\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u000f\u0001\u0000\u0000"+
		"\u000078\u0007\u0004\u0000\u00008\u0011\u0001\u0000\u0000\u0000\u0004"+
		"\u0015\u0018#5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}