/**
 * SortArray.java
 * - a simple demonstration of how to sort an array
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood2.comparisons;

import java.util.Arrays;



public class SortArray {

	public static void main(String[] args) {
		
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		
		Arrays.sort(fruits);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
