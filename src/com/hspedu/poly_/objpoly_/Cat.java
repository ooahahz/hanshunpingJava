package com.hspedu.poly_.objpoly_;

public class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println("Cat cry() 小猫喵喵叫");
    }

    @Override
    public void getInfo() {
        System.out.println("此刻我是一只小猫");
    }
}
