package com.chapter10.static_;

public class StaticMethod {
    public static void main(String[] args) {
        // 创建两个学生对象
        Stu tom = new Stu("Tom");
        Stu.payFee(100);

        Stu mary = new Stu("Mary");
        Stu.payFee(500);

        // 输出当前收到的总学费
        Stu.showFee();

        // 如果我们希望不创建实例，也可以调用某个方法（即当作工具来使用）
        // 这时，把方法做成静态方法时非常合适
        System.out.println("9开平法的结果是 = " + Math.sqrt(9));

        System.out.println(MyTools.calSum(4, 5));
    }

}
class Stu {
    private String name;
    // 定义一个静态变量，来累计学生学费
    private static double fee;

    public Stu(String name) {
        this.name = name;
    }

    // 1. 当方法使用了 static 修饰后，该方法就是静态方法
    // 2. 静态方法可以访问静态变量
    public static void payFee(double fee) {
        Stu.fee += fee; // 累计到静态变量
    }

    public static void showFee() {
        System.out.println("学费为：" + Stu.fee);
    }
}

// 开发自己的工具类时，可以将方法做成静态的，方便调用
class MyTools {
    // 求两个数的和
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }

    // 可以写出很多类似的静态方法
}
