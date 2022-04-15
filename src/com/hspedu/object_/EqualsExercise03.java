package com.hspedu.object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0是否相等？" + (it == fl)); // true 基本数据类型，值相等
        char ch1 = 'A';
        char ch2 = 12; // 向下转型
        System.out.println("65和和'A'是否相等?" + (it == ch1)); // true
        System.out.println("12和ch2是否相等?" + (12 == ch2)); // true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2)); // false，因为两个对象的地址不同

        System.out.println("str1是否equals str2?" + (str1.equals(str2))); // True, 在 String 类中，已经对 Object 类中的 equals 方法进行了改写
//        System.out.println("hello" == new java.sql.Date()); // 编译器直接报错


    }
}
