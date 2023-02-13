/**
 * SwapTest.java
 * - demonstrating the pass-by-value (vs pass-by-reference) nature of Java
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	24/10/22
 */

package com.fdmgroup.ood1.memory;



/**
 * A simple Person POJO class containing only a String name attribute
 */
class Person {
	String name;
	
	Person( String name ) {
		this.name = name;
	}
}



/**
 * Defines a class with various tests to check the results of swapping two arguments
 */
public class SwapTest {
	
	int attr1 = 1;
	int attr2 = 2;
	
	
	
	/**
	 * 1. this method takes two values
	 * 2. makes a copy 
	 * 3. and performs a swap
	 * 
	 * @param var1
	 * @param var2
	 */
	public static void swap( int var1, int var2 ) {
		int temp = var1;
		var1 = var2;
		var2 = temp;
	}
	
	
	/**
	 * 1. this method takes two Person objects
	 * 2. makes a copy 
	 * 3. and performs a swap
	 * 
	 * @param var1
	 * @param var2
	 */
	public static void swap( Person var1, Person var2 ) {
		Person temp = var1;
		var1 = var2;
		var2 = temp;
	}
	
	
	/**
	 * 1. this method takes an object
	 * 2. makes a copy of its reference
	 * 3. and performs a swap of the values inside the object  
	 * 
	 * @param objRefCopy
	 */
	public static void swap( SwapTest objRefCopy ) {
		int temp = objRefCopy.attr1;
		objRefCopy.attr1 = objRefCopy.attr2;
		objRefCopy.attr2 = temp;
	}

	
	public static void main( String[] args ) {
		
		// Pass-by-value: local values ////////////////////////////////////////////////////////
		System.out.println("\nPass local variables: primitive");
		
		int arg1 = 1;
		int arg2 = 2;
		swap( arg1, arg2 );
		
		System.out.println("arg1 is: " + arg1);
		System.out.println("arg2 is: " + arg2);
		
		
		System.out.println("\nPass local variables: Object");
		
		Person person1 = new Person( "John" );
		Person person2 = new Person( "Chris" );

		swap( person1, person2 );
		
		System.out.println("person1 is: " + person1.name);
		System.out.println("person2 is: " + person2.name);
		
		
		
		// Pass-by-value: values in object ////////////////////////////////////////////////////////
		System.out.println("\nPass values in object");
		
		SwapTest swapTest1 = new SwapTest();
		swap( swapTest1.attr1, swapTest1.attr2 );
		
		System.out.println("attr1 is: " + swapTest1.attr1);
		System.out.println("attr2 is: " + swapTest1.attr2);
		
		
		
		// Pass-by-value: of object reference ////////////////////////////////////////////////////////
		System.out.println("\nPass value of object reference");
		
		SwapTest swapTest2 = new SwapTest();
		
		System.out.println("\nBefore Swapping");
		System.out.println("attr1 is: " + swapTest2.attr1);
		System.out.println("attr2 is: " + swapTest2.attr2);
		
		swap( swapTest2 );
		
		System.out.println("\nAfter Swapping");
		System.out.println("attr1 is: " + swapTest2.attr1);
		System.out.println("attr2 is: " + swapTest2.attr2);
	}
}
