package com.chapter19.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName Properties02
 * @Author Oliver
 * @Date 2022/5/22 10:26
 * Description      TODO
 * @see
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {

        // 使用 Properties 类来读取 mysql.properties 文件

        // 1. 创建Properties对象
        Properties properties = new Properties();
        // 2. 加载
        properties.load(new FileReader("D:\\mysql.properties"));
        // 3. 显示 k-v 到控制台
//        properties.list(System.out); // 标准输出
        // 4. 根据 key 获取 对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名：" + user);
        System.out.println("密码是：" + pwd);

    }
}
