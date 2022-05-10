package com.chapter14.homeWork;

import java.util.*;

/**
 * @ClassName HomeWork03
 * @Author Oliver
 * @Date 2022/5/9 16:39
 * Description      TODO
 * @see
 */
@SuppressWarnings("all")
public class HomeWork03 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack", new Integer(650)); // 自动装箱
        map.put("tom", 1200);
        map.put("smith", 2900);

        map.put("jack", 2600);

        // 为所有员工加薪100元
        // keySet
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            // 更新
            map.put(key, map.get(key) + 100);
        }

        // 遍历 EntrySet
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }

        System.out.println("=======遍历所有员工=========");
        Set<String> keyset = map.keySet();
        for (String s : keyset) {
            System.out.println(s);
        }

        System.out.println("========遍历所有的工资=======");
        Collection<Integer> values = map.values();
        for (int i: values) {
            System.out.println(i);
        }
        System.out.println("=======迭代器=======");
        Iterator<Integer> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println(next);

        }

    }
}

