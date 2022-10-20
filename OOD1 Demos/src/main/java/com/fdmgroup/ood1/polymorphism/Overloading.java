/**
 * Overloading.java
 * - demonstrates the concept of method overloading
 */

package com.fdmgroup.ood1.polymorphism;



class Sum { 

	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) { 
		return (x + y); 
	} 

	
	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) { 
		return (x + y + z); 
	} 
	
	
	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z, int a) { 
		return (x + y + z + a); 
	} 

	
	// Overloaded sum(). This sum takes two double 
	// parameters 
	public double sum(double x, double y) { 
		return (x + y); 
	} 

	
	// Driver code 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10, 20, 30, 40)); 
	} 
}

