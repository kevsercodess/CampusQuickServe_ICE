package com.mycompany.campusquickserve_ice;

public class Order {

    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;

    public static final double VAT_RATE = 0.15;

    public Order(String customerName, String studentNumber, String itemOrdered, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }

    public double calculateDiscount() {
        if (quantity > 3) {
            return calculateSubtotal() * 0.10;
        }
        return 0;
    }

    public double calculateVAT() {
        double discountedSubtotal = calculateSubtotal() - calculateDiscount();
        return discountedSubtotal * VAT_RATE;
    }

    public double calculateTotal() {
        double discountedSubtotal = calculateSubtotal() - calculateDiscount();
        return discountedSubtotal + calculateVAT();
    }

    public String generateReceipt() {
        return "===== Campus QuickServe Receipt =====\n"
                + "Customer: " + customerName + "\n"
                + "Student Number: " + studentNumber + "\n"
                + "Item: " + itemOrdered + "\n"
                + "Quantity: " + quantity + "\n"
                + "Price Per Item: R" + pricePerItem + "\n"
                + "-----------------------------\n"
                + "Subtotal: R" + calculateSubtotal() + "\n"
                + "Discount: R" + calculateDiscount() + "\n"
                + "VAT: R" + calculateVAT() + "\n"
                + "Total: R" + calculateTotal();
    }
}