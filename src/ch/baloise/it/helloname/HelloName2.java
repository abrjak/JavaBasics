package ch.baloise.it.helloname;

import java.util.Scanner; // <----- This shows libraries being imported which are not 'Standard'.

/**
 * @author Jakob Abraham, 01.02.2018
 * 
 * This Class asks the User for his/her name and prints out a greeting in the console.
 * 
 * Version 2 - Advanced
 *
 */
public class HelloName2 {
	
	/**
	 * This is the Main Method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creates a new HelloName2-Object
		new HelloName2();
	}
	
	/**
	 * This is the Constructor of the HelloName2-Class
	 */
	public HelloName2() {
		// Calls the askForName-Method
		String name = askForName();
		//Calls the greetName-Method
		greetName(name);
	}
	
	/**
	 * Asks for the User's Name and returns it as a String
	 * @return name - String of the User's Name
	 */
	public String askForName() {
		
		// creates new Scanner-Object
		Scanner scanner = new Scanner(System.in);
		// asks the User for his/her name
		System.out.println("What is your name?");
		// Saves the input in a variable
		String name = scanner.nextLine();
		// closes the Scanner-Object
		scanner.close();
		// returns the Input
		return name;
	}
	
	/**
	 * Prints out a greeting to the inserted Name
	 * 
	 * @param name - The Name of the User
	 */
	public void greetName(String name) {
		// prints out the name
		System.out.println("Hello " + name);	
	}
}
