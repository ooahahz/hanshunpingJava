package com.chapter14.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName TreeSet_
 * @Author Oliver
 * @Date 2022/5/9 10:18
 * Description      TODO
 * @see TreeSet
 */
public class TreeSet_ {
    public static void main(String[] args) {

        // 1. 当我们使用无参构造器，创建 TreeSet时，默认的顺序
        // 2. 希望添加的元素，按照字符串大小来排序
        // 3. 使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类）
        //    并指定排序规则
        // 4. 简单看一下源码
        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                // 下面调用 String 的 compareTo 方法进行字符串大小的比较(字典序)
//                return ((String)o1).compareTo((String)o2);
                // 要求按照加入元素的字符串长度比较
                // 长度相等的元素不能加入
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("ok");
        treeSet.add("a");

        System.out.println("treeSet = " + treeSet);
        // 解读：
        /*
            1. 构造器把传入的比较器对象赋给了 TreeSet 底层的 TreeMap 的属性 this.comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }
            2. 在调用 treeSet.add("tom")，在底层会执行到
        if (cpr != null) { // cpr 就是匿名内部类（对象）
            do {
                parent = t;
                cmp = cpr.compare(key, t.key); // 动态绑定到我们重写的匿名内部类的 compareTo 方法
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else // 如果相等，即返回0，这个key就没有加入
                    return t.setValue(value);
            } while (t != null);
        }
         */

    }
}
