package com.chapter13.big_;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimal_
 * Description
 * @Author haohao
 * @Date 2022/5/1 19:50
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        // 当需要保存精度很高的小数时，发现 double 不够用了
        // 可以使用 BigDecimal
        double d = 1.2333333333333333332444444444443;
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("13.23947589267293574972593452734985");
        System.out.println(bigDecimal);

        // 如果对 BigDecimal 进行运算，如 + - * / ，需要用对应的方法
        // 创建一个需要操作的 BigDecimal 对象，调用相应的方法即可
        BigDecimal bigDecimal1 = new BigDecimal("0.14");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
//        System.out.println(bigDecimal.divide(bigDecimal1)); // 可能除不尽，抛出异常. 解决办法，在 divide 方法里面指定精度
        // 在调用 divide 方法时，指定精度即可，BigDecimal.ROUND_CEILING
        // 如果有无线循环小数，就会保留 分子 的精度
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));



    }
}
