package com.oop.java3.classes.fitstClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        /*Animal animal = new Animal("Locy", "cat" , 3);
        animal.print();
        animal.sound();*/

        Animal animal = new Animal();
        animal.setName("Locy");
        System.out.println(animal.getName());
        animal.setType("Cat");
        System.out.println(animal.getType());
        animal.print();



      /*  Person person1 = new Person(); // انشاء كائن اسمهperson1 من كلاس Person
        System.out.println(person1.name);

        Person person2 = new Person("Sami");
        System.out.println(person2.name);
        System.out.println(person2.eyeColor);


        Person person3 =
                new Person("Sami", 30,"red");
        System.out.println(person3.eyeColor);*/
        /*Person person2 = new Person();
        Person person1 = new Person();
        person1.name = "ALI";
        System.out.println(person1.name+" " + person1.age);
        System.out.println(person1.eyeColor);
        person1.eyeColor = "green";
        System.out.println(person1.eyeColor);
        person1.printName();

        System.out.println(person2.name);
        System.out.println(person2.eyeColor);*/


    }
}
