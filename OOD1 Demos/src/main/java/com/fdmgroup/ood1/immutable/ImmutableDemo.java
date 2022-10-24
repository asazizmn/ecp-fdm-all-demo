/**
 * ImmutableDemo.java
 * - demonstrating an immutable class
 * - https://www.digitalocean.com/community/tutorials/how-to-create-immutable-class-in-java
 * 
 * To create an immutable class:
 * 
 *	   1. Declare the class as final so it can’t be extended.
 *	   2. Make all fields private so that direct access is not allowed.
 *	   3. Make all fields (mutable) final so that its value can be assigned only once.
 *	   4. Initialise all the fields via a constructor performing deep copy.
 *	   5. Don’t provide setter methods for variables.
 *	   6. Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 * 
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	24/10/22
 */

package com.fdmgroup.ood1.immutable;

import java.util.HashMap;
import java.util.Iterator;



public final class ImmutableDemo {

	private final int id;
	private final String name;
	private final HashMap<String,String> testMap;
	
	
	
	/**
	 * Custom Constructor performing Deep Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	public ImmutableDemo(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id=i;
		this.name=n;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
	}
	
	
	/**
	 * Custom Constructor performing Shallow Copy
	 * 
	 * @param id
	 * @param name
	 * @param hashMap
	 */
//	public ImmutableDemo(int id, String name, HashMap<String,String> hashMap){
//		System.out.println("Performing Shallow Copy for Object initialization");
//		this.id=id;
//		this.name=name;
//		this.testMap=hashMap;
//	}
	
	
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	/**
	 * Accessor function for mutable objects
	 */
	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
//		return testMap;
		return (HashMap<String, String>) testMap.clone();
	}

	

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	public static void main(String[] args) {
		
		// prepare attributes for a new ImmutableDemo object
		HashMap<String, String> newHMap = new HashMap<String, String>();
		newHMap.put("1", "first");
		newHMap.put("2", "second");
		
		
		// create new object using above values and print out it hashmap value
		ImmutableDemo immutableDemo = new ImmutableDemo(10, "original", newHMap);
		System.out.println("ImmutableDemo HashMap: " + immutableDemo.getTestMap());
		
		// Lets see if the original hashmap vs immutableDemo hashmap are the same reference
		System.out.println(newHMap == immutableDemo.getTestMap());

		
		
		// add a new item to the hashmap and then print it
		newHMap.put("3", "third");
		System.out.println(immutableDemo.getTestMap());
		
		
		
		// try to get the hashmap and add an item through it
		// then print it to see if it has changed
		HashMap<String, String> immutableDemoTestHMap = immutableDemo.getTestMap();
		immutableDemoTestHMap.put("4", "new");
		System.out.println(immutableDemo.getTestMap());

	}

}
