package asp.models;

public class Assignment extends Statement {
	
	private final static String STMTTYPE = "Assignment";
	Variable leftSide;
	ExpressionSideEffects rightSide;
	
	public Assignment(Variable leftSide, ExpressionSideEffects rightSide) {
		super(STMTTYPE);
		// TODO Auto-generated constructor stub
		this.leftSide = leftSide;
		this.rightSide = rightSide;		
	}
	
	public void setLeftSide(Variable leftSide)
	{
		this.leftSide = leftSide;
	}
	
	public void setRightSide(ExpressionSideEffects rightSide)
	{
		this.rightSide = rightSide;
	}
	
	public Variable getLeftSide()
	{
		return leftSide;
	}
	
	public ExpressionSideEffects getRightSide()
	{
		return rightSide;
	}
}
