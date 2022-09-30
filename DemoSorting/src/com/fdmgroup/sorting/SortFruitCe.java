package com.fdmgroup.sorting;

import com.fdmgroup.model.FruitCe;
import java.util.Arrays;


public class SortFruitCe {

	public static void main(String args[]) {

		FruitCe[] fruits = new FruitCe[4];

		FruitCe pineappale = new FruitCe("Pineapple", 70);
		FruitCe apple = new FruitCe("Apple", 100);
		FruitCe orange = new FruitCe("Orange", 80);
		FruitCe banana = new FruitCe("Banana", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		// no more exception!!
		Arrays.sort(fruits);
		
		
		// print out the fruit in ascending order of quantity (not name!)
		for (FruitCe fruit : fruits) {
			System.out.println("(" + fruit.getQuantity() + ") " + fruit.getFruitName());
		}
	}
}
