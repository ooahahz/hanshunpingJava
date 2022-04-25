package com.chapter11.enum_;

/**
 * @author ooah
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        // 输出枚举对象的名称
        System.out.println(autumn.name());
        // ordinal 输出的是该枚举对象的次序/编号，从 0 开始编号
        System.out.println(autumn.ordinal());
        // values 返回 Season2[] 数组
        // 含有定义的所有枚举对象
        System.out.println("======遍历取出枚举对象======");
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
        }

        System.out.println("===============================");
        // valueof：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        // 1. 根据你输入的 "AUTUMN" 到 Season2 的枚举对象去查找
        // 2. 如果找到了，则返回，没有找到就报错
        Season2 spring1 = Season2.valueOf("SPRING");
        System.out.println(spring1);

        // compareTo: 比较连个枚举常量编号，编号相减   2 - 3 = -1
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

    }
}
