package com.chapter19.writer_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName PrintWriter_
 * @Author Oliver
 * @Date 2022/5/21 22:06
 * Description      TODO
 * 演示 PrintWriter 使用方式
 * @see java.io.PrintWriter
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
//        PrintWriter printWriter = new PrintWriter(System.out); // System.out 标准输出

        PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\what.txt"));
        printWriter.println("hi，what's your name?");
        printWriter.close(); // 如果没有 close() 就不会写入
        // flush + 关闭流，才会将数据写入到文件

    }
}
