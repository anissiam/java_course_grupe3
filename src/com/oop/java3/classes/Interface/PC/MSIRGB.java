package com.oop.java3.classes.Interface.PC;

public class MSIRGB extends PC implements WaterRGB{
    public MSIRGB(int ram, String company, int storage, String CPU, String GPU, int power) {
        super(ram, company, storage, CPU, GPU, power);
    }

    @Override
    public void tankSize() {
        System.out.println("300ML");
    }

    @Override
    public double tubesLength() {
        return 2.5;
    }

    @Override
    public void waterSize() {
        System.out.println("400ML");
    }



    @Override
    public void RGB() {
        System.out.println("BLUE + RED");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
