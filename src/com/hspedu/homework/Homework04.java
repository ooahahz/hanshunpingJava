package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager marry = new Manager("Marry", 300, 25, 1.2);
        marry.setBonus(1000);
        marry.income();
        NormalStaff jack = new NormalStaff("Jack", 120, 28, 1.0);
        jack.income();


    }
}
