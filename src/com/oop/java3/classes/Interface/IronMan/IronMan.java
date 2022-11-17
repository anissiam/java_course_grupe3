package com.oop.java3.classes.Interface.IronMan;

public class IronMan extends Person implements Feature,Superpower{

    public IronMan(String name, int tall, int age) {
        super(name, tall, age);
    }

    @Override
    public double rich(double rr) {
        return rr;
    }

    @Override
    public int clever() {
        return 180;
    }

    @Override
    public void fly() {
System.out.println("FLY");
    }

    @Override
    public void strong() {
    System.out.println("Strong");
    }
}
