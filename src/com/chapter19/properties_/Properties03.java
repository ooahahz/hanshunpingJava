package com.chapter19.properties_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName Properties03
 * @Author Oliver
 * @Date 2022/5/22 10:33
 * Description      TODO
 * @see
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {

        // 使用 Properties 来创建配置文件，修改配置文件内容
        Properties properties = new Properties();

        // 创建
        // 如果该文件没有 key 就是创建，如果有的话，就是替换
        properties.setProperty("charSet", "utf8");
        properties.setProperty("user", "汤姆"); // 中文保存的是unicode码
        properties.setProperty("pwd", "abc111");

        properties.setProperty("pwd", "88888888");
        // 将key-value 存储到文件中即可
        properties.store(new FileOutputStream("D:\\mysql2.properties"), null);
        System.out.println("保存配置文件成功~");


    }
}
