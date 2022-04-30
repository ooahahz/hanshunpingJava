package com.chapter10.codeblock;

/**
 * 创建一个对象时，在一个类调用的顺序是：（<font size = 5 color = yellow>重点，难点</font>）
 * 调用静态代码块和静态属性初始化（<font color = red>注意</font>：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，按照他们的定义的顺序调用
 * 调用普通代码块和普通属性初始化（<font color = red>注意</font>：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按照定义顺序调用
 * 调用构造方法
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
        // (1) getN1 被调用
        // (2) A 静态代码块01

    }
}

class A {

    private int n2 = getN2(); // 非静态属性初始化
    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块01");
    }

    { // 普通代码块
        System.out.println("A 普通代码块01");
    }

    public static int getN1() {
        System.out.println("getN1 被调用");
        return 100;
    }

    public int getN2() { // 普通方法，非静态方法
        System.out.println("getN2 被调用");
        return 200;
    }

    // 无参构造器
    public A() {
        System.out.println("A() 构造器被调用");
    }
}
