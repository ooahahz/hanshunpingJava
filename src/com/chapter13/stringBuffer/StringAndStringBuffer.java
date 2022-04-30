package com.chapter13.stringBuffer;


/**
 * @ClassName StringAndStringBuffer
 * Description
 * @Author haohao
 * @Date 2022/4/30 19:31
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        // String -> StringBuffer
        String str = "hello Tom";
        // 使用构造器，返回的是 StringBuffer，str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        // 使用 append 方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        // StringBuffer -> String
        StringBuffer haohao = new StringBuffer("haohao");
        // 方式一：使用 StringBuffer 提供的 toString 方法
        String s = haohao.toString();
        System.out.println(s);
        //使用构造器
        String string = new String(haohao);
        System.out.println(string);

    }
}
