package com.chapter14.map_;

import com.chapter10.innerclass.AnonymousInnerClassDetail;
import sun.security.rsa.RSAUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapSource
 * @Author Oliver
 * @Date 2022/5/7 13:30
 * Description      TODO
 * @see HashMap
 */
public class MapSource {
    public static void main(String[] args) {

        Map<Object, Object> map = new HashMap<>();
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");
        map.put(new Car(), new Person());

        // 1. K-V 最后是 HashMap$Node node =  newNode(hash, key, value, null);
        // 2. K-V 为了方便程序员的遍历，还会创建 EntrySet 集合，该集合存放的元素类型 Entry，一个 Entry 对象
        //    就有 K-V EntrySet<Entry<K,V>> 即：transient Set<Map.Entry<K,V>> entrySet;
        // 3. entrySet 中，定义的类型是 Map.Entry，但是实际上存放的还是 HashMapNode
        //    这是因为 HashMap$Node implements Map.Entry
        // 4. 当把 HashMap$Node 对象存放到 entrySet 就方便我们的遍历，因为 Map.Entry 提供了两个重要的方法

        Set<Map.Entry<Object, Object>> set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
//            System.out.println(entry.getClass());
            // 为了从 HashMap$Node 取出 K-V
            // 1. 先做一个向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println("Key " + entry.getKey() + "-" + entry.getValue());

        }
        Set<Object> objects = map.keySet();
        Collection<Object> values = map.values();
        System.out.println(values);
    }

}

class Car{

}
class Person{

}
