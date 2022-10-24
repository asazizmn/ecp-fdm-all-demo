/**
 * CalculatorTest.java
 * - basic calculator test class that will test the Calculator class using junit5
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	24/10/22
 */


package com.fdmgroup.ood2.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class CalculatorTest {

    Calculator calculator;

    
    
    /**
     * The method annotated with @BeforeEach runs before each test
     */
    @BeforeEach                                         
    void setUp() {
        calculator = new Calculator();
    }

    
    /**
     * This method simply tests for basic multiplication
     * A method annotated with @Test defines a test method
     * @DisplayName can be used to define the name of the test which is displayed to the user
     */
    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
    	
    	// arrange & act
    	int result = calculator.multiply(4, 5);
    	int expected = 20;
    	
    	// assert - checks to see if the expected and actual value are the same
        assertEquals(expected, result);  
    }

    
    
    /**
     * As the next step, this method tests for correct handling of zero
     */
    @Test                                    
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
    	
    	
    	// arrange & act
    	int result1 = calculator.multiply(0, 5);
    	int result2 = calculator.multiply(5, 0);
    	int expected = 0;
    	
    	// assert
    	// ... please note that this is in sequential order,
    	// ... if the first assert fails, the second won't run
    	// ... to ensure all, use 'assertAll' (https://www.javaguides.net/2018/09/junit-5-assertall-example.html)
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }
    
    
    
    /**
     * Method showing the various assert statements that exist
     */
    @DisplayName("Demonstrating the various assert statements")
    void testAssertStatements() {
    	
    	// throws an assertion error without checking anything
    	fail("Not yet implemented");
    	
//    	assertEquals(expectedObject, actualObject)​
//
//    	assertNotEquals(expectedObject, actualObject)​
//
//    	assertTrue(boolean)​
//
//    	assertNull(object)​
//
//    	assertFalse(boolean)​
//
//    	assertNotNull(object)​
//
//    	assertArraryEquals(expectedArray, actualArray)
    }
    
}