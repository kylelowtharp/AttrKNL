package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		// what these two are doing is calling the constructors from ColorAttr
		// it is using the constructor with the parameters with string name and screen color value
		//After that it is calling the super class or Attr and then finding out the string name and the value
		// from the super class
		//then it sets myColor= to value
		
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// Number four
		//
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		//Constructor for the test
		//number 5
		testFour= new Attr("ColorFive", "chartreuse");
		System.out.println(testFour.toString());
		
		testFour= new Attr("ColorSix","crimson");
		System.out.println(testFour.toString());
	} // end main
}