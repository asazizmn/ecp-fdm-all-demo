/**
 * ArrayBasics.java
 * - demonstrating basic array usage
 * - an array is a structure that holds a fixed number of values of the same type
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.conditionals;

public class Conditionals {

	public static void main(String[] args) {

		int age = 8;
		String day = "Saturday";

		
		
		// if statement ////////////////////////

		if (age < 16) {
			System.out.println("child");
		}
		
		

		// if / else if statements ////////////////////////

		if (day.equals("Monday")) {
			System.out.println("workweek");
		} 
		else if (day.equals("Tuesday")) {
			System.out.println("workweek");
		} 
		else if (day.equals("Wednesday")) {
			System.out.println("workweek");
		} 
		else if (day.equals("Thursday")) {
			System.out.println("workweek");
		} 
		else if (day.equals("Friday")) {
			System.out.println("workweek");
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

		switch (day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				System.out.println("workweek");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("weekend");
				break;
			default:
				System.out.println("error");
				break;
		}
		
		
		
		// ternary statement ////////////////////////

		String ticket = age < 16 ? "free ticket" : "full ticket";
		
		System.out.println("person will have a "+ ticket);
	}
}
