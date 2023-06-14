/**
 * GuessingGame.java
 * - a number guessing game (concept only), used only to demonstrate the SRP
 * - the game only tracks two things: 
 * 		(1) what the magic number was, and 
 * 		(2) the number of attempts to guess it.
 * 
 * - this class CORRECTLY observes the single responsibility principle
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	17/10/22
 */

package com.fdmgroup.ood3.solid.srp;



public class GuessingGameSRP {

	int numberOfGuesses;
	int numberToBeGuessed;

	GuessingGameSRP( int numberOfGuesses, int theNumber ) {
		this.numberOfGuesses = numberOfGuesses;
		this.numberToBeGuessed = theNumber;
	}
}
