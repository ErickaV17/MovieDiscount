/*
 * Programmer: Ericka Van Dongen
 * Date: September 25 2020
 * Purpose: To create a movie ticket
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();
        
        
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();
        
        // Cost variable
        double cost = 14.50;
        
        // Print cost if they are part of age group
        if (age < 13 || age >= 65) {
        	double cost1 = cost - 3; 
        	if (coupon == true) {
        		double cost2 = cost1 - 2 ;
        		System.out.println("Your ticket costs $" + cost2 + ".");
        	}	
        	else {
        		System.out.println("Your ticket costs $" + cost1 + ".");
        	}
        }		
        	// print cost if they are not part of one of the age groups 
        else { 
        	if (coupon == true) {
        		System.out.println("Your ticket costs $12.50.");
        	}
        	else {
        		System.out.println("Your ticket costs $14.50.");
        	}
        		
        	
        	
        
       
        		
        	
        	
        	
        }
       
    }
}
