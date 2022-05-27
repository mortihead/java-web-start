package ru.mortihead;

import javax.swing.*;

public class SwingApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("main");
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World from swing!");
        f.add(label);
        f.setVisible(true);

    }
}
