package com.oop.java3.classes.Interface.IronMan;

public class Person {
    private String name;
    private int tall;
    private int age;

    public Person() {
    }

    public Person(String name, int tall, int age) {
        this.name = name;
        this.tall = tall;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tall=" + tall +
                ", age=" + age +
                '}';
    }
}
