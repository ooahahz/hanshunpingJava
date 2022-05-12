package com.chapter16.tankgame;

import javax.swing.*;

/**
 * @ClassName HspTankGame
 * @Author Oliver
 * @Date 2022/5/12 12:04
 * Description      TODO
 * @see
 */
public class HspTankGame01 extends JFrame {
    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();

    }
    public HspTankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
