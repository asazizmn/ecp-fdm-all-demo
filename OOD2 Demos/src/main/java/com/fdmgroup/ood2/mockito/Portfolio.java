/**
 * Portfolio.java
 * - simple class representing financial portfolio (i.e. collection of investments)
 * - REF: https://www.simplilearn.com/tutorials/devops-tutorial/mockito-junit
 * - REF: https://www.tutorialspoint.com/mockito/mockito_first_application.htm
 * 
 * Instructions
 * - in the absence of junit, please run as a java application (not a 'junit test')
 *
 * @since	24/10/22
 */

package com.fdmgroup.ood2.mockito;

import java.util.List;



public class Portfolio {
	private StockService stockService;
	private List<Stock> stocks;

	
	public StockService getStockService() {
		return stockService;
	}

	
	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

	
	public List<Stock> getStocks() {
		return stocks;
	}

	
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	
	public double getMarketValue() {
		double marketValue = 0.0;

		for (Stock stock : stocks) {
			marketValue += stockService.getPrice(stock) * stock.getQuantity();
		}
		return marketValue;
	}
}
