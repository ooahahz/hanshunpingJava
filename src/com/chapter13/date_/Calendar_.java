package com.chapter13.date_;

import java.util.Calendar;

/**
 * @ClassName Calendar_
 * Description
 * @Author haohao
 * @Date 2022/5/2 10:14
 */
public class Calendar_ {
    public static void main(String[] args) {
        // 1. Calendar 是一个抽象类，并且构造器是 protected
        // 2. 可以通过 getInstance 来获取实例
        // 3. 提供大量的方法和字段
        // 4. Calendar 没有专门的格式化方法，需要程序员自己组合
        // 5. 如果我们需要按照24小时进制，Calendar.HOUR ====> Calendar.HOUR_OF_DAY
        Calendar c = Calendar.getInstance(); // 创建日历类对象
        System.out.println("c = " + c);
        // 获取日历对象的某个日历字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1)); // 这里为什么要 + 1呢？因为 Calendar 返回月的时候，从 0 开始编号
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));

        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日"  + c.get(Calendar.HOUR_OF_DAY) + "时" + c.get(Calendar.MINUTE)+ "分"  + c.get(Calendar.SECOND)+ "秒");

    }
}
