package asp.models;

import java.util.HashMap;
import java.util.LinkedList;

public class StmtBlock extends Statement{
	
	private final static String STMTTYPE = "Block";
	HashMap<TypeBase,Variable> varDec;
	LinkedList<Statement> stmts; 
		
	public StmtBlock(HashMap<TypeBase,Variable> varDec, LinkedList<Statement> stmts)
	{
		super(STMTTYPE);
		this.varDec = varDec;
		this.stmts = stmts;
	}
	
	public StmtBlock()
	{
		super(STMTTYPE);
		this.varDec = null;
		this.stmts = null;
	}
	
	public HashMap<TypeBase, Variable> getVars()
	{
		return varDec;
	}
	
	public LinkedList<Statement> getStmts()
	{
		return stmts;
	}
	
	public void setStmts(LinkedList<Statement> stmts)
	{
		this.stmts = stmts;
	}
	
	public void setVarDec(HashMap<TypeBase, Variable> varDec)
	{
		this.varDec = varDec;
	}
}
