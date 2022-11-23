/**
 * SortArrayList.java
 * - a simple demonstration of how to sort an arraylist
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood2.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortArrayList {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		// please note the difference between Arrays.sort & Collections.sort!! 
		Collections.sort(fruits);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
