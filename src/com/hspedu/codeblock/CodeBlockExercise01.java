package com.hspedu.codeblock;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);
        System.out.println("total = " + Person.total);

    }
}

class Person {
    public static int total; // 静态变量
    static {
        total = 100;
        System.out.println("in static block"); // 静态代码块只加载一次
    }
}
