package com.hspedu.object_;

import java.util.Objects;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 15, '女');
        Person person2 = new Person("Jack", 15, '女');
        System.out.println(person1.equals(person2));

    }
}

// 判断两个 Person 对象的内容是否相同
// 如果两个 Person 对象的各个属性值都一样
class Person { // extends Object
    private String name;
    private int age;
    private char gender;

    public Person() {

    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.age == person.age && this.gender == person.gender && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}


