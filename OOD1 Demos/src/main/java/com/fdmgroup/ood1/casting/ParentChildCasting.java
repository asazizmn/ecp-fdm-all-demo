/**
 * ParentChildCasting.java
 * - demonstrating the basic inheritance casting between parent and child
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	20/10/22
 */

package com.fdmgroup.ood1.casting;



class Parent {

	String name;
	int age;
	
	Parent( String name, int age ) {
		this.name = name;
		this.age = age;
	}
}



class Child extends Parent {

	// inherited properties exist implicitly
//	String name;
//	int age;
	
	
	// child specific attribute
	String school;
	
	
	// child object needs to initialise inherited properties
	Child( String name, int age, String school ) {
		super(name, age);
		this.school = school;
	}
}



class Runner {

	public static void main(String[] args) {

		// child instantiation ////////////////////////////////////

		Child child = new Child("John", 13, "FDM Junior Academy");

		// all attributes can be accessed
		System.out.println(child.name);
		System.out.println(child.age);
		System.out.println(child.school);

		
		
		// upcasting: child -> parent, done implicitly //////////////////////

		Parent parent = child;

		// only inherited attributes are accessible
		System.out.println(parent.name);
		System.out.println(parent.age);
//		System.out.println(parent.school); // Error! Can't be accessed

		
		
		// downcasting: parent -> child, done explicitly //////////////////

		Child childReturnee = (Child) parent;

		// all original items are accessible again
		System.out.println(childReturnee.name);
		System.out.println(childReturnee.age);
		System.out.println(childReturnee.school);
	}
}