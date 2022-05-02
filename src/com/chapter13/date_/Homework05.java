package com.chapter13.date_;

/**
 * @ClassName Homework05
 * Description
 * @Author haohao
 * @Date 2022/5/2 20:53
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // false 因为 Animal 没有改写其父类 Object 的 equals 方法
        System.out.println(a.name == b.name); // 同时指向常量池中同一个对象

        String s4 = new String("hspedu");
        String s5 = "hspedu";

        System.out.println(s1 == s4); // false
        System.out.println(s4 == s5); // false

        String t1 = "hello" + s1; // t1 指向堆 value，再指向池中，底层是创建 StringBuilder append 字符串
        String t2 = "hellohspedu"; // 池中已经有"hellohspedu"了，t2 直接指向它
        System.out.println(t1.intern() == t2); // true
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
