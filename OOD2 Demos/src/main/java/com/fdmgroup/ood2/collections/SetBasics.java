/**
 * SetBasics.java
 * - A demonstration of all the basic collection operations using a Set
 * 
 * `Set`
 * - Similar to a List, but doesn't accept duplicated elements and does not keep a defined order.
 * - HashSet: Uses a HashTable for storing objects. It means, it uses the hashCode() method from the stored objects to retrieve them more efficiently. Use this implementation if you don’t mind the order of stored elements.
 * - TreeSet: Store objects ordered in a tree structure. The main benefit is all elements are always ordered, but it has a performance cost when you need to add more elements because it needs first to find the right position (keeping the order).
 * - The Set interface does not add any “extra” methods.
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
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {

	public static void main( String[] args ) {
		
		
		// HashSet
		Set< Integer > numbers = new HashSet<>();
		numbers.add( 54 );
		numbers.add( 23 );
		numbers.add( 79 );
		numbers.add( 79 );	// duplicates not allowed, so this overwrites the previous
		numbers.add( 86 ); 
		
		System.out.println( numbers );
		
		
		// TreeSet
		Set< Integer > orderedNumbers = new TreeSet<>(); 
		orderedNumbers.add( 54 );
		orderedNumbers.add( 23 );
		orderedNumbers.add( 79 );
		orderedNumbers.add( 79 );	// duplicates are still NOT allowed!
		orderedNumbers.add( 86 ); 
		
		System.out.println( orderedNumbers );
	}

}
