package com.chapter10.poly_.polyarr_;

public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + " 我的分数为 " + score;
    }

    // 特有方法
    public void study() {
        System.out.println("学生 " + getName() + " 正在学习");
    }
}
