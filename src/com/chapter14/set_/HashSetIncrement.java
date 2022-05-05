package com.chapter14.set_;

import java.util.HashSet;

/**
 * @ClassName HashSetIncrement
 * Description
 * @Author haohao
 * @Date 2022/5/5 17:37
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        /*
            HashSet 底层是 HashMap，第一次添加时，table 数组扩容到 16
            临界值(threshold)是 16 * loadFactor(0.75) = 12
            如果 table 数组使用到了临界值 12，就会扩容到 16 * 2 = 32，新的临界值是 32 * 0.75 = 24，依次推类
         */
        HashSet<Object> hashSet = new HashSet<>();
//        for (int i = 0; i <=100; i++) {
//            hashSet.add(i);
//        }

        /*
            在 Java8 中，如果一条链表的元素个数到达 TREEIFY_THRESHOLD（默认是8），并且
            table 的大小>= MIN_TREEIFY_CAPACITY（默认64），就会进行树化（红黑树）
         */
        for (int i = 1; i <=12; i++) {
            hashSet.add(new A(1)); // equals() 不同
        }

    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() { // 重写 hashCode
        return 100;
    }
}