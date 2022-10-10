/**
 * ArrayListDemo.java
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

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// creation
		ArrayList<String> cars = new ArrayList<>();
		
		
		// insertion
		cars.add("BMW");
		cars.add("Mazda");
	    cars.add("Volvo");
	    cars.add("Ford");
	    
	    
	    // reading
	    cars.get(0);
	    cars.get(1);
	    cars.get(2);
	    cars.get(3);
	    
	    
	    // update
		cars.set(2, "Toyota");
		
		
		// remove
		cars.remove(3);
		
	    // clear all
//	    cars.clear();
		
	    
	    // size
	    cars.size();
	    
	    
	    
	    // looping through collection	    
	    for ( String car : cars ) {
	    	System.out.println(car);
	    }
	    

	}
}
