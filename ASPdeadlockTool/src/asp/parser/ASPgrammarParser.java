// Generated from ASPgrammar.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import asp.models.Class;
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
public class ASPgrammarParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "']'", "'['", "'}'", "'{'", "'+'", "'-'", "'*'", 
		"'/'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'='", "'!='", "'!'", 
		"'skip'", "','", "':'", "';'", "'.'", "'null'", "'true'", "'false'", "'class'", 
		"'return'", "'this'", "'new'", "'newActive'", "'if'", "'then'", "'else'", 
		"'int'", "'bool'", "ID", "NUMBER", "WS", "LINECOMENTS", "BLOCKCOMENTS"
	};
	public static final int
		RULE_program = 0, RULE_classDec = 1, RULE_methodDef = 2, RULE_body = 3, 
		RULE_varDec = 4, RULE_parDef = 5, RULE_type = 6, RULE_variable = 7, RULE_stmt = 8, 
		RULE_stmtblock = 9, RULE_expressionSideEffect = 10, RULE_expression = 11, 
		RULE_arithmeticExpression = 12, RULE_booleanExpression = 13, RULE_value = 14, 
		RULE_element = 15, RULE_lcbrak = 16, RULE_rcbrak = 17;
	public static final String[] ruleNames = {
		"program", "classDec", "methodDef", "body", "varDec", "parDef", "type", 
		"variable", "stmt", "stmtblock", "expressionSideEffect", "expression", 
		"arithmeticExpression", "booleanExpression", "value", "element", "lcbrak", 
		"rcbrak"
	};

	@Override
	public String getGrammarFileName() { return "ASPgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASPgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program prog;
		public ClassDecContext classDec;
		public BodyContext main;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		HashMap<String, Class> classMap = new HashMap<>();
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
				setState(36); ((ProgramContext)_localctx).classDec = classDec();
				classMap.put(((ProgramContext)_localctx).classDec.classObj.getClassName(),((ProgramContext)_localctx).classDec.classObj);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); ((ProgramContext)_localctx).main = body();
			((ProgramContext)_localctx).prog =  new Program(classMap, ((ProgramContext)_localctx).main.stb);
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
		public Class classObj;
		public Token className;
		public ParDefContext parameters;
		public VarDecContext fields;
		public MethodDefContext method;
		public TerminalNode LCBRACK() { return getToken(ASPgrammarParser.LCBRACK, 0); }
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public ParDefContext parDef() {
			return getRuleContext(ParDefContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPgrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPgrammarParser.RPAR, 0); }
		public TerminalNode CLASS() { return getToken(ASPgrammarParser.CLASS, 0); }
		public TerminalNode RCBRACK() { return getToken(ASPgrammarParser.RCBRACK, 0); }
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitClassDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitClassDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDec);
		HashMap<String, Method> methods = new HashMap<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(CLASS);
			setState(48); ((ClassDecContext)_localctx).className = match(ID);
			setState(49); match(LPAR);
			{
			setState(50); ((ClassDecContext)_localctx).parameters = parDef();
			}
			setState(51); match(RPAR);
			setState(52); match(LCBRACK);
			setState(53); ((ClassDecContext)_localctx).fields = varDec();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(54); ((ClassDecContext)_localctx).method = methodDef();
				methods.put(((ClassDecContext)_localctx).method.methodSign.getMethodName(),((ClassDecContext)_localctx).method.methodSign);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(RCBRACK);

							    	 ((ClassDecContext)_localctx).classObj =  new Class( (((ClassDecContext)_localctx).className!=null?((ClassDecContext)_localctx).className.getText():null),
							    	 					    ((ClassDecContext)_localctx).parameters.pars, 
							    	 					    ((ClassDecContext)_localctx).fields.vars,
							    	 					    methods
							    	 					   );
							    
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
		public Method methodSign;
		public TypeContext returnedType;
		public Token methodName;
		public ParDefContext p;
		public BodyContext b;
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public ParDefContext parDef() {
			return getRuleContext(ParDefContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPgrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPgrammarParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitMethodDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDef);
		HashMap<TypeBase,Variable> parameters = new HashMap<>(); 
							    HashMap<String,Variable> varDec = new HashMap<>();
								LinkedList<Statement> stmts = new LinkedList<>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); ((MethodDefContext)_localctx).returnedType = type();
			setState(66); ((MethodDefContext)_localctx).methodName = match(ID);
			setState(67); match(LPAR);
			{
			setState(68); ((MethodDefContext)_localctx).p = parDef();
			}
			setState(69); match(RPAR);
			setState(70); ((MethodDefContext)_localctx).b = body();
			((MethodDefContext)_localctx).methodSign =  new Method(((MethodDefContext)_localctx).returnedType.varType, (((MethodDefContext)_localctx).methodName!=null?((MethodDefContext)_localctx).methodName.getText():null), ((MethodDefContext)_localctx).p.pars,((MethodDefContext)_localctx).b.stb); 
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
		public StmtBlock stb;
		public VarDecContext v;
		public StmtContext st;
		public TerminalNode LCBRACK() { return getToken(ASPgrammarParser.LCBRACK, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RCBRACK() { return getToken(ASPgrammarParser.RCBRACK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		LinkedList<Statement> stmts = new LinkedList<>();
						  	HashMap<TypeBase,Variable> vars = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(LCBRACK);
			{
			setState(74); ((BodyContext)_localctx).v = varDec();
			vars=((BodyContext)_localctx).v.vars;
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(77); ((BodyContext)_localctx).st = stmt();
				stmts.add(((BodyContext)_localctx).st.s);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(RCBRACK);
			((BodyContext)_localctx).stb =  new StmtBlock(vars,stmts);
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
		public HashMap<TypeBase,Variable> vars;
		public TypeContext t;
		public VariableContext v;
		public List<TerminalNode> SEMI() { return getTokens(ASPgrammarParser.SEMI); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(ASPgrammarParser.SEMI, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDec);
		 ((VarDecContext)_localctx).vars =  new HashMap<>();
					   		  TypeBase type = null; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88); ((VarDecContext)_localctx).t = type();
					setState(89); ((VarDecContext)_localctx).v = variable();
					setState(90); match(SEMI);
					 type = ((VarDecContext)_localctx).t.varType;
					     								      _localctx.vars.put(type,((VarDecContext)_localctx).v.var);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
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
		public HashMap<TypeBase,Variable> pars;
		public TypeContext t;
		public VariableContext v;
		public TypeContext t1;
		public VariableContext v1;
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASPgrammarParser.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ASPgrammarParser.COMMA, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public ParDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterParDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitParDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitParDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParDefContext parDef() throws RecognitionException {
		ParDefContext _localctx = new ParDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parDef);
		((ParDefContext)_localctx).pars =  new HashMap<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(98); ((ParDefContext)_localctx).t = type();
				setState(99); ((ParDefContext)_localctx).v = variable();
				_localctx.pars.put(((ParDefContext)_localctx).t.varType,((ParDefContext)_localctx).v.var);
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104); match(COMMA);
				setState(105); ((ParDefContext)_localctx).t1 = type();
				setState(106); ((ParDefContext)_localctx).v1 = variable();
				_localctx.pars.put(((ParDefContext)_localctx).t1.varType,((ParDefContext)_localctx).v1.var);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeBase varType;
		public Token ID;
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(ASPgrammarParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(ASPgrammarParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); ((TypeContext)_localctx).ID = match(ID);
				((TypeContext)_localctx).varType =  new TypeObject((((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(INT);
				((TypeContext)_localctx).varType =  new TypeInt();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(BOOL);
				((TypeContext)_localctx).varType =  new TypeBool();
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

	public static class VariableContext extends ParserRuleContext {
		public Variable var;
		public Token v;
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((VariableContext)_localctx).v = match(ID);
			((VariableContext)_localctx).var =  new Variable((((VariableContext)_localctx).v!=null?((VariableContext)_localctx).v.getText():null));
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

	public static class StmtContext extends ParserRuleContext {
		public Statement s;
		public Token l;
		public ExpressionSideEffectContext r;
		public BooleanExpressionContext guard;
		public StmtContext trueSideS;
		public StmtblockContext trueSideSB;
		public StmtContext falseSideS;
		public StmtblockContext falseSideSB;
		public ExpressionContext e;
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public TerminalNode ELSE() { return getToken(ASPgrammarParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ASPgrammarParser.IF, 0); }
		public TerminalNode THEN() { return getToken(ASPgrammarParser.THEN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPgrammarParser.LPAR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode EQUALS() { return getToken(ASPgrammarParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(ASPgrammarParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(ASPgrammarParser.SEMI, 0); }
		public TerminalNode SKIP() { return getToken(ASPgrammarParser.SKIP, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ASPgrammarParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSideEffectContext expressionSideEffect() {
			return getRuleContext(ExpressionSideEffectContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		  Variable var = null;
							ExpressionSideEffects exprse = null;
							Expression cond = null;
							Statement stTrue = null;
							Statement stFalse = null; 
		try {
			setState(169);
			switch (_input.LA(1)) {
			case SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(SKIP);
				setState(126); match(SEMI);
				((StmtContext)_localctx).s =  new Skip();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); ((StmtContext)_localctx).l = match(ID);
				var = new Variable((((StmtContext)_localctx).l!=null?((StmtContext)_localctx).l.getText():null));
				setState(130); match(EQUALS);
				setState(131); ((StmtContext)_localctx).r = expressionSideEffect();
				exprse = ((StmtContext)_localctx).r.exprse;
				setState(133); match(SEMI);
				((StmtContext)_localctx).s =  new Assignment(var,exprse);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); match(IF);
				setState(137); match(LPAR);
				{
				setState(138); ((StmtContext)_localctx).guard = booleanExpression(0);
				cond = ((StmtContext)_localctx).guard.exprBool;
				}
				setState(141); match(RPAR);
				setState(142); match(THEN);
				setState(149);
				switch (_input.LA(1)) {
				case SKIP:
				case RETURN:
				case IF:
				case ID:
					{
					setState(143); ((StmtContext)_localctx).trueSideS = stmt();
					stTrue = ((StmtContext)_localctx).trueSideS.s;
					}
					break;
				case LCBRACK:
					{
					setState(146); ((StmtContext)_localctx).trueSideSB = stmtblock();
					stTrue = ((StmtContext)_localctx).trueSideSB.stb;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(151); match(ELSE);
					setState(158);
					switch (_input.LA(1)) {
					case SKIP:
					case RETURN:
					case IF:
					case ID:
						{
						setState(152); ((StmtContext)_localctx).falseSideS = stmt();
						stFalse = ((StmtContext)_localctx).falseSideS.s;
						}
						break;
					case LCBRACK:
						{
						setState(155); ((StmtContext)_localctx).falseSideSB = stmtblock();
						stFalse = ((StmtContext)_localctx).falseSideSB.stb;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				((StmtContext)_localctx).s =  new IfThenElse(cond,stTrue,stFalse);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(164); match(RETURN);
				setState(165); ((StmtContext)_localctx).e = expression();
				setState(166); match(SEMI);
				((StmtContext)_localctx).s =  new Return(((StmtContext)_localctx).e.expr);
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
		public StmtBlock stb;
		public StmtContext st;
		public TerminalNode LCBRACK() { return getToken(ASPgrammarParser.LCBRACK, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RCBRACK() { return getToken(ASPgrammarParser.RCBRACK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtblock);
		((StmtblockContext)_localctx).stb =  new StmtBlock();
						  		LinkedList<Statement> stmts = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(LCBRACK);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(172); ((StmtblockContext)_localctx).st = stmt();
				stmts.add(((StmtblockContext)_localctx).st.s);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); match(RCBRACK);
			_localctx.stb.setStmts(stmts);
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

	public static class ExpressionSideEffectContext extends ParserRuleContext {
		public ExpressionSideEffects exprse;
		public ExpressionContext exp;
		public ElementContext elem;
		public Token methodName;
		public ExpressionContext par;
		public Token className;
		public TerminalNode DOT() { return getToken(ASPgrammarParser.DOT, 0); }
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode NEWACT() { return getToken(ASPgrammarParser.NEWACT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPgrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPgrammarParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode NEW() { return getToken(ASPgrammarParser.NEW, 0); }
		public ExpressionSideEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSideEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterExpressionSideEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitExpressionSideEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitExpressionSideEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSideEffectContext expressionSideEffect() throws RecognitionException {
		ExpressionSideEffectContext _localctx = new ExpressionSideEffectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionSideEffect);
		LinkedList<Expression> param = new LinkedList<>();
									 	   Variable obj = null;
		int _la;
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); ((ExpressionSideEffectContext)_localctx).exp = expression();
				((ExpressionSideEffectContext)_localctx).exprse = ((ExpressionSideEffectContext)_localctx).exp.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); ((ExpressionSideEffectContext)_localctx).elem = element();
				obj = new Variable((((ExpressionSideEffectContext)_localctx).elem!=null?_input.getText(((ExpressionSideEffectContext)_localctx).elem.start,((ExpressionSideEffectContext)_localctx).elem.stop):null));
				setState(188); match(DOT);
				setState(189); ((ExpressionSideEffectContext)_localctx).methodName = match(ID);
				setState(190); match(LPAR);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(191); ((ExpressionSideEffectContext)_localctx).par = expression();
					param.add(((ExpressionSideEffectContext)_localctx).par.expr);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199); match(RPAR);
				((ExpressionSideEffectContext)_localctx).exprse =  new MethodCall(obj,(((ExpressionSideEffectContext)_localctx).methodName!=null?((ExpressionSideEffectContext)_localctx).methodName.getText():null),param);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); match(NEW);
				setState(203); ((ExpressionSideEffectContext)_localctx).className = match(ID);
				setState(204); match(LPAR);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(205); ((ExpressionSideEffectContext)_localctx).par = expression();
					param.add(((ExpressionSideEffectContext)_localctx).par.expr);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213); match(RPAR);
				((ExpressionSideEffectContext)_localctx).exprse =  new New((((ExpressionSideEffectContext)_localctx).className!=null?((ExpressionSideEffectContext)_localctx).className.getText():null),param);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215); match(NEWACT);
				setState(216); ((ExpressionSideEffectContext)_localctx).className = match(ID);
				setState(217); match(LPAR);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(218); ((ExpressionSideEffectContext)_localctx).par = expression();
					param.add(((ExpressionSideEffectContext)_localctx).par.expr);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226); match(RPAR);
				((ExpressionSideEffectContext)_localctx).exprse =  new NewActive((((ExpressionSideEffectContext)_localctx).className!=null?((ExpressionSideEffectContext)_localctx).className.getText():null),param);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expr;
		public ValueContext v;
		public ElementContext el;
		public ArithmeticExpressionContext expra;
		public BooleanExpressionContext exprb;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); ((ExpressionContext)_localctx).v = value();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).v.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); ((ExpressionContext)_localctx).el = element();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).el.elem;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); ((ExpressionContext)_localctx).expra = arithmeticExpression(0);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expra.exprArit;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239); ((ExpressionContext)_localctx).exprb = booleanExpression(0);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).exprb.exprBool;
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public Expression exprArit;
		public ArithmeticExpressionContext l;
		public Token n;
		public Token v;
		public Token o;
		public ArithmeticExpressionContext r;
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public TerminalNode NUMBER() { return getToken(ASPgrammarParser.NUMBER, 0); }
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(245); ((ArithmeticExpressionContext)_localctx).n = match(NUMBER);
				((ArithmeticExpressionContext)_localctx).exprArit =  new ExpressionIntValue(Integer.parseInt((((ArithmeticExpressionContext)_localctx).n!=null?((ArithmeticExpressionContext)_localctx).n.getText():null)));
				}
				break;
			case ID:
				{
				setState(247); ((ArithmeticExpressionContext)_localctx).v = match(ID);
				((ArithmeticExpressionContext)_localctx).exprArit =  new Variable((((ArithmeticExpressionContext)_localctx).v!=null?((ArithmeticExpressionContext)_localctx).v.getText():null));
				}
				break;
			case LPAR:
				{
				setState(249); match(LPAR);
				setState(250); arithmeticExpression(0);
				setState(251); match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(255);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(256);
						((ArithmeticExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ArithmeticExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(257); ((ArithmeticExpressionContext)_localctx).r = arithmeticExpression(6);
						((ArithmeticExpressionContext)_localctx).exprArit =  new ExpressionBinaryOperation(((ArithmeticExpressionContext)_localctx).l.exprArit,(((ArithmeticExpressionContext)_localctx).o!=null?((ArithmeticExpressionContext)_localctx).o.getText():null),((ArithmeticExpressionContext)_localctx).r.exprArit);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(260);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(261);
						((ArithmeticExpressionContext)_localctx).o = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(262); ((ArithmeticExpressionContext)_localctx).r = arithmeticExpression(5);
						((ArithmeticExpressionContext)_localctx).exprArit =  new ExpressionBinaryOperation(((ArithmeticExpressionContext)_localctx).l.exprArit,(((ArithmeticExpressionContext)_localctx).o!=null?((ArithmeticExpressionContext)_localctx).o.getText():null),((ArithmeticExpressionContext)_localctx).r.exprArit);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public Expression exprBool;
		public BooleanExpressionContext l;
		public Token n;
		public BooleanExpressionContext exb;
		public ArithmeticExpressionContext exa;
		public ValueContext v;
		public ElementContext e;
		public Token o;
		public BooleanExpressionContext r;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode LT() { return getToken(ASPgrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(ASPgrammarParser.GT, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public TerminalNode OR() { return getToken(ASPgrammarParser.OR, 0); }
		public TerminalNode GEG() { return getToken(ASPgrammarParser.GEG, 0); }
		public TerminalNode NOT() { return getToken(ASPgrammarParser.NOT, 0); }
		public TerminalNode LEG() { return getToken(ASPgrammarParser.LEG, 0); }
		public TerminalNode EQUALS() { return getToken(ASPgrammarParser.EQUALS, 0); }
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ASPgrammarParser.AND, 0); }
		public TerminalNode DISTINCT() { return getToken(ASPgrammarParser.DISTINCT, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271); ((BooleanExpressionContext)_localctx).n = match(NOT);
				setState(272); ((BooleanExpressionContext)_localctx).exb = booleanExpression(6);
				((BooleanExpressionContext)_localctx).exprBool =  new ExpressionUnaryOperation((((BooleanExpressionContext)_localctx).n!=null?((BooleanExpressionContext)_localctx).n.getText():null),((BooleanExpressionContext)_localctx).exb.exprBool);
				}
				break;
			case 2:
				{
				setState(275); ((BooleanExpressionContext)_localctx).exa = arithmeticExpression(0);
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).exa.exprArit;
				}
				break;
			case 3:
				{
				setState(278); ((BooleanExpressionContext)_localctx).v = value();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).v.val;
				}
				break;
			case 4:
				{
				setState(281); ((BooleanExpressionContext)_localctx).e = element();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).e.elem;
				}
				break;
			case 5:
				{
				setState(284); match(LPAR);
				setState(285); booleanExpression(0);
				setState(286); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
					setState(290);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(291);
					((BooleanExpressionContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEG) | (1L << LEG) | (1L << EQUALS) | (1L << DISTINCT))) != 0)) ) {
						((BooleanExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(292); ((BooleanExpressionContext)_localctx).r = booleanExpression(6);
					((BooleanExpressionContext)_localctx).exprBool =  new ExpressionBinaryOperation(((BooleanExpressionContext)_localctx).l.exprBool,(((BooleanExpressionContext)_localctx).o!=null?((BooleanExpressionContext)_localctx).o.getText():null),((BooleanExpressionContext)_localctx).r.exprBool);
					}
					} 
				}
				setState(299);
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

	public static class ValueContext extends ParserRuleContext {
		public ExpressionValue val;
		public Token n;
		public Token t;
		public Token f;
		public TerminalNode NULL() { return getToken(ASPgrammarParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(ASPgrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ASPgrammarParser.TRUE, 0); }
		public TerminalNode NUMBER() { return getToken(ASPgrammarParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); match(NULL);
				((ValueContext)_localctx).val =  new ExpressionNullValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); ((ValueContext)_localctx).n = match(NUMBER);
				((ValueContext)_localctx).val =  new ExpressionIntValue(Integer.parseInt((((ValueContext)_localctx).n!=null?((ValueContext)_localctx).n.getText():null)));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); ((ValueContext)_localctx).t = match(TRUE);
				((ValueContext)_localctx).val =  new ExpressionBoolValue(Boolean.parseBoolean((((ValueContext)_localctx).t!=null?((ValueContext)_localctx).t.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(306); ((ValueContext)_localctx).f = match(FALSE);
				((ValueContext)_localctx).val =  new ExpressionBoolValue(Boolean.parseBoolean((((ValueContext)_localctx).f!=null?((ValueContext)_localctx).f.getText():null)));
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

	public static class ElementContext extends ParserRuleContext {
		public Element elem;
		public Token ID;
		public Token t;
		public TerminalNode ID() { return getToken(ASPgrammarParser.ID, 0); }
		public TerminalNode THIS() { return getToken(ASPgrammarParser.THIS, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_element);
		try {
			setState(314);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); ((ElementContext)_localctx).ID = match(ID);
				((ElementContext)_localctx).elem =  new Variable((((ElementContext)_localctx).ID!=null?((ElementContext)_localctx).ID.getText():null));
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); ((ElementContext)_localctx).t = match(THIS);
				((ElementContext)_localctx).elem =  new ExpressionValue((((ElementContext)_localctx).t!=null?((ElementContext)_localctx).t.getText():null));
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

	public static class LcbrakContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(ASPgrammarParser.LCBRACK, 0); }
		public LcbrakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcbrak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterLcbrak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitLcbrak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitLcbrak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcbrakContext lcbrak() throws RecognitionException {
		LcbrakContext _localctx = new LcbrakContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(LCBRACK);
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
		public TerminalNode RCBRACK() { return getToken(ASPgrammarParser.RCBRACK, 0); }
		public RcbrakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcbrak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).enterRcbrak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPgrammarListener ) ((ASPgrammarListener)listener).exitRcbrak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPgrammarVisitor ) return ((ASPgrammarVisitor<? extends T>)visitor).visitRcbrak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcbrakContext rcbrak() throws RecognitionException {
		RcbrakContext _localctx = new RcbrakContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(RCBRACK);
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
		case 12: return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 13: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5\16"+
		"\5V\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3"+
		"\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0098\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n\n\5\n\u00a3\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\7\13\u00b2"+
		"\n\13\f\13\16\13\u00b5\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00e0\n\f\f\f\16\f\u00e3\13\f\3\f\3\f\5\f\u00e7\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0100\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010c\n\16\f\16\16\16\u010f\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u012a\n\17\f\17\16\17\u012d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0137\n\20\3\21\3\21\3\21\3\21\5\21\u013d\n\21\3\22\3\22\3"+
		"\23\3\23\3\23\2\4\32\34\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"\2\5\3\2\13\f\3\2\t\n\3\2\r\24\u0155\2+\3\2\2\2\4\61\3\2\2\2\6C\3\2\2"+
		"\2\bK\3\2\2\2\na\3\2\2\2\fh\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\u00ab\3"+
		"\2\2\2\24\u00ad\3\2\2\2\26\u00e6\3\2\2\2\30\u00f4\3\2\2\2\32\u00ff\3\2"+
		"\2\2\34\u0122\3\2\2\2\36\u0136\3\2\2\2 \u013c\3\2\2\2\"\u013e\3\2\2\2"+
		"$\u0140\3\2\2\2&\'\5\4\3\2\'(\b\2\1\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)"+
		"\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\5\b\5\2/\60\b\2\1\2\60\3\3\2"+
		"\2\2\61\62\7\36\2\2\62\63\7(\2\2\63\64\7\3\2\2\64\65\5\f\7\2\65\66\7\4"+
		"\2\2\66\67\7\b\2\2\67=\5\n\6\289\5\6\4\29:\b\3\1\2:<\3\2\2\2;8\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\7\2\2AB\b\3\1\2"+
		"B\5\3\2\2\2CD\5\16\b\2DE\7(\2\2EF\7\3\2\2FG\5\f\7\2GH\7\4\2\2HI\5\b\5"+
		"\2IJ\b\4\1\2J\7\3\2\2\2KL\7\b\2\2LM\5\n\6\2MN\b\5\1\2NT\3\2\2\2OP\5\22"+
		"\n\2PQ\b\5\1\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\7\7\2\2XY\b\5\1\2Y\t\3\2\2\2Z[\5\16\b\2[\\\5\20\t\2\\"+
		"]\7\31\2\2]^\b\6\1\2^`\3\2\2\2_Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"b\13\3\2\2\2ca\3\2\2\2de\5\16\b\2ef\5\20\t\2fg\b\7\1\2gi\3\2\2\2hd\3\2"+
		"\2\2hi\3\2\2\2iq\3\2\2\2jk\7\27\2\2kl\5\16\b\2lm\5\20\t\2mn\b\7\1\2np"+
		"\3\2\2\2oj\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\r\3\2\2\2sq\3\2\2\2"+
		"tu\7(\2\2u{\b\b\1\2vw\7&\2\2w{\b\b\1\2xy\7\'\2\2y{\b\b\1\2zt\3\2\2\2z"+
		"v\3\2\2\2zx\3\2\2\2{\17\3\2\2\2|}\7(\2\2}~\b\t\1\2~\21\3\2\2\2\177\u0080"+
		"\7\26\2\2\u0080\u0081\7\31\2\2\u0081\u00ac\b\n\1\2\u0082\u0083\7(\2\2"+
		"\u0083\u0084\b\n\1\2\u0084\u0085\7\23\2\2\u0085\u0086\5\26\f\2\u0086\u0087"+
		"\b\n\1\2\u0087\u0088\7\31\2\2\u0088\u0089\b\n\1\2\u0089\u00ac\3\2\2\2"+
		"\u008a\u008b\7#\2\2\u008b\u008c\7\3\2\2\u008c\u008d\5\34\17\2\u008d\u008e"+
		"\b\n\1\2\u008e\u008f\3\2\2\2\u008f\u0090\7\4\2\2\u0090\u0097\7$\2\2\u0091"+
		"\u0092\5\22\n\2\u0092\u0093\b\n\1\2\u0093\u0098\3\2\2\2\u0094\u0095\5"+
		"\24\13\2\u0095\u0096\b\n\1\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0098\u00a2\3\2\2\2\u0099\u00a0\7%\2\2\u009a\u009b\5\22"+
		"\n\2\u009b\u009c\b\n\1\2\u009c\u00a1\3\2\2\2\u009d\u009e\5\24\13\2\u009e"+
		"\u009f\b\n\1\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\n\1\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7\7\37"+
		"\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\b\n\1\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\177\3\2\2\2\u00ab\u0082\3\2\2\2\u00ab\u008a\3\2\2"+
		"\2\u00ab\u00a6\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00b3\7\b\2\2\u00ae\u00af"+
		"\5\22\n\2\u00af\u00b0\b\13\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\b\13\1\2"+
		"\u00b8\25\3\2\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b\f\1\2\u00bb\u00e7"+
		"\3\2\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\b\f\1\2\u00be\u00bf\7\32\2\2"+
		"\u00bf\u00c0\7(\2\2\u00c0\u00c6\7\3\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3"+
		"\b\f\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\b\f\1\2\u00cb\u00e7\3\2\2\2\u00cc"+
		"\u00cd\7!\2\2\u00cd\u00ce\7(\2\2\u00ce\u00d4\7\3\2\2\u00cf\u00d0\5\30"+
		"\r\2\u00d0\u00d1\b\f\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00e7\b\f\1\2\u00d9"+
		"\u00da\7\"\2\2\u00da\u00db\7(\2\2\u00db\u00e1\7\3\2\2\u00dc\u00dd\5\30"+
		"\r\2\u00dd\u00de\b\f\1\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\4\2\2\u00e5\u00e7\b\f\1\2\u00e6"+
		"\u00b9\3\2\2\2\u00e6\u00bc\3\2\2\2\u00e6\u00cc\3\2\2\2\u00e6\u00d9\3\2"+
		"\2\2\u00e7\27\3\2\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\b\r\1\2\u00ea"+
		"\u00f5\3\2\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\b\r\1\2\u00ed\u00f5\3\2"+
		"\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0\b\r\1\2\u00f0\u00f5\3\2\2\2\u00f1"+
		"\u00f2\5\34\17\2\u00f2\u00f3\b\r\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00e8\3"+
		"\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\31\3\2\2\2\u00f6\u00f7\b\16\1\2\u00f7\u00f8\7)\2\2\u00f8\u0100\b\16\1"+
		"\2\u00f9\u00fa\7(\2\2\u00fa\u0100\b\16\1\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd"+
		"\5\32\16\2\u00fd\u00fe\7\4\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2"+
		"\u00ff\u00f9\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u010d\3\2\2\2\u0101\u0102"+
		"\f\7\2\2\u0102\u0103\t\2\2\2\u0103\u0104\5\32\16\b\u0104\u0105\b\16\1"+
		"\2\u0105\u010c\3\2\2\2\u0106\u0107\f\6\2\2\u0107\u0108\t\3\2\2\u0108\u0109"+
		"\5\32\16\7\u0109\u010a\b\16\1\2\u010a\u010c\3\2\2\2\u010b\u0101\3\2\2"+
		"\2\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\33\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\b\17\1\2\u0111"+
		"\u0112\7\25\2\2\u0112\u0113\5\34\17\b\u0113\u0114\b\17\1\2\u0114\u0123"+
		"\3\2\2\2\u0115\u0116\5\32\16\2\u0116\u0117\b\17\1\2\u0117\u0123\3\2\2"+
		"\2\u0118\u0119\5\36\20\2\u0119\u011a\b\17\1\2\u011a\u0123\3\2\2\2\u011b"+
		"\u011c\5 \21\2\u011c\u011d\b\17\1\2\u011d\u0123\3\2\2\2\u011e\u011f\7"+
		"\3\2\2\u011f\u0120\5\34\17\2\u0120\u0121\7\4\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0110\3\2\2\2\u0122\u0115\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u011b\3\2"+
		"\2\2\u0122\u011e\3\2\2\2\u0123\u012b\3\2\2\2\u0124\u0125\f\7\2\2\u0125"+
		"\u0126\t\4\2\2\u0126\u0127\5\34\17\b\u0127\u0128\b\17\1\2\u0128\u012a"+
		"\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\35\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\33\2"+
		"\2\u012f\u0137\b\20\1\2\u0130\u0131\7)\2\2\u0131\u0137\b\20\1\2\u0132"+
		"\u0133\7\34\2\2\u0133\u0137\b\20\1\2\u0134\u0135\7\35\2\2\u0135\u0137"+
		"\b\20\1\2\u0136\u012e\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0132\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0137\37\3\2\2\2\u0138\u0139\7(\2\2\u0139\u013d\b"+
		"\21\1\2\u013a\u013b\7 \2\2\u013b\u013d\b\21\1\2\u013c\u0138\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d!\3\2\2\2\u013e\u013f\7\b\2\2\u013f#\3\2\2\2\u0140"+
		"\u0141\7\7\2\2\u0141%\3\2\2\2\32+=Tahqz\u0097\u00a0\u00a2\u00ab\u00b3"+
		"\u00c6\u00d4\u00e1\u00e6\u00f4\u00ff\u010b\u010d\u0122\u012b\u0136\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}