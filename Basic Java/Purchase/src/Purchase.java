import javax.swing.JOptionPane;

/*
 * Clayton Oswald
 * 07.17.2019
 * Bellevue University
 * Purchase.java
 * 
 * The purpose of this program is to create an organized application that calculates the tax of a purchase amount.
 */

import javax.swing.JOptionPane;

public class Purchase {

	public static void main(String[] args) {
		
		int invoice;
		double sale;
		double tax;
		double taxPer = 0.075;
		
		invoice = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your Invoice number..."));
		sale = Integer.parseInt(JOptionPane.showInputDialog("Please, enter the sale amount..."));
		tax = sale * taxPer;
		
		JOptionPane.showMessageDialog(null, "Invoice Number: " + invoice + "\n" + "Sale Amount: $" + sale + "\n" + "Sales Tax: %" + taxPer + "\n"
				+ "Tax amount: $" + tax);

	}

}
