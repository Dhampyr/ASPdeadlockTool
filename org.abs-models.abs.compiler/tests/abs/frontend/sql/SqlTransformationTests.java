/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved. 
 * This file is licensed under the terms of the Modified BSD License.
 */
package abs.frontend.sql;

import static abs.ABSTest.Config.*;
import static org.junit.Assert.*;

import org.junit.Test;
import abs.frontend.FrontendTest;
import abs.frontend.analyser.SemanticErrorList;
import abs.frontend.ast.AsyncCall;
import abs.frontend.ast.Exp;
import abs.frontend.ast.ExpressionStmt;
import abs.frontend.ast.Model;
import abs.frontend.ast.Stmt;
import abs.frontend.ast.SyncCall;

public class SqlTransformationTests extends FrontendTest {

    private static String DB_INITIALIZATION = "RelationalTransactionalDatabase db = new local RelationalDatabase(Pair(EmptyMap, EmptySet)); ";

    protected Model assertParseOk(String s) {
        Model m = assertParse(s, WITH_STD_LIB, WITH_DB_LIB, TYPE_CHECK);
        final SemanticErrorList errors = m.getErrors();
        if (!errors.isEmpty())
            fail(errors.getFirst().getMessage());
        return m;
    }

    protected Model assertParseTypeError(String s) {
        return assertParse(s, WITH_STD_LIB, WITH_DB_LIB, TYPE_CHECK, EXPECT_TYPE_ERROR);
    }

    protected Model assertParseSemanticError(String s) {
        Model m = assertParse(s, WITH_STD_LIB, WITH_DB_LIB, TYPE_CHECK);
        final SemanticErrorList errors = m.getErrors();
        if (errors.isEmpty())
            fail("Expected semantic error, but no one occurred.");
        return m;
    }

    @Test
    public void testSelection() {
        Model m = assertParseOk("{ " + DB_INITIALIZATION
                + "[DatabaseConnection: db] MaybeEx<Relation> result = sql(select * from \"My Table\"); }");
        Exp dbCallExp = getSecondExp(m);
        assertEquals(SyncCall.class, dbCallExp.getClass());
        assertEquals("db", ((SyncCall) dbCallExp).getCallee().toString());
        /*
         * The following is fragile because it may fail if the String
         * representation of call expressions changes:
         */
        assertEquals("SyncCall(db,ABS.DB.RelationLeaf(StringLiteral(My Table)))", dbCallExp.toString());
    }

    @Test
    public void testSelectionWithTxAnnotation() {
        Model m = assertParseOk("{ "
                + DB_INITIALIZATION
                + "Transaction tx = db.beginTransaction(); [TX: tx] MaybeEx<Relation> result = sql(select * from \"My Table\"); }");
        assertEquals(SyncCall.class, getExp(m, 2).getClass());
    }

    @Test
    public void testSelectionWithInvalidAnnotation() {
        assertParseTypeError("{ "
                + DB_INITIALIZATION
                + "Transaction tx = db.beginTransaction(); [DatabaseConnection: tx] MaybeEx<Relation> result = sql(select * from \"My Table\"); }");
    }

    @Test
    public void testSelectionWithoutAnnotation() {
        assertParseSemanticError("{ " + DB_INITIALIZATION
                + "MaybeEx<Relation> result = sql(select * from \"My Table\"); }");
    }

    @Test
    public void testSelectionAsync() {
        Model m = assertParseOk("{ "
                + DB_INITIALIZATION
                + "[SqlAsync] [DatabaseConnection: db] Fut<MaybeEx<Relation>> result = sql(select * from \"My Table\"); }");
        assertEquals(AsyncCall.class, getSecondExp(m).getClass());
    }

    @Test
    public void testSqlProc() {
        Model m = assertParseOk("[DatabaseConnection: conn] class C(DatabaseConnection conn) { [SqlProc] Unit p() {} } { "
                + DB_INITIALIZATION
                + "TransmissionTimeCalculator calc = new local IdealTransmissionTimeCalculator(); DatabaseConnection conn = new local DatabaseConnection(db, 0, calc); new local C(conn);}");
        Stmt propagationDelayStmt = getFirstClassDecl(m).getMethod(0).getBlock().getStmt(0);
        assertEquals(ExpressionStmt.class, propagationDelayStmt.getClass());
        Exp propagationDelayExp = ((ExpressionStmt) propagationDelayStmt).getExp();
        assertEquals(SyncCall.class, propagationDelayExp.getClass());
        SyncCall propagationDelayCall = (SyncCall) propagationDelayExp;
        assertEquals("conn", propagationDelayCall.getCallee().toString());
        assertEquals("propagationDelay", propagationDelayCall.getMethod());
    }

    @Test
    public void testSqlProcNoConnection() {
        assertParseSemanticError("[TX: tx] class C(Transaction tx) { [SqlProc] Unit p() {} } { " + DB_INITIALIZATION
                + "Transaction tx = db.beginTransaction(); new local C(tx);}");
    }

    @Test
    public void testInsertion() {
        Model m = assertParseOk("{ "
                + DB_INITIALIZATION
                + "[DatabaseConnection: db] MaybeEx<Unit> result = sql(insert into \"My Table\" (\"Attribute\") values ('xyz')); }");
        assertEquals(SyncCall.class, getSecondExp(m).getClass());
    }

    @Test
    public void testInsertionWrongReturnType() {
        assertParseTypeError("{ "
                + DB_INITIALIZATION
                + "[DatabaseConnection: db] MaybeEx<Relation> result = sql(insert into \"My Table\" (\"Attribute\") values ('xyz')); }");
    }

    @Test
    public void testInsertionIntoRelation() {
        Model m = assertParseOk("{ "
                + DB_INITIALIZATION
                + "Relation rel = emptyRelation(); [DatabaseConnection: db] MaybeEx<Relation> result = sql(insert into rel (\"Attribute\") values ('xyz')); }");
        assertEquals(SyncCall.class, getExp(m, 2).getClass());
    }

    @Test
    public void testUpdate() {
        Model m = assertParseOk("{ "
                + DB_INITIALIZATION
                + "[DatabaseConnection: db] MaybeEx<Unit> result = sql(update \"My Table\" set \"Attribute\" = 'xyz' where \"OtherAttribute\" <> 4); }");
        assertEquals(SyncCall.class, getSecondExp(m).getClass());
    }

}
