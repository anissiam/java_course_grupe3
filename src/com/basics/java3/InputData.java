package com.basics.java3;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*in Runtime
        Scanner input = new Scanner(System.in);  // جهزنا اداة الادخال
        System.out.println("Plz enter x value");
        int x = input.nextInt(); // تعريف متغير من نوع int  واستخدام Scanner لادخال قيمة int

        System.out.println("Plz enter y value");
        int y = input.nextInt();

        int z = x + y;
        System.out.println("Sum = " + z);*/

        /* in implement time
        int x = 50;
        int y = 60;
        int z = x + y;
        System.out.println("sum = "+ z);*/

       /* String ss = input.nextLine();
        System.out.println(ss);
        System.out.println(input.nextLine());*/

        /*System.out.println("Enter 1 no ");
        int no1 = input.nextInt();

        System.out.println("Enter 2 no ");
        int no2 = input.nextInt();

        System.out.println("Enter 3 no ");
        int no3 = input.nextInt();

        int ava = (no1 + no2 + no3) / 3;
        System.out.println(ava);*/

        /*System.out.println("Enter first name ");
        String firstName = input.nextLine();
        System.out.println("Enter last name ");
        String lastname = input.nextLine();

        String fullName = firstName.concat(" "+lastname);
        System.out.println(fullName);*/

        System.out.println("Please enter rad");
        int rad = input.nextInt();
        double area = 2 * 3.14 * rad;
        System.out.println(area);

    }
}
