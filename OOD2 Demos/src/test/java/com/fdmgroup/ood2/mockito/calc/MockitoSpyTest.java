package com.fdmgroup.ood2.mockito.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class MockitoSpyTest {

	@Spy
	List<String> spyList = new ArrayList<String>();
	
	
	@Test
	public void testMethod() {
		
		// alternative to @Spy annotation
//	    List<String> list = new ArrayList<String>();
//	    List<String> spyList = Mockito.spy(list);

	    assertEquals(0, spyList.size());
	    System.out.println(spyList.size());

	    Mockito.doReturn(100).when(spyList).size();
	    assertEquals(100, spyList.size());
		
		
		// Reference: https://www.digitalocean.com/community/tutorials/mockito-tutorial
//		List<String> list = new ArrayList<String>();
//	    List<String> spyList = Mockito.spy(list);
//
//		spyList.add("first-element");
//		System.out.println(spyList.get(0));

//		assertEquals("first-element", listSpy.get(0));
//		when(spyList.get(0)).thenReturn("second-element");
//		System.out.println(spyList.get(0));
//		assertEquals("second-element", listSpy.get(0));
	}

}