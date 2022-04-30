package com.chapter10.homework.homework5;


public class Peasant extends Emploee {
    public Peasant(String name, double salaryEachDay, int workDaysEachYear) {
        super(name, salaryEachDay, workDaysEachYear);
    }

    @Override
    public void printYearSalary() {
        System.out.print("农民" + getName());
        super.printYearSalary();
    }
}
