package com.hspedu.innerclass;


/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        // 演示基于接口的匿名内部类
        // 1. 需求：想使用 Interface A，并创建对象
        // 2. 传统方法是：写一个类，实现该接口，并创建对象
        // 3. 需求：希望 Tiger() 类只是用一次，以后再也不使用
        // 4. 可以使用匿名内部类来简化
//        IA tiger = new Tiger();
//        tiger.cry();

        // 5. tiger 的编译类型？ IA
        // 6. tiger 的运行类型？ 就是匿名内部类
        /*
            我们看底层 : 系统会分配一个类名
            class XXXX implements IA { // XXXX = Outer04$1
                system.out.println("老虎叫唤...");
            }
         */
        // 7. jdk 底层，创建匿名内部类 Outer04$1，立即马上就创建了 Outer$1 实例，并且把地址返回给 tiger
        // 8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };

        System.out.println("tiger的运行类型：" + tiger.getClass()); // getclass() 获取对象的运行类型
        tiger.cry();


        // ==============================================================
        // 演示基于类的匿名内部类
        // 1. father的编译类型 Father
        // 2. father的运行类型 匿名内部类 Outer04$2
        // 3. 底层会创建匿名内部类
        /*
        class Outer04$2 extends Father {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test()方法");
            }
        }
        */
        // 4. 同时也返回了 匿名内部类 Outer04$2的对象
        // 5. 注意("Jack") 参数列表会传递给构造器
        Father father = new Father("Jack") {
            @Override
            public void test() {

                System.out.println("匿名内部类重写了test()方法");
            }

        };

        System.out.println("father对象的运行类型" + father.getClass()); // Outer04$2
        father.test();
        System.out.println(father.name);

//==================================================================================
        // 演示基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗在吃bone");
            }
        };
        animal.eat();

    }
}

interface IA { // 接口
    public void cry();
}
//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎在叫...嗷嗷嗷~~~");
//    }
//
//}
//class Dog implements IA {
//    @Override
//    public void cry() {
//        System.out.println("小狗在叫...汪汪汪~~~");
//    }
//}

class Father {
    public String name;
    public Father(String name) {
        this.name = name;
    }

    public void test() {
    }
}

abstract class Animal {
   abstract void eat();
}