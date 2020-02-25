/*
Clayton Oswald
The purpose of this program is to add the digits of an integer and display the sum
09/30/2018
Bellevue University
ReturnSumDigits.java
 */
package returnsumdigits;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class ReturnSumDigits{
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        JOptionPane myIO = new JOptionPane();
        
        //Prompt user to enter a number
       myIO.showMessageDialog(null,"Please enter a number!");
        
        //Display the sum
        int number1 = in.nextInt();
        myIO.showMessageDialog(null,"The sum of the digits in the number " + number1 + " is: " + sumDigits(number1));
    }

    //Create the loop
    public static int sumDigits(long n){
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }
        return sum;
    }    
}
