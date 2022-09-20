package com.vogella.junitfirst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	App app;

	@BeforeEach
	public void App() {
		app = new App();
	}

	@Test
	void testMultiply() {

//		System.out.println("step 1");
//		assertThrows(IllegalArgumentException.class, () -> {
//			app.multiply(1000, 5);
//		});		
//		
//		System.out.println("step 2");
//		assertEquals(50, app.multiply(1000, 5), "10 x 5 must be 50");
//		
//		System.out.println("step 3");
		
		

		assertAll(
				
				() -> {
					System.out.println("step 1");
					assertThrows(IllegalArgumentException.class, () -> {
						app.multiply(1000, 5);
					});
				},

				() -> {
					System.out.println("step 2");
					assertEquals(50, app.multiply(25, 2), "10 x 5 must be 50");
				},

				() -> {
					System.out.println("step 3");
				});
	}

//	@Test
//	void testExceptionIsThrown( ) {
//		assertThrows(IllegalArgumentException.class, () -> {
//			app.multiply(1000, 5);	
//		});
//	}

}
