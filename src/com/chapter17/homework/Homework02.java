package com.chapter17.homework;


/**
 * @ClassName Homework02
 * @Author Oliver
 * @Date 2022/5/15 22:14
 * Description      TODO
 * @see Thread
 */
public class Homework02 {
    public static void main(String[] args) {
        Withdraw withdraw = new Withdraw();
        Thread thread1 = new Thread(withdraw);
        thread1.setName("用户1");
        Thread thread2 = new Thread(withdraw);
        thread2.setName("用户2");
        thread1.start();
        thread2.start();
    }
}

// 因为这里涉及到多个线程共享资源，用Runnable
class Withdraw implements Runnable {
    private double balance = 10000;


    @Override
    public void run() {
        while (true) {
            // 1. 这里使用 synchronized 实现了线程同步
            // 2. 当多个线程执行到这里时，就会去争夺 this 对象锁
            // 3. 哪个线程争夺到 this 对象锁，就执行 synchronized 代码块，执行完后会释放this对象锁
            // 4. 争夺不到this对象锁，就blocked，准备下次争夺
            // 5. this 对象锁是非公平锁
            synchronized (this) {
                if (balance < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                balance -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出了1000元 " + "余额为：" + balance);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}