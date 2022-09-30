package com.fdmgroup.sorting;

import com.fdmgroup.model.FruitCe;

public class FruitRunner {

	public static void main(String[] args) {
		
		FruitCe fruitOne = new FruitCe("Strawberry", 89);
		FruitCe fruitTwo = new FruitCe("Blueberry", 98);
		
		
		
		fruitOne.compareTo(fruitTwo);
		
//		fruitComparator.compare(fruitOne, fruitTwo);
		
		

	}

}
