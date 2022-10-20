/**
 * ManagerInheritEmployee.java
 * - demonstrating the basic inheritance conceptually
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	19/10/22
 */

package com.fdmgroup.ood1.inheritance;

import java.util.List;



class Employee {

	protected String name;
	protected String jobTitle;
	protected int salary;
	
	public void work() {}
}


class Manager extends Employee {

	// inherited properties exist implicitly
//	protected String name;
//	protected String jobTitle;
//	protected int salary;
	
	
	// child specific attribute
	private List<Employee> team;
	
	public void manage() {}	
	
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		System.out.println(manager.name);
		System.out.println(manager.salary);
	}
}