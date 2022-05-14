package com.chapter17.method;

/**
 * @ClassName ThreadMethod02
 * @Author Oliver
 * @Date 2022/5/14 21:49
 * Description      TODO
 * @see
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i+ " 包子");
            if (i == 5) {
                System.out.println("主线程让子线程先吃");
                // join() 线程插队
//                t2.join(); // 相当于让t2 线程先执行完毕

                Thread.yield(); // 礼让，不一定成功

                System.out.println("子线程吃完了，主线程接着吃");
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程吃了" + i + " 包子");

        }
    }
}