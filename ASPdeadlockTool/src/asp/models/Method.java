package asp.models;

import java.util.HashMap;

public class Method extends ComputationUnit{
	
	TypeBase returnedType;
	String methodName;
	HashMap<TypeBase,Variable> parameters; 
	StmtBlock body;
	
	public Method(TypeBase returnedType, String methodName, HashMap<TypeBase,Variable> parameters, StmtBlock body)
	{
		this.returnedType = returnedType;
		this.methodName = methodName;
		this.parameters = parameters;
		this.body = body;
	}

	public TypeBase getReturnedType() {
		return returnedType;
	}

	public void setReturnedType(TypeBase returnedType) {
		this.returnedType = returnedType;
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public HashMap<TypeBase,Variable> getParameters()
	{
		return parameters;
	}
	
	public StmtBlock getBody()
	{
		return body;
	}
	
	public void setParameters(HashMap<TypeBase,Variable> parameters)
	{
		this.parameters = parameters;
	}
	
	public void setBody(StmtBlock body)
	{
		this.body = body;
	}
}
