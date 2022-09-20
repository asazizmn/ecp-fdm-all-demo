package com.company.mavenjunit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testShouldAnswerWithTrue()
    {
        assertTrue( true );
        
        // please note in case of multiple assertions
        // ... if one fails, junit will NOT continue
        // ... to ensure that all asserts are executed
        // ... group the asserts together, likewise the error messages get grouped too
        //
        // ... use assertAll("group heading",
        // ... 		() -> assertEquals(expected1, actual1),
        // ... 		() -> assertEquals(expected2, actual2)
        // ...	);
        
        // dynamic vs parameterised tests
        // parameterised tests allow running same test with various inputs
        // dynamic tests allow runtime test generation through code
        // parameterised testing support the full test lifecycle (BeforeEach AfterEach)
        // dynamic tests provide more flexibility about how input is generated and tests executed
    }
}
