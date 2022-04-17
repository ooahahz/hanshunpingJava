package com.hspedu.homework.homework11;

public class HomeWork11 {
    public static void main(String[] args) {

        // 向上转型
        Person p = new Student(); // 将父类的引用指向子类的对象  此时编译类型是 Person，运行类型是 Student
        // 编译类型是 Person ，所以能调用的方法从编译类型中去找
        p.run(); // Student中的 run
        p.eat(); // 子类中没有 eat 方法，于是调用父类中的 eat 方法


        System.out.println("===================");
        // 向下转型：把指向子类对象的父类引用，转成指向子类对象的子类引用
        Student s = (Student)p;
        s.eat(); // 子类中没有 eat 方法，只能取父类中去找
        s.run();
        s.study();  // 这样就能调用子类的方法了

    }
}
