package com.chapter11.homework;

/**
 * @author ooah
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {

        Car1 car1 = new Car1(60);
        car1.getAir().flow();
        Car1 car2 = new Car1(20);
        car2.getAir().flow();

    }
}

class Car1 {
    private double temp;

    public Car1(double temp) {
        this.temp = temp;
    }
    public Car1() {
    }

    public double getTemp() {
        return temp;
    }

    public class Air { // 成员内部类
        public void flow() {
            if (temp > 40) {
                System.out.println("温度大于40，吹冷气");
            } else if (temp < 0) {
                System.out.println("温度小于0，吹暖气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    // 写一个方法返回 Air() 对象

    /**
     * 这里开始没写出来 =.=
     * @return Air
     */
    public Air getAir() {
        return new Air();
    }
}
