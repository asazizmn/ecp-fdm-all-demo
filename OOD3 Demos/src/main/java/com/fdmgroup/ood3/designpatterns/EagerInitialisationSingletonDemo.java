/**
 * EagerInitialisationSingletonDemo.java
 * 
 * [Ref: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#1-eager-initialization]
 */

package com.fdmgroup.ood3.designpatterns;


/**
 * This singleton class uses the eager initialisation approach.
 * Therefore, it creates the instance immediately at the class level
 */
class EagerInitialisationSingleton {

	// instantiated immediately at the class level; hence, is final
	private static final EagerInitialisationSingleton instance = new EagerInitialisationSingleton();

	
	// private default constructor; empty but declared to prevent manual instantiation later
	private EagerInitialisationSingleton() {
	}

	public static EagerInitialisationSingleton getInstance() {
		
		// simply returns the existing instance
		return instance;
	}
	

	public void doSomething() {
		System.out.println("do something!!");
	}
}


public class EagerInitialisationSingletonDemo {

	public static void main(String args[]) {

		// manual instantiation not possible
//		EagerInitialisationSingleton eis2 = new EagerInitialisationSingleton();
		
		
		// instead get the already existing instance to use
		EagerInitialisationSingleton eis = EagerInitialisationSingleton.getInstance();

		eis.doSomething();
	}
}