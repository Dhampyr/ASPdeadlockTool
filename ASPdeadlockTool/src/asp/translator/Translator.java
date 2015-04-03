package asp.translator;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.v4.parse.ANTLRParser.parserRule_return;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import asp.models.ClassDecl;
import asp.models.Program;
import asp.parser.ASPLexer;
import asp.parser.ASPParser;
import asp.parser.ASPParser.ProgramContext;


public class Translator {
	
//	public static void print(HashMap<String, ClassDecl> classSpec){
//		System.out.println("Il programma ha le classi:");
//		for (String key: classSpec.keySet()){
//            ClassDecl cl = classSpec.get(key);  
//            cl.print();  
//		} 
//	}
	
	public static void translate(ASPParser parser, ParseTree tree)
	{
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks
		walker.walk(new AspToAbs(parser.classTable), tree);
		System.out.println(); 
	}
	
	
}