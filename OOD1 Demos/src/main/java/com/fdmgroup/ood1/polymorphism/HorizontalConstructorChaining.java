/**
 * HorizontalConstructorChaining.java
 * - demonstrates the concept of horizontal constructor chaining
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/22
 */

package com.fdmgroup.ood1.polymorphism;



class Car {
	
	int maxSpeed;
	String model;
	boolean isSportsCar;
	
	
	public Car() {
		this.maxSpeed = 0;
		this.model = "";
		this.isSportsCar = false;
	}
	
	public Car(int maxSpeed) {
		this(); // horizontal constructor chaining
		this.maxSpeed = maxSpeed;
	}

	public Car(int maxSpeed, String model) {
		this(maxSpeed); // horizontal constructor chaining
		this.model = model;
	}
	
	public Car(int maxSpeed, String model, boolean isTrue) {
		this(maxSpeed, model); // horizontal constructor chaining
		isTrue = true;
	}
	
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car(3);
		Car car3 = new Car(6, "Toyota"); 
		Car car4 = new Car(8, "Honda", true); 
	}

}
