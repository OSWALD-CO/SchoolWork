/*
 * Clayton Oswald
 * 07.17.2019
 * Bellevue University
 * lotteryGame.java
 * 
 * The purpose of this program is to create the Java Lottery Game.
 */

package lotteryGame;

import javax.swing.JOptionPane;

public class lotteryGame {
	
	 public static void main(String[] args){
		 
		 
	        int firstGuess = 0; 
	        int secondGuess = 0;
	        int thirdGuess = 0;
	        int fourthGuess = 0;
	        
	        int num1; 
	        int num2;
	        int num3;
	        int num4;
	        
	        int totalMatch = 0;
	        boolean match1 = false, match2 = false, match3 = false, match4 = false;
	      
	        firstGuess = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your First number..."));
	        secondGuess = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your Second number..."));
	        thirdGuess = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your Third number..."));
	        fourthGuess = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your Last number..."));
	        
	        num1= ((int)(Math.random() * 100) % 9 + 0); 
	        num2= ((int)(Math.random() * 100) % 9 + 0); 
	        num3= ((int)(Math.random() * 100) % 9 + 0);
	        num4= ((int)(Math.random() * 100) % 9 + 0);
	        
	        JOptionPane.showMessageDialog(null, "Your 4 Numbers are: " + firstGuess+ "," + secondGuess + "," + thirdGuess + "," + fourthGuess);
	        JOptionPane.showMessageDialog(null, "The Lottery Numbers Are: " + num1 + "," + num2 + "," + num3 + "," + num4);

	        if (num1 == firstGuess)
	        {
	           match1 = true;
	        }
	        else if(num1 == secondGuess)
	        {
	           match1 = true;
	        }
	        else if(num1 == thirdGuess)
	        {
	           match1 = true;
	        }
		    else if(num1 == fourthGuess)
		    {
		       match1 = true;
	        }
	        if(match1)
	        {
	           totalMatch += 1;
	        }
	        if (num2 == firstGuess)
	        {  
	           match2 =true ;
	        }
	        else if (num2 == secondGuess)
	        {
	           match2 =true ;
	        }
	        else if (num2 == thirdGuess)
	        {
	           match2 = true ;
	        }
		    else if(num2 == fourthGuess)
		    {
		       match2 = true;
	        }
	        if(match2)
	        {
	           totalMatch += 1;
	        }
	        if (num3 == firstGuess)
	        {
	           match3 = true;
	        }
	        else if (num3 == secondGuess)
	        {
	           match3 = true;
	        }
	        else if (num3 == thirdGuess)
	        {
	           match3 = true ;
	        }
		    else if(num3 == fourthGuess)
		    {
		       match3 = true;
	        }
	        if(match3)
	        {
	           totalMatch += 1;
	        }
	        if (num4 == firstGuess)
	        {
	           match1 = true;
	        }
	        else if(num4 == secondGuess)
	        {
	           match1 = true;
	        }
	        else if(num4 == thirdGuess)
	        {
	           match1 = true;
	        }
		    else if(num4 == fourthGuess)
		    {
		       match4 = true;
	        }
	        if(match4)
	        {
	           totalMatch += 1;
	        }
	     
	        if(totalMatch == 4)
	        	
	           JOptionPane.showMessageDialog(null,"You Matched: " + totalMatch + "\n" + "You have won 1,000,000 points!!");
	        
	        else if(totalMatch == 3)
	           JOptionPane.showMessageDialog(null,"You Matched: " + totalMatch + "\n" + "You have won 2,000 points!!");
	        
	        else if(totalMatch == 2)
		        JOptionPane.showMessageDialog(null,"You Matched: " + totalMatch + "\n" + "You have won 100 points!!");
	        
	        else if(totalMatch == 1)
		        JOptionPane.showMessageDialog(null,"You Matched: " + totalMatch + "\n" + "You have won 5 points!!");
	        
	        else
	        	JOptionPane.showMessageDialog(null,"You Matched: " + totalMatch + "\n" + "No matches ");
	   }

}
