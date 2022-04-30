package com.chapter10.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "hspedu";

        Person1 person2 = new Person1();
        person2.name = "hspedu";

        System.out.println(person1 == person2);
        System.out.println(person1.name.equals(person2.name));
        System.out.println(person1.equals(person2));

        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }
}


class Person1 {
    public String name;
}