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
		RULE_program = 0, RULE_classDec = 1, RULE_methodSignature = 2, RULE_methodDef = 3, 
		RULE_body = 4, RULE_varDeclaration = 5, RULE_varDec = 6, RULE_objDec = 7, 
		RULE_intDec = 8, RULE_boolDec = 9, RULE_parDef = 10, RULE_type = 11, RULE_intType = 12, 
		RULE_boolType = 13, RULE_objType = 14, RULE_variable = 15, RULE_stmt = 16, 
		RULE_skipStmt = 17, RULE_assignStmt = 18, RULE_ifStmt = 19, RULE_returnStmt = 20, 
		RULE_stmtblock = 21, RULE_expressionSideEffect = 22, RULE_methodCall = 23, 
		RULE_expression = 24, RULE_newExp = 25, RULE_newActExp = 26, RULE_arithmeticExpression = 27, 
		RULE_valAritExp = 28, RULE_variableExp = 29, RULE_parAritExp = 30, RULE_booleanExpression = 31, 
		RULE_boolExpOneOp = 32, RULE_parBoolExp = 33, RULE_value = 34, RULE_boolVal = 35, 
		RULE_element = 36, RULE_lcbrak = 37, RULE_rcbrak = 38;
	public static final String[] ruleNames = {
		"program", "classDec", "methodSignature", "methodDef", "body", "varDeclaration", 
		"varDec", "objDec", "intDec", "boolDec", "parDef", "type", "intType", 
		"boolType", "objType", "variable", "stmt", "skipStmt", "assignStmt", "ifStmt", 
		"returnStmt", "stmtblock", "expressionSideEffect", "methodCall", "expression", 
		"newExp", "newActExp", "arithmeticExpression", "valAritExp", "variableExp", 
		"parAritExp", "booleanExpression", "boolExpOneOp", "parBoolExp", "value", 
		"boolVal", "element", "lcbrak", "rcbrak"
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


		public HashMap<String, ClassDecl> environment;
		public ClassDecl currentClass;
		public Method currentMethod;
		public Environment scope;
		

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
							  environment = classMap;
						
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(MOD);
			setState(79); match(IDUC);
			setState(80); match(SEMI);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(81); ((ProgramContext)_localctx).classDec = classDec();
				classMap.put(((ProgramContext)_localctx).classDec.classObj.getClassName(),((ProgramContext)_localctx).classDec.classObj);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); ((ProgramContext)_localctx).main = body();
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
		public ClassDecl classObj;
		public Token className;
		public ParDefContext parameters;
		public VarDeclarationContext fields;
		public MethodDefContext m;
		public TerminalNode LCBRACK() { return getToken(ASPParser.LCBRACK, 0); }
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ParDefContext parDef() {
			return getRuleContext(ParDefContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public TerminalNode CLASS() { return getToken(ASPParser.CLASS, 0); }
		public TerminalNode RCBRACK() { return getToken(ASPParser.RCBRACK, 0); }
		public TerminalNode IDUC() { return getToken(ASPParser.IDUC, 0); }
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
		enterRule(_localctx, 2, RULE_classDec);
		HashMap<String, LinkedList<Method>> methods = new HashMap<>();
							  LinkedList<Method> methodList = null;
							  ((ClassDecContext)_localctx).classObj =  new ClassDecl();
							  currentClass = _localctx.classObj;
							  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(CLASS);
			setState(93); ((ClassDecContext)_localctx).className = match(IDUC);
			_localctx.classObj.setClassName((((ClassDecContext)_localctx).className!=null?((ClassDecContext)_localctx).className.getText():null));
			setState(95); match(LPAR);
			{
			setState(96); ((ClassDecContext)_localctx).parameters = parDef();
			}
			_localctx.classObj.setParameters(((ClassDecContext)_localctx).parameters.pars);
			setState(98); match(RPAR);
			setState(99); match(LCBRACK);
			setState(100); ((ClassDecContext)_localctx).fields = varDeclaration();
			_localctx.classObj.setFields(((ClassDecContext)_localctx).fields.vars);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << IDUC))) != 0)) {
				{
				{
				setState(102); ((ClassDecContext)_localctx).m = methodDef();
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
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(RCBRACK);
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
		enterRule(_localctx, 4, RULE_methodSignature);
		scope = new Environment();
						  	    scope.putAllInt(currentClass.getParameters());
						  	    scope.putAll(currentClass.getFields());
						  		((MethodSignatureContext)_localctx).methodSign =  new Method();
						  	    currentMethod = _localctx.methodSign;
						  	    HashMap<Integer,Declaration> parameters = new HashMap<>(); 
							    HashMap<String,Declaration> varDec = new HashMap<>();
								LinkedList<Statement> stmts = new LinkedList<>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); ((MethodSignatureContext)_localctx).returnedType = type();
			_localctx.methodSign.setReturnedType(((MethodSignatureContext)_localctx).returnedType.varType);
			setState(115); ((MethodSignatureContext)_localctx).methodName = match(IDLC);
			_localctx.methodSign.setMethodName((((MethodSignatureContext)_localctx).methodName!=null?((MethodSignatureContext)_localctx).methodName.getText():null));
			setState(117); match(LPAR);
			{
			setState(118); ((MethodSignatureContext)_localctx).p = parDef();
			}
			_localctx.methodSign.setParameters(((MethodSignatureContext)_localctx).p.pars); scope.putAllInt(((MethodSignatureContext)_localctx).p.pars);
			setState(120); match(RPAR);
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
		enterRule(_localctx, 6, RULE_methodDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((MethodDefContext)_localctx).ms = methodSignature();
			((MethodDefContext)_localctx).method =  ((MethodDefContext)_localctx).ms.methodSign;
			setState(124); ((MethodDefContext)_localctx).b = body();
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
		enterRule(_localctx, 8, RULE_body);
		LinkedList<Statement> stmts = new LinkedList<>();
						  	HashMap<String,Declaration> vars = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(LCBRACK);
			{
			setState(128); ((BodyContext)_localctx).v = varDeclaration();
			vars=((BodyContext)_localctx).v.vars; scope.putAll(vars); scope.print();
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << IDLC))) != 0)) {
				{
				{
				setState(131); ((BodyContext)_localctx).st = stmt();
				stmts.add(((BodyContext)_localctx).st.s);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(RCBRACK);
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
		enterRule(_localctx, 10, RULE_varDeclaration);
		 ((VarDeclarationContext)_localctx).vars =  new HashMap<>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142); ((VarDeclarationContext)_localctx).v = varDec();
					_localctx.vars.put(((VarDeclarationContext)_localctx).v.dec.getVar().getName(),((VarDeclarationContext)_localctx).v.dec);
					}
					} 
				}
				setState(149);
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
		enterRule(_localctx, 12, RULE_varDec);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case IDUC:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); ((VarDecContext)_localctx).od = objDec();
				((VarDecContext)_localctx).dec =  ((VarDecContext)_localctx).od.dec;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); ((VarDecContext)_localctx).id = intDec();
				((VarDecContext)_localctx).dec =  ((VarDecContext)_localctx).id.dec;
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); ((VarDecContext)_localctx).bd = boolDec();
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
		enterRule(_localctx, 14, RULE_objDec);
		 TypeBase type = null; 
					   		  Variable var = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161); ((ObjDecContext)_localctx).t = objType();
			setState(162); ((ObjDecContext)_localctx).v = variable();
			setState(163); match(SEMI);
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
		enterRule(_localctx, 16, RULE_intDec);
		 TypeBase type = null; 
					   		  Variable var = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166); ((IntDecContext)_localctx).t = intType();
			setState(167); ((IntDecContext)_localctx).v = variable();
			setState(168); match(ASSIGN);
			setState(169); match(NUMBER);
			setState(170); match(SEMI);
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
		enterRule(_localctx, 18, RULE_boolDec);
		 TypeBase type = null; 
					   	  	   Variable var = null; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(173); ((BoolDecContext)_localctx).t = boolType();
			setState(174); ((BoolDecContext)_localctx).v = variable();
			setState(175); match(ASSIGN);
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(177); match(SEMI);
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
		public TypeContext t;
		public VariableContext v;
		public TypeContext t1;
		public VariableContext v1;
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASPParser.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ASPParser.COMMA, i);
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
		enterRule(_localctx, 20, RULE_parDef);
		((ParDefContext)_localctx).pars =  new HashMap<>();
							  TypeBase type = null; 
					   		  Variable var = null; 
					   		  int parIndex = 0;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << IDUC))) != 0)) {
				{
				setState(180); ((ParDefContext)_localctx).t = type();
				setState(181); ((ParDefContext)_localctx).v = variable();
				 type = ((ParDefContext)_localctx).t.varType;
				     								   var = ((ParDefContext)_localctx).v.var;
				     								   var.setType(type);
				     								   Declaration dec = new Declaration(type,var);
													   _localctx.pars.put((Integer) parIndex,dec); 
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186); match(COMMA);
				setState(187); ((ParDefContext)_localctx).t1 = type();
				setState(188); ((ParDefContext)_localctx).v1 = variable();
				type = ((ParDefContext)_localctx).t1.varType;
				     								   		   var = ((ParDefContext)_localctx).v1.var;
				     								   		   var.setType(type);
				     								   		   Declaration dec = new Declaration(type,var);
								  							   _localctx.pars.put((Integer) (parIndex +1),dec);
				}
				}
				setState(195);
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
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196); ((TypeContext)_localctx).it = intType();
				((TypeContext)_localctx).varType =  ((TypeContext)_localctx).it.varType;
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); ((TypeContext)_localctx).bt = boolType();
				((TypeContext)_localctx).varType =  ((TypeContext)_localctx).bt.varType;
				}
				break;
			case IDUC:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); ((TypeContext)_localctx).ot = objType();
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
		enterRule(_localctx, 24, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(INT);
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
		enterRule(_localctx, 26, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(BOOL);
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
		enterRule(_localctx, 28, RULE_objType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); ((ObjTypeContext)_localctx).IDUC = match(IDUC);
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); ((VariableContext)_localctx).v = match(IDLC);
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
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); ((StmtContext)_localctx).sk = skipStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).sk.s ;
				}
				break;
			case IDLC:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); ((StmtContext)_localctx).as = assignStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).as.s ;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); ((StmtContext)_localctx).ite = ifStmt();
				((StmtContext)_localctx).s =  ((StmtContext)_localctx).ite.s;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(228); ((StmtContext)_localctx).rt = returnStmt();
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
		enterRule(_localctx, 34, RULE_skipStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(SKIP);
			setState(234); match(SEMI);
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
		enterRule(_localctx, 36, RULE_assignStmt);
		  Variable var = null;
							       ExpressionSideEffects exprse = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); ((AssignStmtContext)_localctx).l = match(IDLC);
			var = scope.getVar((((AssignStmtContext)_localctx).l!=null?((AssignStmtContext)_localctx).l.getText():null));
			setState(239); match(ASSIGN);
			setState(240); ((AssignStmtContext)_localctx).r = expressionSideEffect();
			exprse = ((AssignStmtContext)_localctx).r.exprse;
			setState(242); match(SEMI);
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
		public StmtContext falseSideS;
		public StmtblockContext falseSideSB;
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ASPParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ASPParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(ASPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ASPParser.RPAR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
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
		enterRule(_localctx, 38, RULE_ifStmt);
		  Expression cond = null;
							Statement stTrue = null;
							Statement stFalse = null; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(IF);
			setState(246); match(LPAR);
			{
			setState(247); ((IfStmtContext)_localctx).guard = booleanExpression(0);
			cond = ((IfStmtContext)_localctx).guard.exprBool;
			}
			setState(250); match(RPAR);
			setState(257);
			switch (_input.LA(1)) {
			case SKIP:
			case RETURN:
			case IF:
			case IDLC:
				{
				setState(251); ((IfStmtContext)_localctx).trueSideS = stmt();
				stTrue = ((IfStmtContext)_localctx).trueSideS.s;
				}
				break;
			case LCBRACK:
				{
				setState(254); ((IfStmtContext)_localctx).trueSideSB = stmtblock();
				stTrue = ((IfStmtContext)_localctx).trueSideSB.stb;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(259); match(ELSE);
				setState(266);
				switch (_input.LA(1)) {
				case SKIP:
				case RETURN:
				case IF:
				case IDLC:
					{
					setState(260); ((IfStmtContext)_localctx).falseSideS = stmt();
					stFalse = ((IfStmtContext)_localctx).falseSideS.s;
					}
					break;
				case LCBRACK:
					{
					setState(263); ((IfStmtContext)_localctx).falseSideSB = stmtblock();
					stFalse = ((IfStmtContext)_localctx).falseSideSB.stb;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 40, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(RETURN);
			setState(273); ((ReturnStmtContext)_localctx).e = expression();
			setState(274); match(SEMI);
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
		enterRule(_localctx, 42, RULE_stmtblock);
		((StmtblockContext)_localctx).stb =  new StmtBlock();
						  		LinkedList<Statement> stmts = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(LCBRACK);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP) | (1L << RETURN) | (1L << IF) | (1L << IDLC))) != 0)) {
				{
				{
				setState(278); ((StmtblockContext)_localctx).st = stmt();
				stmts.add(((StmtblockContext)_localctx).st.s);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); match(RCBRACK);
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
		enterRule(_localctx, 44, RULE_expressionSideEffect);
		LinkedList<Expression> param = new LinkedList<>();
									 	   Variable obj = null;
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); ((ExpressionSideEffectContext)_localctx).exp = expression();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).exp.expr    ;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); ((ExpressionSideEffectContext)_localctx).mc = methodCall();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).mc.expr     ;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); ((ExpressionSideEffectContext)_localctx).newObj = newExp();
				((ExpressionSideEffectContext)_localctx).exprse =  ((ExpressionSideEffectContext)_localctx).newObj.expr ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); ((ExpressionSideEffectContext)_localctx).newAObj = newActExp();
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
		enterRule(_localctx, 46, RULE_methodCall);
		LinkedList<Expression> param = new LinkedList<>();
							 	 Variable obj = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); ((MethodCallContext)_localctx).elem = element();
			obj = scope.getVar((((MethodCallContext)_localctx).elem!=null?_input.getText(((MethodCallContext)_localctx).elem.start,((MethodCallContext)_localctx).elem.stop):null));
			setState(305); match(DOT);
			setState(306); ((MethodCallContext)_localctx).methodName = match(IDLC);
			setState(307); match(LPAR);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(308); ((MethodCallContext)_localctx).par = expression();
				param.add(((MethodCallContext)_localctx).par.expr);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316); match(RPAR);
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
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); ((ExpressionContext)_localctx).v = value();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).v.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); ((ExpressionContext)_localctx).el = element();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).el.elem;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325); ((ExpressionContext)_localctx).expra = arithmeticExpression(0);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expra.exprArit;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328); ((ExpressionContext)_localctx).exprb = booleanExpression(0);
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
		enterRule(_localctx, 50, RULE_newExp);
		LinkedList<Expression> param = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(NEW);
			setState(334); ((NewExpContext)_localctx).className = match(IDUC);
			setState(335); match(LPAR);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(336); ((NewExpContext)_localctx).par = expression();
				param.add(((NewExpContext)_localctx).par.expr);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344); match(RPAR);
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
		enterRule(_localctx, 52, RULE_newActExp);
		LinkedList<Expression> param = new LinkedList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(NEWACT);
			setState(348); ((NewActExpContext)_localctx).className = match(IDUC);
			setState(349); match(LPAR);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IDLC) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(350); ((NewActExpContext)_localctx).par = expression();
				param.add(((NewActExpContext)_localctx).par.expr);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); match(RPAR);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(362); ((ArithmeticExpressionContext)_localctx).n = valAritExp();
				((ArithmeticExpressionContext)_localctx).exprArit =  ((ArithmeticExpressionContext)_localctx).n.exprArit  ;
				}
				break;
			case IDLC:
				{
				setState(365); ((ArithmeticExpressionContext)_localctx).v = variableExp();
				((ArithmeticExpressionContext)_localctx).exprArit =  ((ArithmeticExpressionContext)_localctx).v.exprArit  ;
				}
				break;
			case LPAR:
				{
				setState(368); parAritExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
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
					setState(371);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(372);
					((ArithmeticExpressionContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
						((ArithmeticExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(373); ((ArithmeticExpressionContext)_localctx).r = arithmeticExpression(5);
					((ArithmeticExpressionContext)_localctx).exprArit =  new ExpressionBinaryOperation(((ArithmeticExpressionContext)_localctx).l.exprArit,(((ArithmeticExpressionContext)_localctx).o!=null?((ArithmeticExpressionContext)_localctx).o.getText():null),((ArithmeticExpressionContext)_localctx).r.exprArit);
					}
					} 
				}
				setState(380);
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
		enterRule(_localctx, 56, RULE_valAritExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); ((ValAritExpContext)_localctx).n = match(NUMBER);
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
		enterRule(_localctx, 58, RULE_variableExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); ((VariableExpContext)_localctx).v = match(IDLC);
			((VariableExpContext)_localctx).exprArit =  scope.getVar((((VariableExpContext)_localctx).v!=null?((VariableExpContext)_localctx).v.getText():null));
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
		enterRule(_localctx, 60, RULE_parAritExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(LPAR);
			setState(388); arithmeticExpression(0);
			setState(389); match(RPAR);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(392); ((BooleanExpressionContext)_localctx).b1o = boolExpOneOp();
				((BooleanExpressionContext)_localctx).exprBool =  ((BooleanExpressionContext)_localctx).b1o.exprBool;
				}
				break;
			case 2:
				{
				setState(395); ((BooleanExpressionContext)_localctx).a = arithmeticExpression(0);
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).a.exprArit;
				}
				break;
			case 3:
				{
				setState(398); ((BooleanExpressionContext)_localctx).v = boolVal();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).v.val;
				}
				break;
			case 4:
				{
				setState(401); ((BooleanExpressionContext)_localctx).e = element();
				((BooleanExpressionContext)_localctx).exprBool = ((BooleanExpressionContext)_localctx).e.elem;
				}
				break;
			case 5:
				{
				setState(404); match(LPAR);
				setState(405); booleanExpression(0);
				setState(406); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
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
					setState(410);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(411);
					((BooleanExpressionContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEG) | (1L << LEG) | (1L << EQUALS) | (1L << DISTINCT))) != 0)) ) {
						((BooleanExpressionContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(412); ((BooleanExpressionContext)_localctx).r = booleanExpression(6);
					((BooleanExpressionContext)_localctx).exprBool =  new ExpressionBinaryOperation(((BooleanExpressionContext)_localctx).l.exprBool,(((BooleanExpressionContext)_localctx).o!=null?((BooleanExpressionContext)_localctx).o.getText():null),((BooleanExpressionContext)_localctx).r.exprBool);
					}
					} 
				}
				setState(419);
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
		enterRule(_localctx, 64, RULE_boolExpOneOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); ((BoolExpOneOpContext)_localctx).n = match(NOT);
			setState(421); ((BoolExpOneOpContext)_localctx).exb = booleanExpression(0);
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
		enterRule(_localctx, 66, RULE_parBoolExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(LPAR);
			setState(425); booleanExpression(0);
			setState(426); match(RPAR);
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
		enterRule(_localctx, 68, RULE_value);
		try {
			setState(435);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); match(NULL);
				((ValueContext)_localctx).val =  new ExpressionNullValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(430); ((ValueContext)_localctx).n = match(NUMBER);
				((ValueContext)_localctx).val =  new ExpressionIntValue(Integer.parseInt((((ValueContext)_localctx).n!=null?((ValueContext)_localctx).n.getText():null)));
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(432); ((ValueContext)_localctx).b = boolVal();
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
		enterRule(_localctx, 70, RULE_boolVal);
		try {
			setState(441);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); ((BoolValContext)_localctx).t = match(TRUE);
				((BoolValContext)_localctx).val =  new ExpressionBoolValue(Boolean.parseBoolean((((BoolValContext)_localctx).t!=null?((BoolValContext)_localctx).t.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(439); ((BoolValContext)_localctx).f = match(FALSE);
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
		enterRule(_localctx, 72, RULE_element);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case IDLC:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); ((ElementContext)_localctx).IDLC = match(IDLC);
				((ElementContext)_localctx).elem =  scope.getVar((((ElementContext)_localctx).IDLC!=null?((ElementContext)_localctx).IDLC.getText():null));
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); ((ElementContext)_localctx).t = match(THIS);
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
		enterRule(_localctx, 74, RULE_lcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(LCBRACK);
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
		enterRule(_localctx, 76, RULE_rcbrak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(RCBRACK);
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
		case 27: return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 31: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0094"+
		"\n\7\f\7\16\7\u0097\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00d0\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ea"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0104\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010d\n\25\5\25\u010f\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u011c\n\27"+
		"\f\27\16\27\u011f\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u013a\n\31\f\31\16\31\u013d\13\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014e"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0156\n\33\f\33\16\33\u0159\13"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0164\n\34\f\34"+
		"\16\34\u0167\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0174\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u017b\n\35\f\35\16\35"+
		"\u017e\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u019b\n!\3!\3!\3!\3!\3!\7!\u01a2"+
		"\n!\f!\16!\u01a5\13!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$"+
		"\5$\u01b6\n$\3%\3%\3%\3%\5%\u01bc\n%\3&\3&\3&\3&\5&\u01c2\n&\3\'\3\'\3"+
		"(\3(\3(\2\48@)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\5\3\2\35\36\3\2\t\f\4\2\r\22\24\25\u01c6\2P\3\2\2\2"+
		"\4^\3\2\2\2\6s\3\2\2\2\b|\3\2\2\2\n\u0081\3\2\2\2\f\u0095\3\2\2\2\16\u00a1"+
		"\3\2\2\2\20\u00a3\3\2\2\2\22\u00a8\3\2\2\2\24\u00af\3\2\2\2\26\u00ba\3"+
		"\2\2\2\30\u00cf\3\2\2\2\32\u00d1\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2"+
		"\2\2 \u00da\3\2\2\2\"\u00e9\3\2\2\2$\u00eb\3\2\2\2&\u00ef\3\2\2\2(\u00f7"+
		"\3\2\2\2*\u0112\3\2\2\2,\u0117\3\2\2\2.\u012f\3\2\2\2\60\u0131\3\2\2\2"+
		"\62\u014d\3\2\2\2\64\u014f\3\2\2\2\66\u015d\3\2\2\28\u0173\3\2\2\2:\u017f"+
		"\3\2\2\2<\u0182\3\2\2\2>\u0185\3\2\2\2@\u019a\3\2\2\2B\u01a6\3\2\2\2D"+
		"\u01aa\3\2\2\2F\u01b5\3\2\2\2H\u01bb\3\2\2\2J\u01c1\3\2\2\2L\u01c3\3\2"+
		"\2\2N\u01c5\3\2\2\2PQ\7\37\2\2QR\7*\2\2RX\7\32\2\2ST\5\4\3\2TU\b\2\1\2"+
		"UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2"+
		"[\\\5\n\6\2\\]\b\2\1\2]\3\3\2\2\2^_\7 \2\2_`\7*\2\2`a\b\3\1\2ab\7\3\2"+
		"\2bc\5\26\f\2cd\b\3\1\2de\7\4\2\2ef\7\b\2\2fg\5\f\7\2gm\b\3\1\2hi\5\b"+
		"\5\2ij\b\3\1\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2"+
		"\2\2om\3\2\2\2pq\7\7\2\2qr\b\3\1\2r\5\3\2\2\2st\5\30\r\2tu\b\4\1\2uv\7"+
		"+\2\2vw\b\4\1\2wx\7\3\2\2xy\5\26\f\2yz\b\4\1\2z{\7\4\2\2{\7\3\2\2\2|}"+
		"\5\6\4\2}~\b\5\1\2~\177\5\n\6\2\177\u0080\b\5\1\2\u0080\t\3\2\2\2\u0081"+
		"\u0082\7\b\2\2\u0082\u0083\5\f\7\2\u0083\u0084\b\6\1\2\u0084\u008a\3\2"+
		"\2\2\u0085\u0086\5\"\22\2\u0086\u0087\b\6\1\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\7\2\2\u008e"+
		"\u008f\b\6\1\2\u008f\13\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092\b\7\1"+
		"\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\r\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\5\20\t\2\u0099\u009a\b\b\1\2\u009a\u00a2\3\2\2\2\u009b\u009c\5"+
		"\22\n\2\u009c\u009d\b\b\1\2\u009d\u00a2\3\2\2\2\u009e\u009f\5\24\13\2"+
		"\u009f\u00a0\b\b\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\5\36\20\2\u00a4"+
		"\u00a5\5 \21\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\b\t\1\2\u00a7\21\3\2\2"+
		"\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7\23\2\2\u00ab"+
		"\u00ac\7,\2\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\b\n\1\2\u00ae\23\3\2\2"+
		"\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\23\2\2\u00b2"+
		"\u00b3\t\2\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\b\13\1\2\u00b5\25\3\2"+
		"\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\b\f\1\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c3\3\2"+
		"\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\5 \21\2\u00bf"+
		"\u00c0\b\f\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\27\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\b\r\1\2\u00c8\u00d0\3\2\2\2"+
		"\u00c9\u00ca\5\34\17\2\u00ca\u00cb\b\r\1\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd"+
		"\5\36\20\2\u00cd\u00ce\b\r\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00c6\3\2\2\2"+
		"\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d2"+
		"\7(\2\2\u00d2\u00d3\b\16\1\2\u00d3\33\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5"+
		"\u00d6\b\17\1\2\u00d6\35\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8\u00d9\b\20\1"+
		"\2\u00d9\37\3\2\2\2\u00da\u00db\7+\2\2\u00db\u00dc\b\21\1\2\u00dc!\3\2"+
		"\2\2\u00dd\u00de\5$\23\2\u00de\u00df\b\22\1\2\u00df\u00ea\3\2\2\2\u00e0"+
		"\u00e1\5&\24\2\u00e1\u00e2\b\22\1\2\u00e2\u00ea\3\2\2\2\u00e3\u00e4\5"+
		"(\25\2\u00e4\u00e5\b\22\1\2\u00e5\u00ea\3\2\2\2\u00e6\u00e7\5*\26\2\u00e7"+
		"\u00e8\b\22\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e0\3"+
		"\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ec"+
		"\7\27\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00ee\b\23\1\2\u00ee%\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f0\u00f1\b\24\1\2\u00f1\u00f2\7\23\2\2\u00f2\u00f3\5"+
		".\30\2\u00f3\u00f4\b\24\1\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6\b\24\1\2"+
		"\u00f6\'\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\5"+
		"@!\2\u00fa\u00fb\b\25\1\2\u00fb\u00fc\3\2\2\2\u00fc\u0103\7\4\2\2\u00fd"+
		"\u00fe\5\"\22\2\u00fe\u00ff\b\25\1\2\u00ff\u0104\3\2\2\2\u0100\u0101\5"+
		",\27\2\u0101\u0102\b\25\1\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u0100\3\2\2\2\u0104\u010e\3\2\2\2\u0105\u010c\7\'\2\2\u0106\u0107\5\""+
		"\22\2\u0107\u0108\b\25\1\2\u0108\u010d\3\2\2\2\u0109\u010a\5,\27\2\u010a"+
		"\u010b\b\25\1\2\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109\3"+
		"\2\2\2\u010d\u010f\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b\25\1\2\u0111)\3\2\2\2\u0112\u0113\7!\2\2"+
		"\u0113\u0114\5\62\32\2\u0114\u0115\7\32\2\2\u0115\u0116\b\26\1\2\u0116"+
		"+\3\2\2\2\u0117\u011d\7\b\2\2\u0118\u0119\5\"\22\2\u0119\u011a\b\27\1"+
		"\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\7\7\2\2\u0121\u0122\b\27\1\2\u0122-\3\2\2\2\u0123\u0124\5\62\32"+
		"\2\u0124\u0125\b\30\1\2\u0125\u0130\3\2\2\2\u0126\u0127\5\60\31\2\u0127"+
		"\u0128\b\30\1\2\u0128\u0130\3\2\2\2\u0129\u012a\5\64\33\2\u012a\u012b"+
		"\b\30\1\2\u012b\u0130\3\2\2\2\u012c\u012d\5\66\34\2\u012d\u012e\b\30\1"+
		"\2\u012e\u0130\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0129"+
		"\3\2\2\2\u012f\u012c\3\2\2\2\u0130/\3\2\2\2\u0131\u0132\5J&\2\u0132\u0133"+
		"\b\31\1\2\u0133\u0134\7\33\2\2\u0134\u0135\7+\2\2\u0135\u013b\7\3\2\2"+
		"\u0136\u0137\5\62\32\2\u0137\u0138\b\31\1\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\4\2\2\u013f"+
		"\u0140\b\31\1\2\u0140\61\3\2\2\2\u0141\u0142\5F$\2\u0142\u0143\b\32\1"+
		"\2\u0143\u014e\3\2\2\2\u0144\u0145\5J&\2\u0145\u0146\b\32\1\2\u0146\u014e"+
		"\3\2\2\2\u0147\u0148\58\35\2\u0148\u0149\b\32\1\2\u0149\u014e\3\2\2\2"+
		"\u014a\u014b\5@!\2\u014b\u014c\b\32\1\2\u014c\u014e\3\2\2\2\u014d\u0141"+
		"\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e"+
		"\63\3\2\2\2\u014f\u0150\7#\2\2\u0150\u0151\7*\2\2\u0151\u0157\7\3\2\2"+
		"\u0152\u0153\5\62\32\2\u0153\u0154\b\33\1\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\4\2\2\u015b"+
		"\u015c\b\33\1\2\u015c\65\3\2\2\2\u015d\u015e\7$\2\2\u015e\u015f\7*\2\2"+
		"\u015f\u0165\7\3\2\2\u0160\u0161\5\62\32\2\u0161\u0162\b\34\1\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0169\7\4\2\2\u0169\u016a\b\34\1\2\u016a\67\3\2\2\2\u016b\u016c\b\35"+
		"\1\2\u016c\u016d\5:\36\2\u016d\u016e\b\35\1\2\u016e\u0174\3\2\2\2\u016f"+
		"\u0170\5<\37\2\u0170\u0171\b\35\1\2\u0171\u0174\3\2\2\2\u0172\u0174\5"+
		"> \2\u0173\u016b\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u017c\3\2\2\2\u0175\u0176\f\6\2\2\u0176\u0177\t\3\2\2\u0177\u0178\58"+
		"\35\7\u0178\u0179\b\35\1\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d9\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017f\u0180\7,\2\2\u0180\u0181\b\36\1\2\u0181;\3"+
		"\2\2\2\u0182\u0183\7+\2\2\u0183\u0184\b\37\1\2\u0184=\3\2\2\2\u0185\u0186"+
		"\7\3\2\2\u0186\u0187\58\35\2\u0187\u0188\7\4\2\2\u0188?\3\2\2\2\u0189"+
		"\u018a\b!\1\2\u018a\u018b\5B\"\2\u018b\u018c\b!\1\2\u018c\u019b\3\2\2"+
		"\2\u018d\u018e\58\35\2\u018e\u018f\b!\1\2\u018f\u019b\3\2\2\2\u0190\u0191"+
		"\5H%\2\u0191\u0192\b!\1\2\u0192\u019b\3\2\2\2\u0193\u0194\5J&\2\u0194"+
		"\u0195\b!\1\2\u0195\u019b\3\2\2\2\u0196\u0197\7\3\2\2\u0197\u0198\5@!"+
		"\2\u0198\u0199\7\4\2\2\u0199\u019b\3\2\2\2\u019a\u0189\3\2\2\2\u019a\u018d"+
		"\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0193\3\2\2\2\u019a\u0196\3\2\2\2\u019b"+
		"\u01a3\3\2\2\2\u019c\u019d\f\7\2\2\u019d\u019e\t\4\2\2\u019e\u019f\5@"+
		"!\b\u019f\u01a0\b!\1\2\u01a0\u01a2\3\2\2\2\u01a1\u019c\3\2\2\2\u01a2\u01a5"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4A\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\u01a7\7\26\2\2\u01a7\u01a8\5@!\2\u01a8\u01a9\b\""+
		"\1\2\u01a9C\3\2\2\2\u01aa\u01ab\7\3\2\2\u01ab\u01ac\5@!\2\u01ac\u01ad"+
		"\7\4\2\2\u01adE\3\2\2\2\u01ae\u01af\7\34\2\2\u01af\u01b6\b$\1\2\u01b0"+
		"\u01b1\7,\2\2\u01b1\u01b6\b$\1\2\u01b2\u01b3\5H%\2\u01b3\u01b4\b$\1\2"+
		"\u01b4\u01b6\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b2"+
		"\3\2\2\2\u01b6G\3\2\2\2\u01b7\u01b8\7\35\2\2\u01b8\u01bc\b%\1\2\u01b9"+
		"\u01ba\7\36\2\2\u01ba\u01bc\b%\1\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bcI\3\2\2\2\u01bd\u01be\7+\2\2\u01be\u01c2\b&\1\2\u01bf\u01c0"+
		"\7\"\2\2\u01c0\u01c2\b&\1\2\u01c1\u01bd\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"K\3\2\2\2\u01c3\u01c4\7\b\2\2\u01c4M\3\2\2\2\u01c5\u01c6\7\7\2\2\u01c6"+
		"O\3\2\2\2\33Xm\u008a\u0095\u00a1\u00ba\u00c3\u00cf\u00e9\u0103\u010c\u010e"+
		"\u011d\u012f\u013b\u014d\u0157\u0165\u0173\u017c\u019a\u01a3\u01b5\u01bb"+
		"\u01c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}