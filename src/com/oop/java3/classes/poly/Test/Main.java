package com.oop.java3.classes.poly.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Poly poly = new Poly();
        Test obj = new Concat();

        poly.poly(obj , 10 , 50);

        obj = new Addtion();
        poly.poly(obj, 10 , 50);*/

        Poly poly = new Poly();
        Test test;
        Scanner in = new Scanner(System.in);
        System.out.println("Plz enter X");
        int x = in.nextInt();

        System.out.println("Plz enter Y");
        int y = in.nextInt();
        System.out.println("Plz enter choice\n1)Addition\n2)Concat");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                test = new Addtion();
                poly.poly(test, x, y);
                break;
            case 2:
                test = new Concat();
                poly.poly(test, x, y);
                break;
            default:
                System.out.println("Not valid");
        }
    }
}
