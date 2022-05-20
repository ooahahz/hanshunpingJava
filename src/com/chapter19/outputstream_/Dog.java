package com.chapter19.outputstream_;

import java.io.Serializable;

/**
 * @ClassName Dog
 * @Author Oliver
 * @Date 2022/5/19 23:19
 * Description      TODO
 * @see
 */
public class Dog implements Serializable { // 这里一定要实现 Serializable
    private String name;
    private int age;
    // 序列化版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;
    private String hobby; // 有序列号的话，添加一个新的 hobby 属性，不会认为这是一个新的类，只是版本的修改
    // 序列化对象时，默认将里面所有的属性进行序列化，但除了 static 和 transient 修饰的成员
    private static String nation;
    private transient String color;

    // 序列化对象时，要求里面的属性的类型也需要实现序列化接口
    private Master master;

    public Dog(String name, int age, String color, String hobby, String nation, Master master) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hobby = hobby;
        Dog.nation = nation;
        this.master = master;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", color='" + color + '\'' +
                ", nation='" + nation + '\'' +
                ", master='" + master.getName() + '\'' +
                '}';
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
