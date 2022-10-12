package com.fdmgroup.loops;

public class Loops {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		int numArray[] = {0, 1, 2, 3, 4};
		final String NEW_LINE = "\n";
		
		
		
		// looping structures //////////////////////////////
		
		
		// 1. while loop 
		System.out.println(NEW_LINE + "while loop:");
		
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		
		// 2. do-while loop 
		System.out.println(NEW_LINE + "do-while loop:");
		
		do {
			System.out.println(j);
			j++;
		} while (j < 5);
		
		
		// 3. for loop 
		// ... [init] ; [expression] ; [update]
		System.out.println(NEW_LINE + "for loop:");
		
		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}
		
		
		// multiple counters... 
		System.out.println(NEW_LINE + "for loop - multiple counters:");
		
		for (int l = 0, m = 0; l < 10 && l < 14; l++, m = m +  2) {
			System.out.println("l:" + l + " m:" + m);
		}
		
		
		// 4. for-each loop 
		System.out.println(NEW_LINE + "for-each loop:");
		
		for (int n : numArray) {
			System.out.println(n);
		}
		
		
		
		// branching statements //////////////////////////////
		
		// break 
		// ... doesn't work in a foreach loop
//		System.out.println(NEW_LINE + "break statement:");

		
		
		
		// continue
		// ... doesn't work in a foreach loop
		
//		System.out.println(NEW_LINE + "continue statement:");
		
		
		
		// labeled statements //////////////////////////////
		// ... can be used together with the break or continue statements to simulate a go-to
		
//		outer: for (int i = 0; i < matrix.length; i++) {
//		    for (int j = 0; j < matrix[i].length; j++) {
//		        System.out.print(matrix[i][j] + " ");
//		        if (matrix[i][j] == a) {
//		            foundAtI = i;
//		            foundAtJ = j;
//		            break outer;
//		        }
//		    }
//		    System.out.println();
//		}

	}

}
