package com.chapter13.date_;

import java.util.Arrays;

/**
 * @ClassName Homework01
 * Description
 * (1) 将字符串中指定部分进行反转 如 "abcdef" ---> "aedcbf"
 * (2) 编写方法 public static String reverse(String str, int start, int end)
 * 思路分析
 * (1) 先把方法定义确定
 * (2) 把 String 转成 char[]
 * (3) 画出分析示意图
 * (4) 代码实现
 * @Author haohao
 * @Date 2022/5/2 16:41
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = null;
        try {
            reverse = reverse(str, 0, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(reverse);

    }
    public static String reverse(String str, int start, int end) {
        // 对输入的参数做一个验证
        // 重要的编程技巧！！！
        // 写出正确的情况，然后取反
        // 这样写思路很清晰
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
       char[] chars = str.toCharArray();
       while (start < end) {
           char temp = chars[start];
           chars[start] = chars[end];
           chars[end] = temp;
           start++;
           end--;
       }
//       return Arrays.toString(chars);
        return new String(chars);
    }
}
