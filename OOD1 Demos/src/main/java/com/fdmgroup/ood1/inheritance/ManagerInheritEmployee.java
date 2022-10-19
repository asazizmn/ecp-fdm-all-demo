/**
 * ManagaerInheritEmployee.java
 * - demonstrating basic inheritance concet between manager and employee
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	19/10/22
 */


package com.fdmgroup.ood1.inheritance;

import java.util.List;

class Employee {

	private String name;
	private String jobTitle;
	private int salary;
	
	public void work() {}
}


class Manager extends Employee {

	private List<Employee> team;
	
	public void manage() {}	
}
