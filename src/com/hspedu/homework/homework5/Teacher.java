package com.hspedu.homework.homework5;


public class Teacher extends Emploee {
    private double bonusEachDay;

    public Teacher(String name, double salaryEachDay, int workDaysEachYear) {
        super(name, salaryEachDay, workDaysEachYear);
    }

    public double getBonusEachDay() {
        return bonusEachDay;
    }

    public void setBonusEachDay(double bonusEachDay) {
        this.bonusEachDay = bonusEachDay;
    }

    @Override
    public void printYearSalary() {
        System.out.println("老师"+ getName() + "的年工资为" + (getWorkDaysEachYear() * (getSalaryEachDay() + bonusEachDay)));
    }
}
