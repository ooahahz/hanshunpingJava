package com.chapter18.tankgame04;

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

    private int direction; // 坦克方向 0，1，2，3

    private int speed = 1;

    // 上 右 下 左 移动
    public void moveUp() {
        y -= speed;
    }
    public void moveRight() {
        x += speed;
    }
    public void moveDown() {
        y += speed;
    }
    public void moveLeft() {
        x -= speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
