package com.chapter19.writer_;

import java.io.*;

/**
 * @ClassName BufferWriter_
 * @Author Oliver
 * @Date 2022/5/18 15:04
 * Description      TODO
 * 演示 BufferedWriter 使用
 * @see
 */
public class BufferWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\ok.txt";

        // 说明：
        // 1. new FileWriter(filePath, true) 表示以追加的方式写入
        // 2. new FileWriter(filePath) 表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        String content1 = "北京欢迎你";
        String content2 = "上海欢迎您";
        bufferedWriter.write(content1, 0, content1.length());
        bufferedWriter.newLine(); // 插入一个和系统相关的换行
        bufferedWriter.write(content2, 0, content2.length());
        bufferedWriter.newLine(); // 插入一个和系统相关的换行

        // 说明：关闭外层流（包装流）即可，传入的 new FileWriter(filePath)，会在底层关闭
        bufferedWriter.close();
    }
}
