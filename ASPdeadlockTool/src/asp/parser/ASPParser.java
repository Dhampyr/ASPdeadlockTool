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
		MULT=9, DIV=10, AND=11, OR=12, GT=13, LT=14, GEG=15, LEG=16, ASSIGN=17, 
		EQUALS=18, DISTINCT=19, NOT=20, SKIP=21, COMMA=22, COLON=23, SEMI=24, 
		DOT=25, NULL=26, TRUE=27, FALSE=28, MOD=29, CLASS=30, RETURN=31, THIS=32, 
		NEW=33, NEWACT=34, IF=35, THEN=36, ELSE=37, INT=38, BOOL=39, IDUC=40, 
		IDLC=41, NUMBER=42, WS=43, LINECOMENTS=44, BLOCKCOMENTS=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "']'", "'['", "'}'", "'{'", "'+'", "'-'", "'*'", 
		"'/'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'='", "'=='", "'!='", 
		"'!'", "'skip'", "','", "':'", "';'", "'.'", "'null'", "'True'", "'False'", 
		"'module'", "'class'", "'return'", "'this'", "'new'", "'newActive'", "'if'", 
		"'then'", "'else'", "'Int'", "'Bool'", "IDUC", "IDLC", "NUMBER", "WS", 
		"LINECOMENTS", "BLOCKCOMENTS"
	};
	public static final int
		RULE_program = 0, RULE_classSignature = 1, RULE_classDec = 2, RULE_methodSignature = 3, 
		RULE_methodDef = 4, RULE_body = 5, RULE_varDeclaration = 6, RULE_varDec = 7, 
		RULE_objDec = 8, RULE_intDec = 9, RULE_boolDec = 10, RULE_parDef = 11, 
		RULE_typeVariable = 12, RULE_secondPair = 13, RULE_type = 14, RULE_intType = 15, 
		RULE_boolType = 16, RULE_objType = 17, RULE_variable = 18, RULE_stmt = 19, 
		RULE_skipStmt = 20, RULE_assignStmt = 21, RULE_ifStmt = 22, RULE_elseStmt = 23, 
		RULE_returnStmt = 24, RULE_stmtblock = 25, RULE_expressionSideEffect = 26, 
		RULE_methodCall = 27, RULE_expression = 28, RULE_newExp = 29, RULE_newActExp = 30, 
		RULE_arithmeticExpression = 31, RULE_valAritExp = 32, RULE_variableExp = 33, 
		RULE_parAritExp = 34, RULE_booleanExpression = 35, RULE_boolExpOneOp = 36, 
		RULE_parBoolExp = 37, RULE_value = 38, RULE_boolVal = 39, RULE_element = 40, 
		RULE_lcbrak = 41, RULE_rcbrak = 42;
	public static final String[] ruleNames = {
		"program", "classSignature", "classDec", "methodSignature", "methodDef", 
		"body", "varDeclaration", "varDec", "objDec", "intDec", "boolDec", "parDef", 
		"typeVariable", "secondPair", "type", "intType", "boolType", "objType", 
		"variable", "stmt", "skipStmt", "assignStmt", "ifStmt", "elseStmt", "returnStmt", 
		"stmtblock", "expressionSideEffect", "methodCall", "expression", "newExp", 
		"newActExp", "arithmeticExpression", "valAritExp", "variableExp", "parAritExp", 
		"booleanExpression", "boolExpOneOp", "parBoolExp", "value", "boolVal", 
		"element", "lcbrak", "rcbrak"
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


		public HashMap<String, ClassDecl> classTable;
		public ClassDecl currentClass;
		public Method currentMethod;
		public Environment environment;

	public ASPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program prog;
		public ClassDecContext classDec;
		public BodyContext main;
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode MOD() { return getToken(ASPParser.MOD, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
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
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		HashMap<String, ClassDecl> classMap = new HashMap<>();
							  classTable = classMap;
						
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(MOD);
			setState(87); match(IDUC);
			setState(88); match(SEMI);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(89); ((ProgramContext)_localctx).classDec = classDec();
				classMap.put(((ProgramContext)_localctx).classDec.classObj.getClassName(),((ProgramContext)_localctx).classDec.classObj);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); ((ProgramContext)_localctx).main = body();
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

	public static class ClassSignatureContext extends ParserRuleContext {
		public ClassDecl classObj;
		public Token className;
		public ParDefContext parameters;
		public ParDefContext parDef() {
			return getRuleContext(ParDefContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public TerminalNode CLASS() { return getToken(ASPParser.CLASS, 0); }
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
		public ClassSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterClassSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitClassSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitClassSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSignatureContext classSignature() throws RecognitionException {
		ClassSignatureContext _localctx = new ClassSignatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classSignature);
		HashMap<String, LinkedList<Method>> methods = new HashMap<>();
							  ((ClassSignatureContext)_localctx).classObj =  new ClassDecl();
							  currentClass = _localctx.classObj; 
							  
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(CLASS);
			setState(101); ((ClassSignatureContext)_localctx).className = match(IDUC);
			_localctx.classObj.setClassName((((ClassSignatureContext)_localctx).className!=null?((ClassSignatureContext)_localctx).className.getText():null));
			setState(103); match(LPAR);
			{
			setState(104); ((ClassSignatureContext)_localctx).parameters = parDef();
			}
			_localctx.classObj.setParameters(((ClassSignatureContext)_localctx).parameters.pars);
			setState(106); match(RPAR);
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
		public ClassDecl classObj;
		public ClassSignatureContext cs;
		public VarDeclarationContext fields;
		public MethodDefContext m;
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ClassSignatureContext classSignature() {
			return getRuleContext(ClassSignatureContext.class,0);
		}
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
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
		enterRule(_localctx, 4, RULE_classDec);
		HashMap<String, LinkedList<Method>> methods = new HashMap<>();
							  LinkedList<Method> methodList = null;
							  ((ClassDecContext)_localctx).classObj =  new ClassDecl();
							  currentClass = _localctx.classObj;
							  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((ClassDecContext)_localctx).cs = classSignature();
			((ClassDecContext)_localctx).classObj =  ((ClassDecContext)_localctx).cs.classObj;
			setState(110); match(LCBRACK);
			setState(111); ((ClassDecContext)_localctx).fields = varDeclaration();
			_localctx.classObj.setFields(((ClassDecContext)_localctx).fields.vars);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << IDUC))) != 0)) {
				{
				{
				setState(113); ((ClassDecContext)_localctx).m = methodDef();
				if (methods.containsKey(((ClassDecContext)_localctx).m.method.getMethodName()))
								    	                	   { LinkedList<Method> list = methods.get(((ClassDecContext)_localctx).m.method.getMethodName());
								    	                         if (((ClassDecContext)_localctx).m.method.isIn(list))
								    	                         { System.out.println("The method "+ ((ClassDecContext)_localctx).m.method.getMethodName() +  
								    	                                              " has been defined more than once! Rename it");
								    	                           System.exit(0); }   
								    	                         else
								    	                         { ((ClassDecContext)_localctx).m.method.setID(methods.get(((ClassDecContext)_localctx).m.method.getMethodName()).size());
																   methods.get(((ClassDecContext)_localctx).m.method.getMethodName()).add(((ClassDecContext)_localctx).m.method);
															     }
				 					    					   } 
									    					   else
									    					   {  methodList = new LinkedList<>();
									    						  ((ClassDecContext)_localctx).m.method.setID(0);
									    						  methodList.add(((ClassDecContext)_localctx).m.method); 
									    	                      methods.put(((ClassDecContext)_localctx).m.method.getMethodName(),methodList);
									    	                   }
								    	    
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(RCBRACK);
			 _localctx.classObj.setMethods(methods);
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

	public static class MethodSignatureContext extends ParserRuleContext {
		public Method methodSign;
		public TypeContext returnedType;
		public Token methodName;
		public ParDefContext p;
		public ParDefContext parDef() {
			return getRuleContext(ParDefContext.class,0);
		}
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitMethodSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitMethodSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodSignature);
		environment = new Environment();
						  	    environment.putAllInt(currentClass.getParameters());
						  	    environment.putAll(currentClass.getFields());
						  		((MethodSignatureContext)_localctx).methodSign =  new Method();
						  	    currentMethod = _localctx.methodSign;
						  	    HashMap<Integer,Declaration> parameters = new HashMap<>(); 
							    HashMap<String,Declaration> varDec = new HashMap<>();
								LinkedList<Statement> stmts = new LinkedList<>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); ((MethodSignatureContext)_localctx).returnedType = type();
			_localctx.methodSign.setReturnedType(((MethodSignatureContext)_localctx).returnedType.varType);
			setState(126); ((MethodSignatureContext)_localctx).methodName = match(IDLC);
			_localctx.methodSign.setMethodName((((MethodSignatureContext)_localctx).methodName!=null?((MethodSignatureContext)_localctx).methodName.getText():null));
			setState(128); match(LPAR);
			{
			setState(129); ((MethodSignatureContext)_localctx).p = parDef();
			}
			_localctx.methodSign.setParameters(((MethodSignatureContext)_localctx).p.pars); environment.putAllInt(((MethodSignatureContext)_localctx).p.pars);
			setState(131); match(RPAR);
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
		public Method method;
		public MethodSignatureContext ms;
		public BodyContext b;
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
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
		enterRule(_localctx, 8, RULE_methodDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); ((MethodDefContext)_localctx).ms = methodSignature();
			((MethodDefContext)_localctx).method =  ((MethodDefContext)_localctx).ms.methodSign;
			setState(135); ((MethodDefContext)_localctx).b = body();
			_localctx.method.setBody(((MethodDefContext)_localctx).b.stb); 
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
		public VarDeclarationContext v;
		public StmtContext st;
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
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
		enterRule(_localctx, 10, RULE_body);
		LinkedList<Statement> stmts = new LinkedList<>();
						  	HashMap<String,Declaration> vars = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(LCBRACK);
			{
			setState(139); ((BodyContext)_localctx).v = varDeclaration();
			vars=((BodyContext)_localctx).v.vars; environment.putAll(vars);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << IDLC))) != 0)) {
				{
				{
				setState(142); ((BodyContext)_localctx).st = stmt();
				stmts.add(((BodyContext)_localctx).st.s);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(RCBRACK);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public HashMap<String,Declaration> vars;
		public VarDecContext v;
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		 ((VarDeclarationContext)_localctx).vars =  new HashMap<>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153); ((VarDeclarationContext)_localctx).v = varDec();
					_localctx.vars.put(((VarDeclarationContext)_localctx).v.dec.getVar().getName(),((VarDeclarationContext)_localctx).v.dec);
					}
					} 
				}
				setState(160);
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

	public static class VarDecContext extends ParserRuleContext {
		public Declaration dec;
		public ObjDecContext od;
		public IntDecContext id;
		public BoolDecContext bd;
		public BoolDecContext boolDec() {
			return getRuleContext(BoolDecContext.class,0);
		}
		public ObjDecContext objDec() {
			return getRuleContext(ObjDecContext.class,0);
		}
		public IntDecContext intDec() {
			return getRuleContext(IntDecContext.class,0);
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
		enterRule(_localctx, 14, RULE_varDec);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case IDUC:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); ((VarDecContext)_localctx).od = objDec();
				((VarDecContext)_localctx).dec =  ((VarDecContext)_localctx).od.dec;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); ((VarDecContext)_localctx).id = intDec();
				((VarDecContext)_localctx).dec =  ((VarDecContext)_localctx).id.dec;
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); ((VarDecContext)_localctx).bd = boolDec();
				((VarDecContext)_localctx).dec =  ((VarDecContext)_localctx).bd.dec;
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

	public static class ObjDecContext extends ParserRuleContext {
		public Declaration dec;
		public ObjTypeContext t;
		public VariableContext v;
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ObjDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterObjDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitObjDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitObjDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDecContext objDec() throws RecognitionException {
		ObjDecContext _localctx = new ObjDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objDec);
		 TypeBase type = null; 
					   		  Variable var = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172); ((ObjDecContext)_localctx).t = objType();
			setState(173); ((ObjDecContext)_localctx).v = variable();
			setState(174); match(SEMI);
			 type = ((ObjDecContext)_localctx).t.varType;
			     									    var = ((ObjDecContext)_localctx).v.var;
			     									    var.setType(type);
			     									    ((ObjDecContext)_localctx).dec =  new Declaration(type,var);
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

	public static class IntDecContext extends ParserRuleContext {
		public Declaration dec;
		public IntTypeContext t;
		public VariableContext v;
		public TerminalNode ASSIGN() { return getToken(ASPParser.ASSIGN, 0); }
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode NUMBER() { return getToken(ASPParser.NUMBER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterIntDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitIntDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitIntDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDecContext intDec() throws RecognitionException {
		IntDecContext _localctx = new IntDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intDec);
		 TypeBase type = null; 
					   		  Variable var = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177); ((IntDecContext)_localctx).t = intType();
			setState(178); ((IntDecContext)_localctx).v = variable();
			setState(179); match(ASSIGN);
			setState(180); match(NUMBER);
			setState(181); match(SEMI);
			 type = ((IntDecContext)_localctx).t.varType;
			     			   						  				     var = ((IntDecContext)_localctx).v.var;
			     									  				     var.setType(type);
			     									  				     ((IntDecContext)_localctx).dec =  new Declaration(type,var);
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

	public static class BoolDecContext extends ParserRuleContext {
		public Declaration dec;
		public BoolTypeContext t;
		public VariableContext v;
		public Token val;
		public TerminalNode ASSIGN() { return getToken(ASPParser.ASSIGN, 0); }
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(ASPParser.FALSE, 0); }
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode TRUE() { return getToken(ASPParser.TRUE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BoolDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBoolDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBoolDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBoolDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDecContext boolDec() throws RecognitionException {
		BoolDecContext _localctx = new BoolDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolDec);
		 TypeBase type = null; 
					   	  	   Variable var = null; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184); ((BoolDecContext)_localctx).t = boolType();
			setState(185); ((BoolDecContext)_localctx).v = variable();
			setState(186); match(ASSIGN);
			setState(187);
			((BoolDecContext)_localctx).val = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
				((BoolDecContext)_localctx).val = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(188); match(SEMI);
			 type = ((BoolDecContext)_localctx).t.varType;
			     									  				  		   var = ((BoolDecContext)_localctx).v.var;
			     									  				  		   var.setType(type);
			     									  				  		   ((BoolDecContext)_localctx).dec =  new Declaration(type,var);
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
		public HashMap<Integer,Declaration> pars;
		public TypeVariableContext tv;
		public SecondPairContext tv1;
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public List<SecondPairContext> secondPair() {
			return getRuleContexts(SecondPairContext.class);
		}
		public SecondPairContext secondPair(int i) {
			return getRuleContext(SecondPairContext.class,i);
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
		ParDefContext _localctx = new ParDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parDef);
		((ParDefContext)_localctx).pars =  new HashMap<>();
							  TypeBase type = null; 
					   		  Variable var = null; 
					   		  int parIndex = 0;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << IDUC))) != 0)) {
				{
				setState(191); ((ParDefContext)_localctx).tv = typeVariable();
				 _localctx.pars.put((Integer) parIndex,((ParDefContext)_localctx).tv.par); 
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196); ((ParDefContext)_localctx).tv1 = secondPair();
				 _localctx.pars.put((Integer) (parIndex +1),((ParDefContext)_localctx).tv1.par);
				}
				}
				setState(203);
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

	public static class TypeVariableContext extends ParserRuleContext {
		public Declaration par;
		public TypeContext t;
		public VariableContext v;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeVariable);
		 TypeBase type = null; 
					   		  		Variable var = null; 
					   		  	   
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204); ((TypeVariableContext)_localctx).t = type();
			setState(205); ((TypeVariableContext)_localctx).v = variable();
			 type = ((TypeVariableContext)_localctx).t.varType;
			     								   		var = ((TypeVariableContext)_localctx).v.var;
			     								   		var.setType(type);
			     								   		((TypeVariableContext)_localctx).par =  new Declaration(type,var);
												      
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

	public static class SecondPairContext extends ParserRuleContext {
		public Declaration par;
		public TypeVariableContext tv;
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPParser.COMMA, 0); }
		public SecondPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterSecondPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitSecondPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitSecondPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondPairContext secondPair() throws RecognitionException {
		SecondPairContext _localctx = new SecondPairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_secondPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(COMMA);
			setState(209); ((SecondPairContext)_localctx).tv = typeVariable();
			((SecondPairContext)_localctx).par = ((SecondPairContext)_localctx).tv.par;
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
		public IntTypeContext it;
		public BoolTypeContext bt;
		public ObjTypeContext ot;
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); ((TypeContext)_localctx).it = intType();
				((TypeContext)_localctx).varType =  ((TypeContext)_localctx).it.varType;
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); ((TypeContext)_localctx).bt = boolType();
				((TypeContext)_localctx).varType =  ((TypeContext)_localctx).bt.varType;
				}
				break;
			case IDUC:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); ((TypeContext)_localctx).ot = objType();
				((TypeContext)_localctx).varType =  ((TypeContext)_localctx).ot.varType;
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

	public static class IntTypeContext extends ParserRuleContext {
		public TypeBase varType;
		public TerminalNode INT() { return getToken(ASPParser.INT, 0); }
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(INT);
			((IntTypeContext)_localctx).varType =  new TypeInt();
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

	public static class BoolTypeContext extends ParserRuleContext {
		public TypeBase varType;
		public TerminalNode BOOL() { return getToken(ASPParser.BOOL, 0); }
		public BoolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTypeContext boolType() throws RecognitionException {
		BoolTypeContext _localctx = new BoolTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(BOOL);
			((BoolTypeContext)_localctx).varType =  new TypeBool();
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

	public static class ObjTypeContext extends ParserRuleContext {
		public TypeBase varType;
		public Token IDUC;
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); ((ObjTypeContext)_localctx).IDUC = match(IDUC);
			((ObjTypeContext)_localctx).varType =  new TypeObject((((ObjTypeContext)_localctx).IDUC!=null?((ObjTypeContext)_localctx).IDUC.getText():null));
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
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); ((VariableContext)_localctx).v = match(IDLC);
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
		public SkipStmtContext sk;
		public AssignStmtContext as;
		public IfStmtContext ite;
		public ReturnStmtContext rt;
		public SkipStmtContext skipStmt() {
			return getRuleContext(SkipStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
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
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); ((StmtContext)_localctx).sk = skipStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).sk.s ;
				}
				break;
			case IDLC:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); ((StmtContext)_localctx).as = assignStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).as.s ;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); ((StmtContext)_localctx).ite = ifStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).ite.s;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(244); ((StmtContext)_localctx).rt = returnStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).rt.s ;
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

	public static class SkipStmtContext extends ParserRuleContext {
		public Statement s;
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode SKIP() { return getToken(ASPParser.SKIP, 0); }
		public SkipStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterSkipStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitSkipStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitSkipStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStmtContext skipStmt() throws RecognitionException {
		SkipStmtContext _localctx = new SkipStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_skipStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(SKIP);
			setState(250); match(SEMI);
			((SkipStmtContext)_localctx).s =  new Skip();
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

	public static class AssignStmtContext extends ParserRuleContext {
		public Statement s;
		public Token l;
		public ExpressionSideEffectContext r;
		public TerminalNode ASSIGN() { return getToken(ASPParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public ExpressionSideEffectContext expressionSideEffect() {
			return getRuleContext(ExpressionSideEffectContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignStmt);
		  Variable var = null;
							       ExpressionSideEffects exprse = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); ((AssignStmtContext)_localctx).l = match(IDLC);
			var = environment.getVar((((AssignStmtContext)_localctx).l!=null?((AssignStmtContext)_localctx).l.getText():null));
			setState(255); match(ASSIGN);
			setState(256); ((AssignStmtContext)_localctx).r = expressionSideEffect();
			exprse = ((AssignStmtContext)_localctx).r.exprse;
			setState(258); match(SEMI);
			((AssignStmtContext)_localctx).s =  new Assignment(var,exprse);
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

	public static class IfStmtContext extends ParserRuleContext {
		public Statement s;
		public BooleanExpressionContext guard;
		public StmtContext trueSideS;
		public StmtblockContext trueSideSB;
		public ElseStmtContext els;
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode IF() { return getToken(ASPParser.IF, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStmt);
		  Expression cond = null;
							Statement stTrue = null;
							Statement stFalse = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(IF);
			setState(262); match(LPAR);
			{
			setState(263); ((IfStmtContext)_localctx).guard = booleanExpression(0);
			cond = ((IfStmtContext)_localctx).guard.exprBool;
			}
			setState(266); match(RPAR);
			setState(273);
			switch (_input.LA(1)) {
			case SKIP:
			case RETURN:
			case IF:
			case IDLC:
				{
				setState(267); ((IfStmtContext)_localctx).trueSideS = stmt();
				stTrue = ((IfStmtContext)_localctx).trueSideS.s;
				}
				break;
			case LCBRACK:
				{
				setState(270); ((IfStmtContext)_localctx).trueSideSB = stmtblock();
				stTrue = ((IfStmtContext)_localctx).trueSideSB.stb;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(275); ((IfStmtContext)_localctx).els = elseStmt();
				stFalse = ((IfStmtContext)_localctx).els.s;
				}
				break;
			}
			((IfStmtContext)_localctx).s =  new IfThenElse(cond,stTrue,stFalse);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public Statement s;
		public StmtContext falseSideS;
		public StmtblockContext falseSideSB;
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ASPParser.ELSE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseStmt);
		  Expression cond = null;
							Statement stTrue = null;
							Statement stFalse = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282); match(ELSE);
			setState(289);
			switch (_input.LA(1)) {
			case SKIP:
			case RETURN:
			case IF:
			case IDLC:
				{
				setState(283); ((ElseStmtContext)_localctx).falseSideS = stmt();
				((ElseStmtContext)_localctx).s =  ((ElseStmtContext)_localctx).falseSideS.s;
				}
				break;
			case LCBRACK:
				{
				setState(286); ((ElseStmtContext)_localctx).falseSideSB = stmtblock();
				((ElseStmtContext)_localctx).s =  ((ElseStmtContext)_localctx).falseSideSB.stb;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public Statement s;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(ASPParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(ASPParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(RETURN);
			setState(292); ((ReturnStmtContext)_localctx).e = expression();
			setState(293); match(SEMI);
			((ReturnStmtContext)_localctx).s =  new Return(((ReturnStmtContext)_localctx).e.expr);
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
		enterRule(_localctx, 50, RULE_stmtblock);
		((StmtblockContext)_localctx).stb =  new StmtBlock();
						  		LinkedList<Statement> stmts = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(LCBRACK);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << IDLC))) != 0)) {
				{
				{
				setState(297); ((StmtblockContext)_localctx).st = stmt();
				stmts.add(((StmtblockContext)_localctx).st.s);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305); match(RCBRACK);
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
		public MethodCallContext mc;
		public NewExpContext newObj;
		public NewActExpContext newAObj;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewExpContext newExp() {
			return getRuleContext(NewExpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewActExpContext newActExp() {
			return getRuleContext(NewActExpContext.class,0);
		}
		public ExpressionSideEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSideEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExpressionSideEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExpressionSideEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExpressionSideEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSideEffectContext expressionSideEffect() throws RecognitionException {
		ExpressionSideEffectContext _localctx = new ExpressionSideEffectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionSideEffect);
		LinkedList<Expression> param = new LinkedList<>();
									 	   Variable obj = null;
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); ((ExpressionSideEffectContext)_localctx).exp = expression();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).exp.expr    ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); ((ExpressionSideEffectContext)_localctx).mc = methodCall();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).mc.expr     ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); ((ExpressionSideEffectContext)_localctx).newObj = newExp();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).newObj.expr ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); ((ExpressionSideEffectContext)_localctx).newAObj = newActExp();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).newAObj.expr;
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

	public static class MethodCallContext extends ParserRuleContext {
		public ExpressionSideEffects expr;
		public ElementContext elem;
		public Token methodName;
		public ExpressionContext par;
		public TerminalNode DOT() { return getToken(ASPParser.DOT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodCall);
		LinkedList<Expression> param = new LinkedList<>();
							 	 Variable obj = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); ((MethodCallContext)_localctx).elem = element();
			obj = environment.getVar((((MethodCallContext)_localctx).elem!=null?_input.getText(((MethodCallContext)_localctx).elem.start,((MethodCallContext)_localctx).elem.stop):null));
			setState(324); match(DOT);
			setState(325); ((MethodCallContext)_localctx).methodName = match(IDLC);
			setState(326); match(LPAR);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(327); ((MethodCallContext)_localctx).par = expression();
				param.add(((MethodCallContext)_localctx).par.expr);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(RPAR);
			((MethodCallContext)_localctx).expr =  new MethodCall(obj,(((MethodCallContext)_localctx).methodName!=null?((MethodCallContext)_localctx).methodName.getText():null),param);
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
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); ((ExpressionContext)_localctx).v = value();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).v.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); ((ExpressionContext)_localctx).el = element();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).el.elem;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344); ((ExpressionContext)_localctx).expra = arithmeticExpression(0);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expra.exprArit;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347); ((ExpressionContext)_localctx).exprb = booleanExpression(0);
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

	public static class NewExpContext extends ParserRuleContext {
		public ExpressionSideEffects expr;
		public Token className;
		public ExpressionContext par;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode NEW() { return getToken(ASPParser.NEW, 0); }
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
		public NewExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpContext newExp() throws RecognitionException {
		NewExpContext _localctx = new NewExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newExp);
		LinkedList<Expression> param = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(NEW);
			setState(353); ((NewExpContext)_localctx).className = match(IDUC);
			setState(354); match(LPAR);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(355); ((NewExpContext)_localctx).par = expression();
				param.add(((NewExpContext)_localctx).par.expr);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363); match(RPAR);
			((NewExpContext)_localctx).expr =  new New((((NewExpContext)_localctx).className!=null?((NewExpContext)_localctx).className.getText():null),param);
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

	public static class NewActExpContext extends ParserRuleContext {
		public ExpressionSideEffects expr;
		public Token className;
		public ExpressionContext par;
		public TerminalNode NEWACT() { return getToken(ASPParser.NEWACT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
		public NewActExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newActExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterNewActExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitNewActExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitNewActExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewActExpContext newActExp() throws RecognitionException {
		NewActExpContext _localctx = new NewActExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_newActExp);
		LinkedList<Expression> param = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(NEWACT);
			setState(367); ((NewActExpContext)_localctx).className = match(IDUC);
			setState(368); match(LPAR);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(369); ((NewActExpContext)_localctx).par = expression();
				param.add(((NewActExpContext)_localctx).par.expr);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377); match(RPAR);
			((NewActExpContext)_localctx).expr =  new NewActive((((NewActExpContext)_localctx).className!=null?((NewActExpContext)_localctx).className.getText():null),param);
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
		public ValAritExpContext n;
		public VariableExpContext v;
		public Token o;
		public ArithmeticExpressionContext r;
		public ValAritExpContext valAritExp() {
			return getRuleContext(ValAritExpContext.class,0);
		}
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ParAritExpContext parAritExp() {
			return getRuleContext(ParAritExpContext.class,0);
		}
		public VariableExpContext variableExp() {
			return getRuleContext(VariableExpContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitArithmeticExpression(this);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(381); ((ArithmeticExpressionContext)_localctx).n = valAritExp();
				((ArithmeticExpressionContext)_localctx).exprArit =  ((ArithmeticExpressionContext)_localctx).n.exprArit  ;
				}
				break;
			case IDLC:
				{
				setState(384); ((ArithmeticExpressionContext)_localctx).v = variableExp();
				((ArithmeticExpressionContext)_localctx).exprArit =  ((ArithmeticExpressionContext)_localctx).v.exprArit  ;
				}
				break;
			case LPAR:
				{
				setState(387); parAritExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(390);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(391);
					((ArithmeticExpressionContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
						((ArithmeticExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(392); ((ArithmeticExpressionContext)_localctx).r = arithmeticExpression(5);
					((ArithmeticExpressionContext)_localctx).exprArit =  new ExpressionBinaryOperation(((ArithmeticExpressionContext)_localctx).l.exprArit,(((ArithmeticExpressionContext)_localctx).o!=null?((ArithmeticExpressionContext)_localctx).o.getText():null),((ArithmeticExpressionContext)_localctx).r.exprArit);
					}
					} 
				}
				setState(399);
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

	public static class ValAritExpContext extends ParserRuleContext {
		public Expression exprArit;
		public Token n;
		public TerminalNode NUMBER() { return getToken(ASPParser.NUMBER, 0); }
		public ValAritExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valAritExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterValAritExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitValAritExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitValAritExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValAritExpContext valAritExp() throws RecognitionException {
		ValAritExpContext _localctx = new ValAritExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valAritExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); ((ValAritExpContext)_localctx).n = match(NUMBER);
			((ValAritExpContext)_localctx).exprArit =  new ExpressionIntValue(Integer.parseInt((((ValAritExpContext)_localctx).n!=null?((ValAritExpContext)_localctx).n.getText():null)));
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

	public static class VariableExpContext extends ParserRuleContext {
		public Expression exprArit;
		public Token v;
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public VariableExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterVariableExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitVariableExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitVariableExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpContext variableExp() throws RecognitionException {
		VariableExpContext _localctx = new VariableExpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); ((VariableExpContext)_localctx).v = match(IDLC);
			((VariableExpContext)_localctx).exprArit =  environment.getVar((((VariableExpContext)_localctx).v!=null?((VariableExpContext)_localctx).v.getText():null));
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

	public static class ParAritExpContext extends ParserRuleContext {
		public Expression exprArit;
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public ParAritExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parAritExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterParAritExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitParAritExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitParAritExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParAritExpContext parAritExp() throws RecognitionException {
		ParAritExpContext _localctx = new ParAritExpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parAritExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(LPAR);
			setState(407); arithmeticExpression(0);
			setState(408); match(RPAR);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public Expression exprBool;
		public BooleanExpressionContext l;
		public BoolExpOneOpContext b1o;
		public ArithmeticExpressionContext a;
		public BoolValContext v;
		public ElementContext e;
		public Token o;
		public BooleanExpressionContext r;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode LT() { return getToken(ASPParser.LT, 0); }
		public TerminalNode GT() { return getToken(ASPParser.GT, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public TerminalNode OR() { return getToken(ASPParser.OR, 0); }
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public TerminalNode GEG() { return getToken(ASPParser.GEG, 0); }
		public TerminalNode LEG() { return getToken(ASPParser.LEG, 0); }
		public TerminalNode EQUALS() { return getToken(ASPParser.EQUALS, 0); }
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public BoolExpOneOpContext boolExpOneOp() {
			return getRuleContext(BoolExpOneOpContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ASPParser.AND, 0); }
		public TerminalNode DISTINCT() { return getToken(ASPParser.DISTINCT, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBooleanExpression(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(411); ((BooleanExpressionContext)_localctx).b1o = boolExpOneOp();
				((BooleanExpressionContext)_localctx).exprBool =  ((BooleanExpressionContext)_localctx).b1o.exprBool;
				}
				break;
			case 2:
				{
				setState(414); ((BooleanExpressionContext)_localctx).a = arithmeticExpression(0);
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).a.exprArit;
				}
				break;
			case 3:
				{
				setState(417); ((BooleanExpressionContext)_localctx).v = boolVal();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).v.val;
				}
				break;
			case 4:
				{
				setState(420); ((BooleanExpressionContext)_localctx).e = element();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).e.elem;
				}
				break;
			case 5:
				{
				setState(423); match(LPAR);
				setState(424); booleanExpression(0);
				setState(425); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
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
					setState(429);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(430);
					((BooleanExpressionContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEG) | (1L << LEG) | (1L << EQUALS) | (1L << DISTINCT))) != 0)) ) {
						((BooleanExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(431); ((BooleanExpressionContext)_localctx).r = booleanExpression(6);
					((BooleanExpressionContext)_localctx).exprBool =  new ExpressionBinaryOperation(((BooleanExpressionContext)_localctx).l.exprBool,(((BooleanExpressionContext)_localctx).o!=null?((BooleanExpressionContext)_localctx).o.getText():null),((BooleanExpressionContext)_localctx).r.exprBool);
					}
					} 
				}
				setState(438);
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

	public static class BoolExpOneOpContext extends ParserRuleContext {
		public Expression exprBool;
		public Token n;
		public BooleanExpressionContext exb;
		public TerminalNode NOT() { return getToken(ASPParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BoolExpOneOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpOneOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBoolExpOneOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBoolExpOneOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBoolExpOneOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpOneOpContext boolExpOneOp() throws RecognitionException {
		BoolExpOneOpContext _localctx = new BoolExpOneOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_boolExpOneOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); ((BoolExpOneOpContext)_localctx).n = match(NOT);
			setState(440); ((BoolExpOneOpContext)_localctx).exb = booleanExpression(0);
			((BoolExpOneOpContext)_localctx).exprBool =  new ExpressionUnaryOperation((((BoolExpOneOpContext)_localctx).n!=null?((BoolExpOneOpContext)_localctx).n.getText():null),((BoolExpOneOpContext)_localctx).exb.exprBool);
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

	public static class ParBoolExpContext extends ParserRuleContext {
		public Expression exprBool;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ParBoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parBoolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterParBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitParBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitParBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParBoolExpContext parBoolExp() throws RecognitionException {
		ParBoolExpContext _localctx = new ParBoolExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parBoolExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(LPAR);
			setState(444); booleanExpression(0);
			setState(445); match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public ExpressionValue val;
		public Token n;
		public BoolValContext b;
		public TerminalNode NULL() { return getToken(ASPParser.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(ASPParser.NUMBER, 0); }
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(454);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); match(NULL);
				((ValueContext)_localctx).val =  new ExpressionNullValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(449); ((ValueContext)_localctx).n = match(NUMBER);
				((ValueContext)_localctx).val =  new ExpressionIntValue(Integer.parseInt((((ValueContext)_localctx).n!=null?((ValueContext)_localctx).n.getText():null)));
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(451); ((ValueContext)_localctx).b = boolVal();
				((ValueContext)_localctx).val =  ((ValueContext)_localctx).b.val;
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

	public static class BoolValContext extends ParserRuleContext {
		public ExpressionValue val;
		public Token t;
		public Token f;
		public TerminalNode FALSE() { return getToken(ASPParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ASPParser.TRUE, 0); }
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolVal);
		try {
			setState(460);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); ((BoolValContext)_localctx).t = match(TRUE);
				((BoolValContext)_localctx).val =  new ExpressionBoolValue(Boolean.parseBoolean((((BoolValContext)_localctx).t!=null?((BoolValContext)_localctx).t.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); ((BoolValContext)_localctx).f = match(FALSE);
				((BoolValContext)_localctx).val =  new ExpressionBoolValue(Boolean.parseBoolean((((BoolValContext)_localctx).f!=null?((BoolValContext)_localctx).f.getText():null)));
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
		public Token IDLC;
		public Token t;
		public TerminalNode IDLC() { return getToken(ASPParser.IDLC, 0); }
		public TerminalNode THIS() { return getToken(ASPParser.THIS, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPListener ) ((ASPListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPVisitor ) return ((ASPVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_element);
		try {
			setState(466);
			switch (_input.LA(1)) {
			case IDLC:
				enterOuterAlt(_localctx, 1);
				{
				setState(462); ((ElementContext)_localctx).IDLC = match(IDLC);
				((ElementContext)_localctx).elem =  environment.getVar((((ElementContext)_localctx).IDLC!=null?((ElementContext)_localctx).IDLC.getText():null));
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(464); ((ElementContext)_localctx).t = match(THIS);
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
		enterRule(_localctx, 82, RULE_lcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(LCBRACK);
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
		enterRule(_localctx, 84, RULE_rcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(RCBRACK);
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
		case 31: return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 35: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4w\n\4\f"+
		"\4\16\4z\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\5\r\u00c5\n\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e0\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00fa\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0114\n\30\3\30\3\30\3\30\5\30\u0119\n\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0124\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\7\33\u012f\n\33\f\33\16\33\u0132\13\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0143\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014d\n\35\f\35\16\35\u0150"+
		"\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0161\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0169\n"+
		"\37\f\37\16\37\u016c\13\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u0177\n"+
		" \f \16 \u017a\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0187\n!\3!\3!"+
		"\3!\3!\3!\7!\u018e\n!\f!\16!\u0191\13!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ae\n%\3%\3"+
		"%\3%\3%\3%\7%\u01b5\n%\f%\16%\u01b8\13%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u01c9\n(\3)\3)\3)\3)\5)\u01cf\n)\3*\3*\3*\3*\5"+
		"*\u01d5\n*\3+\3+\3,\3,\3,\2\4@H-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\3\2\35\36\3\2\t\f\4\2\r\22\24"+
		"\25\u01d5\2X\3\2\2\2\4f\3\2\2\2\6n\3\2\2\2\b~\3\2\2\2\n\u0087\3\2\2\2"+
		"\f\u008c\3\2\2\2\16\u00a0\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2\2\2\24"+
		"\u00b3\3\2\2\2\26\u00ba\3\2\2\2\30\u00c4\3\2\2\2\32\u00ce\3\2\2\2\34\u00d2"+
		"\3\2\2\2\36\u00df\3\2\2\2 \u00e1\3\2\2\2\"\u00e4\3\2\2\2$\u00e7\3\2\2"+
		"\2&\u00ea\3\2\2\2(\u00f9\3\2\2\2*\u00fb\3\2\2\2,\u00ff\3\2\2\2.\u0107"+
		"\3\2\2\2\60\u011c\3\2\2\2\62\u0125\3\2\2\2\64\u012a\3\2\2\2\66\u0142\3"+
		"\2\2\28\u0144\3\2\2\2:\u0160\3\2\2\2<\u0162\3\2\2\2>\u0170\3\2\2\2@\u0186"+
		"\3\2\2\2B\u0192\3\2\2\2D\u0195\3\2\2\2F\u0198\3\2\2\2H\u01ad\3\2\2\2J"+
		"\u01b9\3\2\2\2L\u01bd\3\2\2\2N\u01c8\3\2\2\2P\u01ce\3\2\2\2R\u01d4\3\2"+
		"\2\2T\u01d6\3\2\2\2V\u01d8\3\2\2\2XY\7\37\2\2YZ\7*\2\2Z`\7\32\2\2[\\\5"+
		"\6\4\2\\]\b\2\1\2]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac"+
		"\3\2\2\2b`\3\2\2\2cd\5\f\7\2de\b\2\1\2e\3\3\2\2\2fg\7 \2\2gh\7*\2\2hi"+
		"\b\3\1\2ij\7\3\2\2jk\5\30\r\2kl\b\3\1\2lm\7\4\2\2m\5\3\2\2\2no\5\4\3\2"+
		"op\b\4\1\2pq\7\b\2\2qr\5\16\b\2rx\b\4\1\2st\5\n\6\2tu\b\4\1\2uw\3\2\2"+
		"\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\7\2"+
		"\2|}\b\4\1\2}\7\3\2\2\2~\177\5\36\20\2\177\u0080\b\5\1\2\u0080\u0081\7"+
		"+\2\2\u0081\u0082\b\5\1\2\u0082\u0083\7\3\2\2\u0083\u0084\5\30\r\2\u0084"+
		"\u0085\b\5\1\2\u0085\u0086\7\4\2\2\u0086\t\3\2\2\2\u0087\u0088\5\b\5\2"+
		"\u0088\u0089\b\6\1\2\u0089\u008a\5\f\7\2\u008a\u008b\b\6\1\2\u008b\13"+
		"\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u008e\5\16\b\2\u008e\u008f\b\7\1\2"+
		"\u008f\u0095\3\2\2\2\u0090\u0091\5(\25\2\u0091\u0092\b\7\1\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\7"+
		"\2\2\u0099\u009a\b\7\1\2\u009a\r\3\2\2\2\u009b\u009c\5\20\t\2\u009c\u009d"+
		"\b\b\1\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\b\t\1\2\u00a5\u00ad\3\2\2\2\u00a6"+
		"\u00a7\5\24\13\2\u00a7\u00a8\b\t\1\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\5"+
		"\26\f\2\u00aa\u00ab\b\t\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac"+
		"\u00a6\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af\5$\23"+
		"\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\b\n\1\2\u00b2"+
		"\23\3\2\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\7\23\2"+
		"\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\b\13\1\2\u00b9"+
		"\25\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7\23"+
		"\2\2\u00bd\u00be\t\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\b\f\1\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3\b\r\1\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cb\3\2\2\2\u00c6"+
		"\u00c7\5\34\17\2\u00c7\u00c8\b\r\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3"+
		"\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d0\5&\24"+
		"\2\u00d0\u00d1\b\16\1\2\u00d1\33\3\2\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4"+
		"\5\32\16\2\u00d4\u00d5\b\17\1\2\u00d5\35\3\2\2\2\u00d6\u00d7\5 \21\2\u00d7"+
		"\u00d8\b\20\1\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\b"+
		"\20\1\2\u00db\u00e0\3\2\2\2\u00dc\u00dd\5$\23\2\u00dd\u00de\b\20\1\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2"+
		"\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\b\21\1\2\u00e3!\3"+
		"\2\2\2\u00e4\u00e5\7)\2\2\u00e5\u00e6\b\22\1\2\u00e6#\3\2\2\2\u00e7\u00e8"+
		"\7*\2\2\u00e8\u00e9\b\23\1\2\u00e9%\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb\u00ec"+
		"\b\24\1\2\u00ec\'\3\2\2\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\b\25\1\2\u00ef"+
		"\u00fa\3\2\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\b\25\1\2\u00f2\u00fa\3"+
		"\2\2\2\u00f3\u00f4\5.\30\2\u00f4\u00f5\b\25\1\2\u00f5\u00fa\3\2\2\2\u00f6"+
		"\u00f7\5\62\32\2\u00f7\u00f8\b\25\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00ed"+
		"\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00fc\7\27\2\2\u00fc\u00fd\7\32\2\2\u00fd\u00fe\b\26\1"+
		"\2\u00fe+\3\2\2\2\u00ff\u0100\7+\2\2\u0100\u0101\b\27\1\2\u0101\u0102"+
		"\7\23\2\2\u0102\u0103\5\66\34\2\u0103\u0104\b\27\1\2\u0104\u0105\7\32"+
		"\2\2\u0105\u0106\b\27\1\2\u0106-\3\2\2\2\u0107\u0108\7%\2\2\u0108\u0109"+
		"\7\3\2\2\u0109\u010a\5H%\2\u010a\u010b\b\30\1\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0113\7\4\2\2\u010d\u010e\5(\25\2\u010e\u010f\b\30\1\2\u010f\u0114\3"+
		"\2\2\2\u0110\u0111\5\64\33\2\u0111\u0112\b\30\1\2\u0112\u0114\3\2\2\2"+
		"\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0116"+
		"\5\60\31\2\u0116\u0117\b\30\1\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\30\1\2\u011b"+
		"/\3\2\2\2\u011c\u0123\7\'\2\2\u011d\u011e\5(\25\2\u011e\u011f\b\31\1\2"+
		"\u011f\u0124\3\2\2\2\u0120\u0121\5\64\33\2\u0121\u0122\b\31\1\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124\61\3\2\2"+
		"\2\u0125\u0126\7!\2\2\u0126\u0127\5:\36\2\u0127\u0128\7\32\2\2\u0128\u0129"+
		"\b\32\1\2\u0129\63\3\2\2\2\u012a\u0130\7\b\2\2\u012b\u012c\5(\25\2\u012c"+
		"\u012d\b\33\1\2\u012d\u012f\3\2\2\2\u012e\u012b\3\2\2\2\u012f\u0132\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7\7\2\2\u0134\u0135\b\33\1\2\u0135\65\3\2\2"+
		"\2\u0136\u0137\5:\36\2\u0137\u0138\b\34\1\2\u0138\u0143\3\2\2\2\u0139"+
		"\u013a\58\35\2\u013a\u013b\b\34\1\2\u013b\u0143\3\2\2\2\u013c\u013d\5"+
		"<\37\2\u013d\u013e\b\34\1\2\u013e\u0143\3\2\2\2\u013f\u0140\5> \2\u0140"+
		"\u0141\b\34\1\2\u0141\u0143\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0139\3"+
		"\2\2\2\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143\67\3\2\2\2\u0144"+
		"\u0145\5R*\2\u0145\u0146\b\35\1\2\u0146\u0147\7\33\2\2\u0147\u0148\7+"+
		"\2\2\u0148\u014e\7\3\2\2\u0149\u014a\5:\36\2\u014a\u014b\b\35\1\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0152\7\4\2\2\u0152\u0153\b\35\1\2\u01539\3\2\2\2\u0154\u0155\5N(\2\u0155"+
		"\u0156\b\36\1\2\u0156\u0161\3\2\2\2\u0157\u0158\5R*\2\u0158\u0159\b\36"+
		"\1\2\u0159\u0161\3\2\2\2\u015a\u015b\5@!\2\u015b\u015c\b\36\1\2\u015c"+
		"\u0161\3\2\2\2\u015d\u015e\5H%\2\u015e\u015f\b\36\1\2\u015f\u0161\3\2"+
		"\2\2\u0160\u0154\3\2\2\2\u0160\u0157\3\2\2\2\u0160\u015a\3\2\2\2\u0160"+
		"\u015d\3\2\2\2\u0161;\3\2\2\2\u0162\u0163\7#\2\2\u0163\u0164\7*\2\2\u0164"+
		"\u016a\7\3\2\2\u0165\u0166\5:\36\2\u0166\u0167\b\37\1\2\u0167\u0169\3"+
		"\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\4"+
		"\2\2\u016e\u016f\b\37\1\2\u016f=\3\2\2\2\u0170\u0171\7$\2\2\u0171\u0172"+
		"\7*\2\2\u0172\u0178\7\3\2\2\u0173\u0174\5:\36\2\u0174\u0175\b \1\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7\4\2\2\u017c\u017d\b \1\2\u017d?\3\2\2\2\u017e\u017f\b!\1\2\u017f"+
		"\u0180\5B\"\2\u0180\u0181\b!\1\2\u0181\u0187\3\2\2\2\u0182\u0183\5D#\2"+
		"\u0183\u0184\b!\1\2\u0184\u0187\3\2\2\2\u0185\u0187\5F$\2\u0186\u017e"+
		"\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u018f\3\2\2\2\u0188"+
		"\u0189\f\6\2\2\u0189\u018a\t\3\2\2\u018a\u018b\5@!\7\u018b\u018c\b!\1"+
		"\2\u018c\u018e\3\2\2\2\u018d\u0188\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190A\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0193\7,\2\2\u0193\u0194\b\"\1\2\u0194C\3\2\2\2\u0195\u0196\7+\2\2\u0196"+
		"\u0197\b#\1\2\u0197E\3\2\2\2\u0198\u0199\7\3\2\2\u0199\u019a\5@!\2\u019a"+
		"\u019b\7\4\2\2\u019bG\3\2\2\2\u019c\u019d\b%\1\2\u019d\u019e\5J&\2\u019e"+
		"\u019f\b%\1\2\u019f\u01ae\3\2\2\2\u01a0\u01a1\5@!\2\u01a1\u01a2\b%\1\2"+
		"\u01a2\u01ae\3\2\2\2\u01a3\u01a4\5P)\2\u01a4\u01a5\b%\1\2\u01a5\u01ae"+
		"\3\2\2\2\u01a6\u01a7\5R*\2\u01a7\u01a8\b%\1\2\u01a8\u01ae\3\2\2\2\u01a9"+
		"\u01aa\7\3\2\2\u01aa\u01ab\5H%\2\u01ab\u01ac\7\4\2\2\u01ac\u01ae\3\2\2"+
		"\2\u01ad\u019c\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad\u01a3\3\2\2\2\u01ad\u01a6"+
		"\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae\u01b6\3\2\2\2\u01af\u01b0\f\7\2\2\u01b0"+
		"\u01b1\t\4\2\2\u01b1\u01b2\5H%\b\u01b2\u01b3\b%\1\2\u01b3\u01b5\3\2\2"+
		"\2\u01b4\u01af\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7I\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7\26\2\2\u01ba"+
		"\u01bb\5H%\2\u01bb\u01bc\b&\1\2\u01bcK\3\2\2\2\u01bd\u01be\7\3\2\2\u01be"+
		"\u01bf\5H%\2\u01bf\u01c0\7\4\2\2\u01c0M\3\2\2\2\u01c1\u01c2\7\34\2\2\u01c2"+
		"\u01c9\b(\1\2\u01c3\u01c4\7,\2\2\u01c4\u01c9\b(\1\2\u01c5\u01c6\5P)\2"+
		"\u01c6\u01c7\b(\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c3"+
		"\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9O\3\2\2\2\u01ca\u01cb\7\35\2\2\u01cb"+
		"\u01cf\b)\1\2\u01cc\u01cd\7\36\2\2\u01cd\u01cf\b)\1\2\u01ce\u01ca\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cfQ\3\2\2\2\u01d0\u01d1\7+\2\2\u01d1\u01d5"+
		"\b*\1\2\u01d2\u01d3\7\"\2\2\u01d3\u01d5\b*\1\2\u01d4\u01d0\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5S\3\2\2\2\u01d6\u01d7\7\b\2\2\u01d7U\3\2\2\2\u01d8"+
		"\u01d9\7\7\2\2\u01d9W\3\2\2\2\33`x\u0095\u00a0\u00ac\u00c4\u00cb\u00df"+
		"\u00f9\u0113\u0118\u0123\u0130\u0142\u014e\u0160\u016a\u0178\u0186\u018f"+
		"\u01ad\u01b6\u01c8\u01ce\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}