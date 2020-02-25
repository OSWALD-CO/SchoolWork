/*
Clayton Oswald
The purpose of this program is to create a table showing the square root of certain numbers
09/30/2018
Bellevue University
SqrtTable.java
 */
package sqrttable;


public class SqrtTable {


    public static void main(String[] args) {
        // Displaying the header of the table
        System.out.printf("%-10s%-10s\n", "Number", "SquareRoot");
        
        //Displaying the values for zero
        for (int x = 0; x <= 20; x=x+2) {
        double squareroot = Math.sqrt(x);
        System.out.printf("%-10d%14.4f\n", x, squareroot);
    }
    }
    }
