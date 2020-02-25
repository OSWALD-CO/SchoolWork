/*
 * Clayton Oswald
 * 08.11.2019
 * Bellevue Universiy
 * The purpose of this assignment is fix the MessageBoxes Code
 * MessageBoxes.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MessageBoxes{

  private JButton alert = new JButton("Alert");
  private JButton yesNo = new JButton("Yes/No");
  private JButton color = new JButton("Color");
  private JButton vals = new JButton("3 Vals");
  private JButton input = new JButton("Input");

  private JTextField txt = new JTextField(15);

  private JFrame frame;

  public MessageBoxes(){

    frame = new JFrame("Title");

    frame.setSize(250, 250);

    frame.getContentPane().setLayout(new FlowLayout());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(alert);
    frame.getContentPane().add(yesNo);
    frame.getContentPane().add(color);
    frame.getContentPane().add(vals);
    frame.getContentPane().add(input);
    frame.getContentPane().add(txt);

    frame.setVisible(true);

  }

  public void launchJFrame(){

      alert.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                JOptionPane.showMessageDialog(null,
                                      "There's a bug on you!", "Hey!",
                                      JOptionPane.ERROR_MESSAGE);
            }
        });  

        yesNo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                int val = JOptionPane.showConfirmDialog(null,
                                      "Choose yes or no", "Your Call...",
                                      JOptionPane.YES_NO_OPTION);

                if(val != JOptionPane.CLOSED_OPTION){
                  if(val == 0){
                    txt.setText("Yes");
                }
                else{
                    txt.setText("No");
                }
                }
            }
        });  

        color.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                Object[] options = {"Red", "Green"};

                int sel = JOptionPane.showOptionDialog(null,
                                "Choose a Color!", "Warning",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.WARNING_MESSAGE, null,
                                            options, options[0]);

                if(sel != JOptionPane.CLOSED_OPTION){
                    txt.setText("Color Selected: " + options[sel]);
                }
            }
        });  

        vals.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                Object[] selections = {"First", "Second", "Third"};

                Object val = JOptionPane.showInputDialog(null,
                                                 "Choose one", "Input",
                                                 JOptionPane.INFORMATION_MESSAGE,
                                                 null, selections, selections[0]);

                if(val != null){
                    txt.setText(val.toString());
                }
            }
        });

        input.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                String val = JOptionPane.showInputDialog("How mant fingers do you see?");

                    txt.setText(val);
            }
        });  

}

 public static void main(String [] args){

    MessageBoxes messageBoxes = new MessageBoxes();
    messageBoxes.launchJFrame();
 }
}