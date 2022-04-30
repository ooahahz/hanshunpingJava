package com.chapter10.homework;

/**
 * 说出 == 和 equals 的区别简答
 *  == 比较运算符 可以比较两个基本数据类型的值是否相等，对于引用数据类型给，还可以比较两个对象是否为同一个对象，即对象的地址是否相等
 *  equals 方法是 Object 类中的方法(Java 类都可以使用)，不可以比较基本数据类型，可以比较两个对象的地址是否相同
 *  对于 Object 类的子类，往往需要改写 equals 方法，判断两对象的属性是否相等
 *  比如 String Integer 都重写了 Object 的 equals 方法
 */
public class HomeWork12 {
    public static void main(String[] args) {

    }
}
