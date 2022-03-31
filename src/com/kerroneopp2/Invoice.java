package com.kerroneopp2;


public class Invoice implements Payable {
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, int quality, double pricePerItem) {
        this.partNumber = partNumber;
        this.quantity = quality;
        this.pricePerItem = pricePerItem;
    }

    public Invoice() {
        this(" ", 0, 0.00);
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "\nInvoice No.: " + partNumber + "\nQuantity: " + quantity + "\nPayment Amount: " + "$" + String.format("%.2f", getPaymentAmount());
    }

}