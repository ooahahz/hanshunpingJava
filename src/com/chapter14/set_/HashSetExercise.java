package com.chapter14.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @ClassName HashSetExercise
 * Description
 * @Author haohao
 * @Date 2022/5/6 11:46
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Jack", 22));
        employees.add(new Employee("Tom", 32));
        employees.add(new Employee("Marry", 35));
        employees.add(new Employee("Jack", 22));

        // 重写了 equals() 和 hashCode()，只加入了三个对象到 HashSet
        System.out.println(employees);


    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 如果 name 和 age 值相同，返回相同的 hash 值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o; // 向下转型
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() { // 如果 Employee 对象的名字和年龄相同，计算hashcode()时，就会有相同的 hashCode
        return Objects.hash(name, age);
    }
}
