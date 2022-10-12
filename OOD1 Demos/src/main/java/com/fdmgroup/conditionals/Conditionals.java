/**
 * Conditionals.java
 * - demonstrating basic conditional structures
 * - evolution of the switch statement: 
 * 	 https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	12/10/22
 */

package com.fdmgroup.conditionals;



public class Conditionals {

	public static void main(String[] args) {

		int age = 8;
		String day = "Saturday";

		
		
		// if / else-if statements ////////////////////////
		// ... can test conditions based on a ranges of values
		
		if (age < 16) {
			System.out.println("child");
		}
		

		if (day.equals("Monday")) {
			System.out.println("weekday");
		} 
		else if (day.equals("Tuesday")) {
			System.out.println("weekday");
		} 
		else if (day.equals("Wednesday")) {
			System.out.println("weekday");
		} 
		else if (day.equals("Thursday")) {
			System.out.println("weekday");
		} 
		else if (day.equals("Friday")) {
			System.out.println("weekday");
		} 
		else if (day.equals("Saturday")) {
			System.out.println("weekend");
		} 
		else if (day.equals("Sunday")) {
			System.out.println("weekend");
		} 
		else {
			System.out.println("error");
		}

		
		
		// switch statement ////////////////////////
		// ... can only test for single integer, string, or enumerated values

		switch (day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				System.out.println("weekday");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("weekend");
				break;
			default:
				System.out.println("error");
				break;	// not necessary, but good practice
		}
		
		
		
		// ternary statement ////////////////////////

		String ticket = age < 16 ? "free ticket" : "full ticket";
		
		System.out.println("person will have a "+ ticket);
	}
}
