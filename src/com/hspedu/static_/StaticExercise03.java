package com.hspedu.static_;

public class StaticExercise03 {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        Person.getTotal();
    }

}

class Person {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
//      this.total = total; // 这里是错的，在static方法中，不能使用 this 关键字
        Person.total = total;
    }
    public Person() {
        total++;
        id = total;
    }

    public static void getTotal() {
        System.out.println(Person.total);
    }
}

