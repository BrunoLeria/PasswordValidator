/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.passwordvalidator;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Main {

    public static void main(String[] args) {
        Rules rules;
        do {
            rules = new Rules(JOptionPane.showInputDialog("Test your password"));
            if (rules.checkPassword().isBlank()) {
                JOptionPane.showMessageDialog(null, "Password approved");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid password. " + rules.checkPassword());
            }
        } while (!rules.checkPassword().isBlank());
    }
}
