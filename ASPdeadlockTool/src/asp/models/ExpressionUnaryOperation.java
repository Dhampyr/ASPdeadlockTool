package asp.models;

public class ExpressionUnaryOperation extends Expression {
	
	private Expression operand;
	private String op;
	
	/**
	 * Creates a new binary operation
	 * @param leftSide: left operand
	 * @param operator: one of the allowed operators {+, -, >=, <=, =, !=, &&, ||}
	 * @param rightSide: right operand
	 */
	public ExpressionUnaryOperation(String operator, Expression operand) {
		this.operand = operand;
		this.op = operator;
	}
	
	public void setOperand(Expression operand)
	{
		this.operand = operand;
	}
	
	public void setOperator(String op)
	{
		this.op = op;
	}
	
	public Expression getOperand()
	{
		return operand;
	}
	
	public String getOperator()
	{
		return op;
	}
	
}
