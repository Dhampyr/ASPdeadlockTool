package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Base class for variables . i.e. (x, y, n)
 */
public class Variable extends Element {
	
	protected String id;
	
	public Variable(String id) {
		this.id = id;
	}
	
	public String getId(){return id;}

}
