/**
 * StockService.java
 * - simple interface to get the price of a stock
 * - REF: https://www.simplilearn.com/tutorials/devops-tutorial/mockito-junit
 * - REF: https://www.tutorialspoint.com/mockito/mockito_first_application.htm
 *
 * @since	24/10/22
 */

package com.fdmgroup.ood2.mockito;



public interface StockService {
	   public double getPrice(Stock stock);
	}
