package com.oop.java3.classes.inhr;

public class Ahmed extends Person{

    public Ahmed(String name, String eyeColor, int age){
        super(name, eyeColor, age);
    }
    public void printAhmed(){
        System.out.println(name);
        System.out.println(test);
        /*test = 50;*/
    }
}
