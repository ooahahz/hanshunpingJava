package com.chapter10.debug_;

// debug 对象创建的过程，加深对调试的理解
public class DebugExercise {
    public static void main(String[] args) {
        // 创建对象的流程
        // (1) 加载 Person 类信息
        // (2) 初始化 2.1 默认初始化 2.2 显示初始化 2.3 构造器初始化
        // (3) 返回对象的地址
        Person jack = new Person("Jack", 20);
        System.out.println(jack);

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
