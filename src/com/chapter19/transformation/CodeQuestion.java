package com.chapter19.transformation;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @ClassName CodeQuestion
 * @Author Oliver
 * @Date 2022/5/21 9:59
 * Description      TODO
 * 转换流，解决乱码问题
 * @see
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        // 读取 D:\\a.txt 文件到程序
        // 1. 创建字符输入流，BufferedReader(处理流)
        // 2. 使用 BufferedReader 读取 a.txt
        // 3. 默认情况下，读取文件格式是按照 utf-8

        String filePath = "D:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s = bufferedReader.readLine();
        System.out.println("读取到的内容：" + s);
        bufferedReader.close();

//        InputStreamReader
//        public InputStreamReader(InputStream in, Charset cs)

//        OutputStreamWriter

    }
}
