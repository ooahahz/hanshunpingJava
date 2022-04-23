package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {

        // 多态数组
        // 接口类型的数组体现多态
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();

        for (Usb usb : usbs) {
            usb.work(); // 动态绑定
            // 类型判断
            if (usb instanceof Phone_) { // instanceof 判断运行类型
                ((Phone_) usb).call(); // 向下转型
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}