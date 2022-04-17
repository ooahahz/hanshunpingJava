package com.hspedu.homework;

public class Professor extends Teacher{
    // 特有的属性可以自己增加
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息：");
        super.introduce();
    }
}
