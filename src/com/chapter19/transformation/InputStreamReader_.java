package com.chapter19.transformation;

import java.io.*;

/**
 * @ClassName InputStreamReader_
 * @Author Oliver
 * @Date 2022/5/21 10:18
 * Description      TODO
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成 字符流 InputStreamReader，指定编码 gbk/utf-8
 * @see
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\a.txt";
        // 解读
        // 1. 把 new FileInputStream 转成 InputStreamReader
        // 2. 指定编码
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
        // 3. 把 InputStreamReader 传入 BufferedReader（这是一个包装流或者处理流）
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        BufferedReader gbk = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));

        // 读取
        String s = bufferedReader.readLine();
        System.out.println("s：" + s);
        bufferedReader.close();

    }

}