package com.chapter16.tankgame;

/**
 * @ClassName Tank
 * @Author Oliver
 * @Date 2022/5/12 11:58
 * Description      TODO
 * @see
 */
public class Tank {
    private int x; // 坦克横坐标
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
