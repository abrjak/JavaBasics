package ch.baloise.it.helloname;

import java.util.Scanner; // <----- This shows libraries being imported which are not 'Standard'.

/**
 * @author Jakob Abraham, 01.02.2018
 * 
 * This Class asks the User for his/her name and prints out a greeting in the console.
 * 
 * Version 1 - Easy
 * 
 */
public class HelloName {
	
	/**
	 * This is the Main Method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		// This Line creates a new Scanner-Object. It can read input from the console
		Scanner scanner = new Scanner(System.in);
		// This Line asks the USer for his/her name
		System.out.println("What is your name?");
		// This line saves the name written in a variable
		String name = scanner.nextLine();
		// This line prints out a greeting to the User
		System.out.println("Hello " + name);
		// This line closes the Scanner-Object again. This is not needed for all Objects, but for this one (I/O)
		scanner.close();
	}
}
