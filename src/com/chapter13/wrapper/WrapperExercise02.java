package com.chapter13.wrapper;

/**
 * @author ooah
 * @version 1.0
 * 面试题，有坑
 */
public class WrapperExercise02 {
    public static void main(String[] args) {

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false

        // 这里主要看范围 -128 ~ 127之间，没有 new
        /*
        public static Integer valueOf ( int i){
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
        */
        Integer m = 1; // 底层 Integer.valueOf(1) ---> 阅读源码
        Integer n = 1; // 底层 Integer.valueOf(1)
        System.out.println(m == n); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false
    }

}
