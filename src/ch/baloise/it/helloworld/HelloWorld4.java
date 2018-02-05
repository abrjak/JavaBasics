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
 * Version 4 - Advanced
 *
 */
public class HelloWorld4 { // <----- Class-Name ( == Name of the File)
	
	/**
	 * This is the Main-Method. Unless otherwise defined, this Method will be executed first upon starting the application
	 * 
	 * @param args - The Default Parameter for the Main Class, not important for now
	 */
	public static void main(String[] args) { // <----- Method
		
		// Version 3 - Advanced
		// This command creates a new HelloWorld3-Object
		new HelloWorld4();
	}
	
	/**
	 * Constructor of the HelloWorld4-Class
	 */
	public HelloWorld4() {
		// This Variable defines the Greeting
		String greeting = "Hello World";
		// This command calls the printGreeting-Method and gives along a greeting
		printGreeting(greeting);
	}
	
	/**
	 * This Method prints a passed on Greeting on the Console
	 */
	public void printGreeting(String greeting) {
		System.out.println(greeting);
	}
}
