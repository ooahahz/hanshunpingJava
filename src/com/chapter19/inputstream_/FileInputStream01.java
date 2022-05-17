package com.chapter19.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName FileInputStream01
 * @Author Oliver
 * @Date 2022/5/17 17:20
 * Description      TODO
 * 演示 FileInputStream01 的使用
 */
public class FileInputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() throws IOException {

        int readDate;

        String filePath = "D:\\hello.txt";
        // 创建 FileInputStream 对象，用于读取文件
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while ((readDate = fileInputStream.read()) != -1) {
            System.out.print((char) readDate); // 转成 char 显示
        }

        fileInputStream.close(); // 关闭文件流，释放资源
    }

    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile02() throws IOException {

        byte[] buffer = new byte[8]; // 依次读取 8 个字节
        int readLength;

        String filePath = "D:\\hello.txt";
        // 创建 FileInputStream 对象，用于读取文件
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while ((readLength = fileInputStream.read(buffer))!=-1) { // 读取正常，返回实际读取的字节数
            System.out.print(new String(buffer, 0, readLength)); // 显示
        }

        fileInputStream.close(); // 关闭文件流，释放资源
    }
}
