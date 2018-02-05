package ch.baloise.it.calculator;

import java.util.Scanner;

/**
 * @author Jakob Abraham, 01.02.2018
 * 
 * This Class adds two numbers given by the User and prints out the Result.
 *
 */
public class Addition {
	
	/**
	 * The Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// new Scanner-Object
		Scanner scanner = new Scanner(System.in);
		// Welcome User and ask for numbers
		System.out.println("--- Welcome to the Additor ---");
		System.out.println("Please insert the first Number:");
		// Save Number 1
		int x = scanner.nextInt();
		System.out.println("Please Insert the second Number:");
		// Save number 2
		int y = scanner.nextInt();
		// Calculate and Print out Result
		System.out.println("Thank you. The Calculation and the Result is:");
		System.out.println(x + " + " + y + " = " + (x + y));
		// Close Scanner
		scanner.close();
	}
}
