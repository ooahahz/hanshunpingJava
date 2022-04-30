package com.chapter10.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {

        Outer10 outer10 = new Outer10();
        outer10.m1();

        // 外部其他类使用静态内部类
        // 方式 1
        // 因为静态内部类是可以类名直接访问（前提是满足访问权限）
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        // 方式 2
        // 编写一个方法可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("==============");
        inner101.say();

        System.out.println("==============");
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();
    }
}


class Outer10 {
    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {
    }

    // Inner10 就是一个静态内部类
    // 1. 放在外部类的成员位置
    // 2. 使用 static 修饰
    // 3. 可以访问外部类的所有静态成员，但不能访问非静态成员
    // 4. 可以添加任意访问修饰符，它的地位就是一个成员
    // 5. 作用域：同其他的成员，为整个类体
    static class Inner10 {
        private static String name = "Jack";

        public void say() {
//            System.out.println(n1);
            // 就近原则
            System.out.println(Outer10.name + " " + name);
            cry();
        }

    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}
