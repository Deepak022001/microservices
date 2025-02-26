package com.wipro.java.microservices.l;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;  // Ensuring width = height
    }

    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height; // Ensuring width = height
    }
}