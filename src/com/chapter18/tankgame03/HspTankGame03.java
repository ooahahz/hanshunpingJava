package com.chapter18.tankgame03;

import javax.swing.*;

/**
 * @ClassName HspTankGame
 * @Author Oliver
 * @Date 2022/5/12 12:04
 * Description      TODO
 * @see
 */
public class HspTankGame03 extends JFrame {
    // 定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame03 hspTankGame01 = new HspTankGame03();

    }
    public HspTankGame03() {
        mp = new MyPanel();
        // 将 mp放入到 Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
