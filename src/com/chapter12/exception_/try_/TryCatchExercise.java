package com.chapter12.exception_.try_;


import java.util.Scanner;

/**
 * @author ooah
 * @version 1.0
 */
public class TryCatchExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入一个整数");
            try {
                num = Integer.parseInt(scanner.next()); //这里可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数");
            }
        }

        System.out.println("你输入的值为：" + num);


    }
}
