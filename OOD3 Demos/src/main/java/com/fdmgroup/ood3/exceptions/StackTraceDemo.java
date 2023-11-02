package com.fdmgroup.ood3.exceptions;

public class StackTraceDemo {
	
	public void methodA() {
		methodB();
	}
	
	public void methodB() {
		methodC();
	}
	
	public void methodC() {
		methodD();
	}
	
	public void methodD() {
		
		
		int[] values = {1, 2, 3};
		
		// problem code - exception is thrown
		System.out.println( values[9] );
		
		// does not execute after exception above!!!!
		System.out.println("The Next Step");
	}
	

	public static void main(String[] args) {
		
		StackTraceDemo demo = new StackTraceDemo();
		demo.methodA();
		
		
		
	}

}
