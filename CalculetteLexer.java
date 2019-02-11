// Generated from Calculette.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, TYPE=22, IDENTIFIANT=23, 
		NEWLINE=24, WS=25, ENTIER=26, UNMATCH=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "TYPE", "IDENTIFIANT", "NEWLINE", "WS", 
		"ENTIER", "UNMATCH"
	};


	public CalculetteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0086\n\27\3\30\3\30\7\30\u008a\n\30\f"+
		"\30\16\30\u008d\13\30\3\31\5\31\u0090\n\31\3\31\3\31\3\31\3\31\3\32\6"+
		"\32\u0097\n\32\r\32\16\32\u0098\3\32\3\32\3\33\6\33\u009e\n\33\r\33\16"+
		"\33\u009f\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\35\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13"+
		"\"\"\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5;\3\2\2\2\7B\3\2\2\2\tJ\3\2\2\2\13O\3\2\2\2\rR\3\2\2\2\17T\3\2\2"+
		"\2\21V\3\2\2\2\23Y\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2"+
		"\2\2\35h\3\2\2\2\37j\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2"+
		")u\3\2\2\2+w\3\2\2\2-\u0085\3\2\2\2/\u0087\3\2\2\2\61\u008f\3\2\2\2\63"+
		"\u0096\3\2\2\2\65\u009d\3\2\2\2\67\u00a1\3\2\2\29:\7\61\2\2:\4\3\2\2\2"+
		";<\7t\2\2<=\7g\2\2=>\7c\2\2>?\7f\2\2?@\7n\2\2@A\7p\2\2A\6\3\2\2\2BC\7"+
		"r\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2GH\7n\2\2HI\7p\2\2I\b\3\2\2\2"+
		"JK\7v\2\2KL\7t\2\2LM\7w\2\2MN\7g\2\2N\n\3\2\2\2OP\7#\2\2PQ\7?\2\2Q\f\3"+
		"\2\2\2RS\7=\2\2S\16\3\2\2\2TU\7}\2\2U\20\3\2\2\2VW\7@\2\2WX\7?\2\2X\22"+
		"\3\2\2\2YZ\7y\2\2Z[\7j\2\2[\\\7k\2\2\\]\7n\2\2]^\7g\2\2^\24\3\2\2\2_`"+
		"\7?\2\2`a\7?\2\2a\26\3\2\2\2bc\7>\2\2c\30\3\2\2\2de\7\177\2\2e\32\3\2"+
		"\2\2fg\7?\2\2g\34\3\2\2\2hi\7@\2\2i\36\3\2\2\2jk\7>\2\2kl\7?\2\2l \3\2"+
		"\2\2mn\7*\2\2n\"\3\2\2\2op\7+\2\2p$\3\2\2\2qr\7,\2\2r&\3\2\2\2st\7-\2"+
		"\2t(\3\2\2\2uv\7/\2\2v*\3\2\2\2wx\7h\2\2xy\7c\2\2yz\7n\2\2z{\7u\2\2{|"+
		"\7g\2\2|,\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0086\7v\2\2\u0080\u0081\7"+
		"h\2\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7c\2\2\u0084\u0086"+
		"\7v\2\2\u0085}\3\2\2\2\u0085\u0080\3\2\2\2\u0086.\3\2\2\2\u0087\u008b"+
		"\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\60\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0090\7\17\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\f\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\31"+
		"\2\2\u0094\62\3\2\2\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\32\2\2\u009b\64\3\2\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\66"+
		"\3\2\2\2\u00a1\u00a2\13\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\34\2\2"+
		"\u00a48\3\2\2\2\b\2\u0085\u008b\u008f\u0098\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}