package com.chapter13.string_;

/**
 * @author ooah
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        // String 对象用于保存字符串，也就是一组字符序列
        // 2. "Jack"是字符串常量，双引号括起来的字符序列
        // 3. 字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字符
        // 4. String 类有很多构造器，构造器的重载
        // 5. String 实现了接口 Serializable [String 可以串行化：可以网络传输]
        //                    Comparable [String 对象可以比较大小]
        // 6. String 是 final 类，不能被其他类继承
        // 7. String 有属性 private final char value[]; 用于存放字符串内容
        // 8. 一定要注意，value 是一个 final 类型，赋值后就不可修改(不能再指向新的对象)(需要功力):即 value 不能指向新的地址，但
        //    单个字符内容是可以变化
        String name = "Jack";
        name = "tom";

        final char[] value = {'a', 'b', 'c'};
        value[0] = 'A';
        char[] v2 = {'t', 'o', 'm'};
//        value = v2; 不可以修改 value 的地址

    }
}
