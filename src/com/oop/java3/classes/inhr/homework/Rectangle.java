package com.oop.java3.classes.inhr.homework;

public class Rectangle extends Shape {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void area() {
        System.out.println("Area = "+getHeight()*getWidth());

    }
}
