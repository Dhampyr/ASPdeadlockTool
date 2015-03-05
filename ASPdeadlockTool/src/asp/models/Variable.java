package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Base class for variables . i.e. (x, y, n)
 */
public class Variable extends Expression {
	
	protected String id; //the identity of the variable
	
	/**
	 * Creates an expression representing a variable
	 * @param id: the id of the variable
	 */
	public Variable(String id) {
		this.id = id;
	}
	
	public String getId(){return id;}

}
