package com.chapter10.single_;



public class SingleTon01 {
    public static void main(String[] args) {

        // 直接通过方法可以获取对象
        Girlfriend instance = Girlfriend.getInstance();
        System.out.println(instance);
        Girlfriend instance2 = Girlfriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);

    }
}

// 有一个类，Girlfriend
// 只能有一个女朋友
class Girlfriend {
    private String name;

    // 为了能够在静态方法中返回 gf 对象，需要将其修饰为 static
    private static Girlfriend gf = new Girlfriend("小红"); // 只要类加载，这个对象就创建了
    // 如何保障我们只能创建一个 girlfriend 对象
    // 步骤[单例模式-饿汉式] (很着急，你可能还没有用到这个对象时，它就已经创建好了)
    // (1) 构造器私有化
    // (2) 在类的内部直接创建对象，该对象是 static
    // (3) 提供一个公共的静态方法，可以返回 gf 对象

    // 饿汉式可能会造成创建了对象资源的浪费，因为你可能没有使用它
    // 下面介绍懒汉式
    private Girlfriend(String name) {
        this.name = name;
    }
    public static Girlfriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
