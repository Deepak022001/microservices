package com.wipro.java.microservices.o;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(Arrays.asList(rectangle, circle));

        System.out.println("Total Area: " + totalArea);
    }
}