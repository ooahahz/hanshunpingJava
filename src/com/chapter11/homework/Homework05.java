package com.chapter11.homework;


/**
 * @author ooah
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {

        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "Bob";

    public void f1() {
        class B { // 局部内部类
            private final String NAME = "Jack";

            public void show() {
                System.out.println(NAME);
                System.out.println(A.this.name);
            }
        }

        B b = new B();
        b.show();
    }

}
