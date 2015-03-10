package asp.models;

import java.util.HashMap;
import java.util.LinkedList;

public class Method extends ComputationUnit{
	
	String returnedType;
	String methodName;
	LinkedList<TypeBase> parameters; 
	HashMap<String,Variable> varDec;
	LinkedList<Statement> stmts; 
	
	public Method(String returnedType, String methodName, LinkedList<TypeBase> parameters, HashMap<String,Variable> varDec, LinkedList<Statement> stmts)
	{
		this.returnedType = returnedType;
		this.methodName = methodName;
		this.parameters = parameters;
		this.varDec = varDec;
		this.stmts = stmts;
	}

	public String getReturnedType() {
		return returnedType;
	}

	public void setReturnedType(String returnedType) {
		this.returnedType = returnedType;
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
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
