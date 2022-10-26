package com.basics.java3;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Plz enter num :" + (i+1));
            int x = input.nextInt();
            if(i==0){
                min = x;
            }
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);





        /*Scanner input = new Scanner(System.in);

        String ss = input.nextLine();


        for (int i = 0; i < ss.length(); i++) {
            if(ss.charAt(0)=='a'){
                break;
            }
            System.out.println(ss.charAt(i));
        }*/
        /*for(int i = 1 ; i<=5 ;i++ ){
            if(i==2){
                break; // توقف
                //return;
            }
            System.out.println(i);
        }*/

        /*for(int i = 1 ; i<=5 ;i++ ){
            if(i==2){
                continue; // تجاهل
            }
            System.out.println(i);
        }*/
        /*String ss = "java";
        for(int i = 0 ; i<ss.length() ; i++){
            System.out.println(ss.charAt(i));
            *//*if(ss.charAt(0)=='j'){
                System.out.println("Yes");
            }*//*
        }*/

        /*for(int i = 0;i<5;i++){
            for(int j = 0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Plz enter rows");
        int row = input.nextInt();

        System.out.println("Plz enter coloms");
        int colom = input.nextInt();

        for(int i = 0;i<row;i++){
            for(int j = 0 ; j<colom;j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //For
        /*for(int i = 0;i<5;i++){
            System.out.println("Hello");
        }*/

        /*int sum = 0;
        for(int i = 0; i<5;i++){
            sum += i;
        }
        System.out.println("Sum " + sum);*/

        /*int i = 0;
        int sum = 0;
        while (i<5){
            //sum = sum + i;
            sum += i;
            i++;
        }
        System.out.println("Sum:" + sum);
*/


       /* int i = 5;
        while (i<5){
            System.out.println("Hello");
        }
        System.out.println(i);*/


        /////////////////////////////////////////////////////////////
       /* int i = 5;
        do {
            System.out.println(i);
        } while (i!=5);
*/
        /*int i = 5;
        while (i!=5){
            System.out.println(i);
        }*/

        /*Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int max = 0;
        int min = 0;

        while (cont<5){
            System.out.println("Enter number ");
            int x = scanner.nextInt();
            if(cont==0){
                min = x;
                max = x;
            }
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
            cont++;
        }
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);*/

       /* Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();

        int count = 0;
        while (count < year.length()) {
            System.out.println(year.charAt(count));

            count++;
        }
*/
        // Scanner scanner = new Scanner(System.in);

        /*int count = 0;
        int max = 0;
        int min = 0;
        while (count < 5) {
            System.out.println("Enter number:");
            int x = scanner.nextInt();
            if(count==0){
                min = x;
            }

            count++;
            if (x > max) {
                max = x;
            }
            if(x<min){
                min = x;
            }
            *//*System.out.println("Enter new number:");
            x = scanner.nextInt();*//*
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
