package com.chapter10.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("wukong");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();

    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }
}

// 接口
interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}


// 继承
// 小结：当子类继承了父类，就自动拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式进行扩展
//      可以理解实现接口是对java单继承机制的一种补充
class LittleMonkey extends Monkey implements Fishable, Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以像鸟儿一样飞翔");

    }
}
