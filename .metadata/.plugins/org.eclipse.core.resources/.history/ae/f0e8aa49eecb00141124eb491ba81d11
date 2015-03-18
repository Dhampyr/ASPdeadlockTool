/**
 * 
 */
package asp.models;

import java.util.HashMap;

/**
 * @author Vincenzo Mastandrea
 * Base class for an ASP program
 */
public class Program extends ComputationUnit {
	
	HashMap<String, ClassDecl> classSpec;
	StmtBlock mainFunction;
	
	//setter
	public Program(HashMap<String, ClassDecl> classSpec, StmtBlock mainFunction)
	{
		this.classSpec = classSpec;
		this.mainFunction = mainFunction;
	}
	
	
	//getter
	public StmtBlock getMF()
	{ 
		return mainFunction;
	}
	
	public ClassDecl getClassDef(String id)
	{
		return classSpec.get(id);
	}
	
	public HashMap<String, ClassDecl> getClasses()
	{
		return classSpec;
	}
}