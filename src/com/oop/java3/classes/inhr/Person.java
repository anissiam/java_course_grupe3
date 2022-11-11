package com.oop.java3.classes.inhr;

public class Person {
    String name ;
    String eyeColor;
    int age;


    public Person(String name, String eyeColor, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
    }

    public void printPeron(){
        System.out.println("Person");
    }
}
