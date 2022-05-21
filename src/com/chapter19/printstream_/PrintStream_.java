package com.chapter19.printstream_;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName PrintStream_
 * @Author Oliver
 * @Date 2022/5/21 19:35
 * Description      TODO
 * 演示 PrintStream (字节打印流)
 * @see PrintStream
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        // 在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
//        public void print(String s) {
//            if (s == null) {
//                s = "null";
//            }
//            write(s);
//        }
        // 因为 print 的底层使用的是 write ，所以我们可以直接调用 write 进行打印/输出
        out.println("john, hello");
        out.write("haohao你好".getBytes(StandardCharsets.UTF_8));


        out.close();

        // 我们可以去修改打印输出流的位置/设备
        // 修改成到
        System.setOut(new PrintStream("D:\\f1.txt"));
        System.out.println("hello, 查显昊真帅\n查显昊是谁啊？");
        // 此时，打印的位置不再是控制台啦！而是 D:f1.txt
    }
}
