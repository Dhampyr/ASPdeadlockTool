package asp.analyzer;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import asp.models.ClassDecl;
import asp.models.Program;
import asp.parser.ASPLexer;
import asp.parser.ASPParser;
import asp.parser.ASPParser.ProgramContext;


public class Translator {
	
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		is = new FileInputStream("src/input.txt");
		ANTLRInputStream input = new ANTLRInputStream(is);
		ASPLexer lexer = new ASPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ASPParser parser = new ASPParser(tokens);
		//parser.setBuildParseTree(false);
		FileOutputStream trad = new FileOutputStream("src/trad.abs"); 
		FileOutputStream log = new FileOutputStream("src/log.abs");
		FileOutputStream env = new FileOutputStream("src/env.abs");
		
		//PRINT TRAD
		System.setOut(new PrintStream(trad));
	    Program program = parser.program().prog;
	    
	    //PRINT ENVIRONMENT
	    System.setOut(new PrintStream(env));
	    print(parser.environment);
	    
	    //PRINT LOG
	    System.setOut(new PrintStream(log));
	    if(program != null)
	    	program.print();
	    
	    Object i;
		i = true;
		System.out.println("LA CLASSE DI I É: " + i.toString());
	}
	
	public static void print(HashMap<String, ClassDecl> classSpec){
		System.out.println("Il programma ha le classi:");
		for (String key: classSpec.keySet()){
            ClassDecl cl = classSpec.get(key);  
            cl.print();  
		} 
	}
	
	
}