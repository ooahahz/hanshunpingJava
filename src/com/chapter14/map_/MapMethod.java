package com.chapter14.map_;

import java.util.HashMap;

/**
 * @ClassName MapMethod
 * @Author Oliver
 * @Date 2022/5/7 14:33
 * Description      TODO
 * @see java.util.HashMap
 */
public class MapMethod {
    public static void main(String[] args) {
        // 演示 Map 接口常用方法
        HashMap<Object, Object> map = new HashMap<>();
        map.put("邓超",new Book("", 100)); // OK
        map.put("邓超", "孙俪"); // 替换 --> 分析源码
        map.put("王宝强", "马蓉"); // OK
        map.put("宋喆", "马蓉"); // OK
        map.put("刘嘉玲", null); // OK
        map.put(null, "刘亦菲"); // OK
        map.put("鹿晗", "关晓彤"); // OK

        System.out.println("map " + map);

        // remove:根据键删除映射关系
        map.remove(null);
        System.out.println("map " + map);
        // get: 根据键获取值
        Object val = map.get("鹿晗");
        System.out.println(val);
        // size()：获取元素个数
        System.out.println(map.size());
        // isEmpty() 判断是否为空
        System.out.println(map.isEmpty());
        // clear() 清楚键值对
//        map.clear();
        System.out.println(map);
        // containsKey: 查找键是否存在
        System.out.println(map.containsKey("刘嘉玲"));
    }
}

class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
