package com.chapter14.list;

import java.util.ArrayList;

/**
 * @ClassName ArrayListSource
 * Description
 * @Author haohao
 * @Date 2022/5/3 13:24
 */
public class ArrayListSource {
    public static void main(String[] args) {

        // 解读源码
        // 使用无参构造器创建 ArrayList
//        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list = new ArrayList<>(8);

        // 使用 for 循环给 list 添加 1-10
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <=15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        System.out.println(list);
    }
}
