package com.chapter14.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName TreeMap
 * @Author Oliver
 * @Date 2022/5/9 11:01
 * Description      TODO
 * @see TreeMap
 */
@SuppressWarnings("all")
public class TreeMap_ {
    public static void main(String[] args) {

        // 使用默认的构造器创建 TreeMap
//        TreeMap treeMap = new TreeMap();

        // 按照字符串长度大小排序
        TreeMap<Object, Object> treeMap = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "史密斯");

        System.out.println("treeMap :" + treeMap);
    }
}
