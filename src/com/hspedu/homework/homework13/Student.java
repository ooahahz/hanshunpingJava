package com.hspedu.homework.homework13;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println(getName() + "承诺，我会好好学习。");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    // 编写一个输出信息的方法，体现封装
    public void printInfo() {
        System.out.println("学生的信息");
        System.out.println(basicInfo());
        System.out.println("学号: " + stu_id);
        study(); // 组合
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student " +
                "stu_id='" + stu_id + '\'' +
                ' ' + super.toString();
    }
}
