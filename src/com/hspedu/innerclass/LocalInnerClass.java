package com.hspedu.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {

        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() { // 私有方法
        System.out.println("Outer02 m2()");
    }

    public void m1() { // 方法
        // (1)局部内部类是定义在外部类的局部位置，通常在方法中
        // (3)不能添加访问修饰符，因为它的地位就是一个局部变量，局部变量是不能使用修饰符的。
        //    但是可以使用 final 修饰，final 修饰后则不能被继承。
        // (4)作用域：仅仅定义在它的方法或代码块中
        class Inner02 { // 局部内部类
            // (2)可以直接访问外部类的所有成员，包含私有的
            private int n1 = 800;

            public void f1() {
                // (5)局部内部类可以直接访问外部类的成员
                // (7)如果外部类和局部内部类的成员重名时，默认遵循就近原则，
                //    如果想访问外部类的成员，则可以使用（外部类名.this.成员）r去访问
                // 解读：Outer02.this 本质就是外部类Outer02 的一个对象，即
                //      哪个对象调用了m1，Outer02.this 就是哪个对象
                System.out.println("n1=" + n1);
                System.out.println("外部n1=" + Outer02.this.n1);

                m2();
            }

        }
        // (6)外部类在方法中，可以创建Inner02对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();

        class Inner03 extends Inner02 {

        }
    }
}
