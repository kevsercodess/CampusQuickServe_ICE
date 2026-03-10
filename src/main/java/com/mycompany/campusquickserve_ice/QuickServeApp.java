/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campusquickserve_ice;

/**
 *
 * @author Kevse
 */
public class QuickServeApp {
// Main method to collect user input and display the receipt
    public static void main(String[] args) {
        String customerName = javax.swing.JOptionPane.showInputDialog("Enter customer name:");

String studentNumber = javax.swing.JOptionPane.showInputDialog("Enter student number:");

String itemOrdered = javax.swing.JOptionPane.showInputDialog("Enter item ordered:");

int quantity = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter quantity:"));

double pricePerItem = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter price per item:"));

Order order = new Order(customerName, studentNumber, itemOrdered, quantity, pricePerItem);

javax.swing.JOptionPane.showMessageDialog(null, order.generateReceipt());
    }
}
