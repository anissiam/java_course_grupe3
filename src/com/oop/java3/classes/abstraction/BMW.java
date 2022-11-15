package com.oop.java3.classes.abstraction;

public class BMW extends Car{

    @Override
    public void printSpeed() {
        System.out.println("100");
    }

    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public int carColor() {

        return 1;
    }

    @Override
    public void showSpeed() {
    }
}
