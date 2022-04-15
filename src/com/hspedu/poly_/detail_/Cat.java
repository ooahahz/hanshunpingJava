package com.hspedu.poly_.detail_;

public class Cat extends Animal {
    public Cat() {

    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃🐟");
    }

    public void catchMouse() { // Cat 特有方法
        System.out.println("猫抓老鼠");
    }
}
