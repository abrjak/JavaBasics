package ch.baloise.it.calculator;

import java.util.Scanner;

// ----- EXERCISE : READ THE CODE BELOW CARFULLY AND TRY TO UNDERSTAND IT. AFTERWARDS, COMPLETE THE FUNCTIONALITIES OF SUBSTRACTING, MULTIPLYING AND DIVIDING NUMBERS ----- //

/**
 * 
 * @author Jakob Abraham, 01.02.2018
 * 
 * This Class asks the user if he wants to add, substract, divide or multiply numbers. Afterwards, he asks for two numbers and does what the User wanted with them.
 *
 * Version 1 - Advanced +
 *
 */
public class CalculatorExercise {
	
	// This is a Class-Variable. It's use will be talked about later
	// for now it's important to know that you can use it the way it is shown in the addNumbers()-Method
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * Main - Method
	 * @param args
	 */
	public static void main(String[] args) {
		new CalculatorExercise();
	}
	
	/**
	 * Constructor of the Calculator-Class
	 */
	public CalculatorExercise() {
		
		int option = askOptions();
		
		// Determine what to do based on the chosen option
		if (option == 1) {
			// call Addition-Method
			addNumbers();
		} else if (option == 2) {
			// call Substraction-Method
		} // TODO: COMPLETE FOR ALL OPTIONS
		
		// Last Thing: Close Scanner
		scanner.close();		
	}
	
	/**
	 * Asks the User what kind of Calculation he wants to do
	 * 
	 * @return option - Integer-Value of an option
	 */
	public int askOptions() {		
		System.out.println("----- Welcome to the Calculator -----");
		System.out.println("Please choos what kind of Calculation you want to do:");
		System.out.println("- Press '1' for Addition");
		System.out.println("- Press '2' for Substraction");
		// TODO: COMPLETE WITH THE OTHER OPTIONS
		
		// save option as Int
		int option = scanner.nextInt();
		// return Option
		return option;
	}
	
	/**
	 * Asks the User for two numbers and adds them
	 */
	public void addNumbers() {
		System.out.println("----- Addition -----");
		System.out.println("Please insert the first Number");
		int x = scanner.nextInt();
		System.out.println("Please insert the second Number");
		int y = scanner.nextInt();
		System.out.println("The Result of this Addition is:");
		System.out.println(x + " + " + y + " = " + (x+y));
	}

}
