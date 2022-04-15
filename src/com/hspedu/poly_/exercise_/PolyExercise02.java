package com.hspedu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); // 访问属性看编译类型
        s.display(); // 按照运行类型往上找，就近原则
        Base b = s; // 向上转型
        System.out.println(b == s); // b, s 指向同一个地址
        System.out.println(b.count); // b 的编译类型是 Base
        b.display(); // 看 b 的运行类型
    }
}
