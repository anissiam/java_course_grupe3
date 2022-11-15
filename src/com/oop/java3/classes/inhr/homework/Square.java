package com.oop.java3.classes.inhr.homework;

import java.util.Scanner;

public class Square extends Shape{
    public Square() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter h");
        int h = scanner.nextInt();
        setHeight(h);
        System.out.println("Plz enter w");
        int w= scanner.nextInt();
        setWidth(w);*/

    }

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void area() {

        System.out.println("Area = "+getHeight()*getWidth());
    }
}
