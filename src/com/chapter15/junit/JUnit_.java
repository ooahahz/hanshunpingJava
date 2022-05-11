package com.chapter15.junit;

import org.junit.jupiter.api.Test;

/**
 * @ClassName JUnit_
 * @Author Oliver
 * @Date 2022/5/11 21:33
 * Description      TODO
 * @see
 */
public class JUnit_ {
    public static void main(String[] args) {
        // 传统方法
//        new JUnit_().m1();
//        new JUnit_().m2();

    }

    @Test
    public void m1() {
        System.out.println("m1 方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2 方法被调用");
    }
}
