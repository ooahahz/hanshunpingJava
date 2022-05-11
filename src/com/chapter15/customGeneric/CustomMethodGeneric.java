package com.chapter15.customGeneric;

/**
 * @ClassName CustomMethodGeneric
 * @Author Oliver
 * @Date 2022/5/11 17:58
 * Description      TODO
 * 泛型方法的使用
 * 1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
 * 2. 当泛型方法被调用时，类型会确定
 * 3. public void eat(E e), 修饰符后没有<T, R...>，eat 方法不是泛型方法，而是使用了泛型
 * @see
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {

        Car car = new Car();
        car.fly("宝马", 100); // 当调用方法时，传入参数，编译器就会确定类型
        Fish<String, Integer> fish = new Fish<>();
        fish.run();
        fish.eat("虾子", 300);
    }
}

// 泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car { //
    public void run() {// 普通方法

    }

    // 1. <T, R> 泛型标识符，提供给 fly 使用
    public <T, R> void fly(T t, R r) { // 泛型方法
        System.out.println(t + " " + r);
    }
}

class Fish<T, R> { // 泛型类
    public void run() {
        System.out.println("the fish is running");
    }

    public <U, M> void eat(U u, M m) { // 泛型方法 (此处使用了自己声明的泛型)
        System.out.println("this fish ate " + m + " " + u);

    }

    // 说明 hi 不是泛型方法，因为修饰符public后面没有<T t>, 而是 hi 方法使用了 Fish 类声明的泛型
    public void hi(T t) {

    }

    // 泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    public<K> void hello(R r, K k) {

    }

}

