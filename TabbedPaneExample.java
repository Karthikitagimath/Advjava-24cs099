//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display the concerned color whenever the specific tab is selected in the Pan.

package swings;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

    JFrame f;

    TabbedPaneExample() {
        f = new JFrame("Tabbed Pane Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        // Add tabs
        tp.addTab("BLUE", p1);
        tp.addTab("RED", p2);
        tp.addTab("GREEN", p3);

        // Add tabbed pane to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DO NOT use null layout
        // f.setLayout(null); ❌ remove this

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}