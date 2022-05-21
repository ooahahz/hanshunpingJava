package com.chapter19.transformation;

import java.io.*;

/**
 * @ClassName OutputStreamWriter_
 * @Author Oliver
 * @Date 2022/5/21 10:55
 * Description      TODO
 * 演示 OutputStreamWriter 使用
 * 把 FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 * @see
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\nice.txt";

        String charSet = "utf8";
        OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
//        BufferedWriter bufferedWriter = new BufferedWriter(gbk);
        gbk.write("hi, 昊昊");
        gbk.close();
        System.out.println("按照" + charSet + "保存文件成功");

    }
}
