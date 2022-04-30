package com.chapter10.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A_ {
    int x = 0; // public static final int x = 0;
}

class B_ {
    int x = 1; // 普通属性
}

class C extends B_ implements A_ {
    public void pX() {
        System.out.println(A_.x + "\n" + super.x); // 这个 x 到底是 A_ 还是 B_ 里面的 x ，所以会造成冲突
    }
}

// 小结：类的五大成员已经讲了四个了：1.属性 2.方法 3.构造器 4.代码块 (5.内部类)