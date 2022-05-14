package com.chapter17.exercise;

/**
 * @ClassName ThreadMethodExercise
 * @Author Oliver
 * @Date 2022/5/14 22:24
 * Description      TODO
 * @see Thread
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        SonThread sonThread = new SonThread();
        Thread thread = new Thread(sonThread);

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
            if (i == 5) {
                thread.start();
                thread.join(); // 子线程插队
            }
        }
        System.out.println("主线程结束");

    }
}

class SonThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("子线程结束");
    }
}
