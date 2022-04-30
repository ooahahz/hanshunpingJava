package com.chapter10.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person1.getTotalPerson());
        Person1 p1 = new Person1();
        System.out.println("Number of total is " + Person1.getTotalPerson());
    }

}

class Person1 {
    public int id;
    public static int total = 0;

    public static int getTotalPerson() {
//        id++;
        return total;
    }

    public Person1() {
        total++;
        id = total;
    }
}
