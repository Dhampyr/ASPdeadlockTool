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
	 * Enter a parse tree produced by {@link ASPParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(@NotNull ASPParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(@NotNull ASPParser.ElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull ASPParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull ASPParser.ValContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#exprb}.
	 * @param ctx the parse tree
	 */
	void enterExprb(@NotNull ASPParser.ExprbContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#exprb}.
	 * @param ctx the parse tree
	 */
	void exitExprb(@NotNull ASPParser.ExprbContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#expra}.
	 * @param ctx the parse tree
	 */
	void enterExpra(@NotNull ASPParser.ExpraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#expra}.
	 * @param ctx the parse tree
	 */
	void exitExpra(@NotNull ASPParser.ExpraContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ASPParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ASPParser.ProgContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#exprse}.
	 * @param ctx the parse tree
	 */
	void enterExprse(@NotNull ASPParser.ExprseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#exprse}.
	 * @param ctx the parse tree
	 */
	void exitExprse(@NotNull ASPParser.ExprseContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#listvar}.
	 * @param ctx the parse tree
	 */
	void enterListvar(@NotNull ASPParser.ListvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#listvar}.
	 * @param ctx the parse tree
	 */
	void exitListvar(@NotNull ASPParser.ListvarContext ctx);
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
	 * Enter a parse tree produced by {@link ASPParser#methodSign}.
	 * @param ctx the parse tree
	 */
	void enterMethodSign(@NotNull ASPParser.MethodSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#methodSign}.
	 * @param ctx the parse tree
	 */
	void exitMethodSign(@NotNull ASPParser.MethodSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ASPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ASPParser.ExprContext ctx);
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
}