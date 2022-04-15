package com.hspedu.object_;

// 演示 Finalize 的用法
public class Finalize_ {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");
        // Car 对象没有引用了，这时 Car 对象就是一个垃圾，垃圾回收器就会回收（销毁）对象，
        // 将堆的空间释放，在回收对象前，会调用该对象的 Finalize 方法，程序员就可以在 finalize 中，
        // 写自己的业务逻辑（比如释放资源：数据库连接，打开文件...）
        // 如果程序员不重写 finalize ，那么就会调用 Object 类的 Finalize，即默认处理
        // 如果程序员重写了 Finalize，就可以实现自己的逻辑
        bmw = null;
        System.gc();
        System.out.println("程序退出了");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 重写 finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放额某些资源...");
    }
}
