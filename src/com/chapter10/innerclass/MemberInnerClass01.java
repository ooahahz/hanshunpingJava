package com.chapter10.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {

        Outer08 outer08 = new Outer08();
        outer08.t1();

        // 外部其他类使用成员内部类的三种方式
        // 第一种方法：
        // outer08.new Inner08() 相当于把 new Inner08() 当作是 outer08 成员
        // 这是一个语法，不要太纠结
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        // 第二种方法：在外部类中编写一个方法，可以返回 Inner08 对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();


    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    private void sahib() {
        System.out.println("sahib()...");
    }

    // 成员内部类是定义在外部类的成员位置上
    class Inner08 { // 成员内部类
        private double sal = 99.9;

        public void say() {
            System.out.println("Outer01 的 n1 = " + n1 + " outer01 的 name = " + name);
            sahib();
        }
    }

    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    // 写一个方法
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}