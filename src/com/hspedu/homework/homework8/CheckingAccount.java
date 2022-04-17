package com.hspedu.homework.homework8;

/**
 * 在上面类基础上扩展新类，对每次存款和取款收取1美元手续费
 */
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1); // 巧妙地使用了父类的 deposit 方法
        // 一块钱入银行的账号
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
        // 一块钱转入银行的账号
    }
}
