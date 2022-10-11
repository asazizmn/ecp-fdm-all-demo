/**
 * ArrayListBasics.java
 * - demonstrating basic ArrayList usage
 * - an ArrayList is just a resizable array type
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood1.arraysandarraylist;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayListBasics {

	public static void main(String[] args) {
		
		// creation
		ArrayList<String> cars = new ArrayList<>();
		
		
		// insertion
		cars.add("BMW");
		cars.add("Mazda");
	    cars.add("Volvo");
	    cars.add("Ford");
	    
	    
	    // read item
	    String name = cars.get(1);
	    
	    
	    // update item
		cars.set(2, "Toyota");
		
		
		// remove item
		cars.remove(3);
		
		
	    // clear all
//		cars.clear();
		
	    
	    // get size of array
		int numCars = cars.size();
	    
	    
	    // looping through collection	    
		for (String car : cars) {
			System.out.println(car);
		}
	    
	    
	    
	    // Other ways to create an array //////////////////
	    
//		ArrayList<int> numbers = new ArrayList<>();	// Syntax error! NO primitives allowed!!
		
		ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(10, 20, 30) ); // size initially specified as 3
		ArrayList<Integer> numbers2 = numbers;
		
		numbers.add(40);		// mutable: simply increases the ArrayList size and adds the 4 value
	}
}
