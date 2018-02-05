package ch.baloise.it.finance;

import java.util.Scanner;

/*
 *  EXERCISE: WRITE A TOOL THAT CAN DO THE FOLLOWING THINGS:
 *  1. ASK THE USER WHAT HE WANTS TO DO. - OPTIONS: SEE ACCOUNT BALANCE. WITHDRAW MONEY. ADD MONEY. EXIT.
 *  2. IMPLEMENT ALL THESE OPTIONS.
 *  3. THE APPLICATION SHOULD ONLY EXIT WHEN THE USER CHOOSES TO.
 */

/**
 * 
 * @author 
 *
 */
public class FinanceToolExercise {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * Main-Method
	 * @param args
	 */
	public static void main(String[] args) {
		new FinanceToolExercise();
	}
	
	/**
	 * Constructor of the FinanceToolExercise
	 */
	public FinanceToolExercise() {
		
		
		scanner.close();
	}

}
