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
		IDENTIFIER=21, STRING_LITERAL=22, SEMI=23, COLON=24, LPAREN=25, RPAREN=26, 
		ASSIGN=27, DOT=28, WS=29, AND=30, ARRAY=31, BOOLEAN=32, CASE=33, CHAR=34, 
		CHR=35, CONST=36, DIV=37, DO=38, DOWNTO=39, ELSE=40, FILE=41, FOR=42, 
		FUNCTION=43, GOTO=44, IF=45, IN=46, INTEGER=47, LABEL=48, MOD=49, NIL=50, 
		NOT=51, OF=52, OR=53, PACKED=54, PROCEDURE=55, REAL=56, RECORD=57, REPEAT=58, 
		SET=59, THEN=60, TO=61, TYPE=62, UNTIL=63, WHILE=64, WITH=65, PLUS=66, 
		MINUS=67, STAR=68, SLASH=69, COMMA=70, EQUAL=71, NOT_EQUAL=72, LT=73, 
		LE=74, GE=75, GT=76, LBRACK=77, LBRACK2=78, RBRACK=79, RBRACK2=80, POINTER=81, 
		AT=82, DOTDOT=83, LCURLY=84, RCURLY=85, UNIT=86, INTERFACE=87, USES=88, 
		STRING=89, IMPLEMENTATION=90, TRUE=91, FALSE=92, COMMENT_1=93, COMMENT_2=94, 
		IDENT=95, NUM_INT=96, NUM_REAL=97;
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
			"READLN", "VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "VAR", "IDENTIFIER", 
			"STRING_LITERAL", "SEMI", "COLON", "LPAREN", "RPAREN", "ASSIGN", "DOT", 
			"WS", "AND", "ARRAY", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", 
			"DO", "DOWNTO", "ELSE", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
			"REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "WHILE", 
			"WITH", "PLUS", "MINUS", "STAR", "SLASH", "COMMA", "EQUAL", "NOT_EQUAL", 
			"LT", "LE", "GE", "GT", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", 
			"AT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", 
			"IMPLEMENTATION", "TRUE", "FALSE", "COMMENT_1", "COMMENT_2", "IDENT", 
			"NUM_INT", "NUM_REAL", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedure'", "'function'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "';'", "':'", "'('", "')'", "':='", "'.'", null, "'AND'", 
			"'ARRAY'", "'BOOLEAN'", "'CASE'", "'CHAR'", "'CHR'", "'CONST'", "'DIV'", 
			"'DO'", "'DOWNTO'", "'ELSE'", "'FILE'", "'FOR'", "'FUNCTION'", "'GOTO'", 
			"'IF'", "'IN'", "'INTEGER'", "'LABEL'", "'MOD'", "'NIL'", "'NOT'", "'OF'", 
			"'OR'", "'PACKED'", "'PROCEDURE'", "'REAL'", "'RECORD'", "'REPEAT'", 
			"'SET'", "'THEN'", "'TO'", "'TYPE'", "'UNTIL'", "'WHILE'", "'WITH'", 
			"'+'", "'-'", "'*'", "'/'", "','", "'='", "'<>'", "'<'", "'<='", "'>='", 
			"'>'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'..'", "'{'", "'}'", 
			"'UNIT'", "'INTERFACE'", "'USES'", "'STRING'", "'IMPLEMENTATION'", "'TRUE'", 
			"'FALSE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PROGRAM", "CLASS", "EXTENDS", "BEGIN", "END", "PUBLIC", 
			"PRIVATE", "PROTECTED", "CONSTRUCTOR", "DESTRUCTOR", "NEW", "WRITELN", 
			"READLN", "VIRTUAL", "OVERRIDE", "INHERITED", "DESTROY", "VAR", "IDENTIFIER", 
			"STRING_LITERAL", "SEMI", "COLON", "LPAREN", "RPAREN", "ASSIGN", "DOT", 
			"WS", "AND", "ARRAY", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", 
			"DO", "DOWNTO", "ELSE", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
			"REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "WHILE", 
			"WITH", "PLUS", "MINUS", "STAR", "SLASH", "COMMA", "EQUAL", "NOT_EQUAL", 
			"LT", "LE", "GE", "GT", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", 
			"AT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", 
			"IMPLEMENTATION", "TRUE", "FALSE", "COMMENT_1", "COMMENT_2", "IDENT", 
			"NUM_INT", "NUM_REAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2c\u02e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\7\26\u0166\n\26\f\26\16\26\u0169\13\26\3\27"+
		"\3\27\3\27\3\27\7\27\u016f\n\27\f\27\16\27\u0172\13\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\6\36"+
		"\u0184\n\36\r\36\16\36\u0185\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3K\3K\3K\3L\3L\3"+
		"L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3U\3U\3V\3"+
		"V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\"+
		"\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\7^\u02ad\n^\f^\16^\u02b0\13^\3"+
		"^\3^\3^\3^\3^\3_\3_\7_\u02b9\n_\f_\16_\u02bc\13_\3_\3_\3_\3_\3`\3`\7`"+
		"\u02c4\n`\f`\16`\u02c7\13`\3a\6a\u02ca\na\ra\16a\u02cb\3b\6b\u02cf\nb"+
		"\rb\16b\u02d0\3b\3b\6b\u02d5\nb\rb\16b\u02d6\3b\5b\u02da\nb\5b\u02dc\n"+
		"b\3b\5b\u02df\nb\3c\3c\5c\u02e3\nc\3c\6c\u02e6\nc\rc\16c\u02e7\4\u02ae"+
		"\u02ba\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5\2\3\2"+
		"\35\4\2RRrr\4\2TTtt\4\2QQqq\4\2IIii\4\2CCcc\4\2OOoo\4\2EEee\4\2NNnn\4"+
		"\2UUuu\4\2GGgg\4\2ZZzz\4\2VVvv\4\2PPpp\4\2FFff\4\2DDdd\4\2KKkk\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2JJjj\4\2[[{{\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17"+
		"\17))\5\2\13\f\17\17\"\"\5\2\62;C\\aa\4\2--//\2\u02f6\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\3\u00c7\3\2\2"+
		"\2\5\u00d1\3\2\2\2\7\u00da\3\2\2\2\t\u00e2\3\2\2\2\13\u00e8\3\2\2\2\r"+
		"\u00f0\3\2\2\2\17\u00f6\3\2\2\2\21\u00fa\3\2\2\2\23\u0101\3\2\2\2\25\u0108"+
		"\3\2\2\2\27\u0112\3\2\2\2\31\u011e\3\2\2\2\33\u0129\3\2\2\2\35\u012d\3"+
		"\2\2\2\37\u0135\3\2\2\2!\u013c\3\2\2\2#\u0144\3\2\2\2%\u014d\3\2\2\2\'"+
		"\u0157\3\2\2\2)\u015f\3\2\2\2+\u0163\3\2\2\2-\u016a\3\2\2\2/\u0175\3\2"+
		"\2\2\61\u0177\3\2\2\2\63\u0179\3\2\2\2\65\u017b\3\2\2\2\67\u017d\3\2\2"+
		"\29\u0180\3\2\2\2;\u0183\3\2\2\2=\u0189\3\2\2\2?\u018d\3\2\2\2A\u0193"+
		"\3\2\2\2C\u019b\3\2\2\2E\u01a0\3\2\2\2G\u01a5\3\2\2\2I\u01a9\3\2\2\2K"+
		"\u01af\3\2\2\2M\u01b3\3\2\2\2O\u01b6\3\2\2\2Q\u01bd\3\2\2\2S\u01c2\3\2"+
		"\2\2U\u01c7\3\2\2\2W\u01cb\3\2\2\2Y\u01d4\3\2\2\2[\u01d9\3\2\2\2]\u01dc"+
		"\3\2\2\2_\u01df\3\2\2\2a\u01e7\3\2\2\2c\u01ed\3\2\2\2e\u01f1\3\2\2\2g"+
		"\u01f5\3\2\2\2i\u01f9\3\2\2\2k\u01fc\3\2\2\2m\u01ff\3\2\2\2o\u0206\3\2"+
		"\2\2q\u0210\3\2\2\2s\u0215\3\2\2\2u\u021c\3\2\2\2w\u0223\3\2\2\2y\u0227"+
		"\3\2\2\2{\u022c\3\2\2\2}\u022f\3\2\2\2\177\u0234\3\2\2\2\u0081\u023a\3"+
		"\2\2\2\u0083\u0240\3\2\2\2\u0085\u0245\3\2\2\2\u0087\u0247\3\2\2\2\u0089"+
		"\u0249\3\2\2\2\u008b\u024b\3\2\2\2\u008d\u024d\3\2\2\2\u008f\u024f\3\2"+
		"\2\2\u0091\u0251\3\2\2\2\u0093\u0254\3\2\2\2\u0095\u0256\3\2\2\2\u0097"+
		"\u0259\3\2\2\2\u0099\u025c\3\2\2\2\u009b\u025e\3\2\2\2\u009d\u0260\3\2"+
		"\2\2\u009f\u0263\3\2\2\2\u00a1\u0265\3\2\2\2\u00a3\u0268\3\2\2\2\u00a5"+
		"\u026a\3\2\2\2\u00a7\u026c\3\2\2\2\u00a9\u026f\3\2\2\2\u00ab\u0271\3\2"+
		"\2\2\u00ad\u0273\3\2\2\2\u00af\u0278\3\2\2\2\u00b1\u0282\3\2\2\2\u00b3"+
		"\u0287\3\2\2\2\u00b5\u028e\3\2\2\2\u00b7\u029d\3\2\2\2\u00b9\u02a2\3\2"+
		"\2\2\u00bb\u02a8\3\2\2\2\u00bd\u02b6\3\2\2\2\u00bf\u02c1\3\2\2\2\u00c1"+
		"\u02c9\3\2\2\2\u00c3\u02ce\3\2\2\2\u00c5\u02e0\3\2\2\2\u00c7\u00c8\7r"+
		"\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7t\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\4\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2"+
		"\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9\6\3\2\2\2\u00da\u00db\t\2"+
		"\2\2\u00db\u00dc\t\3\2\2\u00dc\u00dd\t\4\2\2\u00dd\u00de\t\5\2\2\u00de"+
		"\u00df\t\3\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e1\t\7\2\2\u00e1\b\3\2\2\2"+
		"\u00e2\u00e3\t\b\2\2\u00e3\u00e4\t\t\2\2\u00e4\u00e5\t\6\2\2\u00e5\u00e6"+
		"\t\n\2\2\u00e6\u00e7\t\n\2\2\u00e7\n\3\2\2\2\u00e8\u00e9\t\13\2\2\u00e9"+
		"\u00ea\t\f\2\2\u00ea\u00eb\t\r\2\2\u00eb\u00ec\t\13\2\2\u00ec\u00ed\t"+
		"\16\2\2\u00ed\u00ee\t\17\2\2\u00ee\u00ef\t\n\2\2\u00ef\f\3\2\2\2\u00f0"+
		"\u00f1\t\20\2\2\u00f1\u00f2\t\13\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f4\t"+
		"\21\2\2\u00f4\u00f5\t\16\2\2\u00f5\16\3\2\2\2\u00f6\u00f7\t\13\2\2\u00f7"+
		"\u00f8\t\16\2\2\u00f8\u00f9\t\17\2\2\u00f9\20\3\2\2\2\u00fa\u00fb\t\2"+
		"\2\2\u00fb\u00fc\t\22\2\2\u00fc\u00fd\t\20\2\2\u00fd\u00fe\t\t\2\2\u00fe"+
		"\u00ff\t\21\2\2\u00ff\u0100\t\b\2\2\u0100\22\3\2\2\2\u0101\u0102\t\2\2"+
		"\2\u0102\u0103\t\3\2\2\u0103\u0104\t\21\2\2\u0104\u0105\t\23\2\2\u0105"+
		"\u0106\t\6\2\2\u0106\u0107\t\r\2\2\u0107\24\3\2\2\2\u0108\u0109\t\2\2"+
		"\2\u0109\u010a\t\3\2\2\u010a\u010b\t\4\2\2\u010b\u010c\t\r\2\2\u010c\u010d"+
		"\t\13\2\2\u010d\u010e\t\b\2\2\u010e\u010f\t\r\2\2\u010f\u0110\t\13\2\2"+
		"\u0110\u0111\t\17\2\2\u0111\26\3\2\2\2\u0112\u0113\t\b\2\2\u0113\u0114"+
		"\t\4\2\2\u0114\u0115\t\16\2\2\u0115\u0116\t\n\2\2\u0116\u0117\t\r\2\2"+
		"\u0117\u0118\t\3\2\2\u0118\u0119\t\22\2\2\u0119\u011a\t\b\2\2\u011a\u011b"+
		"\t\r\2\2\u011b\u011c\t\4\2\2\u011c\u011d\t\3\2\2\u011d\30\3\2\2\2\u011e"+
		"\u011f\t\17\2\2\u011f\u0120\t\13\2\2\u0120\u0121\t\n\2\2\u0121\u0122\t"+
		"\r\2\2\u0122\u0123\t\3\2\2\u0123\u0124\t\22\2\2\u0124\u0125\t\b\2\2\u0125"+
		"\u0126\t\r\2\2\u0126\u0127\t\4\2\2\u0127\u0128\t\3\2\2\u0128\32\3\2\2"+
		"\2\u0129\u012a\t\16\2\2\u012a\u012b\t\13\2\2\u012b\u012c\t\24\2\2\u012c"+
		"\34\3\2\2\2\u012d\u012e\t\24\2\2\u012e\u012f\t\3\2\2\u012f\u0130\t\21"+
		"\2\2\u0130\u0131\t\r\2\2\u0131\u0132\t\13\2\2\u0132\u0133\t\t\2\2\u0133"+
		"\u0134\t\16\2\2\u0134\36\3\2\2\2\u0135\u0136\t\3\2\2\u0136\u0137\t\13"+
		"\2\2\u0137\u0138\t\6\2\2\u0138\u0139\t\17\2\2\u0139\u013a\t\t\2\2\u013a"+
		"\u013b\t\16\2\2\u013b \3\2\2\2\u013c\u013d\t\23\2\2\u013d\u013e\t\21\2"+
		"\2\u013e\u013f\t\3\2\2\u013f\u0140\t\r\2\2\u0140\u0141\t\22\2\2\u0141"+
		"\u0142\t\6\2\2\u0142\u0143\t\t\2\2\u0143\"\3\2\2\2\u0144\u0145\t\4\2\2"+
		"\u0145\u0146\t\23\2\2\u0146\u0147\t\13\2\2\u0147\u0148\t\3\2\2\u0148\u0149"+
		"\t\3\2\2\u0149\u014a\t\21\2\2\u014a\u014b\t\17\2\2\u014b\u014c\t\13\2"+
		"\2\u014c$\3\2\2\2\u014d\u014e\t\21\2\2\u014e\u014f\t\16\2\2\u014f\u0150"+
		"\t\25\2\2\u0150\u0151\t\13\2\2\u0151\u0152\t\3\2\2\u0152\u0153\t\21\2"+
		"\2\u0153\u0154\t\r\2\2\u0154\u0155\t\13\2\2\u0155\u0156\t\17\2\2\u0156"+
		"&\3\2\2\2\u0157\u0158\t\17\2\2\u0158\u0159\t\13\2\2\u0159\u015a\t\n\2"+
		"\2\u015a\u015b\t\r\2\2\u015b\u015c\t\3\2\2\u015c\u015d\t\4\2\2\u015d\u015e"+
		"\t\26\2\2\u015e(\3\2\2\2\u015f\u0160\t\23\2\2\u0160\u0161\t\6\2\2\u0161"+
		"\u0162\t\3\2\2\u0162*\3\2\2\2\u0163\u0167\t\27\2\2\u0164\u0166\t\30\2"+
		"\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168,\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0170\7)\2\2\u016b\u016f"+
		"\n\31\2\2\u016c\u016d\7)\2\2\u016d\u016f\7)\2\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7)\2\2\u0174"+
		".\3\2\2\2\u0175\u0176\7=\2\2\u0176\60\3\2\2\2\u0177\u0178\7<\2\2\u0178"+
		"\62\3\2\2\2\u0179\u017a\7*\2\2\u017a\64\3\2\2\2\u017b\u017c\7+\2\2\u017c"+
		"\66\3\2\2\2\u017d\u017e\7<\2\2\u017e\u017f\7?\2\2\u017f8\3\2\2\2\u0180"+
		"\u0181\7\60\2\2\u0181:\3\2\2\2\u0182\u0184\t\32\2\2\u0183\u0182\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0188\b\36\2\2\u0188<\3\2\2\2\u0189\u018a\7C\2\2\u018a"+
		"\u018b\7P\2\2\u018b\u018c\7F\2\2\u018c>\3\2\2\2\u018d\u018e\7C\2\2\u018e"+
		"\u018f\7T\2\2\u018f\u0190\7T\2\2\u0190\u0191\7C\2\2\u0191\u0192\7[\2\2"+
		"\u0192@\3\2\2\2\u0193\u0194\7D\2\2\u0194\u0195\7Q\2\2\u0195\u0196\7Q\2"+
		"\2\u0196\u0197\7N\2\2\u0197\u0198\7G\2\2\u0198\u0199\7C\2\2\u0199\u019a"+
		"\7P\2\2\u019aB\3\2\2\2\u019b\u019c\7E\2\2\u019c\u019d\7C\2\2\u019d\u019e"+
		"\7U\2\2\u019e\u019f\7G\2\2\u019fD\3\2\2\2\u01a0\u01a1\7E\2\2\u01a1\u01a2"+
		"\7J\2\2\u01a2\u01a3\7C\2\2\u01a3\u01a4\7T\2\2\u01a4F\3\2\2\2\u01a5\u01a6"+
		"\7E\2\2\u01a6\u01a7\7J\2\2\u01a7\u01a8\7T\2\2\u01a8H\3\2\2\2\u01a9\u01aa"+
		"\7E\2\2\u01aa\u01ab\7Q\2\2\u01ab\u01ac\7P\2\2\u01ac\u01ad\7U\2\2\u01ad"+
		"\u01ae\7V\2\2\u01aeJ\3\2\2\2\u01af\u01b0\7F\2\2\u01b0\u01b1\7K\2\2\u01b1"+
		"\u01b2\7X\2\2\u01b2L\3\2\2\2\u01b3\u01b4\7F\2\2\u01b4\u01b5\7Q\2\2\u01b5"+
		"N\3\2\2\2\u01b6\u01b7\7F\2\2\u01b7\u01b8\7Q\2\2\u01b8\u01b9\7Y\2\2\u01b9"+
		"\u01ba\7P\2\2\u01ba\u01bb\7V\2\2\u01bb\u01bc\7Q\2\2\u01bcP\3\2\2\2\u01bd"+
		"\u01be\7G\2\2\u01be\u01bf\7N\2\2\u01bf\u01c0\7U\2\2\u01c0\u01c1\7G\2\2"+
		"\u01c1R\3\2\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c5\7N\2"+
		"\2\u01c5\u01c6\7G\2\2\u01c6T\3\2\2\2\u01c7\u01c8\7H\2\2\u01c8\u01c9\7"+
		"Q\2\2\u01c9\u01ca\7T\2\2\u01caV\3\2\2\2\u01cb\u01cc\7H\2\2\u01cc\u01cd"+
		"\7W\2\2\u01cd\u01ce\7P\2\2\u01ce\u01cf\7E\2\2\u01cf\u01d0\7V\2\2\u01d0"+
		"\u01d1\7K\2\2\u01d1\u01d2\7Q\2\2\u01d2\u01d3\7P\2\2\u01d3X\3\2\2\2\u01d4"+
		"\u01d5\7I\2\2\u01d5\u01d6\7Q\2\2\u01d6\u01d7\7V\2\2\u01d7\u01d8\7Q\2\2"+
		"\u01d8Z\3\2\2\2\u01d9\u01da\7K\2\2\u01da\u01db\7H\2\2\u01db\\\3\2\2\2"+
		"\u01dc\u01dd\7K\2\2\u01dd\u01de\7P\2\2\u01de^\3\2\2\2\u01df\u01e0\7K\2"+
		"\2\u01e0\u01e1\7P\2\2\u01e1\u01e2\7V\2\2\u01e2\u01e3\7G\2\2\u01e3\u01e4"+
		"\7I\2\2\u01e4\u01e5\7G\2\2\u01e5\u01e6\7T\2\2\u01e6`\3\2\2\2\u01e7\u01e8"+
		"\7N\2\2\u01e8\u01e9\7C\2\2\u01e9\u01ea\7D\2\2\u01ea\u01eb\7G\2\2\u01eb"+
		"\u01ec\7N\2\2\u01ecb\3\2\2\2\u01ed\u01ee\7O\2\2\u01ee\u01ef\7Q\2\2\u01ef"+
		"\u01f0\7F\2\2\u01f0d\3\2\2\2\u01f1\u01f2\7P\2\2\u01f2\u01f3\7K\2\2\u01f3"+
		"\u01f4\7N\2\2\u01f4f\3\2\2\2\u01f5\u01f6\7P\2\2\u01f6\u01f7\7Q\2\2\u01f7"+
		"\u01f8\7V\2\2\u01f8h\3\2\2\2\u01f9\u01fa\7Q\2\2\u01fa\u01fb\7H\2\2\u01fb"+
		"j\3\2\2\2\u01fc\u01fd\7Q\2\2\u01fd\u01fe\7T\2\2\u01fel\3\2\2\2\u01ff\u0200"+
		"\7R\2\2\u0200\u0201\7C\2\2\u0201\u0202\7E\2\2\u0202\u0203\7M\2\2\u0203"+
		"\u0204\7G\2\2\u0204\u0205\7F\2\2\u0205n\3\2\2\2\u0206\u0207\7R\2\2\u0207"+
		"\u0208\7T\2\2\u0208\u0209\7Q\2\2\u0209\u020a\7E\2\2\u020a\u020b\7G\2\2"+
		"\u020b\u020c\7F\2\2\u020c\u020d\7W\2\2\u020d\u020e\7T\2\2\u020e\u020f"+
		"\7G\2\2\u020fp\3\2\2\2\u0210\u0211\7T\2\2\u0211\u0212\7G\2\2\u0212\u0213"+
		"\7C\2\2\u0213\u0214\7N\2\2\u0214r\3\2\2\2\u0215\u0216\7T\2\2\u0216\u0217"+
		"\7G\2\2\u0217\u0218\7E\2\2\u0218\u0219\7Q\2\2\u0219\u021a\7T\2\2\u021a"+
		"\u021b\7F\2\2\u021bt\3\2\2\2\u021c\u021d\7T\2\2\u021d\u021e\7G\2\2\u021e"+
		"\u021f\7R\2\2\u021f\u0220\7G\2\2\u0220\u0221\7C\2\2\u0221\u0222\7V\2\2"+
		"\u0222v\3\2\2\2\u0223\u0224\7U\2\2\u0224\u0225\7G\2\2\u0225\u0226\7V\2"+
		"\2\u0226x\3\2\2\2\u0227\u0228\7V\2\2\u0228\u0229\7J\2\2\u0229\u022a\7"+
		"G\2\2\u022a\u022b\7P\2\2\u022bz\3\2\2\2\u022c\u022d\7V\2\2\u022d\u022e"+
		"\7Q\2\2\u022e|\3\2\2\2\u022f\u0230\7V\2\2\u0230\u0231\7[\2\2\u0231\u0232"+
		"\7R\2\2\u0232\u0233\7G\2\2\u0233~\3\2\2\2\u0234\u0235\7W\2\2\u0235\u0236"+
		"\7P\2\2\u0236\u0237\7V\2\2\u0237\u0238\7K\2\2\u0238\u0239\7N\2\2\u0239"+
		"\u0080\3\2\2\2\u023a\u023b\7Y\2\2\u023b\u023c\7J\2\2\u023c\u023d\7K\2"+
		"\2\u023d\u023e\7N\2\2\u023e\u023f\7G\2\2\u023f\u0082\3\2\2\2\u0240\u0241"+
		"\7Y\2\2\u0241\u0242\7K\2\2\u0242\u0243\7V\2\2\u0243\u0244\7J\2\2\u0244"+
		"\u0084\3\2\2\2\u0245\u0246\7-\2\2\u0246\u0086\3\2\2\2\u0247\u0248\7/\2"+
		"\2\u0248\u0088\3\2\2\2\u0249\u024a\7,\2\2\u024a\u008a\3\2\2\2\u024b\u024c"+
		"\7\61\2\2\u024c\u008c\3\2\2\2\u024d\u024e\7.\2\2\u024e\u008e\3\2\2\2\u024f"+
		"\u0250\7?\2\2\u0250\u0090\3\2\2\2\u0251\u0252\7>\2\2\u0252\u0253\7@\2"+
		"\2\u0253\u0092\3\2\2\2\u0254\u0255\7>\2\2\u0255\u0094\3\2\2\2\u0256\u0257"+
		"\7>\2\2\u0257\u0258\7?\2\2\u0258\u0096\3\2\2\2\u0259\u025a\7@\2\2\u025a"+
		"\u025b\7?\2\2\u025b\u0098\3\2\2\2\u025c\u025d\7@\2\2\u025d\u009a\3\2\2"+
		"\2\u025e\u025f\7]\2\2\u025f\u009c\3\2\2\2\u0260\u0261\7*\2\2\u0261\u0262"+
		"\7\60\2\2\u0262\u009e\3\2\2\2\u0263\u0264\7_\2\2\u0264\u00a0\3\2\2\2\u0265"+
		"\u0266\7\60\2\2\u0266\u0267\7+\2\2\u0267\u00a2\3\2\2\2\u0268\u0269\7`"+
		"\2\2\u0269\u00a4\3\2\2\2\u026a\u026b\7B\2\2\u026b\u00a6\3\2\2\2\u026c"+
		"\u026d\7\60\2\2\u026d\u026e\7\60\2\2\u026e\u00a8\3\2\2\2\u026f\u0270\7"+
		"}\2\2\u0270\u00aa\3\2\2\2\u0271\u0272\7\177\2\2\u0272\u00ac\3\2\2\2\u0273"+
		"\u0274\7W\2\2\u0274\u0275\7P\2\2\u0275\u0276\7K\2\2\u0276\u0277\7V\2\2"+
		"\u0277\u00ae\3\2\2\2\u0278\u0279\7K\2\2\u0279\u027a\7P\2\2\u027a\u027b"+
		"\7V\2\2\u027b\u027c\7G\2\2\u027c\u027d\7T\2\2\u027d\u027e\7H\2\2\u027e"+
		"\u027f\7C\2\2\u027f\u0280\7E\2\2\u0280\u0281\7G\2\2\u0281\u00b0\3\2\2"+
		"\2\u0282\u0283\7W\2\2\u0283\u0284\7U\2\2\u0284\u0285\7G\2\2\u0285\u0286"+
		"\7U\2\2\u0286\u00b2\3\2\2\2\u0287\u0288\7U\2\2\u0288\u0289\7V\2\2\u0289"+
		"\u028a\7T\2\2\u028a\u028b\7K\2\2\u028b\u028c\7P\2\2\u028c\u028d\7I\2\2"+
		"\u028d\u00b4\3\2\2\2\u028e\u028f\7K\2\2\u028f\u0290\7O\2\2\u0290\u0291"+
		"\7R\2\2\u0291\u0292\7N\2\2\u0292\u0293\7G\2\2\u0293\u0294\7O\2\2\u0294"+
		"\u0295\7G\2\2\u0295\u0296\7P\2\2\u0296\u0297\7V\2\2\u0297\u0298\7C\2\2"+
		"\u0298\u0299\7V\2\2\u0299\u029a\7K\2\2\u029a\u029b\7Q\2\2\u029b\u029c"+
		"\7P\2\2\u029c\u00b6\3\2\2\2\u029d\u029e\7V\2\2\u029e\u029f\7T\2\2\u029f"+
		"\u02a0\7W\2\2\u02a0\u02a1\7G\2\2\u02a1\u00b8\3\2\2\2\u02a2\u02a3\7H\2"+
		"\2\u02a3\u02a4\7C\2\2\u02a4\u02a5\7N\2\2\u02a5\u02a6\7U\2\2\u02a6\u02a7"+
		"\7G\2\2\u02a7\u00ba\3\2\2\2\u02a8\u02a9\7*\2\2\u02a9\u02aa\7,\2\2\u02aa"+
		"\u02ae\3\2\2\2\u02ab\u02ad\13\2\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3"+
		"\2\2\2\u02ae\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b1\u02b2\7,\2\2\u02b2\u02b3\7+\2\2\u02b3\u02b4\3\2\2"+
		"\2\u02b4\u02b5\b^\2\2\u02b5\u00bc\3\2\2\2\u02b6\u02ba\7}\2\2\u02b7\u02b9"+
		"\13\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02bb\3\2\2\2"+
		"\u02ba\u02b8\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be"+
		"\7\177\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\b_\2\2\u02c0\u00be\3\2\2\2"+
		"\u02c1\u02c5\4C\\\2\u02c2\u02c4\t\33\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7"+
		"\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u00c0\3\2\2\2\u02c7"+
		"\u02c5\3\2\2\2\u02c8\u02ca\4\62;\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2"+
		"\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u00c2\3\2\2\2\u02cd"+
		"\u02cf\4\62;\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02de\3\2\2\2\u02d2\u02d4\7\60\2\2\u02d3"+
		"\u02d5\4\62;\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02da\5\u00c5c\2\u02d9"+
		"\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d2\3\2"+
		"\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02df\5\u00c5c\2\u02de"+
		"\u02db\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u00c4\3\2\2\2\u02e0\u02e2\7G"+
		"\2\2\u02e1\u02e3\t\34\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02e6\4\62;\2\u02e5\u02e4\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u00c6\3\2\2\2\22\2"+
		"\u0167\u016e\u0170\u0185\u02ae\u02ba\u02c5\u02cb\u02d0\u02d6\u02d9\u02db"+
		"\u02de\u02e2\u02e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}