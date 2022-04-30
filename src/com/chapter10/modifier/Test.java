package com.chapter10.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}

// 类的修饰符只能为 public 或 默认
class Tiger{}
