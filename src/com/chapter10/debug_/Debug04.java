package com.chapter10.debug_;

import java.util.Arrays;

public class Debug04 {

    // 演示执行到下一个断点，并且支持动态地下断点
    public static void main(String[] args) {
        int arr[] = {8, -1, 199, 70, 10};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j + "\t");
        }

        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
    }
}
