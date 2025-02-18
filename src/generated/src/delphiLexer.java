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
		T__0=1, T__1=2, PROGRAM=3, UNIT=4, BEGIN=5, END=6, VAR=7, TYPE=8, CLASS=9, 
		EXTENDS=10, PUBLIC=11, PRIVATE=12, PROTECTED=13, CONSTRUCTOR=14, DESTRUCTOR=15, 
		VIRTUAL=16, OVERRIDE=17, INHERITED=18, DESTROY=19, NEW=20, IF=21, THEN=22, 
		ELSE=23, WHILE=24, DO=25, READ=26, READLN=27, WRITE=28, WRITELN=29, OR=30, 
		AND=31, NOT=32, DIV=33, MOD=34, IN=35, CHAR=36, BOOLEAN=37, INTEGER=38, 
		REAL=39, STRING=40, DOT=41, COMMA=42, SEMI=43, COLON=44, ASSIGN=45, EQUAL=46, 
		NOT_EQUAL=47, LT=48, LE=49, GE=50, GT=51, PLUS=52, MINUS=53, STAR=54, 
		SLASH=55, LPAREN=56, RPAREN=57, IDENTIFIER=58, INTEGER_CONST=59, REAL_CONST=60, 
		STRING_LITERAL=61, WS=62, COMMENT=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PROGRAM", "UNIT", "BEGIN", "END", "VAR", "TYPE", "CLASS", 
			"EXTENDS", "PUBLIC", "PRIVATE", "PROTECTED", "CONSTRUCTOR", "DESTRUCTOR", 
			"VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "NEW", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "READ", "READLN", "WRITE", "WRITELN", "OR", "AND", "NOT", 
			"DIV", "MOD", "IN", "CHAR", "BOOLEAN", "INTEGER", "REAL", "STRING", "DOT", 
			"COMMA", "SEMI", "COLON", "ASSIGN", "EQUAL", "NOT_EQUAL", "LT", "LE", 
			"GE", "GT", "PLUS", "MINUS", "STAR", "SLASH", "LPAREN", "RPAREN", "IDENTIFIER", 
			"INTEGER_CONST", "REAL_CONST", "STRING_LITERAL", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedure'", "'function'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'.'", "','", "';'", 
			"':'", "':='", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PROGRAM", "UNIT", "BEGIN", "END", "VAR", "TYPE", "CLASS", 
			"EXTENDS", "PUBLIC", "PRIVATE", "PROTECTED", "CONSTRUCTOR", "DESTRUCTOR", 
			"VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "NEW", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "READ", "READLN", "WRITE", "WRITELN", "OR", "AND", "NOT", 
			"DIV", "MOD", "IN", "CHAR", "BOOLEAN", "INTEGER", "REAL", "STRING", "DOT", 
			"COMMA", "SEMI", "COLON", "ASSIGN", "EQUAL", "NOT_EQUAL", "LT", "LE", 
			"GE", "GT", "PLUS", "MINUS", "STAR", "SLASH", "LPAREN", "RPAREN", "IDENTIFIER", 
			"INTEGER_CONST", "REAL_CONST", "STRING_LITERAL", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\7;\u01a8\n;\f;\16;\u01ab\13;\3<\6<\u01ae\n<\r"+
		"<\16<\u01af\3=\6=\u01b3\n=\r=\16=\u01b4\3=\3=\6=\u01b9\n=\r=\16=\u01ba"+
		"\5=\u01bd\n=\3=\3=\5=\u01c1\n=\3=\6=\u01c4\n=\r=\16=\u01c5\5=\u01c8\n"+
		"=\3>\3>\3>\3>\7>\u01ce\n>\f>\16>\u01d1\13>\3>\3>\3?\6?\u01d6\n?\r?\16"+
		"?\u01d7\3?\3?\3@\3@\7@\u01de\n@\f@\16@\u01e1\13@\3@\3@\3@\3@\3\u01df\2"+
		"A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\3\2\36\4\2RRrr\4\2TTtt\4\2QQqq\4\2IIii\4\2CCcc\4"+
		"\2OOoo\4\2WWww\4\2PPpp\4\2KKkk\4\2VVvv\4\2DDdd\4\2GGgg\4\2FFff\4\2XXx"+
		"x\4\2[[{{\4\2EEee\4\2NNnn\4\2UUuu\4\2ZZzz\4\2JJjj\4\2YYyy\4\2HHhh\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\62;\4\2--//\3\2))\5\2\13\f\17\17\"\"\2\u01f1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u008b\3\2\2\2\7\u0094"+
		"\3\2\2\2\t\u009c\3\2\2\2\13\u00a1\3\2\2\2\r\u00a7\3\2\2\2\17\u00ab\3\2"+
		"\2\2\21\u00af\3\2\2\2\23\u00b4\3\2\2\2\25\u00ba\3\2\2\2\27\u00c2\3\2\2"+
		"\2\31\u00c9\3\2\2\2\33\u00d0\3\2\2\2\35\u00da\3\2\2\2\37\u00e6\3\2\2\2"+
		"!\u00f1\3\2\2\2#\u00f9\3\2\2\2%\u0102\3\2\2\2\'\u010c\3\2\2\2)\u0114\3"+
		"\2\2\2+\u0118\3\2\2\2-\u011b\3\2\2\2/\u0120\3\2\2\2\61\u0125\3\2\2\2\63"+
		"\u012b\3\2\2\2\65\u012e\3\2\2\2\67\u0133\3\2\2\29\u013a\3\2\2\2;\u0140"+
		"\3\2\2\2=\u0148\3\2\2\2?\u014b\3\2\2\2A\u014f\3\2\2\2C\u0153\3\2\2\2E"+
		"\u0157\3\2\2\2G\u015b\3\2\2\2I\u015e\3\2\2\2K\u0163\3\2\2\2M\u016b\3\2"+
		"\2\2O\u0173\3\2\2\2Q\u0178\3\2\2\2S\u017f\3\2\2\2U\u0181\3\2\2\2W\u0183"+
		"\3\2\2\2Y\u0185\3\2\2\2[\u0187\3\2\2\2]\u018a\3\2\2\2_\u018c\3\2\2\2a"+
		"\u018f\3\2\2\2c\u0191\3\2\2\2e\u0194\3\2\2\2g\u0197\3\2\2\2i\u0199\3\2"+
		"\2\2k\u019b\3\2\2\2m\u019d\3\2\2\2o\u019f\3\2\2\2q\u01a1\3\2\2\2s\u01a3"+
		"\3\2\2\2u\u01a5\3\2\2\2w\u01ad\3\2\2\2y\u01b2\3\2\2\2{\u01c9\3\2\2\2}"+
		"\u01d5\3\2\2\2\177\u01db\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2"+
		"\u0083\u0084\7q\2\2\u0084\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7f\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a"+
		"\4\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7q\2\2"+
		"\u0092\u0093\7p\2\2\u0093\6\3\2\2\2\u0094\u0095\t\2\2\2\u0095\u0096\t"+
		"\3\2\2\u0096\u0097\t\4\2\2\u0097\u0098\t\5\2\2\u0098\u0099\t\3\2\2\u0099"+
		"\u009a\t\6\2\2\u009a\u009b\t\7\2\2\u009b\b\3\2\2\2\u009c\u009d\t\b\2\2"+
		"\u009d\u009e\t\t\2\2\u009e\u009f\t\n\2\2\u009f\u00a0\t\13\2\2\u00a0\n"+
		"\3\2\2\2\u00a1\u00a2\t\f\2\2\u00a2\u00a3\t\r\2\2\u00a3\u00a4\t\5\2\2\u00a4"+
		"\u00a5\t\n\2\2\u00a5\u00a6\t\t\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\t\r\2\2"+
		"\u00a8\u00a9\t\t\2\2\u00a9\u00aa\t\16\2\2\u00aa\16\3\2\2\2\u00ab\u00ac"+
		"\t\17\2\2\u00ac\u00ad\t\6\2\2\u00ad\u00ae\t\3\2\2\u00ae\20\3\2\2\2\u00af"+
		"\u00b0\t\13\2\2\u00b0\u00b1\t\20\2\2\u00b1\u00b2\t\2\2\2\u00b2\u00b3\t"+
		"\r\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\t\21\2\2\u00b5\u00b6\t\22\2\2\u00b6"+
		"\u00b7\t\6\2\2\u00b7\u00b8\t\23\2\2\u00b8\u00b9\t\23\2\2\u00b9\24\3\2"+
		"\2\2\u00ba\u00bb\t\r\2\2\u00bb\u00bc\t\24\2\2\u00bc\u00bd\t\13\2\2\u00bd"+
		"\u00be\t\r\2\2\u00be\u00bf\t\t\2\2\u00bf\u00c0\t\16\2\2\u00c0\u00c1\t"+
		"\23\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\u00c4\t\b\2\2\u00c4"+
		"\u00c5\t\f\2\2\u00c5\u00c6\t\22\2\2\u00c6\u00c7\t\n\2\2\u00c7\u00c8\t"+
		"\21\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cb\t\3\2\2\u00cb"+
		"\u00cc\t\n\2\2\u00cc\u00cd\t\17\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00cf\t"+
		"\13\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1\u00d2\t\3\2\2\u00d2"+
		"\u00d3\t\4\2\2\u00d3\u00d4\t\13\2\2\u00d4\u00d5\t\r\2\2\u00d5\u00d6\t"+
		"\21\2\2\u00d6\u00d7\t\13\2\2\u00d7\u00d8\t\r\2\2\u00d8\u00d9\t\16\2\2"+
		"\u00d9\34\3\2\2\2\u00da\u00db\t\21\2\2\u00db\u00dc\t\4\2\2\u00dc\u00dd"+
		"\t\t\2\2\u00dd\u00de\t\23\2\2\u00de\u00df\t\13\2\2\u00df\u00e0\t\3\2\2"+
		"\u00e0\u00e1\t\b\2\2\u00e1\u00e2\t\21\2\2\u00e2\u00e3\t\13\2\2\u00e3\u00e4"+
		"\t\4\2\2\u00e4\u00e5\t\3\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\t\16\2\2\u00e7"+
		"\u00e8\t\r\2\2\u00e8\u00e9\t\23\2\2\u00e9\u00ea\t\13\2\2\u00ea\u00eb\t"+
		"\3\2\2\u00eb\u00ec\t\b\2\2\u00ec\u00ed\t\21\2\2\u00ed\u00ee\t\13\2\2\u00ee"+
		"\u00ef\t\4\2\2\u00ef\u00f0\t\3\2\2\u00f0 \3\2\2\2\u00f1\u00f2\t\17\2\2"+
		"\u00f2\u00f3\t\n\2\2\u00f3\u00f4\t\3\2\2\u00f4\u00f5\t\13\2\2\u00f5\u00f6"+
		"\t\b\2\2\u00f6\u00f7\t\6\2\2\u00f7\u00f8\t\22\2\2\u00f8\"\3\2\2\2\u00f9"+
		"\u00fa\t\4\2\2\u00fa\u00fb\t\17\2\2\u00fb\u00fc\t\r\2\2\u00fc\u00fd\t"+
		"\3\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\t\n\2\2\u00ff\u0100\t\16\2\2\u0100"+
		"\u0101\t\r\2\2\u0101$\3\2\2\2\u0102\u0103\t\n\2\2\u0103\u0104\t\t\2\2"+
		"\u0104\u0105\t\25\2\2\u0105\u0106\t\r\2\2\u0106\u0107\t\3\2\2\u0107\u0108"+
		"\t\n\2\2\u0108\u0109\t\13\2\2\u0109\u010a\t\r\2\2\u010a\u010b\t\16\2\2"+
		"\u010b&\3\2\2\2\u010c\u010d\t\16\2\2\u010d\u010e\t\r\2\2\u010e\u010f\t"+
		"\23\2\2\u010f\u0110\t\13\2\2\u0110\u0111\t\3\2\2\u0111\u0112\t\4\2\2\u0112"+
		"\u0113\t\20\2\2\u0113(\3\2\2\2\u0114\u0115\t\t\2\2\u0115\u0116\t\r\2\2"+
		"\u0116\u0117\t\26\2\2\u0117*\3\2\2\2\u0118\u0119\t\n\2\2\u0119\u011a\t"+
		"\27\2\2\u011a,\3\2\2\2\u011b\u011c\t\13\2\2\u011c\u011d\t\25\2\2\u011d"+
		"\u011e\t\r\2\2\u011e\u011f\t\t\2\2\u011f.\3\2\2\2\u0120\u0121\t\r\2\2"+
		"\u0121\u0122\t\22\2\2\u0122\u0123\t\23\2\2\u0123\u0124\t\r\2\2\u0124\60"+
		"\3\2\2\2\u0125\u0126\t\26\2\2\u0126\u0127\t\25\2\2\u0127\u0128\t\n\2\2"+
		"\u0128\u0129\t\22\2\2\u0129\u012a\t\r\2\2\u012a\62\3\2\2\2\u012b\u012c"+
		"\t\16\2\2\u012c\u012d\t\4\2\2\u012d\64\3\2\2\2\u012e\u012f\t\3\2\2\u012f"+
		"\u0130\t\r\2\2\u0130\u0131\t\6\2\2\u0131\u0132\t\16\2\2\u0132\66\3\2\2"+
		"\2\u0133\u0134\t\3\2\2\u0134\u0135\t\r\2\2\u0135\u0136\t\6\2\2\u0136\u0137"+
		"\t\16\2\2\u0137\u0138\t\22\2\2\u0138\u0139\t\t\2\2\u01398\3\2\2\2\u013a"+
		"\u013b\t\26\2\2\u013b\u013c\t\3\2\2\u013c\u013d\t\n\2\2\u013d\u013e\t"+
		"\13\2\2\u013e\u013f\t\r\2\2\u013f:\3\2\2\2\u0140\u0141\t\26\2\2\u0141"+
		"\u0142\t\3\2\2\u0142\u0143\t\n\2\2\u0143\u0144\t\13\2\2\u0144\u0145\t"+
		"\r\2\2\u0145\u0146\t\22\2\2\u0146\u0147\t\t\2\2\u0147<\3\2\2\2\u0148\u0149"+
		"\t\4\2\2\u0149\u014a\t\3\2\2\u014a>\3\2\2\2\u014b\u014c\t\6\2\2\u014c"+
		"\u014d\t\t\2\2\u014d\u014e\t\16\2\2\u014e@\3\2\2\2\u014f\u0150\t\t\2\2"+
		"\u0150\u0151\t\4\2\2\u0151\u0152\t\13\2\2\u0152B\3\2\2\2\u0153\u0154\t"+
		"\16\2\2\u0154\u0155\t\n\2\2\u0155\u0156\t\17\2\2\u0156D\3\2\2\2\u0157"+
		"\u0158\t\7\2\2\u0158\u0159\t\4\2\2\u0159\u015a\t\16\2\2\u015aF\3\2\2\2"+
		"\u015b\u015c\t\n\2\2\u015c\u015d\t\t\2\2\u015dH\3\2\2\2\u015e\u015f\t"+
		"\21\2\2\u015f\u0160\t\25\2\2\u0160\u0161\t\6\2\2\u0161\u0162\t\3\2\2\u0162"+
		"J\3\2\2\2\u0163\u0164\t\f\2\2\u0164\u0165\t\4\2\2\u0165\u0166\t\4\2\2"+
		"\u0166\u0167\t\22\2\2\u0167\u0168\t\r\2\2\u0168\u0169\t\6\2\2\u0169\u016a"+
		"\t\t\2\2\u016aL\3\2\2\2\u016b\u016c\t\n\2\2\u016c\u016d\t\t\2\2\u016d"+
		"\u016e\t\13\2\2\u016e\u016f\t\r\2\2\u016f\u0170\t\5\2\2\u0170\u0171\t"+
		"\r\2\2\u0171\u0172\t\3\2\2\u0172N\3\2\2\2\u0173\u0174\t\3\2\2\u0174\u0175"+
		"\t\r\2\2\u0175\u0176\t\6\2\2\u0176\u0177\t\22\2\2\u0177P\3\2\2\2\u0178"+
		"\u0179\t\23\2\2\u0179\u017a\t\13\2\2\u017a\u017b\t\3\2\2\u017b\u017c\t"+
		"\n\2\2\u017c\u017d\t\t\2\2\u017d\u017e\t\5\2\2\u017eR\3\2\2\2\u017f\u0180"+
		"\7\60\2\2\u0180T\3\2\2\2\u0181\u0182\7.\2\2\u0182V\3\2\2\2\u0183\u0184"+
		"\7=\2\2\u0184X\3\2\2\2\u0185\u0186\7<\2\2\u0186Z\3\2\2\2\u0187\u0188\7"+
		"<\2\2\u0188\u0189\7?\2\2\u0189\\\3\2\2\2\u018a\u018b\7?\2\2\u018b^\3\2"+
		"\2\2\u018c\u018d\7>\2\2\u018d\u018e\7@\2\2\u018e`\3\2\2\2\u018f\u0190"+
		"\7>\2\2\u0190b\3\2\2\2\u0191\u0192\7>\2\2\u0192\u0193\7?\2\2\u0193d\3"+
		"\2\2\2\u0194\u0195\7@\2\2\u0195\u0196\7?\2\2\u0196f\3\2\2\2\u0197\u0198"+
		"\7@\2\2\u0198h\3\2\2\2\u0199\u019a\7-\2\2\u019aj\3\2\2\2\u019b\u019c\7"+
		"/\2\2\u019cl\3\2\2\2\u019d\u019e\7,\2\2\u019en\3\2\2\2\u019f\u01a0\7\61"+
		"\2\2\u01a0p\3\2\2\2\u01a1\u01a2\7*\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7+\2"+
		"\2\u01a4t\3\2\2\2\u01a5\u01a9\t\30\2\2\u01a6\u01a8\t\31\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"v\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\t\32\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0x\3"+
		"\2\2\2\u01b1\u01b3\t\32\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01bc\3\2\2\2\u01b6\u01b8\7\60"+
		"\2\2\u01b7\u01b9\t\32\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01b6\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c7\3\2\2\2\u01be\u01c0\t\r\2\2\u01bf"+
		"\u01c1\t\33\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3"+
		"\2\2\2\u01c2\u01c4\t\32\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01be\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8z\3\2\2\2\u01c9\u01cf\7)\2\2\u01ca\u01cb"+
		"\7)\2\2\u01cb\u01ce\7)\2\2\u01cc\u01ce\n\34\2\2\u01cd\u01ca\3\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7)\2\2\u01d3"+
		"|\3\2\2\2\u01d4\u01d6\t\35\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da"+
		"\b?\2\2\u01da~\3\2\2\2\u01db\u01df\7}\2\2\u01dc\u01de\13\2\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\177\2\2\u01e3\u01e4\3"+
		"\2\2\2\u01e4\u01e5\b@\2\2\u01e5\u0080\3\2\2\2\17\2\u01a9\u01af\u01b4\u01ba"+
		"\u01bc\u01c0\u01c5\u01c7\u01cd\u01cf\u01d7\u01df\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}