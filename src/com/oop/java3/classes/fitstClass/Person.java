package com.oop.java3.classes.fitstClass;

public class Person {
    String name;
    int age ;
    String eyeColor;
   public Person(){
       System.out.println("Hi from Person");
    }

    public Person(String name){
        this.name = name;
    }
    public Person(String name , int age , String eyeColor){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    public void printName() {
        System.out.println("SAMI");
    }
}
