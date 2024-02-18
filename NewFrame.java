/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessontwo;

/**
 *
 * @author amith
 */
import javax.swing.JFrame;

public class NewFrame extends JFrame {

    public NewFrame() {
        setTitle("New Window");
        setSize(200, 150);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window on close
    }
}
