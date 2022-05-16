package com.chapter18.tankgame04;

/**
 * @ClassName Shot
 * @Author Oliver
 * @Date 2022/5/15 23:07
 * Description      TODO
 * 射击子弹
 * @see
 */
public class Shot implements Runnable{
    int x;
    int y;
    int direct;
    int speed = 4; // 子弹的速度
    boolean isLive = true; // 子弹是否存货

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {

            // 休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 根据方向改变子弹 x y
            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
            // 测试，输出坐标
            System.out.println("子弹 x = " + x + " y = " + y);

            // 当子弹移动到面板的边界时，就应该销毁（把启动子弹的线程销毁）
            // 当子弹碰到敌方坦克时，也应该销毁
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <=750 && isLive)) {
                System.out.println("子弹线程结束");
                isLive = false;
                break;
            }

        }

    }
}
