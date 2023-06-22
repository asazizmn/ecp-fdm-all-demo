/**
 * Employee.java
 * - A very simple 'Plain Old Java Object (POJO)'
 */


package com.fdmgroup.ood3.jsonjackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {  
	
	// annotation to help match pojo and getters/setters accordingly
	//@JsonProperty("firstName")
	
    private String firstName;  
	private String lastName;  
    private int age;
    
    
    
    /**
     * custom constructor
     * 
     * @param firstName
     * @param lastName
     * @param age
     */
	public Employee(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	// !!! Please note that the default/noargs constructor is necessary
	// !!! otherwise the ObjectMapper will not function properly
	public Employee() {
		
	}
	
	
    
    // !!! getters and setters HAVE to be defined 
    // !!! otherwise the ObjectMapper doesn't work properly
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Eclipse-generate method to allow for an employee object to be printed as a String
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
}