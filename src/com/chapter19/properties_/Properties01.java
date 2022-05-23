package com.chapter19.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName Properties01
 * @Author Oliver
 * @Date 2022/5/22 10:11
 * Description      TODO
 * @see
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {

        // 读取 mysql.properties 文件，并得到ip,user,pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + ": " + split[1]);
        }
        bufferedReader.close();
    }
}
