package com.hspedu.homework.homework13;


public class HomeWork13 {
    public static void main(String[] args) {
        // 测试
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo();

        System.out.println("----------------------------------");

        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();

        System.out.println("----------------------------------");


        // 定义多态数组，里面保存2个学生和2个教师，要求按照年龄从高到低排序
        Person[] persons = new Person[4];
        persons[0] = new Student("Jack", '男', 10, "0001");
        persons[1] = new Student("Mary", '女', 12, "0003");
        persons[2] = new Teacher("Candy", '女', 33, 5);
        persons[3] = new Teacher("Scott", '男', 43, 6);


        // 创建对象，才能调用非静态方法
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(persons);

        // 显示年龄排序后的结果
        // 排序后的数组情况
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("====================");

        // 遍历数组调用 test 方法
        for(Person person : persons) { // 遍历多态数组
            homeWork13.act(person);
        }

    }

    // 定义方法, 完成年龄从高到低排序
    public void bubbleSort(Person[] persons) {
        Person temp ;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    // 定义方法，形参为 Person 类型，功能：调用学生的 study 或老师的 teach 方法
    public void act(Person person) {
        if (person instanceof Student) {
            // 如果 p 的运行类型是 Student
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("Do nothing~~");
        }

    }

}
