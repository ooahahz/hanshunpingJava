package com.chapter10.homework.homework13;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person() {
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return this.getName() + "爱玩";
    }

    // 返回一个基本信息
    public String basicInfo() {
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " + sex;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age
                ;
    }
}
