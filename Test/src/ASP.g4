/*
 * @Author Vincenzo Mastandrea
 * Grammar definition for ASP
 */
 
grammar ASP;
 
// A program start with key "module" moduleName semicolon, class definitions and main function
program :   MOD IDUC SEMI classDec;
				       
classSignature 	: 	CLASS IDUC LPAR parDef RPAR;

classDec : 	classSignature LCBRACK varDeclaration (methodDef)* RCBRACK;

methodSignature :	type IDLC LPAR parDef RPAR;
    
methodDef :	methodSignature body;

body : LCBRACK varDeclaration (stmt)* RCBRACK;

varDeclaration : (varDec)*;

varDec 	: objDec | intDec | boolDec;
     		
objDec : objType variable SEMI;
     		  		
intDec : intType variable ASSIGN NUMBER SEMI;
     		
boolDec : boolType variable ASSIGN (TRUE | FALSE) SEMI;
     		
parDef : (type variable)?  (COMMA type variable)*;

type : intType | boolType | objType;
            
intType : INT;
            
boolType : BOOL;
            
objType : IDUC;
            
variable :  IDLC;

stmt : skipStmt | assignStmt | ifStmt | returnStmt;

skipStmt : SKIP SEMI;

assignStmt : IDLC ASSIGN expressionSideEffect SEMI;

ifStmt : IF LPAR (booleanExpression) RPAR (stmt | stmtblock)   
         (ELSE (stmt | stmtblock) )? ;


returnStmt : RETURN expression SEMI; 	


            
stmtblock : LCBRACK (stmt)* RCBRACK;
		
expressionSideEffect : expression | methodCall | newExp | newActExp;

methodCall : element DOT IDLC LPAR (expression)* RPAR;

expression : value | element | arithmeticExpression | booleanExpression;    

newExp : NEW IDUC LPAR (expression)* RPAR;
			   
newActExp : NEWACT IDUC LPAR (expression)* RPAR;
			   			   
arithmeticExpression : arithmeticExpression ('*'|'/' | '+'|'-') arithmeticExpression
			  		 | valAritExp 
    				 | variableExp
    				 | parAritExp;

   				 
valAritExp : NUMBER;  
     				 
variableExp : IDLC;

parAritExp : LPAR arithmeticExpression RPAR;

booleanExpression : boolExpOneOp
     			  | booleanExpression (OR | AND | EQUALS | DISTINCT | GT | LT | GEG | LEG) booleanExpression  
				  | arithmeticExpression
				  | boolVal
    			  | element 
    			  | '(' booleanExpression ')';
    					  
boolExpOneOp : NOT booleanExpression;
     				     
parBoolExp : '(' booleanExpression ')';
    		
value : NULL | NUMBER | boolVal;
			  
boolVal : TRUE | FALSE;
    		
element : IDLC | THIS;
            
                	 
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
ASSIGN	: '='	;
EQUALS  : '=='	;
DISTINCT: '!='	;
NOT     : '!' 	;
SKIP    : 'skip';
COMMA   : ','	;
COLON   : ':'	; 
SEMI    : ';'	;
DOT     : '.'	;
NULL    : 'null';
TRUE    : 'True';
FALSE   : 'False' ;
MOD		: 'module';
CLASS	: 'class' ;
RETURN	: 'return';
THIS	: 'this'  ;
NEW		: 'new'	  ;
NEWACT	: 'newActive' ;
IF		: 'if'	  ;
THEN	: 'then'  ;
ELSE	: 'else'  ;
INT		: 'Int'	  ;
BOOL	: 'Bool'  ;

fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
fragment CHARU  : 'a'..'z' |'A'..'Z' | '_';
fragment CHARUC : 'A'..'Z';
fragment CHARLC : 'a'..'z';



IDUC            : CHARUC (CHARU | DIGIT)* ;
IDLC            : CHARLC (CHARU | DIGIT)* ;


//ID              : (CHARLC | CHARUC | DIGIT | UNDER)* ;
//IDLC            : CHARLC ID ;
//IDUC            : CHARUC ID ;

fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//SCAPED SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;