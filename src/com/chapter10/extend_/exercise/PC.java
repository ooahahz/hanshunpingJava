package com.chapter10.extend_.exercise;

public class PC extends Computer{
    private String brand;

    public PC() {

    }
    public PC(String brand) {
        this.brand = brand;
    }

    public PC(String CPU, int memory, int hardDisk, String brand) {
        super(CPU, memory, hardDisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息 = " );
        System.out.println(getDetails() + " brand = " + brand);
    }
}
