package com.chapter16.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MyPanel
 * @Author Oliver
 * @Date 2022/5/12 12:01
 * Description      TODO
 * 坦克大战绘图区
 * @see
 */
public class MyPanel extends JPanel {
    // 定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        // 画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }


    /**
     * @param x         坦克的左上角横坐标
     * @param y         坦克左上角纵坐标
     * @param g         画笔
     * @param direction 坦克的方向
     * @param type      坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0: // 我方坦克
                g.setColor(Color.cyan);
                break;

            case 1: // 敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        // 根据坦克方向，来绘制坦克
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x+30, y, 10, 60, false); // 右边轮子
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.fillOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y, x+20, y+30); // 炮筒

                break;
            default:
                System.out.println("暂时没有处理");
        }

    }
}
