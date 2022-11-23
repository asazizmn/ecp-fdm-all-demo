/**
 * Stock.java
 * - simple POJO class representing financial stock (i.e. share in the ownership of a company, or investment)
 * - REF: https://www.simplilearn.com/tutorials/devops-tutorial/mockito-junit
 * - REF: https://www.tutorialspoint.com/mockito/mockito_first_application.htm
 *
 * @since	24/10/22
 */

package com.fdmgroup.ood2.mockito.portfolio;



public class Stock {
	
	private String stockId;
	private String name;
	private int quantity;

	
	public Stock(String stockId, String name, int quantity) {
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}

	
	public String getStockId() {
		return stockId;
	}

	
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	
	public int getQuantity() {
		return quantity;
	}

	
	public String getTicker() {
		return name;
	}
}
