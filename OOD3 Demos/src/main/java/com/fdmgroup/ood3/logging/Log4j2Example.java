/**
 * Log4j2Example.java
 * - a simple demonstration of how to call a logger and use it to log accordingly
 * - the accompanying logger definition is at src/main/resources/log4j2.xml
 * - log4j2.xml has defined the config to log, both, to the console as well as the src/main/logs/logging.log
 * 
 * Reference: https://jstobigdata.com/java/basics-of-log4j2/
 */


package com.fdmgroup.ood3.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2Example {
	
	public static final Logger LOGGING = LogManager.getLogger( Log4j2Example.class );
	
	public static void main( String[] args ) {
		
		// informational logging
		LOGGING.info( "Just entered the main method");
		
		
		// warning of potential problem
		Object object = new Object();
		object.toString();
		
		LOGGING.warn( "Trying to print an a vague object!" );
		
		
		try 
		{
			// warning alert
			int result, dividend = 4, divisor = 0;
			result = dividend / divisor;
			
			LOGGING.warn( "Should've used defensive coding!" );
		}
		catch ( ArithmeticException ae ) 
		{
			// error alert that prints the exception AS PART of the log
			LOGGING.error( "An Exception was thrown: " + ae );
			
			// error alert that prints the exception SEPARATELY, after the log
			LOGGING.error( "An Exception was thrown: ", ae );
		}
	}
}
