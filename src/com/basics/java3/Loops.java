package com.basics.java3;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();

        int count = 0;
        while (count < year.length()) {
            System.out.println(year.charAt(count));

            count++;
        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        int count = 0;
        int max = 0;
        int min = x;
        while (count < 4) {
            count++;
            if (x > max) {
                max = x;
            }
            if(x<min){
                min = x;
            }
            System.out.println("Enter new number:");
            x = scanner.nextInt();
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);*/


        /*int num = 0;
        while (num < 100) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }*/

        /*while (num<100){
            num+=2;
            System.out.println(num);
        }*/
        /*int num = scanner.nextInt();
        int v = 1;
        int sum = 0;
        while (num>=1){
            v *= num;
            sum += num;
            num--;
        }
        System.out.println("ni = " + v);
        System.out.println("sum = " + sum);*/

       /* int num = scanner.nextInt();
        int v = 1;
        while (num!=1){
            v *= num;
            num--;
        }
        System.out.println("ni = " + v);*/

        /*int sum = 0;
        while (num>=100){
            System.out.println("num = " + num);
            sum += num;

            System.out.println("Enter new number");
            num = scanner.nextInt();
        }
        System.out.println(sum);
        System.out.println("num is less than 100");*/


       /* int i = 1;
        int sum = 0;
        while (i<=5){ //5
            sum = sum + i; //15
            i++; //6
        }
        System.out.println("Sum = " + sum);*/


        /*int i = 1;
        while (i<=3){
            i++;
            System.out.println(i);
        }*/

        /*while (i<=5){
            System.out.println("Hassan");
            i++;
        }*/

        /*int i = 0;
        while (i<5){
            System.out.println("Hello");
            i++;
        }*/
    }
}
