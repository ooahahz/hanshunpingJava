package com.chapter13.stringBuffer;

/**
 * @ClassName StringBufferMethod
 * Description
 * @Author haohao
 * @Date 2022/4/30 20:27
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        // 增
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(10).append(10.5);
        System.out.println(s);

        // 删
        /*
         删除 11 ~ 14 处的字符，左闭右开
         */
        s.delete(11, 14);

        // 改
        /*
         使用 周芷若 替换索引9-11的字符[9, 11)
         */
        s.replace(9, 11, "周芷若");

        // 查
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);

        // 插
        /*
        在索引为9的位置插入 赵敏
        原来索引为9的字符自动后移
         */
        System.out.println("===============");
        System.out.println(s);
        s.insert(9, "赵敏");
        System.out.println(s);

        // 长度
        System.out.println(s.length());
    }

}
