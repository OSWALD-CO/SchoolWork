/*
* This application will convert temperatures from Fahrenheit to Celsius 

 * 9/07/18 

*  Bellevue University  

 * Filename: Temp_Converstion.java  
 */


package javaapplication9;


import java.util.Scanner;

public class JavaApplication9 { 

    public static void main(String [] args) { 

       //declares the scanner object to allow user input 

        Scanner input = new Scanner(System.in);  

        //double variable for the user's temperature 

        double temp_f = 0;

        System.out.println("Welcome to my temperature conversion program!");    

         //asks for user input 

        System.out.print("Please enter temperature in degrees Fahrenheit: "); 

         temp_f = input.nextDouble(); 

 //closes Scanner object

         input.close();  

         //converts fahrenheit to celsius 

          double temp_c = (5.0 / 9.0)*(temp_f - 32.0);  

         System.out.printf("%.1f in Fahrenheit is %.1f in Celsius", temp_f, temp_c);

  }
}    

