package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Represents the types used in a program. 
 */

public abstract class TypeBase{
	
	private String type;
	
	public TypeBase(String type)
	{
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString()
	{
		return type;
	}
}
