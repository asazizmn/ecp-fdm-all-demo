/**
 * ArraysAndCollections.java
 * - introducing the 'Arrays' and 'Collections' utility classes
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood1.arraysandarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class ArraysAndCollections {

	public static void main(String[] args) {
		
		// array <-> arraylist //////////////////////
		
		// generate array
		String wordArray[] = "this sentence will turn into a collection".split(" ");
		
		
		// array -> arraylist
		ArrayList<String> wordList = new ArrayList<>( Arrays.asList(wordArray) );
		
		// arraylist -> array
		String wordArray2[] = wordList.toArray( new String[ wordList.size() ] );
		
		
		
			
		// Arrays: other utility methods //////////////////////
		
		int intArray[] = {10, 20, 15, 35, 22};
		
		
		// sort: then print each item
		Arrays.sort(intArray);
		for(int item : intArray) {
			System.out.println(item);
		}
		

		// binarySearch: find and display index of SORTED list
		int indexFound = Arrays.binarySearch(intArray, 20);
		System.out.println("\nindex found " + indexFound + "\n");
				
		
		// fill: then print each item
		Arrays.fill(intArray, 0);
		for(int item : intArray) {
			System.out.println(item);
		}
		
		
		
		
		// Collections: other utility methods //////////////////////
		
		ArrayList<Integer> intList = new ArrayList<Integer>( Arrays.asList(10, 20, 15, 35, 22, 10, 5) );

		
		// max, min, frequency
		System.out.println( "\nmax: " + Collections.max(intList) );
		System.out.println( "min: " + Collections.min(intList) );
		System.out.println( "freq for 10: " + Collections.frequency(intList, 10) + "\n" );
		
		
		// sort: the words list at the top, then print each item
		Collections.sort(intList);		
		for(int item : intList) {
			System.out.println(item);
		}
	}
}
