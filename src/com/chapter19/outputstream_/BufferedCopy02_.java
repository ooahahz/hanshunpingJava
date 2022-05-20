package com.chapter19.outputstream_;

import java.io.*;

/**
 * @ClassName BufferedCopy02_
 * @Author Oliver
 * @Date 2022/5/18 16:19
 * Description      TODO
 * 演示使用 BufferedOutputStream 和 BufferedInputStream 使用
 * 使用它们可以完成二进制文件的拷贝
 * 思考：字节流可以操作二进制文件，可以操作文本文件吗？
 * @see
 */
public class BufferedCopy02_ {
    public static void main(String[] args) throws IOException {

        String srcFilePath = "C:\\Users\\haohao\\OneDrive\\document\\book\\SQL\\Practical SQL A Beginner’s Guide to Storytelling with Data (Anthony DeBarros) (z-lib.org).pdf";
        String destFilePath = "D:\\Downloads\\SQL.pdf";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            // 因为 FileInputStream 是 InputStream 的子类，BufferedInputStream 是包装流（处理流）
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            // 循环的读取文件，提高效率
            byte[] buffer = new byte[1024];
            int readLen;
            // 当返回 -1 时，表示读取完毕
            while ((readLen = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, readLen);
            }
            System.out.println("文件拷贝成功");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭外层的处理流
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }

        }
//        bufferedOutputStream = new BufferedOutputStream()
    }
}
