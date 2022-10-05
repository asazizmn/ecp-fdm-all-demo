/**
 * StringGeneration
 * - demonstrating various ways to create a string
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	05/10/22
 */

package com.fdmgroup.ood1.datatypes;



public class StringGeneration {

	public static void main(String[] args) {
		
		// Method 1: Using String Literal ////////////////
		String string1 = "In String Pool";
		
		
		
		// Method 2: Using new keyword ////////////////
		
		// string argument
		String string2 = new String("In the Heap");
		
		// character array argument
		char ch[] = { 'H', 'e', 'l', 'l', 'o', '!'};
		String string3 = new String(ch);
		System.out.println(string3);
		
		
		
		// Immutable in nature ///////////////
		
		// even concatenation creates a new string 
		string1 = string1 + " Again";
	}

}
