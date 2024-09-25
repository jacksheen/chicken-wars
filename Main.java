// Created by AtomicBolts

/* 
    PLEASE READ THIS

  cmd prompt instruction:

Enter "javac [file path]/chidcken_wars/java/Main.java" to compile
Then enter "java [class name]"

  VSCODE intruction:

Install the "Extension Pack for Java" extension
Run the code by clicking the play button at the right top.

*/

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
  // main function
  public static void main(String[] args)
  {
      // Create a new JFrame
      JFrame frame = new JFrame("Chicken Wars");

      // Create a label
      JLabel label
          = new JLabel("Lorem Ipsum");

      // Add the label to the frame
      frame.add(label);

      // Set frame properties
      frame.setSize(400,
                    300); // Set the size of the frame

      // Close operation
      frame.setDefaultCloseOperation(
          JFrame.EXIT_ON_CLOSE);

      // Make the frame visible
      frame.setVisible(true);
  }
}
