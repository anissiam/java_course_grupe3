package com.oop.java3.classes.Interface.PC;

public class PC {
    private int ram;
    private String company;
    private int storage;
    private String CPU;
    private String GPU;
    private int power;

    public PC() {
    }

    public PC(int ram, String company, int storage, String CPU, String GPU, int power) {
        this.ram = ram;
        this.company = company;
        this.storage = storage;
        this.CPU = CPU;
        this.GPU = GPU;
        this.power = power;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram + "GB" +
                ", company='" + company + '\'' +
                ", storage=" + storage + "TB"+
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", power=" + power + "Watt"+
                '}';
    }
}
