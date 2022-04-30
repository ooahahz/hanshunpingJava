package com.chapter10.homework.homework5;

public class Emploee {
    private String name;
    private double SalaryEachDay;
    private int workDaysEachYear;

    public Emploee() {
    }

    public Emploee(String name, double salaryEachDay, int workDaysEachYear) {
        this.name = name;
        SalaryEachDay = salaryEachDay;
        this.workDaysEachYear = workDaysEachYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryEachDay() {
        return SalaryEachDay;
    }

    public void setSalaryEachDay(double salaryEachDay) {
        SalaryEachDay = salaryEachDay;
    }

    public int getWorkDaysEachYear() {
        return workDaysEachYear;
    }

    public void setWorkDaysEachYear(int workDaysEachYear) {
        this.workDaysEachYear = workDaysEachYear;
    }

    public void printYearSalary() {
        System.out.println("全年工资为：" + getSalaryEachDay() * getWorkDaysEachYear());
    }
}
