package com.chapter18.tankgame04;

/**
 * @ClassName Bomb
 * @Author Oliver
 * @Date 2022/5/16 17:40
 * Description      TODO
 * @see
 */
public class Bomb {
    int x, y; // 爆炸的坐标
    int life = 9; // 炸弹的生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
