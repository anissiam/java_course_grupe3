package com.oop.java3.classes.fitstClass;

import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {

        Person[] people = new Person[2];
        Scanner scanner = new Scanner(System.in);

        for(int  i = 0 ; i < people.length; i++){
            people[i] = new Person();
            System.out.println("Plz enter name");
            String name = scanner.nextLine();
            people[i].name = name;
        }
    }
}
