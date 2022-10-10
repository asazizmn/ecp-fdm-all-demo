/**
 * ArrayDemo.java
 * - demonstrating basic array usage
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	11/10/22
 */

package com.fdmgroup.ood1.arraysandarraylist;



public class ArrayDemo {

	public static void main(String[] args) {

		// Method 1: manual ////////////////////////////////////////

		int intArray[] = new int[3];

		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("[" + i + "] = " + intArray[i]);
		}

		// ArrayIndexOutOfBoundsException !
//		intArray[3] = 40;
		
		// appears to increase the array size
		// immutable: in reality, this is just creating a new array in memory
		intArray = new int[4];
		intArray[3] = 40;
		
		// prints empty new line
		System.out.println("");

		
		
		// Method 2: array initialiser ////////////////////////////////////////
		
		String stringArray[] = { "ten", "twenty", "thirty" };
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("[" + i + "] = " + stringArray[i]);
		}
		
		// prints empty new line
		System.out.println("");
		
		
		
		// Method 3: from another array ////////////////////////////////////////
		
		String sentence = "this will be used to create another array";
		String splittedSentence[] = sentence.split(" ");
		
		String words[] = splittedSentence;
		
		for (String word : words) {
			System.out.println(word);
		}
	}

}
