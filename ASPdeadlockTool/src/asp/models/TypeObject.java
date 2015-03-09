package asp.models;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vincenzo Mastandrea
 * Represents the type of an Object as well as its fields.
 */
public class TypeObject extends TypeBase implements IActualValue {
	
	//fields
	String id; //the name of the object
	String objClass;
	
	//accessors
	public String getID(){return id;}
	
	public String getObjClass(){return objClass;}
	
	//constructor
	public TypeObject (String id, String objClass){
		this.id = id;
		this.objClass = objClass;
	}
}
