package com.chapter10.homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("小健", 100, 200);
        worker.printYearSalary();

        Peasant tom = new Peasant("Tom", 80, 330);
        tom.printYearSalary();

        Waiter waiter = new Waiter("小芳", 50, 320);
        waiter.printYearSalary();

        Teacher zhaxianhao = new Teacher("zhaxianhao", 400, 300);
        zhaxianhao.setBonusEachDay(50);
        zhaxianhao.printYearSalary();

        Scientist yang = new Scientist("杨振宁", 2000, 200);
        yang.setYearEndBonus(500000);
        yang.printYearSalary();
    }
}
