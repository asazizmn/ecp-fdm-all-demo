/**
 * PrimitiveCasting
 * - demonstrating basic casting
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	05/10/22
 */



package com.fdmgroup.ood1.datatypes;



public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// implicit casting ////////////////
		
		int intAge = 35;
		double doubleAge = intAge;
		
		
		
		// explicit casting ////////////////
		
		double doubleType = 85.4;
		
		// doubleType is bigger, so it must be cast.
		// otherwise 'Type mismatch' error​
		int intType = (int) doubleType;
		

		
		// Numeric promotion (aka implicit casting) ////////////////
		
		int intValue = 1;
		double doubleValue = 1.234;
		double doubleResult = intValue + doubleValue;
		
		long longValue = 1234567879L;
		float floatValue = 1.23f;
		float floatResult = longValue + floatValue;
		
	}

}
