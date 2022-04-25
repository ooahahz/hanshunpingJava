package com.chapter11.enum_;

/**
 * @author ooah
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);

    }
}

// 演示关键字枚举
enum Season2 {

//    public final static Season2 SPRING = new Season2("春天", "温暖");
//    public final static Season2 WINTER = new Season2("冬天", "寒冷");
//    public final static Season2 SUMMER = new Season2("夏天", "炎热");
//    public final static Season2 AUTUMN = new Season2("秋天", "凉爽");

    // 如果使用了 enum 来实现枚举类
    // 1. 使用关键字 enum 替代 class
    // 2. 如果有多个常量（对象），使用,分隔即可
    // 3. 如果使用 enum 来实现枚举，要求将定义的常量对象写在最前面
    // 4. 如果我们使用的是无参构造器创建的常量对象，则可以省略()
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热"), /*What*/;

    private String name;
    private String desc; // 描述

    Season2() {

    }

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

