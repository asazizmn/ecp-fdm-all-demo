/**
 * Wrappers.java
 * - demonstrating primitive wrapper classes
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	05/10/22
 */

package com.fdmgroup.ood1.datatypes;



public class Wrappers {

	public static void main(String[] args) {
		
		final int CONSTANT_INTEGER = 123;
		
		
		
		// int -> Integer
		Integer objectInt = Integer.valueOf(CONSTANT_INTEGER);
		
		
		// Integer -> int
		int anotherRegularInt = objectInt.intValue();

		
		
		// parsing: String -> Long
		Long objectLong = Long.decode("456");
		
		
		// parsing: 
		double regularDouble = Double.parseDouble("2.345");
	}

}
