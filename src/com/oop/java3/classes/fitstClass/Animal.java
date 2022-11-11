package com.oop.java3.classes.fitstClass;

public class Animal {
    private String name;
    private String type;
    private int age;

    public Animal() {
    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
   /* public void getName(){
        System.out.println(name);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name + " Type: " + type + " Age: " + age);
    }

    public void sound() {
        if (type.equalsIgnoreCase("cat")) {
            System.out.println("meow");
        }
    }
}
