package com.chapter10.object_;

public class Equals01 {
    public static void main(String[] args) {

        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c); // 判断地址是否一样
        System.out.println(b == c);

        B bObj = a;
        System.out.println(bObj == c);

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2); // 基本数据类型，判断值是否相等

        // equals 方法，源码怎么查看?
        "Hello".equals("abc");

        // 看看 Object 类的 equals 是
        /*
        // 从源码可以看到 Integer 也重写了 Object 的 equals 方法
        // 变成了判断两个值是否相等
        public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
         */
        System.out.println("===============");

        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);
        System.out.println(integer1 == integer2); // false == 判断引用类型的地址是否相等
        System.out.println(integer1.equals(integer2)); // true 判断值


        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
    }
}

class A extends B {
}

class B {
}

