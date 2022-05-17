package com.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @ClassName Directory_
 * @Author Oliver
 * @Date 2022/5/17 16:34
 * Description      TODO
 * @see
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    // 判断 D:\\news1.txt 是否存在，存在就删除
    @Test
    public void m1() {
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }

        } else {
            System.out.println("该文件不存在");
        }

    }


    // 判断 D:\\demo02 是否存在，存在就删除，否则提示不存在
    // 这里我们需要体会到，在java编程中，目录也被当作文件
    @Test
    public void m2() {
        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if(file.delete()) {
                System.out.println("目录已删除");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("目录不存在");
        }

    }

    // 判断D:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已经存在，否则就创建
//    mkdir() 创建一级目录    mkdirs() 创建多级目录
    @Test
    public void m3() throws IOException {
        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println("目录已存在");
        }else {
            if(file.mkdirs()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        }

    }
}
