package com.chapter12.exception_.homework;


/**
 * @author ooah
 * @version 1.0
 * B-->C-->D
 */
public class Homework03 {
    public static void func() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A"); // 抛出异常后，这条语句不会执行
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
