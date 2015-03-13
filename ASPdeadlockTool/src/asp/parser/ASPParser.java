// Generated from ASP.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import java.util.HashMap;
import java.util.LinkedList; 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASPParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "']'", "'['", "'}'", "'{'", "'+'", "'-'", "'*'", 
		"'/'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'!'", 
		"'skip'", "','", "':'", "';'", "'.'", "'null'", "'true'", "'false'", "'class'", 
		"'return'", "'this'", "'new'", "'newActive'", "'if'", "'then'", "'else'", 
		"ID", "NUMBER", "WS", "LINECOMENTS", "BLOCKCOMENTS"
	};
	public static final int
		RULE_prog = 0, RULE_methodSign = 1, RULE_methodDef = 2, RULE_classDec = 3, 
		RULE_body = 4, RULE_varDec = 5, RULE_parDef = 6, RULE_type = 7, RULE_listvar = 8, 
		RULE_stmt = 9, RULE_stmtblock = 10, RULE_exprse = 11, RULE_expr = 12, 
		RULE_elem = 13, RULE_val = 14, RULE_expra = 15, RULE_exprb = 16, RULE_lcbrak = 17, 
		RULE_rcbrak = 18;
	public static final String[] ruleNames = {
		"prog", "methodSign", "methodDef", "classDec", "body", "varDec", "parDef", 
		"type", "listvar", "stmt", "stmtblock", "exprse", "expr", "elem", "val", 
		"expra", "exprb", "lcbrak", "rcbrak"
	};

	@Override
	public String getGrammarFileName() { return "ASP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(38); classDec();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); body();
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

	public static class MethodSignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public List<ParDefContext> parDef() {
			return getRuleContexts(ParDefContext.class);
		}
		public ParDefContext parDef(int i) {
			return getRuleContext(ParDefContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public MethodSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterMethodSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitMethodSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitMethodSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignContext methodSign() throws RecognitionException {
		MethodSignContext _localctx = new MethodSignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); type();
			setState(47); match(ID);
			setState(48); match(LPAR);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(49); parDef(0);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(RPAR);
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

	public static class MethodDefContext extends ParserRuleContext {
		public MethodSignContext methodSign() {
			return getRuleContext(MethodSignContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitMethodDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); methodSign();
			setState(58); body();
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

	public static class ClassDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public List<ParDefContext> parDef() {
			return getRuleContexts(ParDefContext.class);
		}
		public ParDefContext parDef(int i) {
			return getRuleContext(ParDefContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public TerminalNode CLASS() { return getToken(ASPParser.CLASS, 0); }
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitClassDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitClassDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(CLASS);
			setState(61); match(ID);
			setState(62); match(LPAR);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(63); parDef(0);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(RPAR);
			setState(70); match(LCBRACK);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71); varDec();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(77); methodDef();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(RCBRACK);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(LCBRACK);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); varDec();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(92); stmt();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(RCBRACK);
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

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); type();
			setState(101); listvar(0);
			setState(102); match(SEMI);
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

	public static class ParDefContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ASPParser.COMMA, 0); }
		public List<ParDefContext> parDef() {
			return getRuleContexts(ParDefContext.class);
		}
		public ParDefContext parDef(int i) {
			return getRuleContext(ParDefContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public ParDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterParDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitParDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitParDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParDefContext parDef() throws RecognitionException {
		return parDef(0);
	}

	private ParDefContext parDef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParDefContext _localctx = new ParDefContext(_ctx, _parentState);
		ParDefContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_parDef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105); type();
			setState(106); listvar(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParDefContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parDef);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109); match(COMMA);
					setState(110); parDef(3);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(ID);
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

	public static class ListvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ASPParser.COMMA, 0); }
		public ListvarContext listvar(int i) {
			return getRuleContext(ListvarContext.class,i);
		}
		public List<ListvarContext> listvar() {
			return getRuleContexts(ListvarContext.class);
		}
		public ListvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterListvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitListvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitListvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListvarContext listvar() throws RecognitionException {
		return listvar(0);
	}

	private ListvarContext listvar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListvarContext _localctx = new ListvarContext(_ctx, _parentState);
		ListvarContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_listvar, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListvarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listvar);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122); match(COMMA);
					setState(123); listvar(3);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public TerminalNode ELSE() { return getToken(ASPParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ASPParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ASPParser.THEN, 0); }
		public ExprseContext exprse() {
			return getRuleContext(ExprseContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(ASPParser.EQUALS, 0); }
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(ASPParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode SKIP() { return getToken(ASPParser.SKIP, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(SKIP);
				setState(130); match(SEMI);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(ID);
				setState(132); match(EQUALS);
				setState(133); exprse();
				setState(134); match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); match(IF);
				{
				setState(137); exprb(0);
				}
				setState(138); match(THEN);
				setState(141);
				switch (_input.LA(1)) {
				case SKIP:
				case RETURN:
				case IF:
				case ID:
					{
					setState(139); stmt();
					}
					break;
				case LCBRACK:
					{
					setState(140); stmtblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(143); match(ELSE);
					setState(146);
					switch (_input.LA(1)) {
					case SKIP:
					case RETURN:
					case IF:
					case ID:
						{
						setState(144); stmt();
						}
						break;
					case LCBRACK:
						{
						setState(145); stmtblock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(RETURN);
				setState(151); expr();
				setState(152); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtblockContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmtblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(LCBRACK);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(157); stmt();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(RCBRACK);
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

	public static class ExprseContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ASPParser.DOT, 0); }
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode NEWACT() { return getToken(ASPParser.NEWACT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ASPParser.NEW, 0); }
		public ExprseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExprse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExprse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExprse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprseContext exprse() throws RecognitionException {
		ExprseContext _localctx = new ExprseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprse);
		int _la;
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); elem();
				setState(167); match(DOT);
				setState(168); match(ID);
				setState(169); match(LPAR);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(170); expr();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176); match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); match(NEW);
				setState(179); match(ID);
				setState(180); match(LPAR);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(181); expr();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187); match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188); match(NEWACT);
				setState(189); match(ID);
				setState(190); match(LPAR);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(191); expr();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197); match(RPAR);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExpraContext expra() {
			return getRuleContext(ExpraContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public ExprbContext exprb() {
			return getRuleContext(ExprbContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); elem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); expra(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); exprb(0);
				}
				break;
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

	public static class ElemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public TerminalNode THIS() { return getToken(ASPParser.THIS, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ASPParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(ASPParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ASPParser.TRUE, 0); }
		public TerminalNode NUMBER() { return getToken(ASPParser.NUMBER, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPParser.ID, 0); }
		public ExpraContext expra(int i) {
			return getRuleContext(ExpraContext.class,i);
		}
		public List<ExpraContext> expra() {
			return getRuleContexts(ExpraContext.class);
		}
		public TerminalNode NUMBER() { return getToken(ASPParser.NUMBER, 0); }
		public ExpraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExpra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExpra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExpra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpraContext expra() throws RecognitionException {
		return expra(0);
	}

	private ExpraContext expra(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpraContext _localctx = new ExpraContext(_ctx, _parentState);
		ExpraContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expra, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(211); match(NUMBER);
				}
				break;
			case ID:
				{
				setState(212); match(ID);
				}
				break;
			case LPAR:
				{
				setState(213); match(LPAR);
				setState(214); expra(0);
				setState(215); match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expra);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(221); expra(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expra);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(224); expra(5);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprbContext extends ParserRuleContext {
		public ExprbContext exprb(int i) {
			return getRuleContext(ExprbContext.class,i);
		}
		public TerminalNode LT() { return getToken(ASPParser.LT, 0); }
		public ExpraContext expra() {
			return getRuleContext(ExpraContext.class,0);
		}
		public TerminalNode GT() { return getToken(ASPParser.GT, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode OR() { return getToken(ASPParser.OR, 0); }
		public List<ExprbContext> exprb() {
			return getRuleContexts(ExprbContext.class);
		}
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public TerminalNode GEG() { return getToken(ASPParser.GEG, 0); }
		public TerminalNode NOT() { return getToken(ASPParser.NOT, 0); }
		public TerminalNode LEG() { return getToken(ASPParser.LEG, 0); }
		public TerminalNode EQUALS() { return getToken(ASPParser.EQUALS, 0); }
		public TerminalNode AND() { return getToken(ASPParser.AND, 0); }
		public TerminalNode DISTINCT() { return getToken(ASPParser.DISTINCT, 0); }
		public ExprbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExprb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExprb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExprb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprbContext exprb() throws RecognitionException {
		return exprb(0);
	}

	private ExprbContext exprb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprbContext _localctx = new ExprbContext(_ctx, _parentState);
		ExprbContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exprb, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(231); match(NOT);
				setState(232); exprb(6);
				}
				break;
			case 2:
				{
				setState(233); expra(0);
				}
				break;
			case 3:
				{
				setState(234); val();
				}
				break;
			case 4:
				{
				setState(235); elem();
				}
				break;
			case 5:
				{
				setState(236); match(LPAR);
				setState(237); exprb(0);
				setState(238); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprbContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprb);
					setState(242);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(243);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEG) | (1L << LEG) | (1L << EQUALS) | (1L << DISTINCT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(244); exprb(6);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LcbrakContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public LcbrakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcbrak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterLcbrak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitLcbrak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitLcbrak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcbrakContext lcbrak() throws RecognitionException {
		LcbrakContext _localctx = new LcbrakContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(LCBRACK);
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

	public static class RcbrakContext extends ParserRuleContext {
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public RcbrakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcbrak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterRcbrak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitRcbrak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitRcbrak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcbrakContext rcbrak() throws RecognitionException {
		RcbrakContext _localctx = new RcbrakContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(RCBRACK);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return parDef_sempred((ParDefContext)_localctx, predIndex);
		case 8: return listvar_sempred((ListvarContext)_localctx, predIndex);
		case 15: return expra_sempred((ExpraContext)_localctx, predIndex);
		case 16: return exprb_sempred((ExprbContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listvar_sempred(ListvarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprb_sempred(ExprbContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expra_sempred(ExpraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean parDef_sempred(ParDefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5C"+
		"\n\5\f\5\16\5F\13\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\7\5Q\n\5\f"+
		"\5\16\5T\13\5\3\5\3\5\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\7\6`\n\6\f\6"+
		"\16\6c\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n"+
		"\b\f\b\16\bu\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n"+
		"\u0082\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0090\n\13\3\13\3\13\3\13\5\13\u0095\n\13\5\13\u0097\n\13\3\13\3"+
		"\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\5\r\u00c9\n\r\3\16\3\16\3"+
		"\16\3\16\5\16\u00cf\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00dc\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e4\n"+
		"\21\f\21\16\21\u00e7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00f3\n\22\3\22\3\22\3\22\7\22\u00f8\n\22\f\22\16\22\u00fb"+
		"\13\22\3\23\3\23\3\24\3\24\3\24\2\6\16\22 \"\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\7\4\2  &&\4\2\33\35\'\'\3\2\13\f\3\2\t\n\3\2\r"+
		"\24\u010f\2+\3\2\2\2\4\60\3\2\2\2\6;\3\2\2\2\b>\3\2\2\2\nW\3\2\2\2\ff"+
		"\3\2\2\2\16j\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24\u009c\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00c8\3\2\2\2\32\u00ce\3\2\2\2\34\u00d0\3\2\2\2\36\u00d2\3"+
		"\2\2\2 \u00db\3\2\2\2\"\u00f2\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(*"+
		"\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2."+
		"/\5\n\6\2/\3\3\2\2\2\60\61\5\20\t\2\61\62\7&\2\2\62\66\7\3\2\2\63\65\5"+
		"\16\b\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\66\3\2\2\29:\7\4\2\2:\5\3\2\2\2;<\5\4\3\2<=\5\n\6\2=\7\3\2\2\2>"+
		"?\7\36\2\2?@\7&\2\2@D\7\3\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\4\2\2HL\7\b\2\2IK\5\f\7\2JI\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\6\4\2PO\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\7\2\2V\t\3\2\2"+
		"\2W[\7\b\2\2XZ\5\f\7\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2"+
		"\2\2][\3\2\2\2^`\5\24\13\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ca\3\2\2\2de\7\7\2\2e\13\3\2\2\2fg\5\20\t\2gh\5\22\n\2hi\7\31\2"+
		"\2i\r\3\2\2\2jk\b\b\1\2kl\5\20\t\2lm\5\22\n\2ms\3\2\2\2no\f\4\2\2op\7"+
		"\27\2\2pr\5\16\b\5qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2"+
		"us\3\2\2\2vw\7&\2\2w\21\3\2\2\2xy\b\n\1\2yz\7&\2\2z\u0080\3\2\2\2{|\f"+
		"\4\2\2|}\7\27\2\2}\177\5\22\n\5~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\23\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\7\26\2\2\u0084\u009d\7\31\2\2\u0085\u0086\7&\2\2\u0086\u0087\7\23\2\2"+
		"\u0087\u0088\5\30\r\2\u0088\u0089\7\31\2\2\u0089\u009d\3\2\2\2\u008a\u008b"+
		"\7#\2\2\u008b\u008c\5\"\22\2\u008c\u008f\7$\2\2\u008d\u0090\5\24\13\2"+
		"\u008e\u0090\5\26\f\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0096"+
		"\3\2\2\2\u0091\u0094\7%\2\2\u0092\u0095\5\24\13\2\u0093\u0095\5\26\f\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0091"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009d\3\2\2\2\u0098\u0099\7\37\2\2"+
		"\u0099\u009a\5\32\16\2\u009a\u009b\7\31\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0083\3\2\2\2\u009c\u0085\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009d\25\3\2\2\2\u009e\u00a2\7\b\2\2\u009f\u00a1\5\24\13\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00c9\5\32\16\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7"+
		"\32\2\2\u00aa\u00ab\7&\2\2\u00ab\u00af\7\3\2\2\u00ac\u00ae\5\32\16\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3"+
		"\u00c9\3\2\2\2\u00b4\u00b5\7!\2\2\u00b5\u00b6\7&\2\2\u00b6\u00ba\7\3\2"+
		"\2\u00b7\u00b9\5\32\16\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00c9\7\4\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\7&\2\2\u00c0"+
		"\u00c4\7\3\2\2\u00c1\u00c3\5\32\16\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c9\7\4\2\2\u00c8\u00a7\3\2\2\2\u00c8\u00a8\3\2"+
		"\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00be\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00cf"+
		"\5\36\20\2\u00cb\u00cf\5\34\17\2\u00cc\u00cf\5 \21\2\u00cd\u00cf\5\"\22"+
		"\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d3"+
		"\t\3\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\b\21\1\2\u00d5\u00dc\7\'\2\2\u00d6"+
		"\u00dc\7&\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\7\4"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d6\3\2\2\2\u00db"+
		"\u00d7\3\2\2\2\u00dc\u00e5\3\2\2\2\u00dd\u00de\f\7\2\2\u00de\u00df\t\4"+
		"\2\2\u00df\u00e4\5 \21\b\u00e0\u00e1\f\6\2\2\u00e1\u00e2\t\5\2\2\u00e2"+
		"\u00e4\5 \21\7\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00e9\b\22\1\2\u00e9\u00ea\7\25\2\2\u00ea\u00f3\5\"\22"+
		"\b\u00eb\u00f3\5 \21\2\u00ec\u00f3\5\36\20\2\u00ed\u00f3\5\34\17\2\u00ee"+
		"\u00ef\7\3\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f1\7\4\2\2\u00f1\u00f3\3"+
		"\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2"+
		"\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5\f\7"+
		"\2\2\u00f5\u00f6\t\6\2\2\u00f6\u00f8\5\"\22\b\u00f7\u00f4\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa#\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd%\3\2\2\2\u00fe\u00ff\7"+
		"\7\2\2\u00ff\'\3\2\2\2\32+\66DLR[as\u0080\u008f\u0094\u0096\u009c\u00a2"+
		"\u00af\u00ba\u00c4\u00c8\u00ce\u00db\u00e3\u00e5\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}