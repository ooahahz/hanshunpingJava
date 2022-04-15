package com.hspedu.poly_.polyparameter_;

public class Manager extends Employee{

    private Double bonus;

    public Manager() {
    }

    public Manager(Double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, Double salary, Double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String manage() {
        return "Manager " + getName() + "正在管理... ";
    }

    @Override
    public Double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
