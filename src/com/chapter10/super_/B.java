package com.chapter10.super_;

public class B extends A{

    public int n1 = 999;

    public B() {
//        super();
        super("jack", 10);
    }

    // 访问父类的属性，但不能访问父类的 private 属性 [案例] super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 );
    }

    public void sum() {
        System.out.println("B类的sum()");
        // 希望调用父类A的cal方法
        // 这时，因为子类B没有cal方法，因此我们可以使用下面三种方法都可以实现
        // 找cal方法时，顺序是：
        // (1)先找本类，如果有则调用，
        // (2)如果没有则找父类中的此方法，
        // (3)如果父类没有则继续向上找，直到 Object 类...
        // 提示：如果在查找方法的过程中，找到了，但是不能访问（private）则报错
        cal();
//        this.cal(); // 等价 cal

//        super.cal(); // 调用父类的 cal() 方法 没有查找本类中的 cal()，如果本类中有 cal() 方法，也不会调用

        // 演示访问属性的规则
        System.out.println(n1);
        System.out.println(this.n1);

        // 访问父类的 n1 属性
        System.out.println(super.n1);
    }


    // 访问父类的方法，但不能访问父类的 private 方法 [案例] super.方法名(参数列表)
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // super.test400() 不能访问，因为是父类的 private 方法
    }

    public void cal() {
        System.out.println("调用B类的cal()");
    }

}
