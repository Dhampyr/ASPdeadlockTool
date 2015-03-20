// Generated from ASP.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import java.util.HashMap;
import java.util.LinkedList; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASPParser}.
 */
public interface ASPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASPParser#rcbrak}.
	 * @param ctx the parse tree
	 */
	void enterRcbrak(@NotNull ASPParser.RcbrakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#rcbrak}.
	 * @param ctx the parse tree
	 */
	void exitRcbrak(@NotNull ASPParser.RcbrakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ASPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ASPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull ASPParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull ASPParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ASPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ASPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(@NotNull ASPParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(@NotNull ASPParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(@NotNull ASPParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(@NotNull ASPParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull ASPParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull ASPParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ASPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ASPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull ASPParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull ASPParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull ASPParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull ASPParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#parDef}.
	 * @param ctx the parse tree
	 */
	void enterParDef(@NotNull ASPParser.ParDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#parDef}.
	 * @param ctx the parse tree
	 */
	void exitParDef(@NotNull ASPParser.ParDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#boolType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(@NotNull ASPParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#boolType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(@NotNull ASPParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#expressionSideEffect}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSideEffect(@NotNull ASPParser.ExpressionSideEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#expressionSideEffect}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSideEffect(@NotNull ASPParser.ExpressionSideEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(@NotNull ASPParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(@NotNull ASPParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(@NotNull ASPParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(@NotNull ASPParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ASPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ASPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(@NotNull ASPParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(@NotNull ASPParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(@NotNull ASPParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(@NotNull ASPParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ASPParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ASPParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#lcbrak}.
	 * @param ctx the parse tree
	 */
	void enterLcbrak(@NotNull ASPParser.LcbrakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#lcbrak}.
	 * @param ctx the parse tree
	 */
	void exitLcbrak(@NotNull ASPParser.LcbrakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull ASPParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull ASPParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ASPParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ASPParser.ElementContext ctx);
}