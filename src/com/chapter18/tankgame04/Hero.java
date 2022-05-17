package com.chapter18.tankgame04;

import java.util.Vector;

/**
 * @ClassName Hero
 * @Author Oliver
 * @Date 2022/5/12 11:59
 * Description      TODO
 * 自己的坦克
 * @see
 */
public class Hero extends Tank {
    Shot shot = null; // 定义一个Shot对象，表示一个射击行为
    // 可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y) {
        super(x, y);
    }

    // 射击
    public void shotEnemyTank() {

        // 控制我们的面板上最多只有5 颗子弹
        if (shots.size() == 5) {
            return;
        }

        // 创建 Shot 对象，根据当前 Hero 对象的位置和方向来创建 Shot
        switch (getDirection()) { // 得到 Hero 对象方向
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        // 把新建的 shot 放入到shots
        shots.add(shot);
        // 启动我们的 Shot 线程

        new Thread(shot).start();
    }
}
