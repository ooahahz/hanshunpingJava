package com.chapter13.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArraysMethod02
 * Description
 * @Author haohao
 * @Date 2022/5/1 15:11
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 576};
        // binarySearch 通过二分搜索进行查找，要求必须排好序
        // 如果该数组是无序的，不能使用
        // 如果数组中不存在该元素，返回 -(low+1)

        int index = Arrays.binarySearch(arr, 567);
        System.out.println("index = " + index);

        // copyOf 数组元素的复制
        // 从 arr 数组中，拷贝指定长度到　newArr 中
        // 如果拷贝的长度 > arr.length ,就在新数组的后面增加 null
        // 如果拷贝的长度 = 0 ， 就会返回空 []
        // 如果拷贝的长度 < 0 ， 就会抛出异常
        Integer[] newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("=======拷贝执行完毕后======");
        System.out.println(Arrays.toString(newArr));

        // fill 数组元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        // 解读：
        // 1. 用指定的元素 99 填充 num 数组，替换所有元素
        Arrays.fill(num, 99);
        System.out.println("=======数组填充后======");
        System.out.println(Arrays.toString(num));

        // equals 比较两个数组的元素是否一致
        Integer[] arr2 = {1, 2, 90, 123, 576};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);

        // asList 可以将数组转换为 List
        // 1. asList 方法 会将（2，3，4，5，6，1）转换为一个List集合
        // 2. 返回的 asList 编译类型List(接口)
        // 3. asList 运行类型 java.util.Arrays$ArrayList ，是Arrays类的静态内部类
        List<Integer> asList = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("asList = " + asList);
        System.out.println("asList 的运行类型" + asList.getClass());
    }
}
