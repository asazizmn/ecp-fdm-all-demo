package com.fdmgroup.sorting;

import com.fdmgroup.model.FruitComparable;
import java.util.Arrays;


public class SortFruitComparable {

	public static void main(String args[]) {

		FruitComparable[] fruits = new FruitComparable[4];

		FruitComparable pineappale = new FruitComparable("Pineapple", 70);
		FruitComparable apple = new FruitComparable("Apple", 100);
		FruitComparable orange = new FruitComparable("Orange", 80);
		FruitComparable banana = new FruitComparable("Banana", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		// no more exception!!
		Arrays.sort(fruits);
		
		
		// print out the fruit in ascending order of quantity (not name!)
		for (FruitComparable fruit : fruits) {
			System.out.println("(" + fruit.getQuantity() + ") " + fruit.getFruitName());
		}
	}
}
