package com.fdmgroup.model;


/**
 * Step 1: implements Comparable
 */
public class FruitComparable implements Comparable<FruitComparable> {

	private String fruitName;
	private int quantity;

	
	public FruitComparable(String fruitName, int quantity) {
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
	 * @return int value (positive for this larger, negative for this smaller, zero for equals)
	 */
	@Override
	public int compareTo(FruitComparable comparedFruit) {
		return this.quantity - comparedFruit.getQuantity();
	}
}
