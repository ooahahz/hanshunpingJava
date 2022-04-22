package com.hspedu.final_;

public class FinalDetail02 {
    public static void main(String[] args) {

        System.out.println(BBB.num);

        // 包装类，String 是final类，不能被继承
    }
}

final class AAA {

//    public final void cry() { // 此处有点画蛇添足了，既然 AAA 类是 final 类了，如果有另外一个类继承了该类，则也不能Override cry() 方法
//    }
}

// final static 往往搭配使用，效率更高，不会导致类加载
class BBB {
    public final static int num = 10000;

    static {
        System.out.println("BBB 静态代码块被执行");
    }
}