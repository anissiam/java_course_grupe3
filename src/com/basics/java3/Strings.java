package com.basics.java3;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name = "Anis";
        String name1 = "Anis";
        String name2 = new String("Anis");


        //System.out.println(name.equals(name1));

       /* if (name.equals(name1)) {
            System.out.println("TRUE");
        }*/

        /*if(name.equals(name2)){
            System.out.println("TRUE");
        }*/
        /*if(name ==name2){
            System.out.println("TRUE");
        }*/


        String st = "This is java class ";
        System.out.println(st); // طباعة نص
        System.out.println(st.trim()); // .trim حذف المسافات من اول او اخر النص
        System.out.println(st.length()); // طباعة طول النص
        System.out.println(st.concat("HI")); //اضافة HI الى النص من خلال concat
        System.out.println(st + "HI"); //اضافة HI الى النص من خلال +
        String st1 = st.toUpperCase();
        System.out.println(st.toUpperCase()); // تحويل النص الى حروف كبيرة
        System.out.println(st.toLowerCase());// تحويل النص الى حروف صغيرة
        System.out.println(st.indexOf('a')); // اول موقع للحرف a
        System.out.println(st.indexOf("java")); // اول موقع لكلمة جافا
        System.out.println(st.lastIndexOf('a')); // احر موقع لحرف a
        System.out.println(st.substring(2)); // نص جزئي من النص الكلي يبدا من 2
        System.out.println(st.substring(2,8)); // نص جزئي من النص الكلي يبدا من 2 الى 8
        System.out.println(st.charAt(0));//ما هو الحرف الموجود في الموقع 0
        System.out.println(st.charAt(5));//ما هو الحرف الموجود في الموقع 5
        System.out.println(st.contains("java ")); //هل يحتوي النص على كلمة java
        System.out.println(st.contains("jaVa")); // هل يحتوي النص على كلمة jaVa
        System.out.println(st.replace("java", "C++")); // استبدال كلمة java الى c++ في النص كاملا
        System.out.println(st.replace("a", "b"));//استبدال كلمة a الى b في النص كاملا
        System.out.println(st.startsWith("anis")); // هل يبدأ النص بكلمة anis
        System.out.println(st.startsWith("java"));// هل يبدا النص بكلمة java
        System.out.println(st.startsWith("This"));// هل يبدا النص بكلمة This
        System.out.println(st.startsWith("T")); // هل يبدا النص بحرف T
        System.out.println(st.endsWith("java")); // هل ينتهي النص بكلمة java
        System.out.println(st.endsWith("class "));// هل ينتهي النص بكلمة class

    }
}
