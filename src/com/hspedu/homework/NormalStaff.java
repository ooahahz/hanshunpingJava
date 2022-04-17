package com.hspedu.homework;

public class NormalStaff extends Staff {

    public NormalStaff(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void income() {
        System.out.println("普通员工" + this.getName() + "的收入为: " + this.getDaySalary()* this.getWorkDays()* getGrade());
    }
}
