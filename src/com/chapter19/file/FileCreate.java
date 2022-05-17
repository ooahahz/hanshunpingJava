package com.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName FileCreate
 * @Author Oliver
 * @Date 2022/5/17 15:33
 * Description      TODO
 * 演示创建文件
 * @see
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    // 方式1 new File(String pathname)
    @Test
    public void create01() throws IOException {
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        file.createNewFile(); // 将文件写入到硬盘中
        System.out.println("文件创建成功");
    }

    // 方式2 new File(File parent, String child) // 根据父目录文件+子路径构建
    @Test
    public void create02() throws IOException {
        File parentFile = new File("D:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        file.createNewFile(); // 将文件写入到硬盘中
        System.out.println("文件创建成功");
    }

    // 方式3 new File(String parent, String child) // 根据父目录+子路径构建
    @Test
    public void create03() throws IOException {
        String parentPath = "D:\\";
        String filePath = "news3.txt";
        File file = new File(parentPath, filePath);
        file.createNewFile();
        System.out.println("文件创建成功");

    }
}
