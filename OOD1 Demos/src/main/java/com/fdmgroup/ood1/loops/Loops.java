/**
 * Loops.java
 * - demonstrating how to handle loops and branching statements
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	12/10/22
 */

package com.fdmgroup.ood1.loops;



public class Loops {

	public static void main(String[] args) {
		
		int counter, numArray[] = { 0, 1, 2, 3, 4 };
		int array2D[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		final String NEW_LINE = "\n";
		
		
		// looping structures //////////////////////////////
		
		// 1. while loop 
		System.out.println(NEW_LINE + "while loop:");
		counter = 0;
		while (counter < 5) {
			System.out.println(counter);
			counter++;
		}
		
		
		// 2. do-while loop 
		System.out.println(NEW_LINE + "do-while loop:");
		counter = 0;
		do {
			System.out.println(counter);
			counter++;
		} while (counter < 5);
		
		
		// 3.1 for loop - basic
		// ... [init] ; [expression] ; [update]
		System.out.println(NEW_LINE + "for loop - basic:");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// 3.2 for loop - multiple counters... 
		System.out.println(NEW_LINE + "for loop - multiple counters:");
		for (int i = 0, j = 0; i < 10 && j < 14; i++, j = j +  2) {
			System.out.println("i:" + i + " j:" + j);
		}
		
		
		// 4. for-each loop 
		System.out.println(NEW_LINE + "for-each loop:");
		for (int num : numArray) {
			System.out.println(num);
		}
		
		
		
		// branching statements //////////////////////////////
		
		// break 
		System.out.println(NEW_LINE + "break statement:");
		for (int num : numArray) {
			if (num == 3) break; 
			System.out.println(num);
		}
		
		
		// continue
		System.out.println(NEW_LINE + "continue statement:");
		for (int num : numArray) {
			if (num == 3) continue; 
			System.out.println(num);
		}
		
		
		
		// labeled statements //////////////////////////////
		// ... can be used together with the break or continue statements to simulate a go-to

		System.out.println(NEW_LINE + "labeled statement:");
		outer: for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] == 3) continue outer;
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}

	}

}
