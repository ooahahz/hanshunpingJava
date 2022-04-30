package com.chapter10.homework.homework5;


public class Scientist extends Emploee {
    private double yearEndBonus;

    public Scientist(String name, double salaryEachDay, int workDaysEachYear) {
        super(name, salaryEachDay, workDaysEachYear);
    }

    public double getYearEndBonus() {
        return yearEndBonus;
    }

    public void setYearEndBonus(double yearEndBonus) {
        this.yearEndBonus = yearEndBonus;
    }

    @Override
    public void printYearSalary() {
        System.out.println("科学家" + getName() + "的年工资为：" + (yearEndBonus + getWorkDaysEachYear() * getSalaryEachDay()));
    }
}
