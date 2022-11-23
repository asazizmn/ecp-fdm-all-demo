/**
 * SortFruitCBL.java
 * - a simple demonstration of how to sort a custom object (i.e. FruitCBL) properly, via Comparable 
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood2.comparisons;

import java.util.Arrays;



public class SortFruitCBL {

	public static void main(String args[]) {

		FruitCBL[] fruits = new FruitCBL[4];

		FruitCBL pineappale = new FruitCBL("Pineapple", 70);
		FruitCBL apple = new FruitCBL("Apple", 100);
		FruitCBL orange = new FruitCBL("Orange", 80);
		FruitCBL banana = new FruitCBL("Banana", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		// no more exception!!
		Arrays.sort(fruits);
		
		
		// print out the fruit in ascending order of quantity (not name!)
		for (FruitCBL fruit : fruits) {
			System.out.println("(" + fruit.getQuantity() + ") " + fruit.getFruitName());
		}
	}
}
