package com.chapter19.standard;

import java.util.Scanner;

/**
 * @ClassName InputAndOutput
 * @Author Oliver
 * @Date 2022/5/20 22:49
 * Description      TODO
 * 标准输入、标准输出
 * @see
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // System 类的 public final static InputStream in = null
        // System.in 编译类型   InputStream
        // System.in 运行类型   BufferedInputStream
        // 表示标准输入  键盘
        System.out.println(System.in.getClass());

        // public final static PrintStream out = null;
        // 编译类型 PrintStream
        // 运行类型 PrintStream
        // 表示标准输出  显示器
        System.out.println(System.out.getClass());

        System.out.println("hello, 查显昊");

        Scanner scanner = new Scanner(System.in); // Scanner 从控制台（键盘）获取数据，输入流
        System.out.println("请输入内容：");
        String next = scanner.next();
        System.out.println("next = " + next);
    }
}
