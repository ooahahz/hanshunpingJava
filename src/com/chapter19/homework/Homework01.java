package com.chapter19.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Homework01
 * @Author Oliver
 * @Date 2022/5/22 11:06
 * Description      TODO
 * @see
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "D:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            // 创建
            if (file.mkdirs()) {
                System.out.println(directoryPath + " 创建目录成功");
            } else {
                System.out.println("创建目录失败");
            }
        }
        String filePath = directoryPath + "\\hello.txt";
        File file1 = new File(filePath);
        if (!file1.exists()) {
            // 创建文件
            if (file1.createNewFile()) {
                System.out.println(filePath + " 创建成功");

                // 如果文件存在，我们就使用 BufferedWriter 字符输入流写入内容
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1)); // 节点流、处理流
                bufferedWriter.write("hello,world~~ Oliver快乐");
                bufferedWriter.close();
            } else {
                System.out.println(filePath + " 创建失败");
            }
        } else {
            // 如果文件已经存在，给出提示信息
            System.out.println(filePath + " 已经存在，不需重复创建");
        }
    }
}
