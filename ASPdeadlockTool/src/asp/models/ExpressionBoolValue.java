package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Represents VM value states i.e. bot, top, part
 */
public class ExpressionBoolValue extends ExpressionValue {
	
	@Override
	public Boolean getValue() { return (Boolean)value; }
	
	/**
	 * Creates a boolean expression value
	 * @param value: a value from {true, false}
	 */
	public ExpressionBoolValue(Boolean value){
		super(value);		
	}
}
