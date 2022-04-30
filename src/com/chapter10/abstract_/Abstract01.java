package com.chapter10.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 这个方法没有什么意义
    // 即父类方法不确定性的问题
    // =====> 将该方法设计成抽象(abstract) 方法
    // =====> 所谓抽象方法就是没有实现的方法
    // =====> 没有实现，指的是没有方法体
    // =====> 当一个类中存在抽象方法时，需要将该类声明为 abstract 类
    // =====> 一般来说，抽象类会被继承，其方法由其子类来实现
    public abstract void eat();
}

