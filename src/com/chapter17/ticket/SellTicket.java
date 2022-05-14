package com.chapter17.ticket;

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

        System.out.println("====使用实现接口的方式来售票====");
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start(); // 第一个线程
        new Thread(sellTicket02).start(); // 第二个线程
        new Thread(sellTicket02).start(); // 第三个线程
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
