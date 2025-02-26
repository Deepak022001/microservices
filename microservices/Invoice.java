package com.wipro.java.microservices.solid;

import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    Book book;
    int quantity;
    double discountRate;
    double taxRate;
    double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = (book.price - (book.price * discountRate)) * this.quantity;
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }

    public void printInvoice() {
        System.out.println(quantity + "x " + book.name + " " + book.price + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Invoice Details:\n");
            writer.write(quantity + "x " + book.name + " " + book.price + "$\n");
            writer.write("Discount Rate: " + discountRate + "\n");
            writer.write("Tax Rate: " + taxRate + "\n");
            writer.write("Total: " + total + "\n");
            System.out.println("Invoice saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving invoice: " + e.getMessage());
        }
    }
}
