package com.wipro.java.microservices.l;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rect.getArea()); // Expected: 50

        Rectangle square = new Square(5);
        square.setWidth(10);
        System.out.println("Square Area: " + square.getArea()); // LSP Violation! Unexpected result
    }
}