package com.chapter19.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileWriter_
 * @Author Oliver
 * @Date 2022/5/18 9:49
 * Description      TODO
 * @see
 */
public class FileWriter_ {
    public static void main(String[] args){

        String filePath = "D:\\note.txt";
        // 创建一个 FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        String str = "what are you doing?";

        try {
            fileWriter = new FileWriter(filePath);
            // 写入单个字符 write(int)
            fileWriter.write('H');
            // 写入字符数组 write(char[])
            fileWriter.write(chars);
            // 写入指定数组的指定部分 write(char[], off, len);
            fileWriter.write(str.toCharArray(), 0, 8);
            // 写入整个字符串
            fileWriter.write("Everything will be OK!");
            fileWriter.write("风雨之后，定见彩虹");
            // 写入字符串的指定部分 write(String, off, len)
            fileWriter.write("北京上海广州深圳", 0, 6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 对应FileWriter　一定要关闭流，或者 flush 才能真正的把数据写入到文件
                fileWriter.close();
                // 关闭文件流close(), 等价于 flush + 关闭

//                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束");
    }
}
