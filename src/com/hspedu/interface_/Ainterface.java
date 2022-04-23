package com.hspedu.interface_;

public interface Ainterface {
    // 写属性
    public int n1 = 10;

    // 写方法
    // 在接口中，抽象方法可以胜利 abstract 关键字
    void hi();

    // 在jdk8后，可以有默认实现方法，需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok...");
    }

    // 在jdk8后，可以有静态方法
    public static void cry() {
        System.out.println("cry...");
    }
}

