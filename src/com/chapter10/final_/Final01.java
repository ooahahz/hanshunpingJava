package com.chapter10.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_TATE = 0.09;

    }
}

// 我们要求 A 类不能被其他类继承
// 可以用 final 修饰 A 类
final class A {
}

// class B extends A {
//}

class C {
    // 如果我们要求 hi 不能被子类重写
    // 可以使用 final 修饰 hi 方法
    final public void hi() {
    }
}

class D extends C {

//    @Override
//    public void hi() {
//        System.out.println("重写了 C 类的方法");
//    }
}

class E {
    public final double TAX_TATE = 0.08;
}

// 当不希望某个局部变量被修改，可以使用 final 修饰
class F {
    public void cry() {
        // 这是，NUM 被称为局部常量
        final double NUM = 0.01; // 一般来说，常量用大写字母表示
//        NUM = 0.08;
        System.out.println(NUM);
    }
}
