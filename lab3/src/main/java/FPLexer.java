// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INTEGER=2, DOUBLE=3, BOOL=4, WORD=5, WS=6, COMMA=7, LB=8, RB=9, 
		COLON=10, DOUBLECOLON=11, SEMICOLON=12, EQ=13, STICK=14, ARROW=15, PLUS=16, 
		MINUS=17, DIV=18, MUL=19, MOD=20, OR=21, AND=22, LESS=23, GREATER=24, 
		DEQ=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "INTEGER", "DOUBLE", "BOOL", "WORD", "WS", "COMMA", "LB", "RB", 
			"COLON", "DOUBLECOLON", "SEMICOLON", "EQ", "STICK", "ARROW", "PLUS", 
			"MINUS", "DIV", "MUL", "MOD", "OR", "AND", "LESS", "GREATER", "DEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "','", "'('", "')'", "':'", 
			"'::'", "';'", "'='", "'|'", "'->'", "'+'", "'-'", "'/'", "'*'", "'%'", 
			"'||'", "'&&'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INTEGER", "DOUBLE", "BOOL", "WORD", "WS", "COMMA", "LB", 
			"RB", "COLON", "DOUBLECOLON", "SEMICOLON", "EQ", "STICK", "ARROW", "PLUS", 
			"MINUS", "DIV", "MUL", "MOD", "OR", "AND", "LESS", "GREATER", "DEQ"
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


	public FPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FP.g4"; }

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
		"\u0004\u0000\u0019\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000E\b\u0000\u0001\u0001\u0003\u0001H\b\u0001\u0001"+
		"\u0001\u0004\u0001K\b\u0001\u000b\u0001\f\u0001L\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t\u0004\u0001\u0005\u0004\u0005"+
		"j\b\u0005\u000b\u0005\f\u0005k\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0004\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n"+
		"\r\r  \u00a1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001"+
		"D\u0001\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000\u0005N\u0001"+
		"\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\ta\u0001\u0000\u0000"+
		"\u0000\u000bi\u0001\u0000\u0000\u0000\ro\u0001\u0000\u0000\u0000\u000f"+
		"q\u0001\u0000\u0000\u0000\u0011s\u0001\u0000\u0000\u0000\u0013u\u0001"+
		"\u0000\u0000\u0000\u0015w\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000"+
		"\u0000\u0019|\u0001\u0000\u0000\u0000\u001b~\u0001\u0000\u0000\u0000\u001d"+
		"\u0080\u0001\u0000\u0000\u0000\u001f\u0083\u0001\u0000\u0000\u0000!\u0085"+
		"\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000\u0000%\u0089\u0001\u0000"+
		"\u0000\u0000\'\u008b\u0001\u0000\u0000\u0000)\u008d\u0001\u0000\u0000"+
		"\u0000+\u0090\u0001\u0000\u0000\u0000-\u0093\u0001\u0000\u0000\u0000/"+
		"\u0095\u0001\u0000\u0000\u00001\u0097\u0001\u0000\u0000\u000034\u0005"+
		"I\u0000\u000045\u0005n\u0000\u000056\u0005t\u0000\u000067\u0005e\u0000"+
		"\u000078\u0005g\u0000\u000089\u0005e\u0000\u00009E\u0005r\u0000\u0000"+
		":;\u0005D\u0000\u0000;<\u0005o\u0000\u0000<=\u0005u\u0000\u0000=>\u0005"+
		"b\u0000\u0000>?\u0005l\u0000\u0000?E\u0005e\u0000\u0000@A\u0005B\u0000"+
		"\u0000AB\u0005o\u0000\u0000BC\u0005o\u0000\u0000CE\u0005l\u0000\u0000"+
		"D3\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000"+
		"\u0000E\u0002\u0001\u0000\u0000\u0000FH\u0005-\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IK\u0007"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0004\u0001\u0000"+
		"\u0000\u0000NO\u0003\u0003\u0001\u0000OS\u0005.\u0000\u0000PR\u0007\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0006\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VW\u0005T\u0000\u0000WX\u0005r\u0000\u0000"+
		"XY\u0005u\u0000\u0000Y`\u0005e\u0000\u0000Z[\u0005F\u0000\u0000[\\\u0005"+
		"a\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005s\u0000\u0000^`\u0005e\u0000"+
		"\u0000_V\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000`\b\u0001\u0000"+
		"\u0000\u0000ae\u0007\u0001\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000f\n\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hj\u0007\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0006\u0005\u0000\u0000n\f\u0001\u0000\u0000\u0000"+
		"op\u0005,\u0000\u0000p\u000e\u0001\u0000\u0000\u0000qr\u0005(\u0000\u0000"+
		"r\u0010\u0001\u0000\u0000\u0000st\u0005)\u0000\u0000t\u0012\u0001\u0000"+
		"\u0000\u0000uv\u0005:\u0000\u0000v\u0014\u0001\u0000\u0000\u0000wx\u0005"+
		":\u0000\u0000xy\u0005:\u0000\u0000y\u0016\u0001\u0000\u0000\u0000z{\u0005"+
		";\u0000\u0000{\u0018\u0001\u0000\u0000\u0000|}\u0005=\u0000\u0000}\u001a"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005|\u0000\u0000\u007f\u001c\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005-\u0000\u0000\u0081\u0082\u0005>\u0000\u0000"+
		"\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084\u0005+\u0000\u0000\u0084"+
		" \u0001\u0000\u0000\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\"\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088$\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005*\u0000\u0000\u008a&\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005%\u0000\u0000\u008c(\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"|\u0000\u0000\u008e\u008f\u0005|\u0000\u0000\u008f*\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005&\u0000\u0000\u0091\u0092\u0005&\u0000\u0000\u0092"+
		",\u0001\u0000\u0000\u0000\u0093\u0094\u0005<\u0000\u0000\u0094.\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005>\u0000\u0000\u00960\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005=\u0000\u0000\u0098\u0099\u0005=\u0000\u0000\u0099"+
		"2\u0001\u0000\u0000\u0000\b\u0000DGLS_ek\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}