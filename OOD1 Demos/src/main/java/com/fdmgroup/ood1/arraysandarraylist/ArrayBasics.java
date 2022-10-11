/**
 * ArrayBasics.java
 * - demonstrating basic array usage
 * - an array is a structure that holds a fixed number of values of the same type
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood1.arraysandarraylist;



public class ArrayBasics {

	public static void main(String[] args) {
		
		// creation
		String cars[] = new String[3];
		
		
		// insertion
		cars[0] = "BMW";
		cars[1] = "Mazda";
		cars[2] = "Volvo";
//		cars[3] = "Ford"; // ArrayIndexOutOfBoundsException
	    
		
	    // read item
		String name = cars[1];
	    
	    
	    // update item
		cars[2] = "Toyota";
		
		
		// remove or clear item
		// Java arrays do not provide a direct remove method to remove an element. 
		// Arrays in Java are static so the size of the arrays cannot change once created
		// Thus we cannot delete an element and reduce the array size.
		
	    
		// get size of array
	    int numCars = cars.length;
	    
	    
	    // looping through collection	    
	    for (String car : cars) {
	    	System.out.println(car);
	    }
	    
	    
	    
	    // Other ways to create an array //////////////////
	    
		int[] numbers = {10, 20, 30};
		int numbers2[] = numbers;
		
		numbers = new int[4];	// only appears to increase the array size
		numbers[3] = 40; 		// immutable: in reality, this is just a new array in memory
	}
}
