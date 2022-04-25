package com.chapter11.homework;

/**
 * @author ooah
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}


class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());
    }
}
