package com.chapter12.exception_.throws_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author ooah
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        f2();

    }

    public static void f2() /*throws ArithmeticException*/ {
        // 1. 对于编译异常，程序中必须处理，使用 try-catch 或者 throws
        // 2. 对于运行时异常，程序如果没有处理，默认就是 throws 的方式处理
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() throws FileNotFoundException {
        // 1. 因为f3() 方法抛出的是一个编译异常
        // 2. 即这是， f1() 必须要处理这个编译异常
        // 3. 在 f1() 中要么 try-catch-finally，或者继续 throw 这个编译异常
        f3(); // 抛出异常

    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://a.txt");

    }// 3. 子类重写父类方法的时候

    public static void f4() {
        // 1. 在 f4() 中调 f5() 是ok的
        // 2. 原因是 f5() 抛出的是运行异常
        // 3. 而 java 中，并不要求程序员显示地处理，因为有默认处理机制
        f5();
    }
    public static void f5() throws ArithmeticException {

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
    public void method() throws NullPointerException /*RuntimeException*/ {
    }
}