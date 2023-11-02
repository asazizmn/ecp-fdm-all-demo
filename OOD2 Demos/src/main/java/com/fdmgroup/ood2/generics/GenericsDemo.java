package com.fdmgroup.ood2.generics;

import java.util.ArrayList;


class Vehicle {}
class Car extends Vehicle {}


public class GenericsDemo {

	public static void main(String[] args) {
		
		// Car is a Vehicle
		Vehicle ve = new Vehicle();
		Vehicle ve2 = new Car();

		
		// ArrayList<Car> is NOT a ArrayList<Vehicle> !!
//		ArrayList<Vehicle> values = new ArrayList<Vehicle>();
//		ArrayList<Vehicle> values2 = new ArrayList<Car>(); // !!!!!!!!!!!!!!!!!!

	}

}
