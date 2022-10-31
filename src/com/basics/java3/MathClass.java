package com.basics.java3;

public class MathClass {
    public static void main(String[] args) {

        System.out.println("PI:" + Math.PI); // ترجع قيمة PI = 3.14....
        System.out.println("abs:" + Math.abs(-10)); //القيمة المطلقة
        System.out.println("Ceil:" + Math.ceil(3.7)); // تقريب لاكبر قيمة للرقم العشري
        System.out.println("Ceil:" + Math.ceil(3.3));
        System.out.println("Floor:" + Math.floor(3.7)); //تقريب لاصغر قيمة للرقم العشري
        System.out.println("Max:" + Math.max(10,5)); // اكبر قيمة بين رقمين
        System.out.println("Max:" + Math.max(10.5,5.8));
        System.out.println("Min:" + Math.min(10.5,5.8)); // اصغر قيمة بين رقمين
        System.out.println("Min:" + Math.min(10,5));
        System.out.println("Sqrt:" + Math.sqrt(2));//الجذر التربيعي
        System.out.println("Pow:" + Math.pow(2,3)); // 2 مرفوعة للاس 3
        System.out.println("Round:" + Math.round(2.8)); // التقريب الطبيعي للاعداد العشرية
        System.out.println("Round:" + Math.round(2.4));
        System.out.println("Random:" + (Math.random())); // ارجاع قيمة بين 0.0 - 1.0
        System.out.println("Random:" + (Math.random())*10); //ارجاع قيمة بين 0.0 - 10.0
        System.out.println("Random:" +(int) ((Math.random())*10));// ارجاع قيمو بين 0 الى 10
    }
}
