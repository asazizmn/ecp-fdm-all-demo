/**
 * MapBasics.java
 * - A demonstration of all the basic collection operations using a Map
 * 
 * `Map`
 * - 
 * 
 * `Collection`
 * - The interface contains some of the following general methods:
 *  	add(E Element) 	  	- Boolean, inserts a new element.
 *  	remove(E Element) 	- Boolean, removes an element from the collection.
 *  	isEmpty() 		  	- Boolean, returns true if the collection has no elements.
 *  	size() 			  	- Returns how many elements we have stored in the collection.
 *  	clear() 			- void, removes all elements from the collection.
 *  	contains(E Element) - Boolean, verifies if some element is stored in the collection. 
 *  
 * [REF: https://medium.com/javarevisited/java-understanding-list-set-map-and-queue-4330cf54596d]
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/23

 */

package com.fdmgroup.ood2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapBasics {

	public static void main( String[] args ) {
		
		// Map<Key, Value>
		Map<String, Integer> treeMap = new TreeMap<>();

		// Adding elements to the tree map
		treeMap.put("B", 1);
		treeMap.put("A", 3);
		treeMap.put("C", 2);

		System.out.println( treeMap );
		
		
		// Getting values from the tree map
//		int valueA = treeMap.get("A");
//		System.out.println("Value of A: " + valueA);

		// Removing elements from the tree map
//		treeMap.remove("B");

		// Iterating over the elements of the tree map
//		for (String key : treeMap.keySet()) {
//			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
//		}
	}

}
