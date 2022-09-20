package com.fdmgroup.firstjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstJunit5Test {

	FirstJunit5 firstJunit5;
	
	
	/**
	 * BeforeEach - Runs before each of the following tests
	 * BeforeAll - Runs once before the first test. Has to be static.
	 */
//	@BeforeEach
//	void setup() {
//		firstJunit5 = new FirstJunit5();
//	}
	
	
	/**
     * Test of getTwo method, of class JUnit5.
     */
    @Test
    public void testGetTwo() {

    	// arrange
        FirstJunit5 instance = new FirstJunit5();
        
        // act
        int expResult = 2;
        int result = instance.getTwo();
        
        // assert
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getThree method, of class JUnit5.
     */
    @Test
    public void testGetThree() {

    	// arrange
        FirstJunit5 instance = new FirstJunit5();

        // act
        int expResult = 3;
        int result = instance.getThree();
        
        // assert
        assertEquals(expResult, result);
    	
//    	System.out.println("repeated statement");
    }
}
