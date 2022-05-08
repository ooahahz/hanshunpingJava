package com.chapter14.set_;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName LinkedHashSetSource
 * @Author Oliver
 * @Date 2022/5/6 16:15
 * Description      TODO
 * 维护的是双向链表，保证插入的顺序和遍历的顺序一致
 * @see LinkedHashSet
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set<Object> set = new LinkedHashSet<>();
        set.add(new String("AA"));
        set.add(456);
        set.add(456); // 没有加进去
        set.add(new Customer("Jack", 34));
        set.add(123);
        set.add("HSP");

        System.out.println(set);
        // 解读：
        // LinkedHashSet 底层维护的是一个 LinkedHashMap(是 HashMap 子类)
        // LinkedHashSet 底层结构 （数组 + 双向链表）
        // 添加第一次时，直接将数组 table 扩容到 16，存放的结点类型 LinkedHashMap$Entry
        // 数组 table 是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry类型  (多态)

        /*
            // 继承关系是在内部类完成
            static class Entry<K,V> extends HashMap.Node<K,V> { // Node 是一个静态内部类，因为它是直接通过类名访问的
                Entry<K,V> before, after;
                Entry(int hash, K key, V value, Node<K,V> next) {
                    super(hash, key, value, next);
                }
            }
         */
    }
}

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
