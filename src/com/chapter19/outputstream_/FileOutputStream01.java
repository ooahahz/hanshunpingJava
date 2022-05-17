package com.chapter19.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName FileOutputStream01
 * @Author Oliver
 * @Date 2022/5/17 22:04
 * Description      TODO
 * @see
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream
     */
    @Test
    public void write() {
        // 创建 FileOutputStream 对象
        String filePath = "D:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // 1. new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            // 2. new FileOutputStream(filePath, true) 当写入内容时，是追加到文件后面
//            fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath,true);
            // 写入一个字节
//            fileOutputStream.write('H');
            // 写入字符串
            String str = "\nNever give up~!";
            // str.getBytes() 可以把字符串转成字节数组，括号里面可以声明编码格式
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8), 0, str.length());

        } catch (IOException e) {
            e.printStackTrace();
        } finally{

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
