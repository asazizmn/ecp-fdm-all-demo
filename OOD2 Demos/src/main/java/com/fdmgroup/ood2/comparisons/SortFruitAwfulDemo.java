/**
 * SortFruitAwfulDemo.java
 * - an example of how NOT to sort an array of custom fruits
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood2.comparisons;

import java.util.Arrays;


public class SortFruitAwfulDemo {

	public static void main(String args[]) {

		Fruit pineappale = new Fruit("Pineapple", 70);
		Fruit apple = new Fruit("Apple", 100);
		Fruit orange = new Fruit("Orange", 80);
		Fruit banana = new Fruit("Banana", 90);
		
		
		Fruit[] fruits = { pineappale, apple, orange, banana };

		
		// can NOT sort custom objects using `Arrays.sort` without implementing comparable first
		// ... throws a `java.lang.ClassCastException` !!! 
		//
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(T[],%20java.util.Comparator)
		Arrays.sort(fruits);
		
		
		for (Fruit fruit : fruits) {
			System.out.println("(" + fruit.getQuantity() + ") " + fruit.getFruitName());
		}
	}
}
