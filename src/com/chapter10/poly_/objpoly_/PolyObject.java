package com.chapter10.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        // 体验对象多态特点

//        animal 编译类型就是 Animal, 运行类型就是 Dog
        Animal animal = new Dog();
        animal.cry(); // 因为运行时，这时就执行到该行时，animal 的运行类型是 Dog，所以 cry 就是 dog 的 cry

        // animal 编译类型 Animal, 运行类型是 Cat
        animal = new Cat();
        animal.cry();

        animal.getInfo();
    }
}
