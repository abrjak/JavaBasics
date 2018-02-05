package ch.baloise.it.finance;

import java.util.Scanner;

/**
 * @author Jakob Abraham, 05.02.2018
 * 
 * This Class serves as an example on how to write a Console-Program that runs until the User exits it through interaction
 * (Up until now, our Applications exited after 1-2 interactions)
 * The Class displays two options of output and the option to go back or exit the program.
 *
 */
public class ContinuityExample {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * Main-Method
	 * @param args
	 */
	public static void main(String[] args) {
		new ContinuityExample();
	}
	
	/**
	 * Constructor of the ContinuityExample-Class
	 */
	public ContinuityExample() {
		
		// Initiate an empty String here, or else the "while"-loop can't read the variable
		String option = "";
		
		// Start a Do-While-Loop. this Loop executes the Code after 'do{' as long as the condition in 'while()' is not met
		do {
		
			option = showOptions();
			
			if (option.equalsIgnoreCase("a")) {
				printGreeting();
				
			} else if (option.equalsIgnoreCase("b")) {
				printJoke();
			}
			
			// the '!' before a condition means 'IS NOT' -> if condition is not true, do x
		} while (!option.equalsIgnoreCase("e"));
		System.out.println("Shutting Down");
	}
	
	/**
	 * Shows available Options to User
	 * @return Option - String of the Users choice
	 */
	public String showOptions() {
		System.out.println("----- Continuity-Example -----");
		System.out.println("Press 'a' for a Greeting");
		System.out.println("Press 'b' for a Joke");
		System.out.println("Press 'e' to exit the Application");
		String option = scanner.nextLine();		
		return option;
	}
	
	/**
	 * Prints a Greeting
	 */
	public void printGreeting() {
		System.out.println("");
		System.out.println("Hello User :)");
		System.out.println("");
	}
	
	/**
	 * Prints a Joke
	 */
	public void printJoke() {
		System.out.println("");
		System.out.println("Why do all Programmers wear glasses?");
		System.out.println("Because they can't C#");
		System.out.println("");
	}
}
