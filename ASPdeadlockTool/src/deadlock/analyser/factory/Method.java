package deadlock.analyser.factory;

import java.util.LinkedList;

import com.gzoumix.semisolver.term.Term;
import com.gzoumix.semisolver.term.TermVariable;
import com.gzoumix.semisolver.term.Variable;

public class Method extends GenericStructuredTerm {

public static String name = "Method";
public String methodName = "";
	
	public Method(String methodName) {
		super(name, new LinkedList<Term>());
		this.methodName = methodName;
	}
	
	public String toString(){
		String kind = ".";
		return kind;
	}
	
}
