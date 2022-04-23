package com.hspedu.interface_;

public class Computer {

    // 1. UsbInterface usbinterface 形参是接口类型 UsbInterface
    // 2. 看到了接收了实现了 UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbinterface) {
        usbinterface.start();
        usbinterface.stop();

    }
}
