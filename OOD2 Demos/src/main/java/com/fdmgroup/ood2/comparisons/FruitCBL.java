/**
 * FruitCBL.java
 * - fruit model that implements the comparable (CBL) interface, and provides a custom sort definition
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	01/11/22
 */

package com.fdmgroup.ood2.comparisons;



/**
 * Step 1: implement Comparable
 * 
 * [REF: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html]
 */
public class FruitCBL implements Comparable<FruitCBL> {

	private String fruitName;
	private int quantity;

	
	public FruitCBL(String fruitName, int quantity) {
		this.fruitName = fruitName;
		this.quantity = quantity;
	}

	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	/**
	 * Step 2: override 'compareTo'
	 * 
	 * @param FruitCBL (the object to be compared to)
	 * @return integer value (positive for this larger, negative for this smaller, zero for equals)
	 */
	@Override
	public int compareTo(FruitCBL comparedFruit) {
		
		// this allows the class to be sorted using 'quantity'
		// ascending order
		return this.quantity - comparedFruit.getQuantity();
		
		// descending order
//		return comparedFruit.getQuantity() - this.quantity;
	}
}
