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

        // primitive types ////////////////

        byte byteVar = 127;
        System.out.println(byteVar);

        short shortVar = 32767;
        System.out.println(shortVar);

        int intVar = -2_147_483_648;
        System.out.println(intVar);

        // long longVar = 2_147_483_647_000_000_000L;
        long longVar = 2_147_483_647_999_999_999L;
        System.out.println(longVar);


        // how to calculate range of float variables
        // https://www.youtube.com/watch?v=YYIeMM8By6Y&t=174s
        // float floatVar = 2_147_483_647_000_000_000_000_000_000_000_000_000F;
        float floatVar = 32.0F;
        System.out.println(floatVar);

        double doubleVar = 64.0;
        System.out.println(doubleVar);
    }
}
