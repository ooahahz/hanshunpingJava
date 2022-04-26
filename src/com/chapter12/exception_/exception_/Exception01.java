package com.chapter12.exception_.exception_;

/**
 * @author ooah
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // 分母为 0，抛出异常，程序结束
        // 不应该出现一个不算致命的问题就导致程序崩溃，健壮性不好
        // java 设计者提供了一个叫做异常处理机制
//        int res = num1 / num2;

        // 快捷键 Ctrl + Alt + t
        // 如果进行异常处理，即使出现错误，抛出错误原因，程序仍然继续往下执行
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续运行");

    }
}
