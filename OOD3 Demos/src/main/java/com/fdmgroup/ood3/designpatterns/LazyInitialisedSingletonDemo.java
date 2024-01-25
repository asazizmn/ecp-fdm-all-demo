/**
 * LazyInitialisedSingletonDemo.java
 * 
 * [Ref: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples#3-lazy-initialization]
 */

package com.fdmgroup.ood3.designpatterns;


/**
 * This singleton class uses the lazy initialisation approach.
 * Therefore the instance is only created once access is required.
 */
class LazyInitialisedSingleton {

	// NOT instatiated immediately; hence can NOT be final
    private static LazyInitialisedSingleton instance;

    
    // private default constructor; empty but declared to prevent manual instantiation later
    private LazyInitialisedSingleton(){
    }
    
    public static LazyInitialisedSingleton getInstance() {
    	
    	// checks to see if instance exists and creates one accordingly
        if (instance == null) {
            instance = new LazyInitialisedSingleton();
        }
        
        return instance;
    }
    
    
	public void doSomething() {
		System.out.println("do something!!");
	}
}


public class LazyInitialisedSingletonDemo {

	public static void main(String args[]) {

		// manual instantiation not possible
//		LazyInitialisedSingleton lis = new LazyInitialisedSingleton();
		
		
		// instead get the already existing instance to use
		LazyInitialisedSingleton lis = LazyInitialisedSingleton.getInstance();

		lis.doSomething();
	}
}