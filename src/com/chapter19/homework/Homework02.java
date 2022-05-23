package com.chapter19.homework;

import java.io.*;

/**
 * @ClassName Homework02
 * @Author Oliver
 * @Date 2022/5/22 11:32
 * Description      TODO
 * @see
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\summer.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String line;
        int i = 0;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(++i+ " "+line);
        }
        bufferedReader.close();
    }
}
