package com.oop.java3.classes.inhr.homework;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;
        Square square = new Square(x, y);
        square.area();

        Rectangle rectangle = new Rectangle(x,y);
        rectangle.area();

        Circle circle = new Circle();
        circle.area();

    }
}
