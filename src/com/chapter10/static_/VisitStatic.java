package com.chapter10.static_;

public class VisitStatic {
    public static void main(String[] args) {

        // 说明：类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
        A a = new A();
        // 通过 对象名.类变量名 也可以访问
        System.out.println("a.name = " + a.name);

    }

}


class A {
    // 类变量
    // 类变量的访问，必须遵守相关访问权限，private 只能在类内访问
        public static String name = "ooah";

        // 普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量/非静态字段
        public int num = 20;
        }
