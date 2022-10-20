/**
 * Overriding.java
 * - demonstrates the concept of overriding
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	19/10/22
 */

package com.fdmgroup.ood1.polymorphism;



// parent class
class Animal {

	public void sleeping() {
		System.out.println("snoring");
	}
	
	
	public final void eating() {
		System.out.println("I am eating a little bit!!");
	}
	
	
	public void drinking() {
		System.out.println("I am drinking");
	}
}



// child class
class Dog extends Animal {
	
	
	// implicitly inherited all the methods from the parent Animal
	
	public void barking() {
		System.out.println("Wuff Wuff");
	}
	
	
	// Can NOT override a final method!!
//	@Override
//	public void eating() {
//		System.out.println("I am eating A LOT!!!");
//	}
	
	
	// This is how you call a parent method
	public void rememberingParentEating() {
		super.eating();
	}
}


