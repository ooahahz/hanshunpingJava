package com.chapter10.poly_.detail_;

public class Cat extends Animal {
    public Cat() {

    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("η«επ");
    }

    public void catchMouse() { // Cat ηΉζζΉζ³
        System.out.println("η«ζθιΌ ");
    }
}
