package com.hspedu.homework.homework8;

/**
 *
 */
public class SavingAccount extends BankAccount{
    // 新增加的属性
    private int count = 3;
    private double rate = 0.01; // 利率

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
//        判断是否可以免手续费
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1); // 把 1 元转入银行账户
        }
    }

    @Override
    public void withdraw(double amount) {
        // 判断是否可以免手续费
        if (count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount - 1);
        }
    }

    public void earnMonthlyInterest() {
        // 每个月初，统计上个月的利息，同时将 count = 3
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
