package com.chapter11.homework;

/**
 * @author ooah
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal { // 抽象类
    public abstract void shout(); // 抽象方法没有方法体
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
