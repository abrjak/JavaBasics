package ch.baloise.it.helloworld; // <----- Package-Name | Packages are like folders, 
								  // 					   their main usage is for structure and order

/**
 * @author Jakob Abraham, 01.02.2018 <----- Me :)
 * 
 * This is the starting comment. Commenting is very important in Development,
 * since it will make it easier for you and your co-workers to understand your
 * code even years after it was written. Comments are ignored by the Compiler.
 * In this part, Developers often describe what this Class does in General.
 * 
 * This Class prints out 'Hello World' in the console upon starting.
 * 
 * Version 3 - Easy +
 *
 */
public class HelloWorld3 { // <----- Class-Name ( == Name of the File)
	
	/**
	 * This is the Main-Method. Unless otherwise defined, this Method will be executed first upon starting the application
	 * 
	 * @param args - The Default Parameter for the Main Class, not important for now
	 */
	public static void main(String[] args) { // <----- Method
		
		// Version 3 - Advanced
		// This command creates a new HelloWorld3-Object
		new HelloWorld3();
	}
	
	/**
	 * Constructor of the HelloWorld3-Class
	 */
	public HelloWorld3() {
		// This command calls the printGreeting-Method
		printGreeting();
	}
	
	/**
	 * This Method prints a predefined Greeting on the Console
	 */
	public void printGreeting() {
		System.out.println("Hello World");
	}
}
