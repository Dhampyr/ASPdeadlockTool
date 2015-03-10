/*
 * @Author Vincenzo Mastandrea
 * Grammar definition for ASP
 */
 
grammar ASPgrammar;
 
@header{
import asp.models.*;
import java.util.HashMap;
import java.util.LinkedList; 
}

//TYPES
element returns [Element elem]
 			@init{Element elem = null;} 
            : ID {$elem = new Variable($ID.text);}
            | THIS {$elem = new TypeObject();};


program returns [Program prog]
				@init{HashMap<String, Class> classMap = new HashMap<>();
					  StmtBlock main = new StmtBlock();}
				:   (classDec {classMap.add($classDec.classObj.getClassName(),$classDec.classObj)})* 
				    (body {main.setVarDec($body.varDec);
				    	   main.setStmts($body.stmts);}) 
				    {$prog = new Program(classMap, main)};

classDec returns [Class classObj]
				@init{LinkedList<TypeBase> fields = new LinkedList<>;
					  LinkedList<TypeBase> parameters = new LinkedList<>; 
					  HashMap<String, Method> methods = new LinkedList<>;}	
				: 	CLASS className=ID LPAR (parDef{parameters.add($parDef.par)})* RPAR 
				    LCBRACK (varDec{fields.add($varDec.var)})* (methodDef{methods.add($methodDef.getName,$methodDef.methodSign)})* RCBRACK
				    {
				    	 $classObj = new Class($className,
				    	 					   fields, 
				    	 					   parameters, 
				    	 					   methods
				    	 );
				    };
				    
methodDef returns [Method methodSign]
				  @init{LinkedList<TypeBase> parameters = new LinkedList<>(); 
					    HashMap<String,Variable> varDec = new HashMap<>();
						LinkedList<Statement> stmts = new LinkedList<>(); }	
				  :	returnedType=type methodName=ID LPAR (parDef{parameters.add($parDef.par)})* RPAR {$methodSign = new Method($returnedType, $methodName, parameters) };




body		:   LCBRACK (varDec)* (stmt)* RCBRACK;

varDec returns [TypeBase var]	
     		:  t=type v=variable SEMI
     		   { $var = $t.varType;
     		   	 $var.setID($v.text);
     		   };

parDef	returns [LinkedList<TypeBase>]
				@init{
						LinkedList<TypeBase> pars = new LinkedList<>();
						TypeBase par = null;
					  }
				: t=type v=variable{par = $t.varType; pars.add(par);}
				     (COMMA t=type v=variable {par = $t.varType; pars.add(par);})*;

type returns [TypeBase varType] 
            : ID   {$varType = new TypeObject($ID.text);}
            | INT  {$varType = new TypeInt($INT.text);}
            | BOOL {$varType = new TypeBool($BOOL.text);};

variable	:   ID;

stmt		: SKIP SEMI
            | ID EQUALS exprse SEMI
            | IF (exprb)  THEN (stmt | stmtblock)  (ELSE (stmt | stmtblock) )?
            | RETURN expr SEMI
            ;
            
stmtblock	: LCBRACK (stmt)* RCBRACK;
		

exprse		: expr 
			| element DOT ID LPAR (expr)* RPAR 
			| NEW ID LPAR (expr)* RPAR 
			| NEWACT ID LPAR (expr)* RPAR;

expr		: val 
			| element 
			| expra 
			| exprb	;   



val			: NULL | NUMBER | TRUE | FALSE;


expra		: expra ('*'|'/') expra
    		| expra ('+'|'-') expra
    		| NUMBER	| ID
    		| '(' expra ')'
    		;
    	
exprb		: NOT exprb	
			| exprb (OR | AND | EQUALS | DISTINCT | GT | LT | GEG | LEG) exprb    		
    		| expra | val | element  
    		| '(' exprb ')'
    		;
    	
lcbrak		: LCBRACK	;
rcbrak		: RCBRACK	;

//TOKENS
LPAR  	: '('	;
RPAR  	: ')'	;
RSBRACK : ']'	;
LSBRACK : '['	;
RCBRACK : '}'	;
LCBRACK : '{'	;
PLUS    : '+' 	;
MINUS   : '-' 	;
MULT    : '*' 	;
DIV     : '/' 	;
AND     : '&&' 	;
OR      : '||'	;
GT      : '>' 	;
LT      : '<' 	;
GEG     : '>='	;
LEG     : '<=' 	;
EQUALS  : '='	;
DISTINCT: '!='	;
NOT     : '!' 	;
SKIP    : 'skip';
COMMA   : ','	;
COLON   : ':'	;
SEMI    : ';'	;
DOT     : '.'	;
NULL    : 'null';
TRUE    : 'true';
FALSE   : 'false' ;
CLASS	: 'class' ;
RETURN	: 'return';
THIS	: 'this'  ;
NEW		: 'new'	  ;
NEWACT	: 'newActive' ;
IF		: 'if'	  ;
THEN	: 'then'  ;
ELSE	: 'else'  ;
INT		: 'int'	  ;
BOOL	: 'bool'  ;

fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//SCAPED SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;