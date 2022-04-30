package com.chapter10.homework.homework10;


public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Jack", 18, "牙科医生", '男', 20000);
        Doctor doctor2 = new Doctor("Jack", 20, "牙科医生", '男', 20000);
        System.out.println(doctor1.equals(doctor2));

    }
}
