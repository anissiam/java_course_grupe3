package com.basics.java3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        String hand[][] = {{"s1", "s2" , "s3"},
                {"s1", "s2" , "s3"},
                {"s1", "s2" , "s3"},
                {"s1", "s2" , "s3"},
                {"s1", "s2" , "s3"}};

        for(int i = 0 ; i<hand.length;i++){
            System.out.print("Finger " + (i+1) + "");
            for(int j =0 ; j<hand[i].length;j++){
                System.out.print(hand[i][j]+ " ");
            }
            System.out.println();
        }
        //int[][] tt = {{10, 20, 30}, {10, 80, 90}};

        /*String month[][] = {{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
        ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
        ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}
        ,{"sat", "Sun", "mon", "tus", "wen", "thr", "Fri"}};

        for(int i = 0 ; i<month.length;i++){
            System.out.print("Week " + (i+1) + " ");
            for(int j = 0 ; j<month[i].length ; j++){
                System.out.print(" " + month[i][j] + " ");
            }
            System.out.println();
        }*/


        /* int numbers[][] = new int[3][4];
        System.out.println(numbers.length); // عدد الصفوف
        System.out.println(numbers[0].length); //طول الصف الاول
        System.out.println(numbers[0][0]);

    //    numbers[0][0] = 10;
        System.out.println(numbers[0][0]);
        //System.out.println(numbers[3][5]);
       // System.out.println(numbers[5][2]);

       for(int i = 0 ; i<numbers.length; i++){ // تعبر عن عدد الصفوف
            System.out.print("ROWS : [" + i+ "] ");
            for(int j= 0 ; j<numbers[i].length ; j++){ // تعبر عن الاعمدة
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/

        /*
        SET Sum to 0
FOR each element in the array
  ADD element to Sum
ENDFOR
PRINT Sum
         */
        /*int sum = 0;
        int[] numbers = {10, 50, 10, 10};
        for (int element:numbers){
            sum += element;
        }
        System.out.println(sum);
*/

        /*
        Tasks. Arrays
1. كتابة برنامج لادخال عناصر داخل array من نوع int عن طريق scanner حجمها 10 .
- طباعة مضروب الn  اي (ni) للمصفوفة
- طباعة ال sum للمصفوفة .
-طباعة الavarage للمصفوفة
- طباعة اكثر عنصر واصغر عنصر في المصفوفة.
- ابحث مثلا عن قيمة ١٠ داخل المصفوفة ويطبع اذا وجد العنصر ام لا .
الحل داخل for loop واحدة لجميع الافرع وليس اكثر من for
         */

        /*Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int ni = 1;
        int sum = 0;
        int max = 0, min = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Plz enter num");
            numbers[i] = input.nextInt();
            if (i == 0) {
                min = numbers[i];
                max = numbers[i];
            }
            ni *= numbers[i];
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] == 10) {
                System.out.println("Found");
            }
        }
        System.out.println("ni:" + ni);
        System.out.println("Sum:" + sum);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("AVA:" + sum / numbers.length);*/


        /*Scanner input = new Scanner(System.in);
        System.out.println("Plz enter number of name");
        int x = input.nextInt();
        String[] names = new String[x];
        for (int i=0; i<names.length ;i++){
            System.out.println("plz enter names");
            names[i] = input.next();
        }
        for (int i=0; i<names.length ;i++){
            System.out.println(names[i]);
        }*/

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
