package com.fdmgroup.sorting;

import com.fdmgroup.model.FruitComparable;

public class FruitRunner {

	public static void main(String[] args) {
		
		FruitComparable fruitOne = new FruitComparable("Strawberry", 89);
		FruitComparable fruitTwo = new FruitComparable("Blueberry", 98);
		
		
		
		fruitOne.compareTo(fruitTwo);
		
//		fruitComparator.compare(fruitOne, fruitTwo);
		
		

	}

}
