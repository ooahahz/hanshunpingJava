package com.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapSource2
 * @Author Oliver
 * @Date 2022/5/8 17:53
 * Description      TODO
 * @see HashMap
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }

        System.out.println("hashMap=" + hashMap);
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100; // 所有 A 对象的 HashCode 都是100
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }
}