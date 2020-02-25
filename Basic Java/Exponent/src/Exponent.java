/*
 * Clayton Oswald
 * 06.30.2019
 * Bellevue University
 * Exponent.java
 * 
 * The purpose of this program is to take user input for a digit and square and cube the value.
 */

import javax.swing.JOptionPane;

public class Exponent {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Enter a Value to find the square and cube: ", "User Input", JOptionPane.QUESTION_MESSAGE);
		
		float digit = Float.parseFloat(input);
		Exponent ex = new Exponent();
		float squared = ex.squared(digit);
		float cubed = ex.cubed(digit);
		
		JOptionPane.showMessageDialog(null, "The Square of hte entered value is : " + squared, "Square", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "The Cube of the entered value is : " + cubed, "Cube", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public float squared(double digit)
	{
		return (float) (digit * digit);
	}
	
	public float cubed(double digit)
	{
		return (float) (digit * digit * digit);
	}
	
}
