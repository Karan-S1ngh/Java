/*
Q6  Write a graphics JAVA program to display “All the best “ using frame
*/

// Importing necessary classes from the javax.swing package
import javax.swing.*;

// Main class for creating a basic GUI window
public class GUI {
    public static void main(String[] args) {
        // Creating a new JFrame (GUI window) instance
        JFrame f = new JFrame();

        // Creating a JLabel (text label) instance with the text "Hello World"
        JLabel l = new JLabel("Hello World");

        // Setting the bounds (position and size) of the label within the window
        l.setBounds(50, 50, 100, 40);

        // Setting the horizontal alignment of the label to center
        l.setHorizontalAlignment(JLabel.CENTER);

        // Adding the label to the JFrame
        f.add(l);

        // Setting the size of the JFrame
        f.setSize(200, 200);

        // Disabling the default layout manager to manually position components
        f.setLayout(null);

        // Making the JFrame visible on the screen
        f.setVisible(true);

        // Setting the default close operation to exit the program when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

 
