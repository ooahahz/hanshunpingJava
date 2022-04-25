//package com.chapter11.enum_;
//
///**
// * @author ooah
// * @version 1.0
// */
//public class Enumeration01 {
//    public static void main(String[] args) {
//
//        Season spring = new Season("春天", "温暖");
//        Season winter = new Season("冬天", "寒冷");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "凉爽");
//        // 对于季节而言，他的对象是固定的 4 个，不会有更多
//        // 不能体现季节是固定的四个对象
//        // 因此，这样的设计不好 =====> 枚举类
//    }
//}
//
//class Season {
//    private String name;
//    private String desc; // 描述
//
//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}
