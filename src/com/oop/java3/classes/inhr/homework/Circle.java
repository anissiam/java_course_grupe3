package com.oop.java3.classes.inhr.homework;

import java.util.Scanner;

public class Circle extends Shape{
    private static final double PI = 3.14;
    @Override
    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter rad");
        int rad = scanner.nextInt();
        setRad(rad);
        System.out.println(PI * Math.pow(getRad(), 2));
    }
}
