// Generated from ASPgrammar.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import asp.models.Class;
import java.util.HashMap;
import java.util.LinkedList; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASPgrammarParser}.
 */
public interface ASPgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#rcbrak}.
	 * @param ctx the parse tree
	 */
	void enterRcbrak(@NotNull ASPgrammarParser.RcbrakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#rcbrak}.
	 * @param ctx the parse tree
	 */
	void exitRcbrak(@NotNull ASPgrammarParser.RcbrakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ASPgrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ASPgrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ASPgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ASPgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(@NotNull ASPgrammarParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(@NotNull ASPgrammarParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(@NotNull ASPgrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(@NotNull ASPgrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull ASPgrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull ASPgrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ASPgrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ASPgrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull ASPgrammarParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull ASPgrammarParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#parDef}.
	 * @param ctx the parse tree
	 */
	void enterParDef(@NotNull ASPgrammarParser.ParDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#parDef}.
	 * @param ctx the parse tree
	 */
	void exitParDef(@NotNull ASPgrammarParser.ParDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#expressionSideEffect}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSideEffect(@NotNull ASPgrammarParser.ExpressionSideEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#expressionSideEffect}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSideEffect(@NotNull ASPgrammarParser.ExpressionSideEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(@NotNull ASPgrammarParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(@NotNull ASPgrammarParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(@NotNull ASPgrammarParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(@NotNull ASPgrammarParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ASPgrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ASPgrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(@NotNull ASPgrammarParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(@NotNull ASPgrammarParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ASPgrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ASPgrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#lcbrak}.
	 * @param ctx the parse tree
	 */
	void enterLcbrak(@NotNull ASPgrammarParser.LcbrakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#lcbrak}.
	 * @param ctx the parse tree
	 */
	void exitLcbrak(@NotNull ASPgrammarParser.LcbrakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull ASPgrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull ASPgrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPgrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ASPgrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPgrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ASPgrammarParser.ElementContext ctx);
}