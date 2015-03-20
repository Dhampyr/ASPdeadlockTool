// Generated from ASP.g4 by ANTLR 4.4
package asp.parser;

import asp.models.*;
import java.util.HashMap;
import java.util.LinkedList; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASPParser#rcbrak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcbrak(@NotNull ASPParser.RcbrakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ASPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull ASPParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ASPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(@NotNull ASPParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(@NotNull ASPParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull ASPParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ASPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(@NotNull ASPParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull ASPParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#parDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParDef(@NotNull ASPParser.ParDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#boolType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(@NotNull ASPParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#expressionSideEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSideEffect(@NotNull ASPParser.ExpressionSideEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#classDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDec(@NotNull ASPParser.ClassDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(@NotNull ASPParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ASPParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(@NotNull ASPParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#objType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjType(@NotNull ASPParser.ObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ASPParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#lcbrak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcbrak(@NotNull ASPParser.LcbrakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull ASPParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ASPParser.ElementContext ctx);
}