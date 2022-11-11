package com.oop.java3.classes.carhomeWork;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;

    public Car() {
    }

    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void printCar(){
        System.out.println("Name: " + this.name + " Color: " + this.color + " Max speed: " + maxSpeed);
    }
    public double tMaxSpeed(){
        double value = this.maxSpeed* 0.62137119223733;
        return value;
    }
}
