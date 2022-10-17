/**
 * CounterNonStatic.java
 * - demonstrates what an object counter without a static variable would look like
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood1.statics;



class CounterNonStatic {
	
	// instance variable
	int counterNonStatic = 0;

	
	
	// default constructor
	CounterNonStatic() {
		
		// incrementing value
		counterNonStatic++;
		System.out.println(counterNonStatic);
	}
	
	
	public static void main(String args[]) {
		CounterNonStatic counter1 = new CounterNonStatic();
		CounterNonStatic counter2 = new CounterNonStatic();
		CounterNonStatic counter3 = new CounterNonStatic();
	}
}