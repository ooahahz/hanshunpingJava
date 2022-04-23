package com.hspedu.interface_;

public class Interface02 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();

    }
}

// 如果一个类 implements 实现接口
// 需要该接口的所有抽象方法全部都实现
class A implements Ainterface {
    @Override
    public void hi() {
        System.out.println("hi...");
    }
}

