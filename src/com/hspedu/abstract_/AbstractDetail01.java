package com.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {

        // 抽象类不能被实例化
//        new A();

    }
}

abstract class A {

// 抽象类不一定包含抽象方法，还可以有实现的方法
    public void hi() {
        System.out.println("hi");
    }
}

// 一旦类包含了抽象方法，则这个类必须声明为抽象类
abstract class B {
    public abstract void hi();
}

class C {
//    public  abstract int n1 = 1; abstract 不能修饰属性
}
