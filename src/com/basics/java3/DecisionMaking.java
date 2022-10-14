package com.basics.java3;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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


        System.out.println("Enter number");
        long num = scanner.nextLong();
        /*if(num>0){
            if(num%2==0){
                System.out.println("even");
            }else {
                System.out.println("Odd");
            }
        }else {
            System.out.println("not valid");
        }*/

        if(num<=0){
            System.out.println("not valid");
        }else {
            if(num%2==0){
                System.out.println("even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}
