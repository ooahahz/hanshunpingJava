package com.chapter19.writer_;

import java.io.*;

/**
 * @ClassName BufferedCopy_
 * @Author Oliver
 * @Date 2022/5/18 15:19
 * Description      TODO
 * 拷贝文件
 * @see
 */
public class BufferedCopy_ {

    // 1. BufferedReader 和 BufferedWriter 是按照字符操作
    // 2. 不要去操作二进制文件[声音、视频、pdf、doc]，可能造成文件损坏
    public static void main(String[] args) throws IOException {
        String srcFilePath = "D:\\ok.txt";
        String destFilePath = "D:\\Oliver.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
        String line;
        while((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
