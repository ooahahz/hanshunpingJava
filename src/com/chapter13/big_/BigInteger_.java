package com.chapter13.big_;

import java.math.BigInteger;

/**
 * @ClassName BigInteger_
 * Description
 * @Author haohao
 * @Date 2022/5/1 19:37
 */
public class BigInteger_ {
    public static void main(String[] args) {

        long l = 133333333;
        System.out.println("l = " + l);
        // 当编程中需要处理很大的整数，long 不够用，
        // 可以使用 BigInteger 的类
        BigInteger bigInteger = new BigInteger("12333333333333333536245234");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        // 对 BigInteger 进行加减乘除运算的时候，需要使用对应的方法，不能直接 + - * /
        // 这时候可以创建一个要操作的 BigInteger
        BigInteger add = bigInteger.add(bigInteger1);
        BigInteger sub = bigInteger.subtract(bigInteger1);
        BigInteger multi = bigInteger.multiply(bigInteger1);
        BigInteger div = bigInteger.divide(bigInteger1);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);

    }
}
