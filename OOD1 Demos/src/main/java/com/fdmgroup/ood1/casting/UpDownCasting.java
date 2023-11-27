package com.fdmgroup.ood1.casting;

// Parent
class Vehicle {}

// All Children/Subclasses
class Skateboard extends Vehicle {}
class Bicycle extends Vehicle {}
class Jeep extends Vehicle {}



public class UpDownCasting {

	public static void main(String[] args) {
		
		// Normal Instantiation
		Vehicle vehicle = new Vehicle();
		Skateboard skateboard = new Skateboard();
		
		
		// Upcasting
		Vehicle v2 = new Skateboard(); 
		
		// Downcasting
		Skateboard s2 = (Skateboard) v2;
		
		
		// Does Downcasting work... Without Upcasting first?
		Vehicle v3 = new Vehicle();
		Skateboard s3 = (Skateboard) v3;
		
		
		
		// Need EXTRA care when downcasting and several subclasses available!!!
		Vehicle v4 = new Skateboard(); 
		Skateboard s4 = (Skateboard) v4;
		
		// !!!!!!!!!!!!!!!!!! Compiles.. But Illegal during runtime !!!!!!
		Vehicle v5 = new Skateboard(); 
		
		if ( v5 instanceof Jeep ) {
			Jeep j1 = (Jeep) v5;
		}
		else if ( v5 instanceof Skateboard ) {
			
			Skateboard s5 = (Skateboard) v5;
		}
		else if ( v5 instanceof Bicycle ) {
			
			Bicycle b1 = (Bicycle) v5;
		}
		
	}

}
