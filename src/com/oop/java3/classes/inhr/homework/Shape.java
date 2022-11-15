package com.oop.java3.classes.inhr.homework;

public class Shape {
    private int height;
    private int width;
    private int rad;

    public Shape() {
    }

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Shape(int height, int width, int rad) {
        this.height = height;
        this.width = width;
        this.rad = rad;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    public void area(){
        System.out.println("Area");
    }
}
