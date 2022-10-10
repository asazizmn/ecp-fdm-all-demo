/**
 * StringManipulation.java
 * - demonstrating string manipulation
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	05/10/22
 */

package com.fdmgroup.ood1.datatypes;



public class StringManipulation {

	public static void main(String[] args) {
		
		// Common String Methods ////////////////
		
		String salam = "Assalamu Alaykum";
		
		System.out.println(salam.substring(9));		
		System.out.println(salam.substring(2, 7));
		
		System.out.println(salam.toUpperCase());
		System.out.println(salam.toLowerCase());
		
		System.out.println(salam.toCharArray());
		
		
		// please beware of using reserved characters in regex, for instance '.'
		// REF: https://towardsdatascience.com/an-introduction-to-regular-expressions-5dd762afc5e4  
		String alphabets = "a:b:c:d:e:f";
		String[] alphabetsArray = alphabets.split(":");
		
		// prints '[Ljava.lang.String;@7e9e5f8a'
		// this is an array of String class
		// ... and @7e9e5f8a is the memory address of the array object
		System.out.println(alphabetsArray);
		
		
		// loop through array object and print individually
		for (String alphabet : alphabetsArray) {
			System.out.println(alphabet);
		}
		
		
		// String Comparison ////////////////
		
		String string1 = "Hello";
		String string2 = "Hello";
		System.out.println(string1 ==  string2); 		// true
		
		
		String string3 = new String("Hello");
		String string4 = new String("Hello");
		System.out.println(string3 ==  string4); 		// false

//		System.out.println(string3.equals(string4));	// true
	}

}
