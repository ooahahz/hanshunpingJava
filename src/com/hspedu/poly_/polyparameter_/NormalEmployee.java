package com.hspedu.poly_.polyparameter_;

public class NormalEmployee extends Employee{
    public NormalEmployee() {
    }

    public NormalEmployee(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public Double getAnnual() {
        return super.getAnnual() ;
    }

    public String work() {
        return "员工" + getName() + "正在工作...";
    }
}
