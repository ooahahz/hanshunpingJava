package com.chapter14.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Collections_
 * @Author Oliver
 * @Date 2022/5/9 13:41
 * Description      TODO
 * @see Collections
 * @see java.util.Collection
 * @see ArrayList
 */
@SuppressWarnings("all")
public class Collections_ {
    public static void main(String[] args) {
        // 创建ArrayList 集合，用于测试
        ArrayList list = new ArrayList<>();
        list.add("tom");
        list.add("smithe");
        list.add("king");
        list.add("milan");
        list.add("tom");
        System.out.println(list);

        // reverse() 是 Collections 类里面的一个静态方法，可以将实现List接口类型的对象反转顺序
        Collections.reverse(list);
        System.out.println(list);

        // shuffle() 是对实现 List接口的对象进行随机排序
        Collections.shuffle(list);
        System.out.println(list);

        // sort() 根据元素自然顺序对指定 List 集合元素升序排序
        Collections.sort(list);
        System.out.println("=========自然排序后==========");
        System.out.println("list = " + list);

        // 希望按照字符串长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("=========按照字符串长度排序=========");
        System.out.println(list);

        // swap(List, int, int) 指定 List 集合中的 i 处元素和 j 处元素进行交换
        Collections.swap(list, 0, 1);
        System.out.println("===========交换后的情况========");
        System.out.println(list);

        // max(list) 根据元素的自然排序，返回集合中最大的元素
        System.out.println("自然排序最大元素: " + Collections.max(list));
        // max(Collection, Comparator) 根据 Comparator 指定的顺序，返回给定集合中的最大元素
        // 比如返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("返回长度最大的元素" + maxObject);


        // int frequency(Collection, Object): 返回指定集合中元素的出现次数
        System.out.println("tom 出现的次数 = " + Collections.frequency(list, "tom"));

        // void copy(List dest, List src): 将 src 中的内容复制到 dest 中
        ArrayList dest = new ArrayList();
        // 为了完成一个完整的拷贝，我们需要给 dest 赋值，大小和 list.size()一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        System.out.println("dest = " + dest);

        // boolean replaceAll(List list, Object oldVal, Object newVal): 使用新值替换 List 对象的所有旧值
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("替换后的list："+list);
    }
}
