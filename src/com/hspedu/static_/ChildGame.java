package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {

        Child child1 = new Child("白骨精");
        child1.join();

        Child child2 = new Child("狐狸精");
        child2.join();

        Child child3 = new Child("老鼠精");
        child3.join();

        //==============
        // 类变量可以通过类直接访问
        System.out.println("共有" + Child.count + "小孩加入了游戏");
    }
}


class Child {

    private String name;
    public static int count = 0; // 定义一个变量 count，是一个类变量（静态变量） static 静态
    // 该变量最大的特点就是会被 Child 类的所有对象实例共享

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏");
        count++;
    }
}
