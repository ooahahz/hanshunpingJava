package com.chapter14.homeWork;

import java.util.TreeSet;

/**
 * @ClassName HomeWork05
 * @Author Oliver
 * @Date 2022/5/10 21:20
 * Description      TODO
 * @see TreeSet
 */
public class HomeWork05 {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
//        Person cannot be cast to java.lang.Comparable
        // add() 方法，因为 TreeSet()构造器没有传入 Comparator 接口的匿名内部类
        // 所以在底层 comparator==null ? ((Comparable<? super K>)k1).compareTo((K)k2 : comparator.compare((K)k1, (K)k2);
        // 即把 Person 转成 Comparable 类型
        treeSet.add(new Person());
        System.out.println(treeSet);

    }
}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
