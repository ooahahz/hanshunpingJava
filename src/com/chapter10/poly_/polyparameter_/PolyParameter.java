package com.chapter10.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee e  = new NormalEmployee("Jack", 5000.0);
        Employee m = new Manager("Victor", 20000.0, 8000.0);

        PolyParameter polyParameter = new PolyParameter(); // 创造一个对象才能调用非静态(实例)方法
        System.out.println(e.getAnnual());
        System.out.println(polyParameter.showEmpAnnual(e));

        System.out.println(m.getAnnual());
        System.out.println(polyParameter.showEmpAnnual(m));

        System.out.println(polyParameter.testWork(e));
        System.out.println(polyParameter.testWork(m));

    }

    public String showEmpAnnual(Employee e) {
        return e.getName() + "的年工资为" + e.getAnnual();
    }

    public String testWork(Employee e) {
        if (e instanceof Manager) {
            return ((Manager) e).manage(); // 向下转型的操作
        } else if (e instanceof NormalEmployee) {
            return ((NormalEmployee) e).work();
        } else {
            return "输入有误";
        }
    }
}
