package com.chapter16.tankgame2;

import javax.swing.*;

/**
 * @ClassName HspTankGame
 * @Author Oliver
 * @Date 2022/5/12 12:04
 * Description      TODO
 * @see
 */
public class HspTankGame02 extends JFrame {
    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame02 hspTankGame01 = new HspTankGame02();

    }
    public HspTankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
