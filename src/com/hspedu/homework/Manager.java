package com.hspedu.homework;

public class Manager extends Staff{
    private double bonus;

    // 创建 Manager 对象时，奖金是多少不确定，因此在构造器中不设置 bonus 参数
    public Manager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void income() {
        System.out.println("经理"+this.getName() + "的收入为" + (this.getBonus() + this.getDaySalary() * this.getWorkDays() * this.getGrade()));
    }
}
