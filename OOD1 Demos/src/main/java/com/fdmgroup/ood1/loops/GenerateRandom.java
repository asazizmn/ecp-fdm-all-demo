/**
 * GenerateRandom.java
 * - demonstrating how to generate random numbers
 * - [REF] https://www.educative.io/answers/how-to-generate-random-numbers-in-java
 *
 * @author S. Aziz
 * @version	0.0.1
 * @since	18/01/23
 */

package com.fdmgroup.ood1.loops;

import java.util.Random;



class GenerateRandom {

	public static void main(String args[]) {

		// instance of random class
		Random rand = new Random();


		// generate random values from 0 to 24
		int upperbound = 25;
		int int_random = rand.nextInt(upperbound);
		System.out.println("Random integer value from 0 to " + (upperbound - 1) + " : " + int_random);

		// generate random double from 0.0 to 1.0
		double double_random = rand.nextDouble();
		System.out.println("Random double value between 0.0 and 1.0 : " + double_random);

		// generate random float from 0.0 to 1.0
		float float_random = rand.nextFloat();
		System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
	}
}