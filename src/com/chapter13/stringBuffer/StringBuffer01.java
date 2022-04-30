package com.chapter13.stringBuffer;

/**
 * @ClassName StringBuffer01
 * Description
 * @Author haohao
 * @Date 2022/4/30 18:59
 */
public class StringBuffer01 {
    public static void main(String[] args) {

        // 1. StringBuffer 的直接父类是 AbstractStringBuffer
        // 2. StringBuffer 实现了 Serializable ，即 StringBuffer 的对象可以串行化(网络传输)
        // 3. 在 AbstractStringBuffer 有属性 char[] value，不是 final
        //    该 value 存放字符串内容，因此存放在堆中的
        // 4. StringBuffer 是 final ，不能被继承
        // 5. 因为 StringBuffer 字符内容存放在 char[] value ，所以在变化（增加/删除）
        //    不用每次都更换地址（即不是每次都创建新对象），所以效率高于 String
        StringBuffer stringBuffer = new StringBuffer();
    }
}
