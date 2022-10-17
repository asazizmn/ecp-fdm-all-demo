/**
 * CounterStatic.java
 * - demonstrates what a static object counter would look like
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood1.statics;



class CounterStatic {
	
	// static variable
	static int counterStatic = 0;

	
	
	// default constructor
	CounterStatic() {
		
		// incrementing value
		counterStatic++;
		System.out.println(counterStatic);
	}
	
	
	public static void main(String args[]) {
		CounterStatic counter1 = new CounterStatic();
		CounterStatic counter2 = new CounterStatic();
		CounterStatic counter3 = new CounterStatic();
	}
}