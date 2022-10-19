/**
 * Apple.java
 * - demonstrating an inheritance hierarchy using fruits
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	19/10/22
 */

package com.fdmgroup.ood1.inheritance;



interface Food {
	
	public float getTotalCalories();

	public String getOrigin();
}



abstract class Fruit implements Food {
	
	public float getTotalCalories() {
		return 0.50f;
	}

	public abstract String getOrigin();
}



public class Apple extends Fruit {
	
	public float getTotalCalories() {
		return 0.40f;
	}

	public String getOrigin() {
		return "apple";
	}
	
	
	public static void main(String[] args) {
		
		Fruit fruit = new Apple();
		Apple castedApple = (Apple) fruit;
		
		System.out.println(castedApple.getOrigin());
	}
}