package com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {8, -1, 199, 70, 10};

        // 我们看看 Arrays.sort()的方法底层实现
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j + "\t");
        }
    }
}
