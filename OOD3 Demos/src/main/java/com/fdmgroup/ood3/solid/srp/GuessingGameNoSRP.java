/**
 * GuessingGame.java
 * - a number guessing game (concept only), used only to demonstrate an SRP VIOLATION
 * - should be focusing on the game individually
 * - should NOT be focusing on the results of ALL the games played (i.e. )
 * 
 * - this class CORRECTLY observes the single responsibility principle
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood3.solid.srp;

import java.util.ArrayList;
import java.util.List;


public class GuessingGameNoSRP {

	int numberOfGuesses;
	int numberToBeGuessed;
	
	// used to track ALL the games played so far!!! Not good for SRP here!!!
	static List<GuessingGameNoSRP> historyOfGamesPlayed = new ArrayList();

	
	GuessingGameNoSRP( int numberOfGuesses, int theNumber ) {
		this.numberOfGuesses = numberOfGuesses;
		this.numberToBeGuessed = theNumber;
		
		// NOT good for SRP !!!
		historyOfGamesPlayed.add(this);
	}
	
	
	
	// ALL of the following methods are related to the games history
	// ... and NOT directly to do with the individual game
	
	public static void printHistory() {
		/* lots of code */ }

	public static void updateRow() {
		/* lots of code */ }

	public static void deleteRow() {
		/* lots of code */ }

	public static void editRow() {
		/* lots of code */ }
}
