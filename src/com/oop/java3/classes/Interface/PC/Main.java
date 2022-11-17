package com.oop.java3.classes.Interface.PC;

public class Main {
    public static void main(String[] args) {

       /* PC pcObject = new PC(128,"MSI",2,"Core i9"  , "4090 RTX", 1000);
        System.out.println(pcObject.toString());*/

        MSI msi = new MSI(128,"MSI",2,"Core i9"  , "4090 RTX", 1000);
        System.out.println(msi.toString());
        /*msi.tankSize();
        msi.waterSize();
        System.out.println(msi.tubesLength());*/

        MSIRGB msirgb = new MSIRGB(64,"MSI RGB",1,"Core i7"  , "3090 TI RTX", 1000);
        System.out.println(msirgb.toString());
        msirgb.tankSize();
        msirgb.RGB();
        System.out.println(msirgb.tubesLength());
        msirgb.waterSize();

    }
}
