//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

package Swings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class SwingExample {

    SwingExample() {
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Increased size
        jfrm.setSize(500, 200);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center aligned text
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", JLabel.CENTER);

        // Better font size
        jlab.setFont(new Font("Verdana", Font.BOLD, 18));
        jlab.setForeground(Color.BLUE);

        jfrm.add(jlab);

        // Center window on screen
        jfrm.setLocationRelativeTo(null);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}