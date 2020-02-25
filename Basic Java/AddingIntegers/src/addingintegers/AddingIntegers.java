/*
Clayton Oswald
The purpose of this program is to add the digits of an integer between 0-1000.
09/09/2018
Bellevue University
AddingIntegers.java
 */
package addingintegers;

/**
 *
 * @author clayo
 */
import java.util.Scanner;
        
public class AddingIntegers {

    public static void main(String[] args) {

        //creating a scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter a number between 0-100
        System.out.print("Please enter a number between 0 and 1000.");
        
        int number = input.nextInt();
       
        //seperate each integer
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;
        
        //compute the equation
        int sum = ones + tens + hundreds;
        
        //display the results
        System.out.println("The sum of all the digits in the integer " + hundreds + "" + tens + "" + ones 
        + " is " + sum);
    }
    
}
