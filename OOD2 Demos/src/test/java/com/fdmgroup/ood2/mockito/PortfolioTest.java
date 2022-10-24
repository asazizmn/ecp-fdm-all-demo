/**
 * PortfolioTest.java
 * - A basic portfolio testing class using Mockito
 * - REF: https://www.simplilearn.com/tutorials/devops-tutorial/mockito-junit
 * - REF: https://www.tutorialspoint.com/mockito/mockito_first_application.htm
 *
 * @since	24/10/22
 */

package com.fdmgroup.ood2.mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;



public class PortfolioTest {

	Portfolio portfolio;
	StockService stockService;

	
	public void setUp() {
		// create a portfolio object which is to be tested
		portfolio = new Portfolio();

		// create the mock object of stock service
		stockService = mock(StockService.class);

		// set the stockService to the portfolio
		portfolio.setStockService(stockService);
	}

	
	public boolean testMarketValue() {

		// creates a list of stocks to be added to the portfolio
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1", "Google", 10);
		Stock microsoftStock = new Stock("2", "Microsoft", 100);

		stocks.add(googleStock);
		stocks.add(microsoftStock);

		// add stocks to the portfolio
		portfolio.setStocks(stocks);

		// mock the behaviour of stock service to return the value of various stocks
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);

		double marketValue = portfolio.getMarketValue();
		return marketValue == 100500.0;
	}
	

	public static void main(String[] args) {
		PortfolioTest test = new PortfolioTest();
		test.setUp();
		
		System.out.println(test.testMarketValue() ? "pass" : "fail");
	}
}