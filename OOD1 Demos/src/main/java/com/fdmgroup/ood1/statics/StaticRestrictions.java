/**
 * StaticRestrictions.java
 * - basic demonstration of things you can't do with the static keyword
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood1.statics;



class StaticRestrictions {
	
	// static variable
	static int a = 10;

	// instance variable
	int b = 20;

	// instance method
	void method1() {
		System.out.println("from method1");
	}

	// static method
	static void method2() {
		System.out.println("from method2");
		
		a = 20;

		// Cannot make a static reference to the non-static field b
//		b = 10; // Error !!!!!

		// Cannot make a static reference to the
		// non-static method method1() from the type StaticRestrictions
//		method1(); // Error !!!!!

		// Cannot use 'super' or 'this' in a static context
//		System.out.println(super.a); // Error !!!!!
	}

}