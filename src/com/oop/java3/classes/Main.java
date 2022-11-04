package com.oop.java3.classes;

public class Main {
    public static void main(String[] args) {
        Person person2 = new Person();
        Person person1 = new Person();
        person1.name = "ALI";
        System.out.println(person1.name+" " + person1.age);
        System.out.println(person1.eyeColor);
        person1.eyeColor = "green";
        System.out.println(person1.eyeColor);
        person1.printName();

        System.out.println(person2.name);
        System.out.println(person2.eyeColor);



    }
}
