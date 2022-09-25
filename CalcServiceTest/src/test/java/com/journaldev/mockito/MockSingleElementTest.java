package com.journaldev.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class MockSingleElementTest {
	
	@Mock
	List<String> mockedList;
	
	
	@Test
	public void testMethod() {
		
		when(mockedList.get(0)).thenReturn("first-element");
		assertEquals("first-element", mockedList.get(0));

		// stubbed element, prints "first-element"
		System.out.println(mockedList.get(0));
		
		// non-stubbed element, prints null
		System.out.println(mockedList.get(1));
	}
	
}