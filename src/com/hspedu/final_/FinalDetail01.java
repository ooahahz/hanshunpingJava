package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC(); // CC 类是 final 的，可以被实例化对象，但是不能被继承

        EE ee = new EE();
        ee.cal();
    }
}

class AA {
    /**
     * 赋值的位置有三个地方
     * 1. 定义时赋值
     * 2. 构造器中赋值
     * 3. 代码块中赋值
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 8.8;
    }
}


class BB {
    /**
     *  如果 final 修饰的属性是 static 的，则初始化的位置只能是
     *  1. 定义时
     *  2. 在静态代码块中
     *  3. 不能在构造器中（why）
     */

    public static final double TAX_RATE = 0.03;
    public static final double TAX_RATE2; // 静态变量在类加载的时候就创建了
//    public static final double TAX_RATE3;

//    public BB {
//        TAX_RATE3 = 0.01; // 不能在构造器中赋值，因为只有在创建 BB 对象时才会触发构造器，在类加载的时候 TAX_RATE3 没有赋值
//    }

    static {
        TAX_RATE2 = 0.02;
    }
}

final class CC { // final 类可以被实例化对象

}

// 如果类不是 final 类，但是含有 final 方法，则该方法虽然不能重写，但是可以被继承
// 即仍然遵守继承的机制
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}

class EE extends DD {

}