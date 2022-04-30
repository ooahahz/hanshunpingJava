package com.chapter10.interface_;

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {

        // 接口类型的变量可以指向实现了该接口的类的对象的实例
        IG ig = new Teacher();

        // 多态传递现象
        // 如果 IG 继承了 IH 接口，而 Teacher 类实现了 IG 接口，
        // 相当于 Teacher 实现了 IH 接口。
        IH ih = new Teacher();
    }
}

interface IH {
    void hi();
}

interface IG extends IH {
}

class Teacher implements IG {
    @Override
    public void hi() {
        System.out.println("hi...");
    }
}
