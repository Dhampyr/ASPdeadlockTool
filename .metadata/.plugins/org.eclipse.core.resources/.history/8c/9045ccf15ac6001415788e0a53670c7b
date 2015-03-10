package asp.models;

import java.util.HashMap;
import java.util.LinkedList;

public class Method extends ComputationUnit{
	
	LinkedList<TypeBase> parameters; 
	HashMap<String,Variable> varDec;
	LinkedList<Statement> stmts; 
	
	public Method(LinkedList<TypeBase> parameters, HashMap<String,Variable> varDec, LinkedList<Statement> stmts)
	{
		this.parameters = parameters;
		this.varDec = varDec;
		this.stmts = stmts;
	}
	
	public LinkedList<TypeBase> getParameters()
	{
		return parameters;
	}
	
	public LinkedList<Statement> getStmts()
	{
		return stmts;
	}
	
	public HashMap<String, Variable> getVar()
	{
		return varDec;
	}
	
	public void setParameters(LinkedList<TypeBase> parameters)
	{
		this.parameters = parameters;
	}
	
	public void setVar(HashMap<String, Variable> varDec)
	{
		this.varDec = varDec;
	}
	
	public void setStmts(LinkedList<Statement> stmts)
	{
		this.stmts = stmts;
	}

}
