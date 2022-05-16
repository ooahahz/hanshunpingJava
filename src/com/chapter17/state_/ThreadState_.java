package com.chapter17.state_;

/**
 * @ClassName ThreadState_
 * @Author Oliver
 * @Date 2022/5/15 9:53
 * Description      TODO
 * @see Thread
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName()+ " 状态 " + t.getState());

        t.start();
        while (t.getState() != Thread.State.TERMINATED) {
            System.out.println(t.getName()+ " 状态 " + t.getState());
            Thread.sleep(1000);
        }

        // 已经终止
        System.out.println(t.getName()+ " 状态 " + t.getState());
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}
