package com.oop.java3.classes.Interface.IronMan;

public class Main {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan("Tony Stark" , 180 , 40);
        System.out.println(ironMan.toString());
        System.out.println(ironMan.rich(10000000));
        System.out.println(ironMan.clever());
        ironMan.fly();
        ironMan.strong();

    }
}
