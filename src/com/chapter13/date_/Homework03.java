package com.chapter13.date_;


/**
 * @ClassName Homework03
 * Description
 * @Author haohao
 * @Date 2022/5/2 18:07
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Zha xian hao";
        printName(name);

    }

    /*
        编写方法：完成输出格式要求地字符串
        思路分析：
        (1) 对输入地字符串进行分割
        (2) 对得到地 String[] 进行格式化 String.format
        (3) 对输入地字符串进行校验
     */
    public static void printName(String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }

        String[] names = str.split(" ");

        if (names.length != 3) {
            System.out.println("输入的名字格式不正确");
        }

        String format = String.format("%s, %s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);

    }
}
