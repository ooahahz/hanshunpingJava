package com.chapter19.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @ClassName BufferedReader_
 * @Author Oliver
 * @Date 2022/5/18 14:46
 * Description      TODO
 * 演示 bufferedReader 使用
 * @see
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\a.java";
        // 创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line; // 按行读取
        // 说明
        // readLine() 是按行读取文件
        // 当返回 null 时，表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭流  这里只需要关闭包装流 即 BufferReader ，因为底层会自动关闭节点流
        bufferedReader.close();
    }
}
