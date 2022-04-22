package com.hspedu.final_;

public class FinalExercise02 {

    public static void main(String[] args) {
        System.out.println(Something.addOne(4));
    }

}

class Something {
    public static int addOne(final int x) {
//        ++x; // 错误，final 不能改变值
        return x + 1;
    }
}
