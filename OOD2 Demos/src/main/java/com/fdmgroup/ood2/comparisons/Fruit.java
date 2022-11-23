/**
 * Fruit.java
 * - POJO that represents a regular fruit model
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood2.comparisons;


public class Fruit {

	private String fruitName;
	private int quantity;

	
	public Fruit(String fruitName, int quantity) {
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
}