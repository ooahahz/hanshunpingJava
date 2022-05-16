package com.chapter17.homework;

import java.util.Scanner;

/**
 * @ClassName Homework01
 * @Author Oliver
 * @Date 2022/5/15 21:41
 * Description      TODO
 * @see
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();

    }
}

class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        // 输出 1-100数字
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

// 直到第二个线程从键盘读取了“Q”命令
class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) { // 在构造器中，直接传入 A 对象
        this.a = a;
    }

    @Override
    public void run() {
        // 接收到用户的输入
        while (true) {
            System.out.println("请输入你的指令(Q)表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                // 以通知的方式结束 A 线程
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }
    }
}