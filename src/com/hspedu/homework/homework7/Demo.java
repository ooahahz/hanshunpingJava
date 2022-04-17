package com.hspedu.homework.homework7;

public class Demo extends Test{
    String name = "Jack";
    Demo() {
        super(); // 这里不写也是默认调用父类的无参构造器
        System.out.println("Demo");
    }
    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test(); // 匿名对象
        new Demo("john").test(); // 匿名对象

    }
}
