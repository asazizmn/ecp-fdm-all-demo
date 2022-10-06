/**
 * Primitives
 * - demonstrating basic data type usage and underscoring
 * - for javadoc tags - https://www.tutorialspoint.com/java/java_documentation.htm
 * 
 * @author	S. Aziz
 * @version	0.0.1
 * @since	05/10/22
 */


package com.fdmgroup.ood1.datatypes;



public class Primitives {

    public static void main(String[] args) {

        // primitive types (w/ upper limits) ////////////////

        byte byteVar = 127;

        short shortVar = 32767;

        int intVar = -2_147_483_648;

        long longVar = 9_223_372_036_854_775_807L;


        // how to calculate range of float variables
        // https://www.youtube.com/watch?v=YYIeMM8By6Y&t=174s
        
        // float floatVar = 2_147_483_647_000_000_000_000_000_000_000_000_000F;
        float floatVar = 32.0F;

        double doubleVar = 64.0;
        
        
        boolean booleanVar = true;
        boolean booleanVar2 = false;
        
        
        char charVar = 'a';
    }
}
