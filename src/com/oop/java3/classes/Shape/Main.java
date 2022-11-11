package com.oop.java3.classes.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Plz enter hiegth");
        int h = in.nextInt();

        System.out.println("Plz enter w");
        int w = in.nextInt();
        Shape1 shape = new Shape1();
        shape.setName("circle");
        shape.setRad(0);
        shape.setHigth(h);
        shape.setWidth(w);

        shape.clacCircle();
        shape.clacRectangle();
        /*Scanner in = new Scanner(System.in);
        System.out.println("Plz enter hiegth");
        int h = in.nextInt();

        System.out.println("Plz enter w");
        int w = in.nextInt();
        Shape shape = new Shape(h,w,"rectangle");
        shape.print();
        shape.clac();*/
    }
}
