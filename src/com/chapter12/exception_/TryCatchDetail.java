package com.chapter12.exception_;

/**
 * @author ooah
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        } finally {
            System.out.println("finally 代码块一定会执行...");
        }

        System.out.println("程序继续...");

    }
}
