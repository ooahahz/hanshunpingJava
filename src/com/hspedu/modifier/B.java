package com.hspedu.modifier;

public class B {
    public void say() {
        A a = new A();

        // 在同一个包下，可以访问 public, protected, 或默认 ，不能访问 private
        System.out.println("n1 = " + a.n1 + " n2 = " + a.n2 + " n3 = " + a.n3);

        a.m1();
        a.m2();
        a.m3();

    }
}
