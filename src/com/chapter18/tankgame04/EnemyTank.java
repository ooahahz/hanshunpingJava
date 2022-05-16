package com.chapter18.tankgame04;

import java.util.Vector;

/**
 * @ClassName EnemyTank
 * @Author Oliver
 * @Date 2022/5/12 17:26
 * Description      TODO
 * @see
 */
public class EnemyTank extends Tank {
    // 在敌人坦克类使用 Vector 保存多个 Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
