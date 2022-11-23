package com.fdmgroup.ood2.mockito.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fdmgroup.ood2.mockito.calc.AddService;
import com.fdmgroup.ood2.mockito.calc.CalcService;


@ExtendWith(MockitoExtension.class)
public class CalcService1Test {

	// 1st way to mock
	@Mock AddService addService;
	CalcService calcService;
	
	
	@BeforeEach
	public void init() {
		
		// 2nd way (alternative) way to mock
		// addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);
	}
	
	
	@Test
	void testCalc() {
		
		// arrange
		int num1 = 11;
		int num2 = 12;
		int mockResult = 23;
		
		// stubbing example
		when(addService.add(num1, num2)).thenReturn(mockResult);

		// act
		int expected = 23;
		int actual = calcService.calc(num1, num2);

		// assert
		assertEquals(expected, actual);

	}
}