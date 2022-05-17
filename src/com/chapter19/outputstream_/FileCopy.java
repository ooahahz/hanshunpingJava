package com.chapter19.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileCopy
 * @Author Oliver
 * @Date 2022/5/17 22:37
 * Description      TODO
 * @see
 */
public class FileCopy {
    public static void main(String[] args) {
        // 完成文件 copy
        // 1. 创建文件输入流，将文件读入到程序
        // 2. 创建文件输出流，将读取到的文件写入到指定的文件
        String srcFilePath = "D:\\ooah.jpg";
        String destFilePath = "D:\\Downloads\\ooah.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            // 定义一个字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readLen;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                // 读取源文件后，就写入到目标文件 ，通过 FileOutputStream
                // 即边读边写
                fileOutputStream.write(buf, 0, readLen); // 一定要使用这个方法，如果只传入 buf ，则最后依次读取1024，导致文件损坏
            }
            System.out.println("拷贝成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输入流、输出流释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
