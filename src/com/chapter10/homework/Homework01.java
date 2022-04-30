package com.chapter10.homework;

/**
 * 定义一个 Person 类{name, age, job} 初始化 Person 对象数组，有3个person对象
 * 并按照 age 从大到小进行排序（使用冒泡排序）
 */
public class Homework01 {
    public static void main(String[] args) {
        // 初始化 Person 对象数组，有三个person对象
        Person[] persons = new Person[3];
        persons[0] = new Person("Jack", 23, "student");
        persons[1] = new Person("Tom", 44, "Java工程师");
        persons[2] = new Person("Maryrio", 21, "AI工程师");

        for (Person person : persons) {
            System.out.println(person);
        }

        // 使用冒泡排序
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getName().length() < persons[j+1].getName().length()) {
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }

        // 排序后的效果
        System.out.println("排序后的效果");
        for (Person person: persons) {
            System.out.println(person.toString());
        }

    }
}
