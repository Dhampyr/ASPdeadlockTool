package asp.models;

/**
 * @author Vincenzo Mastandrea
 * Base class for value expressions. i.e. (null, true, 1, BOT, TOP, etc)
 */
public class ExpressionBinaryOperation extends Expression {
	
	protected Expression leftOperand;
	protected Expression rightOperand;
	protected String op;
	
	/**
	 * Creates a new binary operation
	 * @param leftSide: left operand
	 * @param operator: one of the allowed operators {+, -, >=, <=, =, !=, &&, ||}
	 * @param rightSide: right operand
	 */
	public ExpressionBinaryOperation(Expression leftOperand, String operator, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand; 
		this.op = operator;
	}
	
	public void setLeftOperand(Expression leftOperand)
	{
		this.leftOperand = leftOperand;
	}
	
	public void setRightOperand(Expression rightOperand)
	{
		this.rightOperand = rightOperand;
	}
	
	public void setOperator(String op)
	{
		this.op = op;
	}
	
	public Expression getLeftOperand()
	{
		return leftOperand;
	}
	
	public Expression getRightOperand()
	{
		return rightOperand;
	}
	
	public String getOperator()
	{
		return op;
	}
	
}
