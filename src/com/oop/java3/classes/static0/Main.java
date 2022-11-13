package com.oop.java3.classes.static0;

public class Main {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.a = 10;
        obj.b = 50;
        System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println(TestClass.c);
        TestClass.add(100, 50);
        TestClass.MAX(10, 50);
        System.out.println(Math.max(10, 50));
    }
}
