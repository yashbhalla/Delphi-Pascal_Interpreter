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
		T__0=1, T__1=2, CLASS=3, EXTENDS=4, VIRTUAL=5, OVERRIDE=6, CONSTRUCTOR=7, 
		DESTRUCTOR=8, INHERITED=9, DESTROY=10, NEW=11, READLN=12, WRITELN=13, 
		PUBLIC=14, PRIVATE=15, PROTECTED=16, IDENTIFIER=17, STRING_LITERAL=18, 
		SEMI=19, COLON=20, LPAREN=21, RPAREN=22, ASSIGN=23, DOT=24, WS=25, AND=26, 
		ARRAY=27, BEGIN=28, BOOLEAN=29, CASE=30, CHAR=31, CHR=32, CONST=33, DIV=34, 
		DO=35, DOWNTO=36, ELSE=37, END=38, FILE=39, FOR=40, FUNCTION=41, GOTO=42, 
		IF=43, IN=44, INTEGER=45, LABEL=46, MOD=47, NIL=48, NOT=49, OF=50, OR=51, 
		PACKED=52, PROCEDURE=53, PROGRAM=54, REAL=55, RECORD=56, REPEAT=57, SET=58, 
		THEN=59, TO=60, TYPE=61, UNTIL=62, VAR=63, WHILE=64, WITH=65, PLUS=66, 
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
			"T__0", "T__1", "CLASS", "EXTENDS", "VIRTUAL", "OVERRIDE", "CONSTRUCTOR", 
			"DESTRUCTOR", "INHERITED", "DESTROY", "NEW", "READLN", "WRITELN", "PUBLIC", 
			"PRIVATE", "PROTECTED", "IDENTIFIER", "STRING_LITERAL", "SEMI", "COLON", 
			"LPAREN", "RPAREN", "ASSIGN", "DOT", "WS", "AND", "ARRAY", "BEGIN", "BOOLEAN", 
			"CASE", "CHAR", "CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", 
			"FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INTEGER", "LABEL", "MOD", 
			"NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "REAL", "RECORD", 
			"REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
			"PLUS", "MINUS", "STAR", "SLASH", "COMMA", "EQUAL", "NOT_EQUAL", "LT", 
			"LE", "GE", "GT", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", 
			"AT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", 
			"IMPLEMENTATION", "TRUE", "FALSE", "COMMENT_1", "COMMENT_2", "IDENT", 
			"NUM_INT", "NUM_REAL", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedure'", "'function'", "'CLASS'", "'EXTENDS'", "'VIRTUAL'", 
			"'OVERRIDE'", "'CONSTRUCTOR'", "'DESTRUCTOR'", "'INHERITED'", "'DESTROY'", 
			"'NEW'", "'READLN'", "'WRITELN'", "'PUBLIC'", "'PRIVATE'", "'PROTECTED'", 
			null, null, "';'", "':'", "'('", "')'", "':='", "'.'", null, "'AND'", 
			"'ARRAY'", "'BEGIN'", "'BOOLEAN'", "'CASE'", "'CHAR'", "'CHR'", "'CONST'", 
			"'DIV'", "'DO'", "'DOWNTO'", "'ELSE'", "'END'", "'FILE'", "'FOR'", "'FUNCTION'", 
			"'GOTO'", "'IF'", "'IN'", "'INTEGER'", "'LABEL'", "'MOD'", "'NIL'", "'NOT'", 
			"'OF'", "'OR'", "'PACKED'", "'PROCEDURE'", "'PROGRAM'", "'REAL'", "'RECORD'", 
			"'REPEAT'", "'SET'", "'THEN'", "'TO'", "'TYPE'", "'UNTIL'", "'VAR'", 
			"'WHILE'", "'WITH'", "'+'", "'-'", "'*'", "'/'", "','", "'='", "'<>'", 
			"'<'", "'<='", "'>='", "'>'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", 
			"'..'", "'{'", "'}'", "'UNIT'", "'INTERFACE'", "'USES'", "'STRING'", 
			"'IMPLEMENTATION'", "'TRUE'", "'FALSE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CLASS", "EXTENDS", "VIRTUAL", "OVERRIDE", "CONSTRUCTOR", 
			"DESTRUCTOR", "INHERITED", "DESTROY", "NEW", "READLN", "WRITELN", "PUBLIC", 
			"PRIVATE", "PROTECTED", "IDENTIFIER", "STRING_LITERAL", "SEMI", "COLON", 
			"LPAREN", "RPAREN", "ASSIGN", "DOT", "WS", "AND", "ARRAY", "BEGIN", "BOOLEAN", 
			"CASE", "CHAR", "CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", 
			"FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INTEGER", "LABEL", "MOD", 
			"NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "REAL", "RECORD", 
			"REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
			"PLUS", "MINUS", "STAR", "SLASH", "COMMA", "EQUAL", "NOT_EQUAL", "LT", 
			"LE", "GE", "GT", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2c\u02e8\b\1\4\2\t"+
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
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u0151\n\22"+
		"\f\22\16\22\u0154\13\22\3\23\3\23\7\23\u0158\n\23\f\23\16\23\u015b\13"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\6\32\u016d\n\32\r\32\16\32\u016e\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3K\3K\3K\3"+
		"L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3U\3"+
		"U\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\7^\u02ac\n^\f^\16^\u02af"+
		"\13^\3^\3^\3^\3^\3^\3_\3_\7_\u02b8\n_\f_\16_\u02bb\13_\3_\3_\3_\3_\3`"+
		"\3`\7`\u02c3\n`\f`\16`\u02c6\13`\3a\6a\u02c9\na\ra\16a\u02ca\3b\6b\u02ce"+
		"\nb\rb\16b\u02cf\3b\3b\6b\u02d4\nb\rb\16b\u02d5\3b\5b\u02d9\nb\5b\u02db"+
		"\nb\3b\5b\u02de\nb\3c\3c\5c\u02e2\nc\3c\6c\u02e5\nc\rc\16c\u02e6\5\u0159"+
		"\u02ad\u02b9\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"\2\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\5\2\62;C\\aa\4\2"+
		"--//\2\u02f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\3\u00c7\3\2\2\2\5\u00d1\3\2\2\2\7\u00da\3\2\2\2\t\u00e0"+
		"\3\2\2\2\13\u00e8\3\2\2\2\r\u00f0\3\2\2\2\17\u00f9\3\2\2\2\21\u0105\3"+
		"\2\2\2\23\u0110\3\2\2\2\25\u011a\3\2\2\2\27\u0122\3\2\2\2\31\u0126\3\2"+
		"\2\2\33\u012d\3\2\2\2\35\u0135\3\2\2\2\37\u013c\3\2\2\2!\u0144\3\2\2\2"+
		"#\u014e\3\2\2\2%\u0155\3\2\2\2\'\u015e\3\2\2\2)\u0160\3\2\2\2+\u0162\3"+
		"\2\2\2-\u0164\3\2\2\2/\u0166\3\2\2\2\61\u0169\3\2\2\2\63\u016c\3\2\2\2"+
		"\65\u0172\3\2\2\2\67\u0176\3\2\2\29\u017c\3\2\2\2;\u0182\3\2\2\2=\u018a"+
		"\3\2\2\2?\u018f\3\2\2\2A\u0194\3\2\2\2C\u0198\3\2\2\2E\u019e\3\2\2\2G"+
		"\u01a2\3\2\2\2I\u01a5\3\2\2\2K\u01ac\3\2\2\2M\u01b1\3\2\2\2O\u01b5\3\2"+
		"\2\2Q\u01ba\3\2\2\2S\u01be\3\2\2\2U\u01c7\3\2\2\2W\u01cc\3\2\2\2Y\u01cf"+
		"\3\2\2\2[\u01d2\3\2\2\2]\u01da\3\2\2\2_\u01e0\3\2\2\2a\u01e4\3\2\2\2c"+
		"\u01e8\3\2\2\2e\u01ec\3\2\2\2g\u01ef\3\2\2\2i\u01f2\3\2\2\2k\u01f9\3\2"+
		"\2\2m\u0203\3\2\2\2o\u020b\3\2\2\2q\u0210\3\2\2\2s\u0217\3\2\2\2u\u021e"+
		"\3\2\2\2w\u0222\3\2\2\2y\u0227\3\2\2\2{\u022a\3\2\2\2}\u022f\3\2\2\2\177"+
		"\u0235\3\2\2\2\u0081\u0239\3\2\2\2\u0083\u023f\3\2\2\2\u0085\u0244\3\2"+
		"\2\2\u0087\u0246\3\2\2\2\u0089\u0248\3\2\2\2\u008b\u024a\3\2\2\2\u008d"+
		"\u024c\3\2\2\2\u008f\u024e\3\2\2\2\u0091\u0250\3\2\2\2\u0093\u0253\3\2"+
		"\2\2\u0095\u0255\3\2\2\2\u0097\u0258\3\2\2\2\u0099\u025b\3\2\2\2\u009b"+
		"\u025d\3\2\2\2\u009d\u025f\3\2\2\2\u009f\u0262\3\2\2\2\u00a1\u0264\3\2"+
		"\2\2\u00a3\u0267\3\2\2\2\u00a5\u0269\3\2\2\2\u00a7\u026b\3\2\2\2\u00a9"+
		"\u026e\3\2\2\2\u00ab\u0270\3\2\2\2\u00ad\u0272\3\2\2\2\u00af\u0277\3\2"+
		"\2\2\u00b1\u0281\3\2\2\2\u00b3\u0286\3\2\2\2\u00b5\u028d\3\2\2\2\u00b7"+
		"\u029c\3\2\2\2\u00b9\u02a1\3\2\2\2\u00bb\u02a7\3\2\2\2\u00bd\u02b5\3\2"+
		"\2\2\u00bf\u02c0\3\2\2\2\u00c1\u02c8\3\2\2\2\u00c3\u02cd\3\2\2\2\u00c5"+
		"\u02df\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2"+
		"\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce"+
		"\7w\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\4\3\2\2\2\u00d1\u00d2"+
		"\7h\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7e\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\6\3\2\2\2\u00da\u00db\7E\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7C"+
		"\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7U\2\2\u00df\b\3\2\2\2\u00e0\u00e1"+
		"\7G\2\2\u00e1\u00e2\7Z\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7G\2\2\u00e4"+
		"\u00e5\7P\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7U\2\2\u00e7\n\3\2\2\2\u00e8"+
		"\u00e9\7X\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7V\2\2"+
		"\u00ec\u00ed\7W\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef\7N\2\2\u00ef\f\3\2"+
		"\2\2\u00f0\u00f1\7Q\2\2\u00f1\u00f2\7X\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f4"+
		"\7T\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7F\2\2\u00f7"+
		"\u00f8\7G\2\2\u00f8\16\3\2\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7Q\2\2\u00fb"+
		"\u00fc\7P\2\2\u00fc\u00fd\7U\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7T\2\2"+
		"\u00ff\u0100\7W\2\2\u0100\u0101\7E\2\2\u0101\u0102\7V\2\2\u0102\u0103"+
		"\7Q\2\2\u0103\u0104\7T\2\2\u0104\20\3\2\2\2\u0105\u0106\7F\2\2\u0106\u0107"+
		"\7G\2\2\u0107\u0108\7U\2\2\u0108\u0109\7V\2\2\u0109\u010a\7T\2\2\u010a"+
		"\u010b\7W\2\2\u010b\u010c\7E\2\2\u010c\u010d\7V\2\2\u010d\u010e\7Q\2\2"+
		"\u010e\u010f\7T\2\2\u010f\22\3\2\2\2\u0110\u0111\7K\2\2\u0111\u0112\7"+
		"P\2\2\u0112\u0113\7J\2\2\u0113\u0114\7G\2\2\u0114\u0115\7T\2\2\u0115\u0116"+
		"\7K\2\2\u0116\u0117\7V\2\2\u0117\u0118\7G\2\2\u0118\u0119\7F\2\2\u0119"+
		"\24\3\2\2\2\u011a\u011b\7F\2\2\u011b\u011c\7G\2\2\u011c\u011d\7U\2\2\u011d"+
		"\u011e\7V\2\2\u011e\u011f\7T\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7[\2\2"+
		"\u0121\26\3\2\2\2\u0122\u0123\7P\2\2\u0123\u0124\7G\2\2\u0124\u0125\7"+
		"Y\2\2\u0125\30\3\2\2\2\u0126\u0127\7T\2\2\u0127\u0128\7G\2\2\u0128\u0129"+
		"\7C\2\2\u0129\u012a\7F\2\2\u012a\u012b\7N\2\2\u012b\u012c\7P\2\2\u012c"+
		"\32\3\2\2\2\u012d\u012e\7Y\2\2\u012e\u012f\7T\2\2\u012f\u0130\7K\2\2\u0130"+
		"\u0131\7V\2\2\u0131\u0132\7G\2\2\u0132\u0133\7N\2\2\u0133\u0134\7P\2\2"+
		"\u0134\34\3\2\2\2\u0135\u0136\7R\2\2\u0136\u0137\7W\2\2\u0137\u0138\7"+
		"D\2\2\u0138\u0139\7N\2\2\u0139\u013a\7K\2\2\u013a\u013b\7E\2\2\u013b\36"+
		"\3\2\2\2\u013c\u013d\7R\2\2\u013d\u013e\7T\2\2\u013e\u013f\7K\2\2\u013f"+
		"\u0140\7X\2\2\u0140\u0141\7C\2\2\u0141\u0142\7V\2\2\u0142\u0143\7G\2\2"+
		"\u0143 \3\2\2\2\u0144\u0145\7R\2\2\u0145\u0146\7T\2\2\u0146\u0147\7Q\2"+
		"\2\u0147\u0148\7V\2\2\u0148\u0149\7G\2\2\u0149\u014a\7E\2\2\u014a\u014b"+
		"\7V\2\2\u014b\u014c\7G\2\2\u014c\u014d\7F\2\2\u014d\"\3\2\2\2\u014e\u0152"+
		"\t\2\2\2\u014f\u0151\t\3\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153$\3\2\2\2\u0154\u0152\3\2\2\2"+
		"\u0155\u0159\7$\2\2\u0156\u0158\13\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7$\2\2\u015d&\3\2\2\2\u015e\u015f\7=\2\2\u015f"+
		"(\3\2\2\2\u0160\u0161\7<\2\2\u0161*\3\2\2\2\u0162\u0163\7*\2\2\u0163,"+
		"\3\2\2\2\u0164\u0165\7+\2\2\u0165.\3\2\2\2\u0166\u0167\7<\2\2\u0167\u0168"+
		"\7?\2\2\u0168\60\3\2\2\2\u0169\u016a\7\60\2\2\u016a\62\3\2\2\2\u016b\u016d"+
		"\t\4\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\32\2\2\u0171\64\3\2\2"+
		"\2\u0172\u0173\7C\2\2\u0173\u0174\7P\2\2\u0174\u0175\7F\2\2\u0175\66\3"+
		"\2\2\2\u0176\u0177\7C\2\2\u0177\u0178\7T\2\2\u0178\u0179\7T\2\2\u0179"+
		"\u017a\7C\2\2\u017a\u017b\7[\2\2\u017b8\3\2\2\2\u017c\u017d\7D\2\2\u017d"+
		"\u017e\7G\2\2\u017e\u017f\7I\2\2\u017f\u0180\7K\2\2\u0180\u0181\7P\2\2"+
		"\u0181:\3\2\2\2\u0182\u0183\7D\2\2\u0183\u0184\7Q\2\2\u0184\u0185\7Q\2"+
		"\2\u0185\u0186\7N\2\2\u0186\u0187\7G\2\2\u0187\u0188\7C\2\2\u0188\u0189"+
		"\7P\2\2\u0189<\3\2\2\2\u018a\u018b\7E\2\2\u018b\u018c\7C\2\2\u018c\u018d"+
		"\7U\2\2\u018d\u018e\7G\2\2\u018e>\3\2\2\2\u018f\u0190\7E\2\2\u0190\u0191"+
		"\7J\2\2\u0191\u0192\7C\2\2\u0192\u0193\7T\2\2\u0193@\3\2\2\2\u0194\u0195"+
		"\7E\2\2\u0195\u0196\7J\2\2\u0196\u0197\7T\2\2\u0197B\3\2\2\2\u0198\u0199"+
		"\7E\2\2\u0199\u019a\7Q\2\2\u019a\u019b\7P\2\2\u019b\u019c\7U\2\2\u019c"+
		"\u019d\7V\2\2\u019dD\3\2\2\2\u019e\u019f\7F\2\2\u019f\u01a0\7K\2\2\u01a0"+
		"\u01a1\7X\2\2\u01a1F\3\2\2\2\u01a2\u01a3\7F\2\2\u01a3\u01a4\7Q\2\2\u01a4"+
		"H\3\2\2\2\u01a5\u01a6\7F\2\2\u01a6\u01a7\7Q\2\2\u01a7\u01a8\7Y\2\2\u01a8"+
		"\u01a9\7P\2\2\u01a9\u01aa\7V\2\2\u01aa\u01ab\7Q\2\2\u01abJ\3\2\2\2\u01ac"+
		"\u01ad\7G\2\2\u01ad\u01ae\7N\2\2\u01ae\u01af\7U\2\2\u01af\u01b0\7G\2\2"+
		"\u01b0L\3\2\2\2\u01b1\u01b2\7G\2\2\u01b2\u01b3\7P\2\2\u01b3\u01b4\7F\2"+
		"\2\u01b4N\3\2\2\2\u01b5\u01b6\7H\2\2\u01b6\u01b7\7K\2\2\u01b7\u01b8\7"+
		"N\2\2\u01b8\u01b9\7G\2\2\u01b9P\3\2\2\2\u01ba\u01bb\7H\2\2\u01bb\u01bc"+
		"\7Q\2\2\u01bc\u01bd\7T\2\2\u01bdR\3\2\2\2\u01be\u01bf\7H\2\2\u01bf\u01c0"+
		"\7W\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c2\7E\2\2\u01c2\u01c3\7V\2\2\u01c3"+
		"\u01c4\7K\2\2\u01c4\u01c5\7Q\2\2\u01c5\u01c6\7P\2\2\u01c6T\3\2\2\2\u01c7"+
		"\u01c8\7I\2\2\u01c8\u01c9\7Q\2\2\u01c9\u01ca\7V\2\2\u01ca\u01cb\7Q\2\2"+
		"\u01cbV\3\2\2\2\u01cc\u01cd\7K\2\2\u01cd\u01ce\7H\2\2\u01ceX\3\2\2\2\u01cf"+
		"\u01d0\7K\2\2\u01d0\u01d1\7P\2\2\u01d1Z\3\2\2\2\u01d2\u01d3\7K\2\2\u01d3"+
		"\u01d4\7P\2\2\u01d4\u01d5\7V\2\2\u01d5\u01d6\7G\2\2\u01d6\u01d7\7I\2\2"+
		"\u01d7\u01d8\7G\2\2\u01d8\u01d9\7T\2\2\u01d9\\\3\2\2\2\u01da\u01db\7N"+
		"\2\2\u01db\u01dc\7C\2\2\u01dc\u01dd\7D\2\2\u01dd\u01de\7G\2\2\u01de\u01df"+
		"\7N\2\2\u01df^\3\2\2\2\u01e0\u01e1\7O\2\2\u01e1\u01e2\7Q\2\2\u01e2\u01e3"+
		"\7F\2\2\u01e3`\3\2\2\2\u01e4\u01e5\7P\2\2\u01e5\u01e6\7K\2\2\u01e6\u01e7"+
		"\7N\2\2\u01e7b\3\2\2\2\u01e8\u01e9\7P\2\2\u01e9\u01ea\7Q\2\2\u01ea\u01eb"+
		"\7V\2\2\u01ebd\3\2\2\2\u01ec\u01ed\7Q\2\2\u01ed\u01ee\7H\2\2\u01eef\3"+
		"\2\2\2\u01ef\u01f0\7Q\2\2\u01f0\u01f1\7T\2\2\u01f1h\3\2\2\2\u01f2\u01f3"+
		"\7R\2\2\u01f3\u01f4\7C\2\2\u01f4\u01f5\7E\2\2\u01f5\u01f6\7M\2\2\u01f6"+
		"\u01f7\7G\2\2\u01f7\u01f8\7F\2\2\u01f8j\3\2\2\2\u01f9\u01fa\7R\2\2\u01fa"+
		"\u01fb\7T\2\2\u01fb\u01fc\7Q\2\2\u01fc\u01fd\7E\2\2\u01fd\u01fe\7G\2\2"+
		"\u01fe\u01ff\7F\2\2\u01ff\u0200\7W\2\2\u0200\u0201\7T\2\2\u0201\u0202"+
		"\7G\2\2\u0202l\3\2\2\2\u0203\u0204\7R\2\2\u0204\u0205\7T\2\2\u0205\u0206"+
		"\7Q\2\2\u0206\u0207\7I\2\2\u0207\u0208\7T\2\2\u0208\u0209\7C\2\2\u0209"+
		"\u020a\7O\2\2\u020an\3\2\2\2\u020b\u020c\7T\2\2\u020c\u020d\7G\2\2\u020d"+
		"\u020e\7C\2\2\u020e\u020f\7N\2\2\u020fp\3\2\2\2\u0210\u0211\7T\2\2\u0211"+
		"\u0212\7G\2\2\u0212\u0213\7E\2\2\u0213\u0214\7Q\2\2\u0214\u0215\7T\2\2"+
		"\u0215\u0216\7F\2\2\u0216r\3\2\2\2\u0217\u0218\7T\2\2\u0218\u0219\7G\2"+
		"\2\u0219\u021a\7R\2\2\u021a\u021b\7G\2\2\u021b\u021c\7C\2\2\u021c\u021d"+
		"\7V\2\2\u021dt\3\2\2\2\u021e\u021f\7U\2\2\u021f\u0220\7G\2\2\u0220\u0221"+
		"\7V\2\2\u0221v\3\2\2\2\u0222\u0223\7V\2\2\u0223\u0224\7J\2\2\u0224\u0225"+
		"\7G\2\2\u0225\u0226\7P\2\2\u0226x\3\2\2\2\u0227\u0228\7V\2\2\u0228\u0229"+
		"\7Q\2\2\u0229z\3\2\2\2\u022a\u022b\7V\2\2\u022b\u022c\7[\2\2\u022c\u022d"+
		"\7R\2\2\u022d\u022e\7G\2\2\u022e|\3\2\2\2\u022f\u0230\7W\2\2\u0230\u0231"+
		"\7P\2\2\u0231\u0232\7V\2\2\u0232\u0233\7K\2\2\u0233\u0234\7N\2\2\u0234"+
		"~\3\2\2\2\u0235\u0236\7X\2\2\u0236\u0237\7C\2\2\u0237\u0238\7T\2\2\u0238"+
		"\u0080\3\2\2\2\u0239\u023a\7Y\2\2\u023a\u023b\7J\2\2\u023b\u023c\7K\2"+
		"\2\u023c\u023d\7N\2\2\u023d\u023e\7G\2\2\u023e\u0082\3\2\2\2\u023f\u0240"+
		"\7Y\2\2\u0240\u0241\7K\2\2\u0241\u0242\7V\2\2\u0242\u0243\7J\2\2\u0243"+
		"\u0084\3\2\2\2\u0244\u0245\7-\2\2\u0245\u0086\3\2\2\2\u0246\u0247\7/\2"+
		"\2\u0247\u0088\3\2\2\2\u0248\u0249\7,\2\2\u0249\u008a\3\2\2\2\u024a\u024b"+
		"\7\61\2\2\u024b\u008c\3\2\2\2\u024c\u024d\7.\2\2\u024d\u008e\3\2\2\2\u024e"+
		"\u024f\7?\2\2\u024f\u0090\3\2\2\2\u0250\u0251\7>\2\2\u0251\u0252\7@\2"+
		"\2\u0252\u0092\3\2\2\2\u0253\u0254\7>\2\2\u0254\u0094\3\2\2\2\u0255\u0256"+
		"\7>\2\2\u0256\u0257\7?\2\2\u0257\u0096\3\2\2\2\u0258\u0259\7@\2\2\u0259"+
		"\u025a\7?\2\2\u025a\u0098\3\2\2\2\u025b\u025c\7@\2\2\u025c\u009a\3\2\2"+
		"\2\u025d\u025e\7]\2\2\u025e\u009c\3\2\2\2\u025f\u0260\7*\2\2\u0260\u0261"+
		"\7\60\2\2\u0261\u009e\3\2\2\2\u0262\u0263\7_\2\2\u0263\u00a0\3\2\2\2\u0264"+
		"\u0265\7\60\2\2\u0265\u0266\7+\2\2\u0266\u00a2\3\2\2\2\u0267\u0268\7`"+
		"\2\2\u0268\u00a4\3\2\2\2\u0269\u026a\7B\2\2\u026a\u00a6\3\2\2\2\u026b"+
		"\u026c\7\60\2\2\u026c\u026d\7\60\2\2\u026d\u00a8\3\2\2\2\u026e\u026f\7"+
		"}\2\2\u026f\u00aa\3\2\2\2\u0270\u0271\7\177\2\2\u0271\u00ac\3\2\2\2\u0272"+
		"\u0273\7W\2\2\u0273\u0274\7P\2\2\u0274\u0275\7K\2\2\u0275\u0276\7V\2\2"+
		"\u0276\u00ae\3\2\2\2\u0277\u0278\7K\2\2\u0278\u0279\7P\2\2\u0279\u027a"+
		"\7V\2\2\u027a\u027b\7G\2\2\u027b\u027c\7T\2\2\u027c\u027d\7H\2\2\u027d"+
		"\u027e\7C\2\2\u027e\u027f\7E\2\2\u027f\u0280\7G\2\2\u0280\u00b0\3\2\2"+
		"\2\u0281\u0282\7W\2\2\u0282\u0283\7U\2\2\u0283\u0284\7G\2\2\u0284\u0285"+
		"\7U\2\2\u0285\u00b2\3\2\2\2\u0286\u0287\7U\2\2\u0287\u0288\7V\2\2\u0288"+
		"\u0289\7T\2\2\u0289\u028a\7K\2\2\u028a\u028b\7P\2\2\u028b\u028c\7I\2\2"+
		"\u028c\u00b4\3\2\2\2\u028d\u028e\7K\2\2\u028e\u028f\7O\2\2\u028f\u0290"+
		"\7R\2\2\u0290\u0291\7N\2\2\u0291\u0292\7G\2\2\u0292\u0293\7O\2\2\u0293"+
		"\u0294\7G\2\2\u0294\u0295\7P\2\2\u0295\u0296\7V\2\2\u0296\u0297\7C\2\2"+
		"\u0297\u0298\7V\2\2\u0298\u0299\7K\2\2\u0299\u029a\7Q\2\2\u029a\u029b"+
		"\7P\2\2\u029b\u00b6\3\2\2\2\u029c\u029d\7V\2\2\u029d\u029e\7T\2\2\u029e"+
		"\u029f\7W\2\2\u029f\u02a0\7G\2\2\u02a0\u00b8\3\2\2\2\u02a1\u02a2\7H\2"+
		"\2\u02a2\u02a3\7C\2\2\u02a3\u02a4\7N\2\2\u02a4\u02a5\7U\2\2\u02a5\u02a6"+
		"\7G\2\2\u02a6\u00ba\3\2\2\2\u02a7\u02a8\7*\2\2\u02a8\u02a9\7,\2\2\u02a9"+
		"\u02ad\3\2\2\2\u02aa\u02ac\13\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3"+
		"\2\2\2\u02ad\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\u02b1\7,\2\2\u02b1\u02b2\7+\2\2\u02b2\u02b3\3\2\2"+
		"\2\u02b3\u02b4\b^\2\2\u02b4\u00bc\3\2\2\2\u02b5\u02b9\7}\2\2\u02b6\u02b8"+
		"\13\2\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02ba\3\2\2\2"+
		"\u02b9\u02b7\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd"+
		"\7\177\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\b_\2\2\u02bf\u00be\3\2\2\2"+
		"\u02c0\u02c4\4C\\\2\u02c1\u02c3\t\5\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6"+
		"\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u00c0\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02c9\4\62;\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u00c2\3\2\2\2\u02cc"+
		"\u02ce\4\62;\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02dd\3\2\2\2\u02d1\u02d3\7\60\2\2\u02d2"+
		"\u02d4\4\62;\2\u02d3\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d9\5\u00c5c\2\u02d8"+
		"\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d1\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02de\5\u00c5c\2\u02dd"+
		"\u02da\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u00c4\3\2\2\2\u02df\u02e1\7G"+
		"\2\2\u02e0\u02e2\t\6\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e4\3\2\2\2\u02e3\u02e5\4\62;\2\u02e4\u02e3\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u00c6\3\2\2\2\21\2"+
		"\u0152\u0159\u016e\u02ad\u02b9\u02c4\u02ca\u02cf\u02d5\u02d8\u02da\u02dd"+
		"\u02e1\u02e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}