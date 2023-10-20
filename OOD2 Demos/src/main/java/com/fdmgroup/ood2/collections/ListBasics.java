/**
 * ListBasics.java
 * - A demonstration of all the basic collection operations using a List
 * 
 * `List`
 * - An ordered collection that allows duplicates
 * - ArrayList: A dynamic array, every time it reaches the limit, automatically doubles its size. Good performance when looking over the elements (even faster than adding or removing).
 * - LinkedList: Implements List and Queue. A good option when you need add or remove elements constantly, slower when you need to lookup over all the elements. LinkedList is often used as a Queue instead of a common List.
 * - There are 2 more “old” classes: Vector and Stack. Vector does the same as ArrayList but slowly, Stack is unused and commonly replaced by ArrayDeque.
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
 * @since	18/10/23

 */

package com.fdmgroup.ood2.collections;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main( String[] args ) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add( "apple" );
		fruits.add( "orange" );
		fruits.add( "banana" );
		System.out.println( fruits );
		
		fruits.remove( "banana" );
		System.out.println( fruits );
		
		System.out.println( fruits.isEmpty() );
		System.out.println( fruits.size() );
		System.out.println( fruits.contains( "orange" ) );
		
		fruits.clear();
		System.out.println( fruits.size() );
	}

}
