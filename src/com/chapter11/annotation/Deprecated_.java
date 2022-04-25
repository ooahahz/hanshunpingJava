package com.chapter11.annotation;

/**
 * @author ooah
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
        a.hi();

    }
}

// Deprecated 修饰某个元素，表示该元素已经过时
// 即不推荐使用，但是仍然可以使用
// @Deprecated 可以做版本过渡使用
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {

    }
}
