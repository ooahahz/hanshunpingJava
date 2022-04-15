package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student smith = new Student("smith", 20, 123456, 99.8);
        System.out.println(smith.say());
    }
}
