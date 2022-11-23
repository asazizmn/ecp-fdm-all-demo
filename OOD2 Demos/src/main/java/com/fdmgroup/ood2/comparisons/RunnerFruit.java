/**
 * RunnerFruit.java
 * - a simple runner class to help test fruit objects
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	01/11/22
 */

package com.fdmgroup.ood2.comparisons;


public class RunnerFruit {

	public static void main(String[] args) {
		
		FruitCBL fruitOne = new FruitCBL("Strawberry", 100);
		FruitCBL fruitTwo = new FruitCBL("Blueberry", 90);
		
		System.out.println( fruitOne.compareTo( fruitTwo ) );
//		System.out.println( fruitComparator.compare(fruitOne, fruitTwo) );
	}

}
