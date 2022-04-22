package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");

    }
}

// 抽象类的本质还是类，可有有属性和各种方法
abstract class D {
    public int n1 = 10;
    public static String name = "haohao";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}

abstract class E {
    public abstract void hi();
    public abstract void hello();
}

class F extends E {
    @Override
    public void hi() {
        System.out.println("hi"); // 实现了父类 E 的抽象方法
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}

//抽象方法不能使用 private, final, static 修饰，因为这些关键字都是和重写相违背的
// 如果抽象方法被 final 修饰，说明它是不可更改的，儿子类需要重写父类的抽象方法，矛盾
//抽象类不可以定义静态方法，主要有两个原因。
// 首先是抽象类和接口都不可以被实体化，不能实体化就没有内存，但是static 的方法跟随的是整个类，在实体化之前就已经被分配了内存，这两点相矛盾。
// 第二个原因是因为之所以要定义抽象类是要把它作为parent class被子类继承，然后在子类中覆写抽象类中的方法，但是static method并不可以被覆写，所以不可以出现在abstract class里面。

abstract class H {
//    private abstract void hi(); // 不能被 private 修饰很容易理解：如果修饰为private，只能类内访问，其他类以至于子类都不能访问
}