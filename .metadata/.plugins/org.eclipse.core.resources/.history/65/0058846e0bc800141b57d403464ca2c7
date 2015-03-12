package asp.models;

public class IfThenElse extends Statement{
	
	private final static String STMTTYPE = "ITE";
	ExpressionBoolValue condition;
	StmtBlock trueSide;
	StmtBlock falseSide;
	
	public IfThenElse(ExpressionBoolValue condition, StmtBlock trueSide, StmtBlock falseSide) {
		super(STMTTYPE);
		// TODO Auto-generated constructor stub
		this.condition = condition;
		this.trueSide = trueSide;
		this.falseSide = falseSide;
	}
	
	public void setCondition(ExpressionBoolValue condition)
	{
		this.condition = condition;
	}
	
	public void setTrueSide(StmtBlock trueSide)
	{
		this.trueSide = trueSide;
	}
	
	public void setFalseSide(StmtBlock falseSide)
	{
		this.falseSide = falseSide;
	}
	
	public ExpressionBoolValue getCondition()
	{
		return condition;
	}
	
	public StmtBlock getTrueSide()
	{
		return trueSide;
	}
	
	public StmtBlock getFalseSide()
	{
		return falseSide;
	}
	
	

}
