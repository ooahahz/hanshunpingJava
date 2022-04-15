package com.hspedu.object_;

public class toString_ {
    public static void main(String[] args) {
        /*
        Object 的 toString() 源码
        //(1) getClass().getName() 类的全类名（包名+类名）
        //(2) Integer.toHexString(hashCode()) 将对象的 hashCode 转化为 16 进制字符串

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString());
        System.out.println(monster);// 当直接输出一个对象时， toString 方法会被默认的调用
        System.out.println(monster.hashCode());
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    // 重写 toString 方法，输出对象的属性

    @Override
    public String toString() { // 重写后，一般是把对象的属性值输出，当然程序员可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
