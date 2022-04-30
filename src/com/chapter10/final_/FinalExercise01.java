package com.chapter10.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.CalArea());
    }

}

class Circle {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14; // 也可以在构造器里面赋值
    }

//    {
//        PI = 3.14; // 也可以在代码块赋值
//    }

    public double CalArea() {

        System.out.print("半径为 " + radius + " 的圆的面积为：");
        return PI * this.radius * this.radius;
    }
}
