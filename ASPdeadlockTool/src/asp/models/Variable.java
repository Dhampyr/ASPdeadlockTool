package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Base class for variables . i.e. (x, y, n)
 */
public class Variable extends Element {
	
	protected String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	public String getName(){return name;}

}
