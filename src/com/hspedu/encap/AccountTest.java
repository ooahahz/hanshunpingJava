package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Marry", 20, "222222222");
//        System.out.println(account.getName());
//        System.out.println(account.getBalance());
//        System.out.println(account.getPassword());
        account.showInfo();

    }
}
