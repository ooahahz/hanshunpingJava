package com.chapter15.customGeneric;

import java.util.Arrays;

/**
 * @ClassName CustomGeneric
 * @Author Oliver
 * @Date 2022/5/11 16:27
 * Description      TODO
 * @see
 */
@SuppressWarnings("all")
public class CustomGeneric {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> g = new Tiger<Double, String, Integer>("john");
        g.setT(10.9);
//        g.setT("yy"); // 错误，类型不对
        System.out.println(g);

        Tiger g2= new Tiger("john~~"); // OK  默认情况   T = Object  R = Object  M = Object
        g2.setT("yy"); // OK 因为 T = Object "yy" 是 String 类型，为　Object 的子类
        System.out.println(g2);

    }
}


// 1. Tiger 后面泛型，我们把 Tiger 称为自定义泛型类
// 2. T，R，M 泛型的标识符，一般是单个大写字母
// 3. 泛型标识符可以有多个
// 4. 普通成员可以使用泛型（属性、方法）
// 5. 使用泛型的数组不能初始化
// 6. 静态方法不能使用泛型
class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;
    T[] ts;


    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(String name, R r, M m, T t) { // 构造器使用泛型
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    // 因为静态是和类相关的，在类加载的时候对象还没有创建
    // 所以如果静态方法和静态属性使用了泛型，JVM 就无法完成初始化
//    static R r2; // 在类加载的时候 不知道 R 具体是什么类型
//    public static void m1(M m) {
//    }

    // 方法使用到泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() { // 返回类型可以使用泛型
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "\nTiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}
