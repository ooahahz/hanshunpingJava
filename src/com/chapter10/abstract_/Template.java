package com.chapter10.abstract_;

abstract public class Template { // 模板设计模式

    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job(); // 动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
}
