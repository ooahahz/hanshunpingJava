package com.chapter10.homework.homework8;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10); // 1010-1 = 1009
//        checkingAccount.withdraw(9); // 1009-9-1 = 999
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        // 月初，定时器自动调用 earnMontylInterest
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100); // 免手续费
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100); // 免手续费
        savingAccount.withdraw(100); // 免手续费
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());


    }
}
