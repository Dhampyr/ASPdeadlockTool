package asp.models;

import java.util.HashMap;

public class Method extends ComputationUnit{
	
	TypeBase returnedType;
	String methodName;
	HashMap<Integer,Declaration> parameters; 
	StmtBlock body;
	
	public Method(TypeBase returnedType, String methodName, HashMap<Integer,Declaration> parameters, StmtBlock body)
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
	
	public HashMap<Integer,Declaration> getParameters()
	{
		return parameters;
	}
	
	public StmtBlock getBody()
	{
		return body;
	}
	
	public void setParameters(HashMap<Integer,Declaration> parameters)
	{
		this.parameters = parameters;
	}
	
	public void setBody(StmtBlock body)
	{
		this.body = body;
	}
	
	public boolean isEqual(Method m)
	{
		if (this.methodName.equals(m.getMethodName()))
			if (this.countPar() == m.countPar())
			{
				for (int i=0; i<this.getParameters().size();i++)
				  if (!(this.getParameters().get((Integer) i).getType().getType().equals(m.getParameters().get((Integer) i).getType().getType())))
					return false;  
			}	
		return true;
	}
	
	public int countPar()
	{
		return parameters.size();
	}
}
