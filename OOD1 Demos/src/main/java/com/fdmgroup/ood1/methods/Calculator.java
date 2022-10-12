/**
 * Calculator.java
 * - methods demonstration
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	12/10/22
 */

package com.fdmgroup.ood1.methods;



public class Calculator {

	public static void main(String args[]) {
		int result2 = addTwo(2, 2);
		int result3 = addThree(2, 2, 2);
		int result4 = addFour(2, 2, 2, 2);
//		int result = addFive(1, 2, 3, 4, 5); // ????????????????

		System.out.println(result2);
	}
	
	
	public static int addTwo(int first, int second) {
		return first + second;
	}
	
	
	public static int addThree(int first, int second, int third) {
		return first + second + third;
	}
	
	
	public static int addFour(int first, int second, int third, int fourth) {
		return first + second + third + fourth;
	}
	
	
	// the varargs ('...') allow 'values' to capture any number of parameters
	// i.e. add(1, 2, 3, 4, 5) will now work!
	public static int add(int... values) {
		int result = 0;
		for (int value : values) result += value;
		return result;
	}

	
	

}