// Generated from ASPgrammar.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import asp.models.Class;
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
		THEN=34, ELSE=35, INT=36, BOOL=37, ID=38, NUMBER=39, WS=40, LINECOMENTS=41, 
		BLOCKCOMENTS=42;
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
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"LPAR", "RPAR", "RSBRACK", "LSBRACK", "RCBRACK", "LCBRACK", "PLUS", "MINUS", 
		"MULT", "DIV", "AND", "OR", "GT", "LT", "GEG", "LEG", "EQUALS", "DISTINCT", 
		"NOT", "SKIP", "COMMA", "COLON", "SEMI", "DOT", "NULL", "TRUE", "FALSE", 
		"CLASS", "RETURN", "THIS", "NEW", "NEWACT", "IF", "THEN", "ELSE", "INT", 
		"BOOL", "CHAR", "ID", "DIGIT", "NUMBER", "WS", "LINECOMENTS", "BLOCKCOMENTS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\3"+
		"(\3(\7(\u00df\n(\f(\16(\u00e2\13(\3)\3)\3*\6*\u00e7\n*\r*\16*\u00e8\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\7,\u00f3\n,\f,\16,\u00f6\13,\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\7-\u0103\n-\f-\16-\u0106\13-\3-\3-\3-\3-\3-\2\2.\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M\2O(Q\2S)U*W+Y,\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\u0111\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2"+
		"\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2"+
		"\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35w\3"+
		"\2\2\2\37y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2"+
		"\2)\u0086\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u008f\3\2\2\2\61\u0091"+
		"\3\2\2\2\63\u0093\3\2\2\2\65\u0098\3\2\2\2\67\u009d\3\2\2\29\u00a3\3\2"+
		"\2\2;\u00a9\3\2\2\2=\u00b0\3\2\2\2?\u00b5\3\2\2\2A\u00b9\3\2\2\2C\u00c3"+
		"\3\2\2\2E\u00c6\3\2\2\2G\u00cb\3\2\2\2I\u00d0\3\2\2\2K\u00d4\3\2\2\2M"+
		"\u00d9\3\2\2\2O\u00db\3\2\2\2Q\u00e3\3\2\2\2S\u00e6\3\2\2\2U\u00ea\3\2"+
		"\2\2W\u00ee\3\2\2\2Y\u00f9\3\2\2\2[\\\7*\2\2\\\4\3\2\2\2]^\7+\2\2^\6\3"+
		"\2\2\2_`\7_\2\2`\b\3\2\2\2ab\7]\2\2b\n\3\2\2\2cd\7\177\2\2d\f\3\2\2\2"+
		"ef\7}\2\2f\16\3\2\2\2gh\7-\2\2h\20\3\2\2\2ij\7/\2\2j\22\3\2\2\2kl\7,\2"+
		"\2l\24\3\2\2\2mn\7\61\2\2n\26\3\2\2\2op\7(\2\2pq\7(\2\2q\30\3\2\2\2rs"+
		"\7~\2\2st\7~\2\2t\32\3\2\2\2uv\7@\2\2v\34\3\2\2\2wx\7>\2\2x\36\3\2\2\2"+
		"yz\7@\2\2z{\7?\2\2{ \3\2\2\2|}\7>\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7"+
		"?\2\2\u0080$\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0083\7?\2\2\u0083&\3\2"+
		"\2\2\u0084\u0085\7#\2\2\u0085(\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088"+
		"\7m\2\2\u0088\u0089\7k\2\2\u0089\u008a\7r\2\2\u008a*\3\2\2\2\u008b\u008c"+
		"\7.\2\2\u008c,\3\2\2\2\u008d\u008e\7<\2\2\u008e.\3\2\2\2\u008f\u0090\7"+
		"=\2\2\u0090\60\3\2\2\2\u0091\u0092\7\60\2\2\u0092\62\3\2\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7w\2\2\u0095\u0096\7n\2\2\u0096\u0097\7n\2\2\u0097"+
		"\64\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b"+
		"\u009c\7g\2\2\u009c\66\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a28\3\2\2\2\u00a3"+
		"\u00a4\7e\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7u\2\2"+
		"\u00a7\u00a8\7u\2\2\u00a8:\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2"+
		"\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af"+
		"\7p\2\2\u00af<\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7u\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7y\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7e\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2B\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5D\3\2\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2"+
		"\u00caF\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7v\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7n\2\2\u00d8L\3\2\2\2\u00d9\u00da"+
		"\t\2\2\2\u00daN\3\2\2\2\u00db\u00e0\5M\'\2\u00dc\u00df\5M\'\2\u00dd\u00df"+
		"\5Q)\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1P\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e4\4\62;\2\u00e4R\3\2\2\2\u00e5\u00e7\5Q)\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"T\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b+\2\2\u00ed"+
		"V\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f4\3\2\2"+
		"\2\u00f1\u00f3\n\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\b,\2\2\u00f8X\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\u0104\3\2\2\2\u00fc\u0103\n\5\2\2\u00fd\u00fe\7\61\2\2\u00fe\u0103\n"+
		"\6\2\2\u00ff\u0100\7,\2\2\u0100\u0103\n\7\2\2\u0101\u0103\5Y-\2\u0102"+
		"\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7,\2\2\u0108\u0109\7\61"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b-\2\2\u010bZ\3\2\2\2\t\2\u00de\u00e0"+
		"\u00e8\u00f4\u0102\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}