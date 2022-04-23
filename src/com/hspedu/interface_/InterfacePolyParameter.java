package com.hspedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {

        // 接口的多态
        // 接口类型的变量 if01 可以指向 实现了 IF 接口的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        // 继承体现的多态
        // 父类类型的变量 aaa 可以指向继承 AAA 的子类的对象实例
        AAA aaa = new AAA();
        aaa = new CCC();

    }
}

interface IF {
}

class Monster implements IF {
}

class Car implements IF {
}

class AAA {
}

class CCC extends AAA {
}