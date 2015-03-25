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
	 * Visit a parse tree produced by {@link ASPParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(@NotNull ASPParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#valAritExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValAritExp(@NotNull ASPParser.ValAritExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#rcbrak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcbrak(@NotNull ASPParser.RcbrakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#skipStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStmt(@NotNull ASPParser.SkipStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(@NotNull ASPParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(@NotNull ASPParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ASPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#objDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDec(@NotNull ASPParser.ObjDecContext ctx);
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
	 * Visit a parse tree produced by {@link ASPParser#boolVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(@NotNull ASPParser.BoolValContext ctx);
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
	 * Visit a parse tree produced by {@link ASPParser#parAritExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParAritExp(@NotNull ASPParser.ParAritExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(@NotNull ASPParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(@NotNull ASPParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#parBoolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParBoolExp(@NotNull ASPParser.ParBoolExpContext ctx);
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
	 * Visit a parse tree produced by {@link ASPParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ASPParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#boolDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDec(@NotNull ASPParser.BoolDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#intDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDec(@NotNull ASPParser.IntDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ASPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#classSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSignature(@NotNull ASPParser.ClassSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(@NotNull ASPParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull ASPParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#variableExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExp(@NotNull ASPParser.VariableExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(@NotNull ASPParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(@NotNull ASPParser.ReturnStmtContext ctx);
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
	 * Visit a parse tree produced by {@link ASPParser#secondPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondPair(@NotNull ASPParser.SecondPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(@NotNull ASPParser.IfStmtContext ctx);
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
	 * Visit a parse tree produced by {@link ASPParser#newActExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewActExp(@NotNull ASPParser.NewActExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull ASPParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#boolExpOneOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpOneOp(@NotNull ASPParser.BoolExpOneOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASPParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull ASPParser.MethodCallContext ctx);
}