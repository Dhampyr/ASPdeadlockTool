package asp.models;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vincenzo Mastandrea
 * Represents the type of an Object as well as its fields.
 */
public class TypeObject extends TypeBase implements IActualValue {
	
	public TypeObject (String id, String objClass){
		super(id, objClass);
	}
}
