package com.oop.java3.classes.carhomeWork;

public class Main {
    public static void main(String[] args) {
        /*Car car = new Car("BMW" , "RED" , 100);
        car.printCar();
        car.setName("FORD");
        car.printCar();*/

        Car car = new Car();
        car.printCar();
        car.setName("BMW");
        car.setColor("RED");
        car.setMaxSpeed(100);
        car.printCar();
        System.out.println(car.tMaxSpeed());
    }
}
