package com.hspedu.static_;

import sun.security.rsa.RSAUtil;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();

        // 非静态方法不能通过类名调用
        // 需要先创造对象，再调用
        D d = new D();
        d.say();
        D.hello();
    }
}

class D {

    private int n1 = 100;
    public static int n2 =200;

    public void say() {
        // 非静态方法
        hi();
    }

    public static void hi() { // 静态方法，类方法
        // 静态方法
        System.out.println("hello");

    }

    // 静态方法只能访问静态变量或静态方法
    // 小结：静态方法只能访问静态成员
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
    }

    // 普通成员方法，既可以访问 非静态成员（属性、方法），也可以访问静态成员
    // 小结：非静态方法可以访问 静态成员和非静态成员
    public void ok() {
        System.out.println(n1); // n1 为非静态属性
        System.out.println(n2); // n2 为静态属性
        say(); // 非静态方法
        hello(); // 静态方法
    }
}

