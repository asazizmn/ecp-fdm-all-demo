/**
 * EnumSwitch.java
 * - demonstrating how to use enum values in a switch statement
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	12/10/22
 */

package com.fdmgroup.conditionals;



public class EnumSwitch {

	// defining an enumerated structure 
	enum DAYS {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	
	public static void main(String[] args) {
		
		DAYS days = DAYS.SUNDAY;

		switch (days) {
			case MONDAY:
				System.out.println("weekday");
				break;
			case TUESDAY:
				System.out.println("weekday");
				break;
			case WEDNESDAY:
				System.out.println("weekday");
				break;
			case THURSDAY:
				System.out.println("weekday");
				break;
			case FRIDAY:
				System.out.println("weekday");
				break;
			case SATURDAY:
				System.out.println("weekend");
				break;
			case SUNDAY:
				System.out.println("weekend");
				break;
			default:
				System.out.println("error");
				break;
		}
	}
}
