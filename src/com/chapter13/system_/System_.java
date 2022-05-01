package com.chapter13.system_;

import java.util.Arrays;

/**
 * @ClassName System_
 * Description
 * @Author haohao
 * @Date 2022/5/1 16:40
 */
public class System_ {
    public static void main(String[] args) {

        // exit 退出当前程序
        System.out.println("ok1");
        // exit(0) 表示程序退出
        // 0 表示一个状态，正常状态
//        System.exit(0);
        System.out.println("ok2");

        System.out.println("=====================");
        //arrayCopy:复制数组元素，比较适合底层调用
        // 一般使用 Arrays.copyOf完成复制数组

        int[] src = {1, 2, 3};
        int[] dest = new int[3]; // 当前是 {0, 0, 0}
//      *@param    src        the source array.
//      *@param    srcPos     starting position in the source array.
//      *@param    dest       the destination array.
//      *@param    destPos    starting position in the destination data.
//      *@param    length     the number of array elements to be copied.
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println(Arrays.toString(dest));

        // currentTimeMillens:返回1970 1.1 至今的毫秒数
        System.out.println(System.currentTimeMillis());
    }
}
