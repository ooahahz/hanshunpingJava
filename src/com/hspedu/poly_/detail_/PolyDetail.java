package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        // 父类的引用指向了子类的对象
        // 向上转型
        // 语法：父类类型引用名 = new 子类类型()
        Animal animal = new Cat("Tom");

//        Object obj = new Cat(); // 可以吗？可以 Object 也是Cat的祖宗类


        // 向上转型调用方法的规则如下：
        // (1)可以调用父类的所有成员（须遵循访问权限）
        // (2)但是不能调用子类的特有的成员
        // (3)因为在编译阶段，能调用哪些成员，是由编译类型决定的
        // animal.catchMouse(); 错误
        // (4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类开始查找方法
        // 然后调用，规则和我们前面讲的调用规则一致

        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        System.out.println(animal.name);

        // 希望调用 Cat 的 catchMouse 方法
        // 多态的向下转型
        // (1)语法：子类类型 引用名 = （子类类型）父类引用

        // cat 的编译类型是 Cat, 运行类型也是 Cat (由于向下转型)
        Cat cat = (Cat)animal; //
        cat.catchMouse(); // 猫抓老鼠
        // (2) 要求父类的引用必须指向的是当前目标类型的对象

       System.out.println("OK~");

    }
}
