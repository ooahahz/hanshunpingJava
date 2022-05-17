package com.chapter19.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileReader_
 * @Author Oliver
 * @Date 2022/5/17 23:08
 * Description      TODO
 * @see
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01() {

        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int data;
        // 1. 先创建一个 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取 使用read，单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     *
     */
    @Test
    public void readFile02() {

        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int readLen;
        char[] buf = new char[8];
        // 1. 先创建一个 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取 使用read(buf)， 返回的是实际读取到的字符树
            // 如果返回-1，说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
