package asp.models;

public class Statement extends CompilationUnit {
	
	private String stmtType;
	
	public Statement(String stmtType)
	{
		this.stmtType = stmtType;
	}
	
	public String getType()
	{
		return stmtType;
	}
	
	public void setType(String stmtType)
	{
		this.stmtType = stmtType;
	}
	
	public String toString()
	{
		return stmtType;
	}
		
}
