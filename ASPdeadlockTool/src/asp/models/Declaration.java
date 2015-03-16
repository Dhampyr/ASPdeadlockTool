package asp.models;

public class Declaration {
	
	TypeBase type;
	Variable var;
	
	public Declaration(TypeBase type, Variable var)
	{
		this.type = type;
		this.var = var;
	}
	
	public TypeBase getType() {
		return type;
	}

	public void setType(TypeBase type) {
		this.type = type;
	}

	public Variable getVar() {
		return var;
	}

	public void setVar(Variable var) {
		this.var = var;
	}
}
