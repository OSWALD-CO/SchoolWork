/*
 * Clayton Oswald
 * 07.17.2019
 * Bellevue University
 * Password.java
 * 
 * The purpose of this program is to create an application that makes a user create and verify a password.
 */

import javax.swing.JOptionPane;

public class Password {

	public Password() {
	}

	   public void getPassword() {

	       String password = JOptionPane.showInputDialog(null,
	               "Please enter your password ", "Password", 1);

	       while (true) {

	           boolean valid = true;
	           if (password.length() < 6 || password.length() > 10) {
	               valid = false;
	           } 	           
	           else {

	               boolean charactersFound = false;
	               boolean digitsFound = false;

	               for (int i = 0; i < password.length(); i++) {
	            	   
	                   if ((password.charAt(i) >= 65 && password.charAt(i) <= 90)
	                           || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
	                       charactersFound = true;
	                   }

	                   if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
	                       digitsFound = true;
	                   }
	               }

	               if (charactersFound && digitsFound) {
	                   valid = true;
	               }
	               else {
	                   valid = false;
	               }
	               
	           }

	           if (valid) {
	               break;
	           }

	           password = JOptionPane.showInputDialog(null,"Password can not be less than 6 or more than 10 characters\n" + "Password must contain atleast 1 charcater and 1 digit" + "\nPlease re-enter your password ", "Password", 1);
	       }

	       String Password2 = JOptionPane.showInputDialog(null,
	               "Please re-enter your password ", "Password", 1);
	       while (true) {
	           if (password.equalsIgnoreCase(Password2)) {
	               break;
	           }

	           Password2 = JOptionPane.showInputDialog(null, "Password Mismatch" + "\nPlease re-enter your password ", "Re-Password", 1);

	       }

	       JOptionPane.showMessageDialog(null, "Password is valid! ", "Password Check Result", 1);
	      
	   }

	   public static void main(String[] args) {

	       Password password = new Password();
	       password.getPassword();
	}

}
