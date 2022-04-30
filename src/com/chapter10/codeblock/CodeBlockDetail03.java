package com.chapter10.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB(); // (0) AAA 的普通代码块 (1) AAA() 构造器被调用 (2) BBB 的普通代码块 (3) BBB() 构造器被调用

    }
}

class AAA {

    {
        System.out.println("AAA 的普通代码块");
    }


    public AAA() {
        // (1) super()
        // (2) 调用本类的普通代码块
        System.out.println("AAA() 构造器被调用");
    }

}

class BBB extends AAA {

    {
        System.out.println("BBB 的普通代码块");
    }

    public BBB() {
        // (1) super()
        // (2) 调用本类的普通代码块
        System.out.println("BBB() 构造器被调用");
    }

}
