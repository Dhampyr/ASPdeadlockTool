package asp.models;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vincenzo Mastandrea
 * Represents the type of an Object as well as its fields.
 */
public class TypeObject extends TypeBase implements IActualValue {
	
	//fields
	String name; //the name of the object
	List<TypeBase> fields; //the pairs <ID,TYPE> of record fields
	
	//accessors
	public String getName(){return name;}
	
	public List<TypeBase> getFields(){return fields;}
	
	//constructor
	public TypeObject (String name, List<TypeBase> fields){
		this.name = name;
		this.fields = fields!=null?fields:new LinkedList<TypeBase>();
	}
}
