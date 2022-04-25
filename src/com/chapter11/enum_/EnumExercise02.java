package com.chapter11.enum_;

/**
 * @author ooah
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {

        Week[] weeks = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week week :weeks) {
            System.out.println(week.getName());
        }
    }
}

enum Week { // 隐式继承了 Enum，所以不能再继承其他类，但是可以实现接口

    // 定义 Week 枚举对象
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}