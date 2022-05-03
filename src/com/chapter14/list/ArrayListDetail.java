package com.chapter14.list;

import java.util.ArrayList;

/**
 * @ClassName ArrayListDetail
 * Description
 * @Author haohao
 * @Date 2022/5/3 13:18
 */
public class ArrayListDetail {
    public static void main(String[] args) {

        // ArrayList 线程不安全，可以看源码，没有 synchronized
        // 在多线程使用 Vector
        /*
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
         */
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(null);
        arrayList.add("Jack");
        arrayList.add(null);
        System.out.println(arrayList);
    }
}
