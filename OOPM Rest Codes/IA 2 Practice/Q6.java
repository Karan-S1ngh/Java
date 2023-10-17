/*
Q6  Write a graphics JAVA program to display “All the best “ using frame
*/

import javax.swing.*;

public class AllTheBestFrame {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("All the Best");

        // Create a JLabel with the text "All the best"
        JLabel label = new JLabel("All the best");

        // Set font and size for the label
        Font font = new Font("Arial", Font.PLAIN, 24);
        label.setFont(font);

        // Add the label to the frame
        frame.add(label);

        // Set frame size and visibility
        frame.setSize(200, 100); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on window close
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible
    }
}
 
