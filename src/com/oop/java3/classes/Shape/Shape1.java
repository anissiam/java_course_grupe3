package com.oop.java3.classes.Shape;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Shape1 {
    private int higth;
    private int width;
    private String name;
    private int rad;

    public Shape1() {
        //empty
    }

    public Shape1(int higth, int width, String name, int rad) {
        this.higth = higth;
        this.width = width;
        this.name = name;
        this.rad = rad;
    }

    public int getHigth() {
        return higth;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void print() {
        System.out.println(this.name + " H=" + higth + " W=" + width);
    }

    public void clacCircle() {
        double area;
        if (rad == 0) {
            System.out.println("there is no rad ");
            setRadFromScanner();
            return;
        }
        area = Math.PI * (rad * rad);
        System.out.println(area);
    }
    public void setRadFromScanner(){
        System.out.println("Plz enter rad ");
        Scanner scanner = new Scanner(System.in);
        int rad = scanner.nextInt();
        this.rad = rad;
        clacCircle();
    }

    public void clacRectangle() {
        double area;
        area = higth * width;
        System.out.println(area);
    }


}
