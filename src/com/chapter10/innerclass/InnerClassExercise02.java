package com.chapter10.innerclass;


public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        // 1. 传递的是实现了 Bell 接口的匿名内部类
        // 2. 重写了 ring
        cellPhone.alarmClock(new Bell() { // 匿名内部类
            @Override
            public void ring() {
                System.out.println("懒猪起床啦~");
            }
        });

        cellPhone.alarmClock(new Bell() { // 匿名内部类
            @Override
            public void ring() {
                System.out.println("小伙伴们上课啦");
            }
        });

    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) { // 形参是 Bell 接口类型
        bell.ring(); // 动态绑定
    }
}