package com.chapter14.set_;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName SetMethod
 * Description
 * @Author haohao
 * @Date 2022/5/3 21:13
 */
public class SetMethod {
    public static void main(String[] args) {


        // 1. 以Set接口的实现类 HashSet 来讲解 Set 接口的方法
        // 2. Set 接口的实现类的对象（Set接口的对象），不能存放重复的元素
        // 3. 可以加入一个 null
        // 4. Set 接口存放的数据是无序的（即添加的顺序和取出的顺序不一致）
        // 5. 取出的顺序虽然不是添加的顺序，但是它是固定的
        HashSet<String> set = new HashSet<>();
        set.add("john");
        set.add("lucy");
        set.add("john"); // 重复
        set.add("jack");
        set.add(null);
        set.add(null); // 重复

        // 使用迭代器遍历集合
        System.out.println("=======使用迭代器遍历集合======");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        // 使用增强 for 循环遍历集合
        System.out.println("=======增强for=====");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
