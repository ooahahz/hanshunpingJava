package com.chapter13.date_;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName LocalDate_
 * Description
 * @Author haohao
 * @Date 2022/5/2 11:37
 */
public class LocalDate_ {
    public static void main(String[] args) {
        // 第三代日期
        // 1. 使用 now() 返回当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now(); // LocalDate().now()  LocalTime().now()
        System.out.println(ldt);

        // 2. 使用 DateTimeFormatter 对象来进行格式化
        //    创建 DateTimeFormatter 对象
        DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");

        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

    }
}
