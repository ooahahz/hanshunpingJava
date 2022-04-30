package com.chapter10.extend_.exercise;

public class NotePad extends Computer {
    String color;

    public NotePad() {

    }

    public NotePad(String CPU, int memory, int hardDisk, String color) {
        super(CPU, memory, hardDisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad 信息为：");
        System.out.println(getDetails() + " color = " + color);
    }
}
