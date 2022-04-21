package com.hspedu.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
//        getVal01() A02 的一个静态代码块.. getVal03 B02 的一个静态代码块..
//        A02的第一个普通代码块.. getVal02 A02 的构造器
//        getVal04 B02 的第一个普通代码块..  B02 的构造器
    }
}

class A02 { // 父类
    private static int n1 = getVal01();
    static {
        System.out.println("A02 的一个静态代码块.."); // (2)
    }

    {
        System.out.println("A02的第一个普通代码块.."); // (5)
    }
    public int n3 = getVal02();

    public static int getVal01() {
        System.out.println("getVal01"); //(1)
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02"); // (6)
        return 10;
    }

    public A02() {
        // 隐藏了 super()
        // 普通代码块，属性初始化
        System.out.println("A02 的构造器"); // (7)
    }
}
class B02 extends A02 {
    private static int n3 = getVal03();

    static {
        System.out.println("B02 的一个静态代码块.."); // (4)
    }
    public int n5 = getVal04();

    {
        System.out.println("B02 的第一个普通代码块.."); // (9)
    }

    public static int getVal03() {
        System.out.println("getVal03"); // (3)
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04"); // (8)
        return 10;
    }

    public B02() {
        // 隐藏了 super()
        // 普通构造器
        System.out.println("B02 的构造器"); // (10)
    }
}

class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1() {

    }

    private static void m2() {

    }

    static {
        // 静态代码块只能调用静态成员
//            System.out.println(n1)  错误;
        System.out.println(n2); // n2 是静态成员，静态代码块可以调用
//            m1(); // m1()是非静态方法
        m2();
    }

    {
        // 可以调用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}