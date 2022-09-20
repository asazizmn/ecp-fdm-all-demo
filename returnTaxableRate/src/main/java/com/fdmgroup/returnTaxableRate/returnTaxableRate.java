package com.fdmgroup.returnTaxableRate;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class returnTaxableRate {
//	public static void returnTaxableRates(String salaryString) {

	public static double returnTaxableRates(String salaryString) {
		Logger logger = LogManager.getLogger();

//
		try {
			double sal = Double.parseDouble(salaryString);
			return sal * 1.2;
		} catch (NumberFormatException e) {
			logger.fatal("There was an exception");
			return 0;
		}
//
		
//    	System.out.println(sal);

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter a salary: ");
		String salary = myObj.nextLine();
		System.out.println(returnTaxableRates(salary));
//    	returnTaxableRates(salary);

		myObj.close();
	}

}
