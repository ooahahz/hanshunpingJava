package com.chapter10.interface_;


// Phone 类需要实现 UsbInterface 接口声明的方法
public class Phone implements UsbInterface{ // Phone 实现 UsbInterface 接口


    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
