// Generated from ASPgrammar.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import java.util.HashMap;
import java.util.LinkedList; 

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASPgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, RSBRACK=3, LSBRACK=4, RCBRACK=5, LCBRACK=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, AND=11, OR=12, GT=13, LT=14, GEG=15, LEG=16, EQUALS=17, 
		DISTINCT=18, NOT=19, SKIP=20, COMMA=21, COLON=22, SEMI=23, DOT=24, NULL=25, 
		TRUE=26, FALSE=27, CLASS=28, RETURN=29, THIS=30, NEW=31, NEWACT=32, IF=33, 
		THEN=34, ELSE=35, ID=36, NUMBER=37, WS=38, LINECOMENTS=39, BLOCKCOMENTS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('"
	};
	public static final String[] ruleNames = {
		"LPAR", "RPAR", "RSBRACK", "LSBRACK", "RCBRACK", "LCBRACK", "PLUS", "MINUS", 
		"MULT", "DIV", "AND", "OR", "GT", "LT", "GEG", "LEG", "EQUALS", "DISTINCT", 
		"NOT", "SKIP", "COMMA", "COLON", "SEMI", "DOT", "NULL", "TRUE", "FALSE", 
		"CLASS", "RETURN", "THIS", "NEW", "NEWACT", "IF", "THEN", "ELSE", "CHAR", 
		"ID", "DIGIT", "NUMBER", "WS", "LINECOMENTS", "BLOCKCOMENTS"
	};


	public ASPgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ASPgrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\7&\u00d2\n&\f&\16&\u00d5\13&\3\'\3"+
		"\'\3(\6(\u00da\n(\r(\16(\u00db\3)\3)\3)\3)\3*\3*\3*\3*\7*\u00e6\n*\f*"+
		"\16*\u00e9\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u00f6\n+\f+\16+\u00f9"+
		"\13+\3+\3+\3+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K&M\2O\'Q(S)U*\3\2\b\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\u0104\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3"+
		"\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21e\3"+
		"\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31n\3\2\2\2\33q\3\2\2\2\35"+
		"s\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0082"+
		"\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2"+
		"\63\u008f\3\2\2\2\65\u0094\3\2\2\2\67\u0099\3\2\2\29\u009f\3\2\2\2;\u00a5"+
		"\3\2\2\2=\u00ac\3\2\2\2?\u00b1\3\2\2\2A\u00b5\3\2\2\2C\u00bf\3\2\2\2E"+
		"\u00c2\3\2\2\2G\u00c7\3\2\2\2I\u00cc\3\2\2\2K\u00ce\3\2\2\2M\u00d6\3\2"+
		"\2\2O\u00d9\3\2\2\2Q\u00dd\3\2\2\2S\u00e1\3\2\2\2U\u00ec\3\2\2\2WX\7*"+
		"\2\2X\4\3\2\2\2YZ\7+\2\2Z\6\3\2\2\2[\\\7_\2\2\\\b\3\2\2\2]^\7]\2\2^\n"+
		"\3\2\2\2_`\7\177\2\2`\f\3\2\2\2ab\7}\2\2b\16\3\2\2\2cd\7-\2\2d\20\3\2"+
		"\2\2ef\7/\2\2f\22\3\2\2\2gh\7,\2\2h\24\3\2\2\2ij\7\61\2\2j\26\3\2\2\2"+
		"kl\7(\2\2lm\7(\2\2m\30\3\2\2\2no\7~\2\2op\7~\2\2p\32\3\2\2\2qr\7@\2\2"+
		"r\34\3\2\2\2st\7>\2\2t\36\3\2\2\2uv\7@\2\2vw\7?\2\2w \3\2\2\2xy\7>\2\2"+
		"yz\7?\2\2z\"\3\2\2\2{|\7?\2\2|$\3\2\2\2}~\7#\2\2~\177\7?\2\2\177&\3\2"+
		"\2\2\u0080\u0081\7#\2\2\u0081(\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7m\2\2\u0084\u0085\7k\2\2\u0085\u0086\7r\2\2\u0086*\3\2\2\2\u0087\u0088"+
		"\7.\2\2\u0088,\3\2\2\2\u0089\u008a\7<\2\2\u008a.\3\2\2\2\u008b\u008c\7"+
		"=\2\2\u008c\60\3\2\2\2\u008d\u008e\7\60\2\2\u008e\62\3\2\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7w\2\2\u0091\u0092\7n\2\2\u0092\u0093\7n\2\2\u0093"+
		"\64\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7g\2\2\u0098\66\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3\u00a4\7u\2\2\u00a4:\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2"+
		"\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7p\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7u\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7y\2\2\u00b4@\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7e\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7g\2\2"+
		"\u00beB\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1D\3\2\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2"+
		"\u00c6F\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2"+
		"\2\u00ca\u00cb\7g\2\2\u00cbH\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cdJ\3\2\2"+
		"\2\u00ce\u00d3\5I%\2\u00cf\u00d2\5I%\2\u00d0\u00d2\5M\'\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4L\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\4\62;\2"+
		"\u00d7N\3\2\2\2\u00d8\u00da\5M\'\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcP\3\2\2\2\u00dd\u00de"+
		"\t\3\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b)\2\2\u00e0R\3\2\2\2\u00e1\u00e2"+
		"\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\n\4\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b*\2\2\u00eb"+
		"T\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\7,\2\2\u00ee\u00f7\3\2\2\2"+
		"\u00ef\u00f6\n\5\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f6\n\6\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3\u00f6\n\7\2\2\u00f4\u00f6\5U+\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7\61\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\b+\2\2\u00feV\3\2\2\2\t\2\u00d1\u00d3\u00db\u00e7\u00f5"+
		"\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}