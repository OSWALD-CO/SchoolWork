/*
 * Clayton Oswald
 * 06.23.2019
 * Bellevue University
 * Dollars.java
 * 
 * The purpose of this program is to take user input for a dollar amount and
 * and break it into denominations.
 */
import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter an amount of money:");
			int money = input.nextInt();
			int hundo = money / 100;
			int fifty = (money - 100 * hundo)/50;
			int twenty = (money - (100 * hundo + 50 * fifty))/20;
			int ten = (money - (100 * hundo + 50 * fifty + 20 * twenty))/10;
			int five = (money - (100 * hundo + 50 * fifty + 20 * twenty + 10 * ten))/5;
			int one = (money - (100 * hundo + 50 * fifty + 20 * twenty + 10 * ten + 5 * five))/1;
			
			System.out.println("From $" + money + ", you have recieved: ");
			System.out.println("Hundreds:" + hundo);
			System.out.println("Fifties:" + fifty);
			System.out.println("Twenties:" + twenty);
			System.out.println("Tens: " + ten);
			System.out.println("Fives: " + five);
			System.out.println("Ones: " + one);

	}

}
