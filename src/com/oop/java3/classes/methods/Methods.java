package com.oop.java3.classes.methods;

public class Methods {

    public static void main(String[] args) {
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

    public static void mm(int x, int y , String z) { //header
        /// Code
    }

    public static void printArray(){
        String month[][] = {{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
                ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}};

        for(int i = 0 ; i<month.length;i++){
            System.out.print("Week " + (i+1) + " ");
            for(int j = 0 ; j<month[i].length ; j++){
                System.out.print(" " + month[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray1(String month[][]){

        for(int i = 0 ; i<month.length;i++){
            System.out.print("Week " + (i+1) + " ");
            for(int j = 0 ; j<month[i].length ; j++){
                System.out.print(" " + month[i][j] + " ");
            }
            System.out.println();
        }
    }
}
