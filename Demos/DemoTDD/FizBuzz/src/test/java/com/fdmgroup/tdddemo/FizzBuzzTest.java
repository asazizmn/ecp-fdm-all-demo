package com.fdmgroup.tdddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	static FizzBuzz fb;
	
	@BeforeAll
	public static void setup() {
	
		fb = new FizzBuzz();
		
	}
	
	
	/*
	 * FizzBuzz takes a number and returns a String
	 * If the number is divisible by 3 - FuzzBuzz returns "FIZZ"
	 * If the number is divisible by 5 - FuzzBuzz returns "BUZZ"
	 * If the number is divisible by 3 and 5 - FuzzBuzz returns "FIZZBUZZ"
	 * If none of the above are true - FizzBuzz returns the number as a string
	 * 
	 */
	
	@Test
	public void fizzBuzz_1_should_return_1() {
		
		//act
		String output = fb.evaluate(1);
		
		
		//assert
		assertEquals("1", output);
		
	}

	@Test
	public void fizzBuzz_2_should_return_2() {
		
	
		//act
		String output = fb.evaluate(2);
		
		
		//assert
		assertEquals("2", output);
		
	}
	
	@Test
	public void fizzBuzz_3_should_return_FIZZ() {
		
	
		//act
		String output = fb.evaluate(3);
		
		
		//assert
		assertEquals("FIZZ", output);
		
	}
	
	
	@Test
	public void fizzBuzz_6_should_return_FIZZ() {
		
		
		//act
		String output = fb.evaluate(6);
		
		
		//assert
		assertEquals("FIZZ", output);
		
	}
	
	@Test
	public void fizzBuzz_5_should_return_BUZZ() {
		
		// arrange
		FizzBuzz fb = new FizzBuzz();
		
		//act
		String output = fb.evaluate(5);
		
		
		//assert
		assertEquals("BUZZ", output);
		
	}
	
	@Test
	public void fizzBuzz_10_should_return_BUZZ() {
		
		// arrange
		FizzBuzz fb = new FizzBuzz();
		
		//act
		String output = fb.evaluate(10);
		
		
		//assert
		assertEquals("BUZZ", output);
			
	}	
	
	@Test
	public void fizzBuzz_15_should_return_FIZZBUZZ() {
		
		// arrange
		FizzBuzz fb = new FizzBuzz();
		
		//act
		String output = fb.evaluate(15);
		
		
		//assert
		assertEquals("FIZZBUZZ", output);
		
	}	
	
	@Test
	public void fizzBuzz_30_should_return_FIZZBUZZ() {
		
		// arrange
		FizzBuzz fb = new FizzBuzz();
		
		//act
		String output = fb.evaluate(30);
		
		
		//assert
		assertEquals("FIZZBUZZ", output);
		
	}	
	
}
