package com.hspedu.homework.homework5;


public class Worker extends Emploee {
    public Worker(String name, double salaryEachDay, int workDaysEachYear) {
        super(name, salaryEachDay, workDaysEachYear);
    }

    @Override
    public void printYearSalary() {
        System.out.print("工人" + getName());
        super.printYearSalary();
    }
}
