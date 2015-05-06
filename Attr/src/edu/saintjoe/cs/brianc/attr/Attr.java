package edu.saintjoe.cs.brianc.attr;
// These comments are added by Brian Capouch

public class Attr {
	
	// Once I create an object and give it a name, it CANNOT be changed!!
	private final String name;
	
	// "value" can be a reference to ANY kind of object!!
	private Object value = null;
	
	/* ---------------------------------------------------------------------- */
	//Comments on overloaded code
	// These two are overloaded because these are two functions with the same name
	// and are in the same class but they have different pararamters
	public Attr(String name) {
		this.name = name;
	}


	public Attr(String name, Object value) {
		this.name = name;
	    this.value = value;
	    }

	// Accessor or "getter"
	public String getname() {
	    return name;
	    }

	// Accessor or "getter"
	public Object getValue() {
	    return value;
	    }

	// Setter or mututator for data member "value"
	public Object setValue(Object newValue) {
	    Object oldVal = value;
	    value = newValue;
	    return oldVal;
	    }

	// ALL classes should have a "toString" method to visualize their contents
	//   that usually means just printing their data members
	public String toString() {
	    return name + "='" + value + "'";
	    }
	}
