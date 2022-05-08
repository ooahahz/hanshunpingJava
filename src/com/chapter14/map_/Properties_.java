package com.chapter14.map_;


import java.util.Properties;

/**
 * @ClassName Properties_
 * @Author Oliver
 * @Date 2022/5/8 20:33
 * Description      TODO
 * @see Properties
 */
public class Properties_ {
    public static void main(String[] args) {
        // 1. Properties 继承了 Hashtable
        // 2. 可以通过键值对 k-v 存放数据，当然 key 和 value 不能为 null
        Properties properties = new Properties();
        properties.put("john", 100);
//        properties.put(null, 100); // 抛出空指针异常
//        properties.put("john", null); // 抛出空指针异常
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88); // 如果有相同的 key ，值也会被替换

        System.out.println(properties);

        // 通过 k 获取对应的值
        // 查
        System.out.println(properties.get("lic"));
        System.out.println(properties.getProperty("john"));

        // 删除
        System.out.println(properties.remove("lic"));
        System.out.println(properties);

        // 修改
        properties.put("john", "约翰");
        System.out.println(properties);

    }
}
