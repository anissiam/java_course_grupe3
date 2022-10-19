package com.basics.java3;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        int y = scanner.nextInt();
        if(y!=0){
            System.out.println(x / y);
        }else {
            System.out.println("Con't / zero");
        }



        /*String text = "https://www.google.com/visonplus/image/1111.png";
        if(!text.contains("image")){
            System.out.println("VIDEO");
        }else {
            System.out.println("IMAGE");
        }*/


        /*String name = "";
        if(!name.isEmpty()){
            System.out.println("Empty");
        }

        if(name.length()!=0){
            System.out.println("Empty");
        }*/

        /*System.out.println("Plz enter name:");
        String ss = scanner.nextLine();

        if(ss.equals("Mohamed") || ss.equals("Mohammed")){
            System.out.println("Correct");
        }*/


       /* System.out.println("Plz enter num:");
        int num = scanner.nextInt();
            //10 T  and T = T
            //7  T  and F = F
            //-5 F

        if(num<0){
            System.out.println("LESS THAN 0");
            return;
        }

        if(num>0 && num%2==0){
            System.out.println("grater than 0 AND EVEN");
        }else if(num>0 && num%2!=0) {
            System.out.println("grater than 0 AND ODD");
        }*/


        /*if(num>0) {
            if(num%2==0){
                System.out.println("grater than 0 AND EVEN");
            }else {
                System.out.println("less than 0 AND ODD");
            }
        }*/

        /*System.out.println("Plz enter mark:");
        int mark = scanner.nextInt();
        if(mark>100){
            System.out.println("UP 100");
            return;
        }

        if(mark<=50){
            System.out.println("Failed");
            return;
        }

         if(mark>=90){
            System.out.println("A");
            if(mark>99){
                System.out.println("*");
            }
        }else if(mark>=80){
            System.out.println("B");
        }else if(mark>=70){
            System.out.println("C");
        }else if(mark>=60){
            System.out.println("D");
        }else {
            System.out.println("LOSSSER");
        }*/


        /*System.out.println("Plz enter Email or URL");
        String ss = scanner.nextLine();
        if(ss.contains("@")){
            System.out.println("EMAIL");
        }else if(ss.contains("https://")){
            System.out.println("URL");
        }else {
            System.out.println("Not valid");
        }*/




        /*String name = scanner.nextLine();
            // T
        if(name.equals("anis")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }*/

        /*System.out.println("Enter your mark");
        int mark = scanner.nextByte();
        if(mark>=50){
            System.out.println("PASS");
        }else {
            System.out.println("Failed");
        }*/
        /*System.out.println("Enter number");
        long num = scanner.nextLong();
        if(num%2==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }*/


        /*System.out.println("Enter number");
        long num = scanner.nextLong();*/
        /*if(num>0){
            if(num%2==0){
                System.out.println("even");
            }else {
                System.out.println("Odd");
            }
        }else {
            System.out.println("not valid");
        }*/

       /* if(num<=0){
            System.out.println("not valid");
        }else {
            if(num%2==0){
                System.out.println("even");
            }else {
                System.out.println("Odd");
            }
        }*/
        /*Scanner scanner1 = new Scanner(System.in);
        String ss = scanner1.nextLine();
        System.out.println(ss.charAt(0));
        System.out.println(ss.charAt(1));
        System.out.println(ss.charAt(2));
        System.out.println(ss.charAt(3));*/

        /*String lin1 = scanner.nextLine();
        System.out.println(lin1.length());
        String lin2 = scanner.nextLine();
        System.out.println(lin2.length());*/

/*
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();
        int no4 = scanner.nextInt();

        //int sum = (no1 + no2 + no3 + no4) / 4;
        System.out.println((no1 + no2 + no3 + no4) / 4);*/

        /*System.out.println("Plz enter Email or URL");
        String ss = scanner.nextLine();
        if(ss.contains("@")){
            System.out.println("EMAIL");
        }else {
            System.out.println("URL");
        }*/

        /*int x = 3;
        if (x > 0) {
            System.out.println("x is greater than 0");
        }else {
            System.out.println ("x is less than or equal 0 ");
        }*/




    }
}
