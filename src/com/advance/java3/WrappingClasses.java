package com.advance.java3;

public class WrappingClasses {
    public static void main(String[] args) {
        int x = 180;
        System.out.println(x + 10);

       // Integer integer = new Integer(x);
        Integer integer = x;
        System.out.println(integer.floatValue());
        System.out.println(integer.byteValue());
        System.out.println(Integer.valueOf("50"));
        System.out.println(Integer.parseInt("60"));
        System.out.println(Integer.parseInt("Hi"));
    }
}
