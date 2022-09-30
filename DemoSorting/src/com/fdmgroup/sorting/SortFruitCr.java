package com.fdmgroup.sorting;

import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.FruitNameCr;

import java.util.Arrays;


public class SortFruitCr {

	public static void main(String args[]) {

		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", 70);
		Fruit apple = new Fruit("Apple", 100);
		Fruit orange = new Fruit("Orange", 80);
		Fruit banana = new Fruit("Banana", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		// no more exception!!
		Arrays.sort(fruits, new FruitNameCr());
		
		
		// print out the fruit in ascending order of quantity (not name!)
		for (Fruit fruit : fruits) {
			System.out.println(fruit.getFruitName() + " (" + fruit.getQuantity() + ")");
		}
	}
}
