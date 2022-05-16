package com.chapter17.synchronized_;

/**
 * @ClassName SellTicket
 * @Author Oliver
 * @Date 2022/5/14 16:49
 * Description      TODO
 * 使用多线程，模拟三个窗口同时售票
 * @see
 */
public class SellTicket {
    public static void main(String[] args) {

//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        // 这里会出现超卖
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//
//        System.out.println("====使用实现接口的方式来售票====");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start(); // 第一个线程
//        new Thread(sellTicket02).start(); // 第二个线程
//        new Thread(sellTicket02).start(); // 第三个线程

        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}

// 实现接口方式，使用 synchronized 实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true; // 控制 run 的变量
    Object obj = new Object();

    // 同步方法（静态的）的锁为当前类本身
    //  1. public synchronized static void m1() 锁是加在 SellTicket03.class
    public synchronized static void m1(){

    }
    public static void m2() {
        //  2. 如果在静态方法中 实现一个同步代码块
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }


    // 1. public synchronized void sell(){} 就是一个同步方法
    // 2. 这时锁在 this 对象
    // 3. 也可以在代码块上写 synchronized ，同步代码块，互斥锁还是在 this 对象，也可以是其他对象
    public /*synchronized*/ void sell() {// 同步方法，在同一个时刻只能有一个线程来执行 run 方法
        synchronized (/*this*/ obj) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }

            // 休眠 50 毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数 = " + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell(); // sell() 是一个同步方法
        }
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100; // 让多个线程共享 ticketNum ，所以设置为 static

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            // 休眠 50 毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数 = " + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            // 休眠 50 毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数 = " + (--ticketNum));
        }
    }
}
