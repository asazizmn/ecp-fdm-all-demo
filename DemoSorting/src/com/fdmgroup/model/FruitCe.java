package com.fdmgroup.model;


/**
 * Step 1: implement Comparable
 * 
 * [REF: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html]
 */
public class FruitCe implements Comparable<FruitCe> {

	private String fruitName;
	private int quantity;

	
	public FruitCe(String fruitName, int quantity) {
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
	 * @param FruitCe (the object to be compared to)
	 * @return integer value (positive for this larger, negative for this smaller, zero for equals)
	 */
	@Override
	public int compareTo(FruitCe comparedFruit) {
		
		// this allows the class to be sorted using 'quantity'
		// ascending order
		return this.quantity - comparedFruit.getQuantity();
		
		// descending order
//		return comparedFruit.getQuantity() - this.quantity;
	}
}
