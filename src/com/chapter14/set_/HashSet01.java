package com.chapter14.set_;

import java.util.HashSet;

/**
 * @ClassName HashSet01
 * Description
 * @Author haohao
 * @Date 2022/5/4 17:12
 */
public class HashSet01 {
    public static void main(String[] args) {

        HashSet<Object> set  = new HashSet<>();
        // 说明：
        // 1. 在执行 add 方法后，会返回一个 boolean 值
        // 2. 如果添加成功，返回 true，否则返回 false
        // 3. 可以通过 remove 指定删除对象
        System.out.println(set.add("john")); // true
        System.out.println(set.add("lucy")); // true
        System.out.println(set.add("john")); // false
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));

        set.remove("john");
        System.out.println(set); // 打印出来的顺序不一定是放入的顺序

        set = new HashSet<>();
        System.out.println(set); // []
        // 4. HashSet 不能添加相同的元素/数据
        set.add("lucy"); // 添加成功
        set.add("lucy"); // 添加不了

        // 两只不同的狗，只是它们的名字相同而已
        set.add(new Dog("tom")); // OK
        set.add(new Dog("tom")); // OK

        System.out.println(set);

        // 再加深一下，非常经典的面试题
        set.add(new String("hap")); // OK
        set.add(new String("hap")); // 添加不了
        System.out.println(set);
    }
}

class Dog { // 定义了 Dog 类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}