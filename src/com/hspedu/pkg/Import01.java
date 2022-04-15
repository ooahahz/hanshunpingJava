package com.hspedu.pkg;

// 建议：需要什么类就导入哪个类即可，不建议使用 * 的方式导入
// import java.util.*
import java.util.Arrays;
// import java.util.Scanner; // 表示只会引入 java.util 包下的 Scanner

public class Import01 {
    public static void main(String[] args) {

        // 使用系统提供的 Arrays 类完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
