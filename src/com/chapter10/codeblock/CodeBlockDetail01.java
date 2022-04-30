package com.chapter10.codeblock;

/**
 * (1) static 代码块也叫静态代码块，作用是对类进行初始化，而且它随着类的加载而执行，
 * 并且只会执行一次[重要]。如果是普通代码块，每创建一个对象，都会执行一次代码块
 *
 * (2) 类什么时候被加载？[重要]
 * 1. 创建对象实例时(new)
 * 2. 创建子类对象实例，父类也会被加载，而且父类优先被加载
 * 3. 使用类的静态成员时（静态属性，静态方法）
 *
 * (3) 普通代码块，在创建对象实例时，会被隐式地调用
 * 被创建一次，就会被调用一次
 * 如果只是使用类的静态成员时，普通代码块不会执行
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {

//        new AA();

//        System.out.println("=================");
//        new BB();
//
//        System.out.println("=================");
////        System.out.println(Cat.n1);
//        Cat.play();


        System.out.println(DD.n1); // 直接通过方法访问 DD 的静态属性时，此时只执行它的静态代码块，普通代码块不会执行
    }
}


class AA {
    // 静态代码块
    {
        System.out.println("AA 的静态代码块被执行");
    }
}

class BB extends AA {
    // 静态代码块
    {
        System.out.println("BB 的静态代码块被执行");
    }

}

class DD {
    public static int n1 = 8888;
    // 静态代码块
    static {
        System.out.println("DD 的静态代码块");
    }

    // 普通代码块，在 new 对象时被调用，而且是每创建一个对象，就调用一次
    // 可以这样简单的理解，普通代码块是构造器的补充
    {
        System.out.println("DD 的普通(构造)代码块");
    }
}

class Cat {
    // 静态成员变量
    public static int n1 = 999;

    // 静态方法
    public static void play() {
        System.out.println("miaomiao~~");
    }
    // 静态代码块
    {
        System.out.println("Cat 的静态代码块被执行");
    }


}