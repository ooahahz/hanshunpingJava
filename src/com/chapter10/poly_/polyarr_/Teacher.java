package com.chapter10.poly_.polyarr_;

public class Teacher extends Person{

    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " 我的salary是 " + salary;
    }

    // 特有方法
    public void teach() {
        System.out.println("老师 " + getName() + " 正在授课");
    }


}
