/**
 * FruitCTR.java
 * - 3rd party class that implements the comparator (CTR) interface, to enable custom sorting
 * - does not represent a fruit model
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	01/11/22
 */

package com.fdmgroup.ood2.comparisons;

import java.util.Comparator;



/**
 * Step 1: implement Comparator
 * 
 * [REF: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html]
 */
public class FruitCTR implements Comparator<Fruit> {

	/**
	 * Step 2: override 'compare'
	 * 
	 * @param fruitOne (the first object to be compared)
	 * @param fruitTwo (the second object to be compared to)
	 * @return integer value (positive for this larger, negative for this smaller, zero for equals)
	 */
	@Override
	public int compare(Fruit fruitOne, Fruit fruitTwo) {
		
		String fruitNameOne = fruitOne.getFruitName();
		String fruitNameTwo = fruitTwo.getFruitName();
		
		// ascending order
		return fruitNameOne.compareTo(fruitNameTwo);
				
		// descending order
//		return fruitNameTwo.compareTo(fruitNameOne);
	}
	
}
