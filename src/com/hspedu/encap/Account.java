package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account() { // 无参构造器

    }
    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.account = account;
//        this.password = password;
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("名字的范围必须为2位3位或4位");
            this.name = "Jack";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance=balance;
        } else {
            System.out.println("余额必须大于20，给你默认余额0");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须为6位，给你默认密码 000000");
            this.password = "000000";
        }
    }

    // 显示账号信息
    public void showInfo() {
        System.out.println("账号信息 name = " + name + " 余额 = " + balance + " 密码 = " + password);
    }

}
