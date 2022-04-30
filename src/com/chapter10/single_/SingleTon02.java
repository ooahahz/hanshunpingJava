package com.chapter10.single_;

/**
 * 演示懒汉式的单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        // 再次调用 getInstance()
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
    }
}

// 希望在程序运行中 ，只能创建一个 cat 对象
class Cat {
    private String name;
    private static Cat cat;
    public static int n1 = 888;

    // 步骤
    // 1. 仍然让构造器私有化
    // 2. 定义一个静态属性对象
    // 3. 提供一个public的static方法，返回一个cat对象
    // 4. 懒汉式，只用当用户使用getInstance方法时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象，从而保证了单例

    private Cat(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            // 如果还没有创建
            cat = new Cat("小可爱"); // 此时会激发构造函数
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
