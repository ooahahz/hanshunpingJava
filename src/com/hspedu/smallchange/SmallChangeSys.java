package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    // 化繁为简
    // 1. 先完成显示菜单，并可以选择菜单，给出对应提示
    // 2. 完成零钱通明细
    // 3. 完成收益入账
    // 4. 完成消费

    public static void main(String[] args) {
        // 定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key;

        // 2. 完成零钱通明细
        // 思路：(1) 可以把收益入账和消费，保存到数组 (2) 可以使用对象 (3) 简单的话可以使用 String 拼接
        String details = "--------------零钱通明细--------------";

        // 3. 完成收益入账 (完成功能驱动程序员增加新的变量和代码)
        // 思路：定义新的变量
        double money;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 用于日期格式化

        // 4. 消费
        // 定义新变量，保存消费类型
        String consumeType;

        do{

            System.out.println("\n==============零钱通菜单=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            // 使用 switch 分支控制
            switch (key) {
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    // money 值的范围校验 ->> 一会儿再完善
                    // （这里的思想很重要）找出不正确的金额条件，然后给出提示，就直接 break
                    // 设立关卡
                    if (money <= 0) {
                        System.out.println("收益入账金额须大于0");
                        break;
                    }

                    balance += money;
                    // 拼接信息到 details
                    date = new Date(); // 获取当前日期
                    details += "\n收益入账\t\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;

                    break;
                case "3" :
                    System.out.println("消费类型：");
                    consumeType = scanner.next();
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    // 找出金额不正确的情况
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }

                    balance -= money;
                    date = new Date();
                    details += "\n" + consumeType + "\t\t" + "-" + money +"\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4" :
                    // 用户输入 4 退出时，给出提示“你确定要退出吗？y/n“，必须输入正确的y/n，否则进入循环直到输入正确
                    // (1) 定义一个变量 choice,接收用户的输入
                    // (2) 使用 while + break，来处理接收到输入时 y 或 n
                    // (3) 退出 while 后，再判断 choice 是 y 还是 n，就可以决定是否退出
                    // (4) 建议一段代码，完成一个小功能，尽量不要混在一起
                    String choice;

                    while (true) {
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while (loop);

        System.out.println("-------推出了零钱通项目-------");
    }


}
