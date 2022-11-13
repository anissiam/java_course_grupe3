package com.oop.java3.classes.inhr;

public class B extends A{
    /*@Override
    public void print() {
       // super.print(); معناها استدعاء الميثود من الكلاس الاب
    }*/
    @Override
    public void print(){
        System.out.println("B");
        show();

    }

    /*void printB(){
        System.out.println("B");
    }*/
}
