package com.chapter13.stringBuffer;

/**
 * @ClassName StringBuffer02
 * Description
 * @Author haohao
 * @Date 2022/4/30 19:21
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        // 构造器的使用
        // 创建一个大小为 16 的char数组，用于存放字符序列
        StringBuffer stringBuffer = new StringBuffer();

        // 通过构造器指定 char[] 的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        // 通过给一个 String 创建 StringBuffer ，char[] 大小就是 str.length + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
