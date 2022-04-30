package com.chapter10.homework.homework5;

public class Waiter extends Emploee {
    public Waiter(String name, double salaryEachDay, int workDaysEachYear) {
        super(name, salaryEachDay, workDaysEachYear);
    }

    @Override
    public void printYearSalary() {
        System.out.print("服务员" + getName());
        super.printYearSalary();
    }
}
