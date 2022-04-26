package com.chapter12.exception_.throws_;

/**
 * @author ooah
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {

    }

    public void f2() /*throws ArithmeticException*/{
        // 1. 对于编译异常，程序中必须处理，使用 try-catch 或者 throws
        // 2. 对于运行时异常，程序如果没有处理，默认就是 throws 的方式处理
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }
}
class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    // 3. 子类重写父类方法时，对抛出异常的规定：子类重写的方法
    //    所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    @Override
    public void method() throws NullPointerException{
    }
}