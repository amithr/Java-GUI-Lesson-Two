/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lessontwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author amith
 */
public class LessonTwo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, World App");
        // Set up the main window (JFrame)
        frame.setTitle("Simple Application");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create a JPanel to hold buttons
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        // Arranges elements in right to left order and goes to next line
        // if no space
        panel.setLayout(new FlowLayout());
        
        // Add Button to open a popup
        JButton popupButton = new JButton("Open Popup");
        // new ActionListener is something called an anonymous class, which
        // implements and interface
        // actionPerformed overrides the method in this interface
        popupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "This is a Popup!",
                        "Popup",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(popupButton);
        
         // Add Button to open a new window
        JButton newWindowButton = new JButton("Open New Window");
        newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new NewFrame();
                newFrame.setVisible(true);
            }
        });
        panel.add(newWindowButton);
        
        frame.setVisible(true);
    }
}
