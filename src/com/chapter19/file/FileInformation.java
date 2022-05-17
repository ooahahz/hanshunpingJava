package com.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @ClassName FileInformation
 * @Author Oliver
 * @Date 2022/5/17 15:59
 * Description      TODO
 * @see
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    // 获取文件信息
    @Test
    public void info() {
        // 先创建文件对象
        File file = new File("D:\\news1.txt");

        // 调用相应的方法，得到对应信息
        System.out.println("文件名字 = " + file.getName());
        System.out.println("文件绝对路径 = " + file.getAbsolutePath());
        System.out.println("文件父级目录 = " + file.getParent());
        System.out.println("文件大小（字节）= " +file.length());
        System.out.println("文件是否存在？" + file.exists()); // true
        System.out.println("是不是一个文件？" + file.isFile()); // true
        System.out.println("是不是一个目录？" + file.isDirectory()); // false
    }
}
