package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        // 证明接口中的属性是 static
        System.out.println(IB.n1);

//        IB.n1 = 30; // 说明 n1 是 final 的，不能被修改

    }
}

interface IB {

    // 接口中的属性只能是final的，而且是 public static final 修饰符（修饰符省略）
    int n1 = 100; // 等价于 public static final int n1 = 100; 怎么证明这个属性的修饰符不是默认的呢?

    void hi();
}


interface IC {

    void see();
}

// 接口不能继承其他的类，但可以继承多个别的接口
interface ID extends IB, IC {

}

// 一个类可以实现多个接口
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void see() {

    }
}
