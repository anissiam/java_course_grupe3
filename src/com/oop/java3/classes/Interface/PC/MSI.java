package com.oop.java3.classes.Interface.PC;

public class MSI extends PC implements WaterCooler{

    public MSI(int ram, String company, int storage, String CPU, String GPU, int power) {
        super(ram, company, storage, CPU, GPU, power);
    }

    @Override
    public void tankSize() {
        System.out.println("200ML");
    }

    @Override
    public double tubesLength() {
        return 2.0;
    }

    @Override
    public void waterSize() {
        System.out.println("300ML");
    }


    @Override
    public String toString() {
        tankSize();
        System.out.println(tubesLength());
        waterSize();

        return super.toString();
    }
}
