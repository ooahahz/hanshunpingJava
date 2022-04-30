package com.chapter10.innerclass;


public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();

        System.out.println("main 方法中 outer05 的hashcode" + outer05);
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        // 创建一个基于类的匿名内部类
        Person p = new Person() {
            private int n1 = 122;

            @Override
            public void hi() {
                // 可以访问外部类的所有成员，包括私有的
                // n1 遵循就近原则，如果想要访问外部类的属性，可以使用(Outer05.this.属性)
                System.out.println("匿名内部类重写了hi() " + n1 + " " + Outer05.this.n1);
                // Outer05.this 就是调用 f1() 的对象
                System.out.println("Outer05.this hashcode = " + Outer05.this);
            }
        };
        p.hi(); // 动态绑定 ，运行类型是 Outer05$1


        // 也可以直接调用，匿名内部类本身也是返回对象
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi 方法。。。");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("Jack");

    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }

}
// 抽象类、接口...
