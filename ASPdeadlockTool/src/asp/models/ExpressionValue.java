package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Base class for value expressions. i.e. (null, true, 1, BOT, TOP, etc)
 */
public abstract class ExpressionValue extends Expression {
	
	protected Object value;
	
	public Object getValue(){ return value; }
	
	/**
	 * Creates an expression with value
	 * @param value the value of the expression
	 */
	public ExpressionValue(Object value) {
		this.value = value;
	}
	
	

}
