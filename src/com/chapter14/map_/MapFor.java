package com.chapter14.map_;

import java.util.*;

/**
 * @ClassName MapFor
 * @Author Oliver
 * @Date 2022/5/7 15:03
 * Description      TODO
 * @see
 */
public class MapFor {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("邓超", "孙俪"); // 替换 --> 分析源码
        map.put("王宝强", "马蓉"); // OK
        map.put("宋喆", "马蓉"); // OK
        map.put("刘嘉玲", null); // OK
        map.put(null, "刘亦菲"); // OK
        map.put("鹿晗", "关晓彤"); // OK

        // 第一组：先取出所有的Key，通过Key取出对应的Value
        System.out.println("------------第一种方法-----------");
        Set keyset = map.keySet();
        // (1) 增强 for 循环
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        // (2) 迭代器
        System.out.println("-----------第二种方法---------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));

        }

        // 第二组
        Collection<Object> values = map.values();
        // (1) 增强 for
        for (Object value :values) {
            System.out.println(value);
        }
        Iterator<Object> iterator1 = values.iterator();

        // (2) 迭代器
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        // 第三组：通过 EntrySet 来获取
        // (1) 增强 for
        System.out.println("------------使用EntrySet的增强for-----------");
        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
        for (Object entry : entrySet) {
            // 将 entry 转成 Map.Entry
            System.out.println(((Map.Entry) entry).getKey() + " " + ((Map.Entry) entry).getValue());
        }
        // (2) 迭代器
        System.out.println("--------------使用迭代器-------------");
        Iterator<Map.Entry<Object, Object>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Object, Object> entry = iterator2.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
