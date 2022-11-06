package com.oop.java3.classes.methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

/*
        addNumbers();
        subNumbers();

        int x = 10;
        int y = 50;
        addNumbers1(x,y);

        addNumbers1(50,10);
        subNumbers1(x,y);

        mm(10, 90, "10");

        printArray();

        String month[][] = {{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}};

        printArray1(month);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int xx = scanner.nextInt();
        System.out.println("Enter y");
        int yy = scanner.nextInt();
        *//*int xx = 10;
        int yy = 50;*//*
        addNumbers11(xx, yy);
        subNumbers11(xx,yy);


        //int w = addNumbers111(xx, yy);
        System.out.println(addNumbers111(xx, yy));*/
        /*int ava = add4No() / 4;
        System.out.println(ava);

        if (add4No() % 2 == 0) {
            System.out.println("Even");
            System.out.println(add4No() * 10);
        } else {
            System.out.println("Add");
        }*/


        concat(10,20);
        concat("10","20");
        //concat("10",10); not found
        concat("20",10.0);

    }

    public static void addNumbers() { //header
        int x = 10;
        int y = 50;
        int z = x + y;
        System.out.println(z);
    }

    public static void subNumbers() {
        int x = 10;
        int y = 50;
        int z = x - y;
        System.out.println(z);
    }

    public static void addNumbers1(int x, int y) { //header

        int z = x + y;
        System.out.println(z);
    }

    public static void subNumbers1(int x, int y) {

        int z = x - y;
        System.out.println(z);
    }

    public static void mm(int x, int y, String z) { //header
        /// Code
    }

    public static void printArray() {
        String month[][] = {{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                , {"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                , {"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                , {"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}};

        for (int i = 0; i < month.length; i++) {
            System.out.print("Week " + (i + 1) + " ");
            for (int j = 0; j < month[i].length; j++) {
                System.out.print(" " + month[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray1(String month[][]) {

        for (int i = 0; i < month.length; i++) {
            System.out.print("Week " + (i + 1) + " ");
            for (int j = 0; j < month[i].length; j++) {
                System.out.print(" " + month[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addNumbers11(int x, int y) {

        System.out.println(x + y);
    }

    public static void subNumbers11(int x, int y) {

        System.out.println(x - y);
    }


    public static int addNumbers111(int x, int y) {

        int z = x + y;
        return z;
    }

    public static int add4No() {
        return (10 + 20 + 30 + 40);
    }
    public static void concat(int x) {
        System.out.println(x);
    }
    public static void concat(String x) {
        System.out.println(x);
    }

   /* public static String concat(String x) {
        return x;
    }*/
    public static void concat(int x, int y) {
        System.out.println(x + y);
    }

    public static void concat(String x, String y) {
        System.out.println(x + y);
    }

    public static void concat(String x, double y) {
        System.out.println(x + y);
    }

}
