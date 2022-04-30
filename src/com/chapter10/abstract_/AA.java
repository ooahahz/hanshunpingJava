package com.chapter10.abstract_;

public class AA extends Template {

    // 计算任务
    // 1 + ... + 10000

    @Override
    public void job() { // 实现了 Template 方法
        long num = 0;
        for (long i = 0; i < 10000000; i++) {
            num += i;
        }
    }

}
