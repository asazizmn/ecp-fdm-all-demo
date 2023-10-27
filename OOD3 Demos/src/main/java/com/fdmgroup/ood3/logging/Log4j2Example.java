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
	
	
	// call the defined logger fom log4j2.xml
	public static final Logger LOGGING = LogManager.getLogger( Log4j2Example.class );
	
	
	
	public static void main( String[] args ) {
		
		// logging: informational ////////////////////////////
		LOGGING.info( "Just entered the main method");
		
		
		
		// logging: warning ////////////////////////////
		Object object = new Object();
		
		// check to see if object is vague
		if (object.getClass() == Object.class) 
		{	
			// warn, if so
			LOGGING.warn( "Trying to print an a vague object!" );
		}
		else 
		{	
			// continue with next step if not
			object.toString();
		}
		
			
		
		// logging: error ////////////////////////////
		try 
		{
			// warning alert
			int result, dividend = 4, divisor = 0;
			result = dividend / divisor;
			
			LOGGING.error( "Should've used defensive coding!" );
		}
		catch ( ArithmeticException ae ) 
		{
			// preferred: error alert that prints the exception AS PART of the log
			LOGGING.error( "An Exception was thrown: " + ae );
			
			// sloppy: error alert that prints the exception SEPARATELY, after the log
			LOGGING.error( "An Exception was thrown: ", ae);
			ae.printStackTrace();
		}
	}
}
