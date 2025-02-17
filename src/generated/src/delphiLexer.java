// Generated from src/delphi.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class delphiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PROGRAM=3, CLASS=4, EXTENDS=5, BEGIN=6, END=7, PUBLIC=8, 
		PRIVATE=9, PROTECTED=10, CONSTRUCTOR=11, DESTRUCTOR=12, NEW=13, WRITELN=14, 
		READLN=15, VIRTUAL=16, OVERRIDE=17, INHERITED=18, DESTROY=19, VAR=20, 
		TYPE=21, EQUALS=22, IDENTIFIER=23, STRING_LITERAL=24, INTEGER_LITERAL=25, 
		REAL_LITERAL=26, SEMI=27, COLON=28, LPAREN=29, RPAREN=30, ASSIGN=31, DOT=32, 
		COMMA=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PROGRAM", "CLASS", "EXTENDS", "BEGIN", "END", "PUBLIC", 
			"PRIVATE", "PROTECTED", "CONSTRUCTOR", "DESTRUCTOR", "NEW", "WRITELN", 
			"READLN", "VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "VAR", "TYPE", 
			"EQUALS", "IDENTIFIER", "STRING_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", 
			"SEMI", "COLON", "LPAREN", "RPAREN", "ASSIGN", "DOT", "COMMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedure'", "'function'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", null, null, null, null, "';'", "':'", "'('", "')'", "':='", 
			"'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PROGRAM", "CLASS", "EXTENDS", "BEGIN", "END", "PUBLIC", 
			"PRIVATE", "PROTECTED", "CONSTRUCTOR", "DESTRUCTOR", "NEW", "WRITELN", 
			"READLN", "VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "VAR", "TYPE", 
			"EQUALS", "IDENTIFIER", "STRING_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", 
			"SEMI", "COLON", "LPAREN", "RPAREN", "ASSIGN", "DOT", "COMMA", "WS"
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


	public delphiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "delphi.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u00ed\n\30"+
		"\f\30\16\30\u00f0\13\30\3\31\3\31\3\31\3\31\7\31\u00f6\n\31\f\31\16\31"+
		"\u00f9\13\31\3\31\3\31\3\32\6\32\u00fe\n\32\r\32\16\32\u00ff\3\33\6\33"+
		"\u0103\n\33\r\33\16\33\u0104\3\33\3\33\6\33\u0109\n\33\r\33\16\33\u010a"+
		"\5\33\u010d\n\33\3\33\3\33\5\33\u0111\n\33\3\33\6\33\u0114\n\33\r\33\16"+
		"\33\u0115\5\33\u0118\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3\"\3\"\3#\6#\u012a\n#\r#\16#\u012b\3#\3#\2\2$\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3"+
		"\2\35\4\2RRrr\4\2TTtt\4\2QQqq\4\2IIii\4\2CCcc\4\2OOoo\4\2EEee\4\2NNnn"+
		"\4\2UUuu\4\2GGgg\4\2ZZzz\4\2VVvv\4\2PPpp\4\2FFff\4\2DDdd\4\2KKkk\4\2W"+
		"Www\4\2XXxx\4\2YYyy\4\2JJjj\4\2[[{{\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f"+
		"\17\17))\3\2\62;\4\2--//\5\2\13\f\17\17\"\"\2\u0139\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5Q\3\2\2\2\7Z\3"+
		"\2\2\2\tb\3\2\2\2\13h\3\2\2\2\rp\3\2\2\2\17v\3\2\2\2\21z\3\2\2\2\23\u0081"+
		"\3\2\2\2\25\u0088\3\2\2\2\27\u0092\3\2\2\2\31\u009e\3\2\2\2\33\u00a9\3"+
		"\2\2\2\35\u00ad\3\2\2\2\37\u00b5\3\2\2\2!\u00bc\3\2\2\2#\u00c4\3\2\2\2"+
		"%\u00cd\3\2\2\2\'\u00d7\3\2\2\2)\u00df\3\2\2\2+\u00e3\3\2\2\2-\u00e8\3"+
		"\2\2\2/\u00ea\3\2\2\2\61\u00f1\3\2\2\2\63\u00fd\3\2\2\2\65\u0102\3\2\2"+
		"\2\67\u0119\3\2\2\29\u011b\3\2\2\2;\u011d\3\2\2\2=\u011f\3\2\2\2?\u0121"+
		"\3\2\2\2A\u0124\3\2\2\2C\u0126\3\2\2\2E\u0129\3\2\2\2GH\7r\2\2HI\7t\2"+
		"\2IJ\7q\2\2JK\7e\2\2KL\7g\2\2LM\7f\2\2MN\7w\2\2NO\7t\2\2OP\7g\2\2P\4\3"+
		"\2\2\2QR\7h\2\2RS\7w\2\2ST\7p\2\2TU\7e\2\2UV\7v\2\2VW\7k\2\2WX\7q\2\2"+
		"XY\7p\2\2Y\6\3\2\2\2Z[\t\2\2\2[\\\t\3\2\2\\]\t\4\2\2]^\t\5\2\2^_\t\3\2"+
		"\2_`\t\6\2\2`a\t\7\2\2a\b\3\2\2\2bc\t\b\2\2cd\t\t\2\2de\t\6\2\2ef\t\n"+
		"\2\2fg\t\n\2\2g\n\3\2\2\2hi\t\13\2\2ij\t\f\2\2jk\t\r\2\2kl\t\13\2\2lm"+
		"\t\16\2\2mn\t\17\2\2no\t\n\2\2o\f\3\2\2\2pq\t\20\2\2qr\t\13\2\2rs\t\5"+
		"\2\2st\t\21\2\2tu\t\16\2\2u\16\3\2\2\2vw\t\13\2\2wx\t\16\2\2xy\t\17\2"+
		"\2y\20\3\2\2\2z{\t\2\2\2{|\t\22\2\2|}\t\20\2\2}~\t\t\2\2~\177\t\21\2\2"+
		"\177\u0080\t\b\2\2\u0080\22\3\2\2\2\u0081\u0082\t\2\2\2\u0082\u0083\t"+
		"\3\2\2\u0083\u0084\t\21\2\2\u0084\u0085\t\23\2\2\u0085\u0086\t\6\2\2\u0086"+
		"\u0087\t\r\2\2\u0087\24\3\2\2\2\u0088\u0089\t\2\2\2\u0089\u008a\t\3\2"+
		"\2\u008a\u008b\t\4\2\2\u008b\u008c\t\r\2\2\u008c\u008d\t\13\2\2\u008d"+
		"\u008e\t\b\2\2\u008e\u008f\t\r\2\2\u008f\u0090\t\13\2\2\u0090\u0091\t"+
		"\17\2\2\u0091\26\3\2\2\2\u0092\u0093\t\b\2\2\u0093\u0094\t\4\2\2\u0094"+
		"\u0095\t\16\2\2\u0095\u0096\t\n\2\2\u0096\u0097\t\r\2\2\u0097\u0098\t"+
		"\3\2\2\u0098\u0099\t\22\2\2\u0099\u009a\t\b\2\2\u009a\u009b\t\r\2\2\u009b"+
		"\u009c\t\4\2\2\u009c\u009d\t\3\2\2\u009d\30\3\2\2\2\u009e\u009f\t\17\2"+
		"\2\u009f\u00a0\t\13\2\2\u00a0\u00a1\t\n\2\2\u00a1\u00a2\t\r\2\2\u00a2"+
		"\u00a3\t\3\2\2\u00a3\u00a4\t\22\2\2\u00a4\u00a5\t\b\2\2\u00a5\u00a6\t"+
		"\r\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a8\t\3\2\2\u00a8\32\3\2\2\2\u00a9"+
		"\u00aa\t\16\2\2\u00aa\u00ab\t\13\2\2\u00ab\u00ac\t\24\2\2\u00ac\34\3\2"+
		"\2\2\u00ad\u00ae\t\24\2\2\u00ae\u00af\t\3\2\2\u00af\u00b0\t\21\2\2\u00b0"+
		"\u00b1\t\r\2\2\u00b1\u00b2\t\13\2\2\u00b2\u00b3\t\t\2\2\u00b3\u00b4\t"+
		"\16\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\u00b7\t\13\2\2\u00b7"+
		"\u00b8\t\6\2\2\u00b8\u00b9\t\17\2\2\u00b9\u00ba\t\t\2\2\u00ba\u00bb\t"+
		"\16\2\2\u00bb \3\2\2\2\u00bc\u00bd\t\23\2\2\u00bd\u00be\t\21\2\2\u00be"+
		"\u00bf\t\3\2\2\u00bf\u00c0\t\r\2\2\u00c0\u00c1\t\22\2\2\u00c1\u00c2\t"+
		"\6\2\2\u00c2\u00c3\t\t\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6"+
		"\t\23\2\2\u00c6\u00c7\t\13\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00c9\t\3\2\2"+
		"\u00c9\u00ca\t\21\2\2\u00ca\u00cb\t\17\2\2\u00cb\u00cc\t\13\2\2\u00cc"+
		"$\3\2\2\2\u00cd\u00ce\t\21\2\2\u00ce\u00cf\t\16\2\2\u00cf\u00d0\t\25\2"+
		"\2\u00d0\u00d1\t\13\2\2\u00d1\u00d2\t\3\2\2\u00d2\u00d3\t\21\2\2\u00d3"+
		"\u00d4\t\r\2\2\u00d4\u00d5\t\13\2\2\u00d5\u00d6\t\17\2\2\u00d6&\3\2\2"+
		"\2\u00d7\u00d8\t\17\2\2\u00d8\u00d9\t\13\2\2\u00d9\u00da\t\n\2\2\u00da"+
		"\u00db\t\r\2\2\u00db\u00dc\t\3\2\2\u00dc\u00dd\t\4\2\2\u00dd\u00de\t\26"+
		"\2\2\u00de(\3\2\2\2\u00df\u00e0\t\23\2\2\u00e0\u00e1\t\6\2\2\u00e1\u00e2"+
		"\t\3\2\2\u00e2*\3\2\2\2\u00e3\u00e4\t\r\2\2\u00e4\u00e5\t\26\2\2\u00e5"+
		"\u00e6\t\2\2\2\u00e6\u00e7\t\13\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7?\2\2"+
		"\u00e9.\3\2\2\2\u00ea\u00ee\t\27\2\2\u00eb\u00ed\t\30\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\60\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f7\7)\2\2\u00f2\u00f6\n\31\2"+
		"\2\u00f3\u00f4\7)\2\2\u00f4\u00f6\7)\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7)\2\2\u00fb\62\3\2\2\2"+
		"\u00fc\u00fe\t\32\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\64\3\2\2\2\u0101\u0103\t\32\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u010c\3\2\2\2\u0106\u0108\7\60\2\2\u0107\u0109\t\32\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0117\3\2\2\2\u010e\u0110\t\13\2\2\u010f\u0111\t\33\2\2\u0110\u010f\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\t\32\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\66\3\2\2\2\u0119\u011a\7=\2\2\u011a8\3\2\2\2\u011b\u011c\7<\2\2\u011c"+
		":\3\2\2\2\u011d\u011e\7*\2\2\u011e<\3\2\2\2\u011f\u0120\7+\2\2\u0120>"+
		"\3\2\2\2\u0121\u0122\7<\2\2\u0122\u0123\7?\2\2\u0123@\3\2\2\2\u0124\u0125"+
		"\7\60\2\2\u0125B\3\2\2\2\u0126\u0127\7.\2\2\u0127D\3\2\2\2\u0128\u012a"+
		"\t\34\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b#\2\2\u012eF\3\2"+
		"\2\2\16\2\u00ee\u00f5\u00f7\u00ff\u0104\u010a\u010c\u0110\u0115\u0117"+
		"\u012b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}