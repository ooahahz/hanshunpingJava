package com.chapter16.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @ClassName MyPanel
 * @Author Oliver
 * @Date 2022/5/12 12:01
 * Description      TODO
 * 坦克大战绘图区
 * @see
 */

// 为了监听键盘事件，实现 KeyListener
public class MyPanel extends JPanel implements KeyListener {
    // 定义我的坦克
    Hero hero = null;

    // 定义敌人坦克，放入到 Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
        hero.setSpeed(10);
        // 初始化敌人的坦克
        for(int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirection(2); // 设置方向
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        // 画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);

        // 画出敌人的坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g,enemyTank.getDirection() , 0);
        }

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
            case 0: // 上
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); // 右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y); // 炮筒
                break;
            case 1: // 右
                g.fill3DRect(x, y, 60, 10, false); // 上面轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2: // 下
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); // 右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3: // 左
                g.fill3DRect(x, y, 60, 10, false); // 上面轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 处理wdsa键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            // 改变坦克的方向
            hero.setDirection(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(3);
            hero.moveLeft();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
