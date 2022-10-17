/**
 * VariousDependencies.java
 * - basic demonstration the 4 dependency types
 * - ... dependency, association, aggregation, composition
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood1.dependencies;

import java.util.List;



// Dependency ////////////////////////////////

class Exam {}

class Trainee {
	public void takeExam(Exam exam) {}
}



// Association ////////////////////////////////

class Trainer {}

class Classroom {
	Trainer trainer;
}



// Aggregation ////////////////////////////////

class Wheel {}

class Car {
    List<Wheel> wheels;
}



// Composition ////////////////////////////////

class Building {
    List<Room> rooms;
    class Room {}   
}

