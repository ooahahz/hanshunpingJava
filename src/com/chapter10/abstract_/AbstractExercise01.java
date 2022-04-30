package com.chapter10.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {

        Manager manager = new Manager("haohao", "1220", 8000, 2000);
        System.out.println(manager.getSalary());
        System.out.println(manager.getBonus());
        manager.work();
        System.out.println("====================");

        CommonEmployee jack = new CommonEmployee("Jack", "2232", 3000);
        System.out.println(jack.getName());
        jack.work();

    }
}

// 1) 思考：abstract final class A{} 能编译通过吗？为什么？ 不能，final 不能被继承，因为抽象类不能被 final 修饰
// 2) 思考：abstract public static void test2() 能编译通过吗？为什么？ 不能，因为抽象类不能被 static 修饰
// 3) 思考：abstract private void test3() 能编译通过吗？为什么？ 不能，因为抽象类不能被 private 修饰

// 4) 编写一个 Employee 类，声明为抽象类，包含如下三个属性：name, id, salary。提供必要的构造器和抽象方法：work()。对于 Manager 类来说
//    他既是员工，还具有奖金(bonus)的属性。请使用继承的思想，设计CommonEmployee类和Manager类，要求类中必须提供必要的方法进行属性访问，实现work()，
//    提示“经理/普通员工/ 名字 工作中...”

abstract class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + this.getName() + "工作中...");
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + this.getName() + "工作中...");
    }
}
