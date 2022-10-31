package com.basics.java3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter number of name");
        int x = input.nextInt();
        String[] names = new String[x];
        for (int i=0; i<names.length ;i++){
            System.out.println("plz enter names");
            names[i] = input.next();
        }
        for (int i=0; i<names.length ;i++){
            System.out.println(names[i]);
        }

        /*Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Plz enter index " + i + " element " + (i + 1));
            numbers[i] = input.nextInt();
        }

        for(int i = 0 ; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }*/


        /*int[] numbers = {10, 5, 8, 10, 90, 2};
        int sum = 0;
        int max = 0;
        int min = numbers[0];
        for(int i = 0 ; i<numbers.length;i++){
            System.out.println("Numbers:"+ numbers[i]  + " " );
            sum += numbers[i];
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("ava : " + sum/numbers.length);
        System.out.println("Max :"+ max);
        System.out.println("Min :"+ min);
        System.out.println("Sum : " + sum);*/


        /*String[] names = {"ali" , "sami" , "hassan" , "soso"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[0] +" "+ names[1]);
        names[2] = "mohammed";
        System.out.println(names[2]);

        for(int i = 0 ; i<names.length;i++){
            System.out.println(names[i]);
        }*/
        /*for(int i = 0 ; i<=2;i++){
            System.out.println(names[i]);
        }*/


        /*for (String name:names) {
            System.out.println(name);
        }*/


        /*int[] numbers = new int[8];
        System.out.println(numbers[0]); // اطبع العصنر في الموقع صفر
        System.out.println(numbers); // طباعة عنوان المصفوفة داخل ال RAM
        //System.out.println(numbers[-1]); // Exception out of bounds for length
        //System.out.println(numbers[8]); //// Exception out of bounds for length
        System.out.println(numbers.length);
        numbers[0] = 10;
        System.out.println(numbers[0]);
        int num = numbers[0]; // 10
        System.out.println(num);

        numbers[1] = num; // 10
        System.out.println(numbers[1]);
        numbers[1] = numbers[0] +5; //15
        System.out.println(numbers[1]); */


    }
}
