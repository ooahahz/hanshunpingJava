package com.hspedu.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();

        computer.work(phone); // 把手机接入到计算机
        computer.work(camera); // 把相机接入到计算机

    }
}
