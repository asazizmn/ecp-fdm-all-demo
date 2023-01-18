/**
 * CharacterInput.java
 * - methods demonstration
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	18/01/23
 */

package com.fdmgroup.ood1.methods;

import java.util.Scanner;



public class CharacterInput {

	/**
	 * This method reads a character from the console
	 * and then prints it, in effect echoing the input
	 * 
	 * @param scanner an object of the Scanner class
	 */
	public static void processInput(Scanner scanner) {

		// print out first label
		System.out.print("your input: ");

		// do the actually reading from console
		char charInput = scanner.next().charAt(0);

		// print out the input back to the console
		System.out.println(charInput);

	}
	
	
	/**
	 * This runner method creates an object of the Scanner class
	 * and reads input from the console, in a loop
	 */
	public static void main(String[] args) {
		
		// defines the number of times input should occur
		final int NUMBER_OF_INPUTS = 8;
		
		// prepare and open scanner class for reading
		Scanner scanner = new Scanner(System.in);
		

		// reading input multiple times
		for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
			processInput(scanner);
		}
		

		// close the scanner object
		scanner.close();
	}
}