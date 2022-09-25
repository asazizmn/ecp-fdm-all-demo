package com.journaldev.mockito.CalcServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.journaldev.mockito.CalcService.AddService;
import com.journaldev.mockito.CalcService.CalcService;


@ExtendWith(MockitoExtension.class)
public class CalcService1Test {

	@Mock AddService addService;
	CalcService calcService;
	
	
	@BeforeEach
	public void init() {
		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);
	}
	
	
	@Test
	void testCalc() {
		
		int num1 = 11;
		int num2 = 12;

		int mockExpected = 23;
		when(addService.add(num1, num2)).thenReturn(mockExpected);

		int assertExpected = 23;
		int actual = calcService.calc(num1, num2);

		assertEquals(assertExpected, actual);

	}
}