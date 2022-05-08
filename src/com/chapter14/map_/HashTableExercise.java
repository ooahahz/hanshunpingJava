package com.chapter14.map_;

import java.util.Hashtable;

/**
 * @ClassName HashTableExercise
 * @Author Oliver
 * @Date 2022/5/8 18:26
 * Description      TODO
 * @see Hashtable
 */
@SuppressWarnings("all")
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("john", 100); // OK
//        table.put(null, 100); // 异常 NullPointerException
//        table.put("john", null); // 异常 NullPointerException
        table.put("lucy", 100); // OK
        table.put("lic", 100); // OK
        table.put("lic", 88); // 替换
        table.put("hello1", 1);
        table.put("hello2", 1);
        table.put("hello3", 1);
        table.put("hello4", 1);
        table.put("hello5", 1);
        table.put("hello6", 1);
        System.out.println(table);

        // 分析 Hashtable 源码
        // 1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
        // 2. threshold 8 = 11 * 0.75
        // 3. 扩容：按照自己的扩容机制来进行
        // 4. 执行方法 addEntry(hash, key, value, index); 添加 K-V 封装到 Entry
        // 5. 当 if (count >= threshold) 满足时，就进行扩容
        // 6. 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容
    }
}
