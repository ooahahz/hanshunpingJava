package com.hspedu.static_;


public class StaticExercise01 {
    public static void main(String[] args) {
        new StaticExercise01().count();
        new StaticExercise01().count();
        System.out.println(StaticExercise01.count);
    }

        static int count = 9;
        public void count() {
            System.out.println("count = " + (count++));
        }
}
