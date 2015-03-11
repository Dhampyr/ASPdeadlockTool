package asp.models;

import java.util.HashMap;

public class Class extends ComputationUnit {
	
	String className;
	HashMap<TypeBase,Variable> fields;
	HashMap<TypeBase,Variable> parameters; 
	HashMap<String, Method> methods;
	
	
	public Class(String className, 
				 HashMap<TypeBase,Variable> parameters, 
				 HashMap<TypeBase,Variable> fields, 
			     HashMap<String, Method> methods)
	{
		this.className = className;
		this.parameters = parameters;
		this.fields = fields;
		this.methods = methods;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public Method getMethodFromID (String methodName)
	{
		if (methods.containsKey(methodName))
			return methods.get(methodName);
		else
			return null;
	}
	
	public HashMap<String, Method> getMethods()
	{
		return methods;
	}
	
	public HashMap<TypeBase,Variable> getFields()
	{
		return fields;
	}
	
	public HashMap<TypeBase,Variable> getParameters()
	{
		return parameters;
	}
		
	public void setFields (HashMap<TypeBase,Variable>fields )
	{
		this.fields = fields;
	}
	
	public void setParameters (HashMap<TypeBase,Variable> parameters )
	{
		this.parameters = parameters;
	}
	
	public void setMethods (HashMap<String, Method> methods )
	{
		this.methods = methods;
	}
	
}
