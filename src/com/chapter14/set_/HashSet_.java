package com.chapter14.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HashSet_
 * Description
 * @Author haohao
 * @Date 2022/5/4 16:56
 */
public class HashSet_ {
    public static void main(String[] args) {
        /*
            1. 构造器底层源码，底层是 HashMap
            public HashSet() {
                map = new HashMap<>();
            }

            2. HashSet 可以存放null（只能有一个）
            3. HashSet 不保证元素是有序的，取决于 Hash 后，再确定索引的结果
            4. 不能有重复的元素
         */
        Set<Object> hashSet= new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

    }
}
