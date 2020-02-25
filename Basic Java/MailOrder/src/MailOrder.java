/*
 * Clayton Oswald
 * 08.16.2019
 * Bellevue Universiy
 * The purpose of this assignment is to create a program that uses a data entry screen in which the user types an item number and a quantity. Write each record to a file.
 * MailOrder.java
 */

import java.util.Scanner;
import java.io.*;

public class MailOrder {
	
	public static void main(String[] args) throws IOException
	{

		Scanner kb = new Scanner(System.in);

		PrintWriter fileout = new PrintWriter(new File("data.txt"));

		System.out.print("Enter the item number:");

		int item = kb.nextInt();

		System.out.print("Enter the quantity: ");
		int amount = kb.nextInt();

		fileout.println(item + "\t" + amount);
		
		
		System.out.print("Values Succsessfully Recorded");

		fileout.close();
	}
}