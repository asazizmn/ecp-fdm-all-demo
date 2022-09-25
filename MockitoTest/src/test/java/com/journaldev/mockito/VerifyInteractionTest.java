package com.journaldev.mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class VerifyInteractionTest {
	
	@Mock 
	List<String> mockedList;
	
	
	@Test
	public void testMethod() {
		
		mockedList.add("first-element"); 					// add 1st element
		mockedList.add("second-element");					// add 2nd element
		mockedList.add("third-element");					// add 3rd element, twice
		mockedList.add("third-element");
		mockedList.clear();									// clear mocked list
		
		
		verify(mockedList).add("first-element");			// verify 1st element added
		verify(mockedList).add("second-element");			// verify 2nd element added
		verify(mockedList, times(2)).add("third-element");	// verify 3rd element is added twice
		verify(mockedList).clear();							// verify mocked list is cleared
	}

}