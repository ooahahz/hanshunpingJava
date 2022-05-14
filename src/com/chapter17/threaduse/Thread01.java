package com.chapter17.threaduse;

/**
 * @ClassName Thread01
 * @Author Oliver
 * @Date 2022/5/14 10:06
 * Description      TODO
 * 演示通过继承 Thread 类创建线程
 * @see
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException { // main 线程
        // 创建一个 Cat 对象，可以当作线程使用
        Cat cat = new Cat();

        // 读源码
        /*
        (1)
        public synchronized void start() {
            start0();
        }
        (2)
        // start0()是本地方法，是JVM调用，底层是C/C++实现
        // 真正实现多线程的效果是，是 start0()，而不是 run()
         private native void start0();
         */

        cat.start();// 启动线程 Thread-0   最终会执行cat的run方法
//        cat.run(); // run 方法就是一个普通的方法，并没有真正启动线程。程序会将 run 方法执行完毕再往下执行
        // 说明：当 main 线程启动一个子线程 Thread-0 ，主线程不会阻塞，会继续执行
        // 这时，主线程和子线程交替执行。。。
        System.out.println("主线程继续执行 " + Thread.currentThread().getName()); // 线程名字 main
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            // 让主线程休眠
            Thread.sleep(1000);

        }

    }
}

// 1. 当一个类继承了 Thread 类，该类就可以当作线程使用
// 2. 我们会重写 run 方法，写上自己的业务逻辑
// 3. run:  Thread 类实现了 Runnable 接口的 run 方法
/*
 @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {
    int times = 0;

    @Override
    public void run() { // 重写，写自己的逻辑

        while (true) {
            // 该线程每隔一秒，在控制台输出“喵喵，我是小猫咪”
            System.out.println("喵喵，我是小猫咪" + (++times) + " 线程名" + Thread.currentThread().getName());
            // 让线程休眠一秒
            try {
                Thread.sleep(1000); // 休眠一秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;
            }
        }
    }
}
