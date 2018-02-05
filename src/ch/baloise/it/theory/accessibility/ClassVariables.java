package ch.baloise.it.theory.accessibility;

/**
 * 
 * @author Jakob Abraham, 05.02.2017
 * 
 * This class aims to demonstrate the accessibility of Class Variables.
 * Only these three (The most commonly used) Identifiers will be looked at in this Class: public, private, static
 *
 */
public class ClassVariables {
	
	// All Class Variables are instantiated below the Class-Identifier and before the first Method or Constructor
	// Class Variables (unlike normal Variables) can be instantiated without defining a standard Value (see Line 25).
	// Of course, you can define a Value if you want to (see Line 26)
	
	/*
	 * The Public Class Variable can be accessed by every other Class or Object inside the same workspace.
	 * Also, all Methods - except for static ones - can use these Variables.
	 * To see how it works, start the ClassVariablesTest-Class
	 * The Use of Public Class Variables is depreceated but in some cases inevitable.
	 * Instead, Private Class Variables with Getter/Setter Methods are used.
	 */
	
	public String firstname;
	public String lastname = "Meyer";
	
	/**
	 * 
	 */
	
	public ClassVariables() {
		
		
		
	}

}
