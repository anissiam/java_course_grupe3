package com.advance.java3.exception;

import com.oop.java3.classes.fitstClass.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandel {
    static Person p;

    public static void main(String[] args) {
        // Home work
        try {
            int[] a = new int[5];
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            System.out.println(10 / x);
            a[5] = 30;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }


       /* try {
            System.out.println(p.name);

        }catch (NullPointerException e){
            System.out.println("Person is null");
        }*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        //
        int x;
        try {
             x = scanner.nextInt();
            System.out.println(10/x);
        }catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Can't / by 0");
            return;
        }catch (InputMismatchException e1){
            System.out.println(e1);
            System.out.println("Plz enter integer value");
        }finally {
            System.out.println("Finally");
        }

        System.out.println("Done");
*/
    }
}
