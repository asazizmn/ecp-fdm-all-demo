/**
 * ExceptionHandling.java
 *  - Examples of how to handle CheckedExceptions via 2 methods
 * 	  i. handle it w/in actual method using try-catch clause
 * 	  ii. handle it outside current method by throwing it (via 'throws' keyword)
 * 
 * Please Note:
 * 	- Both methods are alternatives, and not used together sequentially.
 * 	- To handle it: use try-catch block
 * 	- To not handle it: use ‘throws’ keyboard and allow calling parent  methods to handle it instead
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/06/23
 */

package com.fdmgroup.ood3.exceptions;


import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionHandling {


	/**
	 * custom method that simply throws the exceptions and does NOT handle them iteself
	 * in this particular case, the calling parent is the main method
	 * 
	 * @param i
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void testException( int i ) throws FileNotFoundException, IOException {

		// if certain conditions are met
		if ( i < 0 ) {
			
			// simply just throw the appropriate exception 
			throw new FileNotFoundException( "Negative Integer " + i );
		} 

		else if ( i > 10 ) {

			// likewise simply throw the exception to be handled elsewhere
			throw new IOException( "Only supported for index 0 to 10" );
		}
	}

	
	/**
	 * the actual method that will do the actual exception handling
	 * so it doesn't need to 'throws' any exceptions
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {

		// attempt to run code that may or may not throw an exception
		try {

			// might throw exception
			testException( -5 );

			// if an exception is thrown above,
			// nothing below it will be executed
			// ...
		} 

		// used to catch relevant exceptions only i.e. FileNotFoundException
		catch ( FileNotFoundException e ) {

			// do something more useful
			// ...
			System.out.println( "[FileNotFoundException] --------- " );
			e.printStackTrace();
		} 

		// used to catch relevant exceptions only i.e. IOException
		catch ( IOException e ) {

			// do something more useful
			// ...
			System.out.println( "[IOException] --------- " );
			e.printStackTrace();
		} 

		// the finally block is optional and and be used only with a try-catch block.
		// Since exception halts the process of execution, 
		// we might have some resources open that will not get closed, 
		// so we can use the finally block. 
		// The finally block always gets executed, whether an exception occurred or not.
		finally {
			System.out.println( "Releasing resources" );
		}
	}
}
