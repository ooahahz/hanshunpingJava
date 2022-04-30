package com.chapter10.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); // 向上转型
        System.out.println(a.sum()); // 40 -> 30
        System.out.println(a.sum1()); // 30 -> 20
    }
}
