package com.fdmgroup.sorting;

import com.fdmgroup.model.Fruit;
import java.util.Arrays;


public class SortFruitAwful {

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

		
		// can NOT use this without implementing comparable 
		// "Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) 
		// ... must not throw a ClassCastException for any elements e1 and e2 in the array)."
		// [REF: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(T[],%20java.util.Comparator)]
		Arrays.sort(fruits);
				
		// (or alternatively comparator)
		//Arrays.sort(fruits, new FruitComparator());
		
		
		for (Fruit fruit : fruits) {
			System.out.println("(" + fruit.getQuantity() + ") " + fruit.getFruitName());
		}
	}
}
