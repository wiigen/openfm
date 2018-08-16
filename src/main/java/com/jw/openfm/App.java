package com.jw.openfm;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

    /**
     * Kickstarter
     * 
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("OpenFM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }

}
