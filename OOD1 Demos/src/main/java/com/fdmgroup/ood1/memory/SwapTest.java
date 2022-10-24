/**
 * SwapTest.java
 * - demonstrating the pass-by-value nature of Java
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	24/10/22
 */

package com.fdmgroup.ood1.memory;



public class SwapTest {
	
	int arg1 = 1;
	int arg2 = 2;
	
	
	public static void swap( int var1, int var2 ) {
		int temp = var1;
		var1 = var2;
		var2 = temp;
	}
	
	
	public static void swap( SwapTest swapTest ) {
		int temp = swapTest.arg1;
		swapTest.arg1 = swapTest.arg2;
		swapTest.arg2 = temp;
	}

	
	public static void main( String[] args ) {
		
		// Pass-by-value: local values ////////////////////////////////////////////////////////
		System.out.println("\nPass local variables");
		
		int arg1 = 1;
		int arg2 = 2;
		swap( arg1, arg2 );
		
		System.out.println("arg1 is: " + arg1);
		System.out.println("arg2 is: " + arg2);
		
		
		
		// Pass-by-value: values in object ////////////////////////////////////////////////////////
		System.out.println("\nPass values in object");
		
		SwapTest swapTest1 = new SwapTest();
		swap( swapTest1.arg1, swapTest1.arg2 );
		
		System.out.println("arg1 is: " + swapTest1.arg1);
		System.out.println("arg2 is: " + swapTest1.arg2);
		
		
		
		// Pass-by-value: of object reference ////////////////////////////////////////////////////////
		System.out.println("\nPass value of object reference");
		
		SwapTest swapTest2 = new SwapTest();
		swap( swapTest2 );
		
		System.out.println("arg1 is: " + swapTest2.arg1);
		System.out.println("arg2 is: " + swapTest2.arg2);
	}
}
