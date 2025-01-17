package gen;// Generated from /Users/jiwonjeong/Documents/TheLittlePrince/src/main/java/PlanetaryGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PlanetaryGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		STRING=18, DATE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"STRING", "DATE", "DIGIT", "WS"
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


	public PlanetaryGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "celestialGrammar/PlanetaryGrammar.g4"; }

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
		"\u0004\u0000\u0014\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011|\b\u0011"+
		"\u000b\u0011\f\u0011}\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0004\u0014\u0092\b\u0014\u000b\u0014\f\u0014"+
		"\u0093\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0000)\u0014\u0001\u0000\u0003\u0005\u0000  09AZ__az"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u0097\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000"+
		"\u0000\u0001+\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u0005"+
		"7\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\tA\u0001\u0000"+
		"\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000"+
		"\u000fN\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013["+
		"\u0001\u0000\u0000\u0000\u0015^\u0001\u0000\u0000\u0000\u0017`\u0001\u0000"+
		"\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000"+
		"\u001dh\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000!t\u0001"+
		"\u0000\u0000\u0000#y\u0001\u0000\u0000\u0000%\u0081\u0001\u0000\u0000"+
		"\u0000\'\u008e\u0001\u0000\u0000\u0000)\u0091\u0001\u0000\u0000\u0000"+
		"+,\u0005F\u0000\u0000,-\u0005I\u0000\u0000-.\u0005N\u0000\u0000./\u0005"+
		"D\u0000\u0000/\u0002\u0001\u0000\u0000\u000001\u0005e\u0000\u000012\u0005"+
		"v\u0000\u000023\u0005e\u0000\u000034\u0005n\u0000\u000045\u0005t\u0000"+
		"\u000056\u0005s\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005W\u0000"+
		"\u000089\u0005H\u0000\u00009:\u0005E\u0000\u0000:;\u0005R\u0000\u0000"+
		";<\u0005E\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005A\u0000\u0000"+
		">?\u0005N\u0000\u0000?@\u0005D\u0000\u0000@\b\u0001\u0000\u0000\u0000"+
		"AB\u0005O\u0000\u0000BC\u0005R\u0000\u0000C\n\u0001\u0000\u0000\u0000"+
		"DE\u0005T\u0000\u0000EF\u0005Y\u0000\u0000FG\u0005P\u0000\u0000GH\u0005"+
		"E\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005D\u0000\u0000JK\u0005"+
		"A\u0000\u0000KL\u0005T\u0000\u0000LM\u0005E\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0005V\u0000\u0000OP\u0005I\u0000\u0000PQ\u0005S\u0000"+
		"\u0000QR\u0005I\u0000\u0000RS\u0005B\u0000\u0000ST\u0005I\u0000\u0000"+
		"TU\u0005L\u0000\u0000UV\u0005I\u0000\u0000VW\u0005T\u0000\u0000WX\u0005"+
		"Y\u0000\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005=\u0000\u0000Z\u0012"+
		"\u0001\u0000\u0000\u0000[\\\u0005!\u0000\u0000\\]\u0005=\u0000\u0000]"+
		"\u0014\u0001\u0000\u0000\u0000^_\u0005<\u0000\u0000_\u0016\u0001\u0000"+
		"\u0000\u0000`a\u0005>\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005"+
		"<\u0000\u0000cd\u0005=\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0005"+
		">\u0000\u0000fg\u0005=\u0000\u0000g\u001c\u0001\u0000\u0000\u0000hi\u0005"+
		"S\u0000\u0000ij\u0005O\u0000\u0000jk\u0005R\u0000\u0000kl\u0005T\u0000"+
		"\u0000lm\u0005 \u0000\u0000mn\u0005B\u0000\u0000no\u0005Y\u0000\u0000"+
		"o\u001e\u0001\u0000\u0000\u0000pq\u0005A\u0000\u0000qr\u0005S\u0000\u0000"+
		"rs\u0005C\u0000\u0000s \u0001\u0000\u0000\u0000tu\u0005D\u0000\u0000u"+
		"v\u0005E\u0000\u0000vw\u0005S\u0000\u0000wx\u0005C\u0000\u0000x\"\u0001"+
		"\u0000\u0000\u0000y{\u0005\"\u0000\u0000z|\u0007\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\"\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\"\u0000\u0000\u0082\u0083\u0003\'\u0013\u0000\u0083\u0084\u0003\'\u0013"+
		"\u0000\u0084\u0085\u0003\'\u0013\u0000\u0085\u0086\u0003\'\u0013\u0000"+
		"\u0086\u0087\u0005-\u0000\u0000\u0087\u0088\u0003\'\u0013\u0000\u0088"+
		"\u0089\u0003\'\u0013\u0000\u0089\u008a\u0005-\u0000\u0000\u008a\u008b"+
		"\u0003\'\u0013\u0000\u008b\u008c\u0003\'\u0013\u0000\u008c\u008d\u0005"+
		"\"\u0000\u0000\u008d&\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0001"+
		"\u0000\u0000\u008f(\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0002\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0014\u0000"+
		"\u0000\u0096*\u0001\u0000\u0000\u0000\u0003\u0000}\u0093\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}