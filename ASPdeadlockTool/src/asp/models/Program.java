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
	
	HashMap<String, Class> classSpec;
	StmtBlock mainFunction;
	
	//setter
	public Program(StmtBlock mainFunction, HashMap<String, Class> classSpec)
	{
		this.classSpec = classSpec;
		this.mainFunction = mainFunction;
	}
	
	
	//getter
	public StmtBlock getMF()
	{ 
		return mainFunction;
	}
	
	public Class getClassDef(String id)
	{
		return classSpec.get(id);
	}
	
	public HashMap<String, Class> getClasses()
	{
		return classSpec;
	}
}