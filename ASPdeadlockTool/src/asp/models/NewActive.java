package asp.models;

import java.util.LinkedList;

public class NewActive extends NewObject{

	private final static boolean ACTIVE = true;
	
	public NewActive(String className, LinkedList<Expression> parameters) {
		super(ACTIVE, className, parameters);
		// TODO Auto-generated constructor stub
	}

}
