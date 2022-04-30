package com.chapter10.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(Aa.a);
        System.out.println(B.a);

    }
}

interface Aa {
    int a = 23;
}

class B implements Aa {

}
