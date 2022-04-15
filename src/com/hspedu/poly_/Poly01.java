package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom= new Master("Tom");
        Dog dog= new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);

        System.out.println("===============");

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);

        System.out.println("===============");
        // 添加给小猪喂饭
        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("米饭");
        tom.feed(pig, rice);
    }


}
