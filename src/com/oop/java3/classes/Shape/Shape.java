package com.oop.java3.classes.Shape;

public class Shape {
    int higth;
    int width;
    String name;

    public Shape() {
        //empty
    }

    public Shape(int higth, int width, String name) {
        this.higth = higth;
        this.width = width;
        this.name = name;
    }

    public void print(){
        System.out.println(this.name + " H=" + higth + " W=" + width);
    }
    public void clac(){
        int area = higth * width;
        System.out.println(area);
    }
}
