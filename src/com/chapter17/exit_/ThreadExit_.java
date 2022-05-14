package com.chapter17.exit_;

/**
 * @ClassName ThreadExit_
 * @Author Oliver
 * @Date 2022/5/14 17:32
 * Description      TODO
 * @see
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        // 如果希望主线程去控制 t1 线程的终止，就必须可以修改 loop 变量
        // 让 t1 退出 run 方法，从而终止 t1 线程 -> 通知方式

        // 让主线程休眠 10s，再通知 t1 线程退出
        System.out.println("main 线程休眠10s");
        Thread.sleep(10 * 1000);
        t1.setLoop(false);

    }
}

class T extends Thread {
    private int count = 0;
    // 设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while(loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T 运行中..."+ (++count));
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
