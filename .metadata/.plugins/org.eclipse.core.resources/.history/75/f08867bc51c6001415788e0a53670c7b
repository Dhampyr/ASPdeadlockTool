package asp.models;

import java.util.HashMap;
import java.util.LinkedList;

public class StmtBlock extends ComputationUnit{
	
	HashMap<String,Variable> varDec;
	LinkedList<Statement> stmts; 
		
	public StmtBlock(HashMap<String,Variable> varDec, LinkedList<Statement> stmts)
	{
		this.varDec = varDec;
		this.stmts = stmts;
	}
	
	public HashMap<String, Variable> getVars()
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
	
	public void setVarDec(HashMap<String, Variable> varDec)
	{
		this.varDec = varDec;
	}
}
