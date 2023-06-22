/**
 * JacksonTest.java
 * - demonstrates how to convert JAVA <-> JSON, 
 * - using the Jackson library
 */


package com.fdmgroup.ood3.jsonjackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonTest {

	// most common object from Jackson
	// used to read/write, POJO and JSON
	private static ObjectMapper objectMapper = new ObjectMapper();

	
	/**
	 * Creates an Employee object (POJO) and then converts it to JSON
	 * 
	 * @throws JsonProcessingException
	 */
	private static void pojoToJSONString() throws JsonProcessingException {

		// create an employee POJO
		Employee employee = new Employee("S.", "Aziz", 20);

		// POJO -> JSON
		String jsonStr = objectMapper.writeValueAsString(employee);

		// print the created JSON string
		System.out.println(jsonStr);
	}
	
	
	/**
	 * Reads an existing JSON file, and then converts it to a POJO
	 * 
	 * @throws IOException
	 */
	private static void jsonFileToPOJO() throws IOException {  
		
		// define the location of the json being read from 
	    File jsonFile = new File("src/main/resources/employee.json");  
	  
	    // read the contents from the specified json file & specify POJO type (i.e. Employee)
	    Employee employee = objectMapper.readValue(jsonFile, Employee.class);  
	    
	    // print out the object in string format (having defined 'Employee.toString()')    
	    System.out.println(employee);
	}
	

	/**
	 * The main runner method to test relevant Jackson functionalities
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			
			// Java -> JSON String
			System.out.println("JSON String: ------");
			pojoToJSONString();
			
			// JSON File -> Java
			System.out.println("\nJava Object: ------");
			jsonFileToPOJO();
			
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}