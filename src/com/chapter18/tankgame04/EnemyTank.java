package com.chapter18.tankgame04;

import java.util.Vector;

/**
 * @ClassName EnemyTank
 * @Author Oliver
 * @Date 2022/5/12 17:26
 * Description      TODO
 * @see
 */
public class EnemyTank extends Tank implements Runnable {
    // 在敌人坦克类使用 Vector 保存多个 Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            // 这里我们判断如果 shots size() = 0，创建一颗子弹放入集合中，并启动
            if (isLive && shots.size() < 1) {
                Shot s = null;
                // 判断坦克的方向，创建对应的子弹
                switch (getDirection()) {
                    case 0:
                        s = new Shot(getX()+20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX()+60, getY()+20, 1);
                        break;
                    case 2:
                        s = new Shot(getX()+20, getY()+60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY()+20, 3);
                        break;
                }
                shots.add(s);

                // 启动
                new Thread(s).start();

            }

            // 根据坦克的方向继续移动
            switch (getDirection()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < 30; j++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

                case 3:
                    for (int j = 0; j < 30; j++) {

                        if(getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }


            // 然后随机地改变坦克方向
            setDirection((int) (Math.random() * 4)); // [0, 4)-->[0, 3]

            // 一定要考虑清楚该线程什么时候结束
            if (!isLive) {
                break;
            }
        }
    }
}
