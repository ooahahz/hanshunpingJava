package com.chapter18.tankgame04;

import javafx.beans.binding.BooleanBinding;

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

// 为了让 Panel 不停的重绘子弹，需要将 MyPanel 实现 Runnable 接口，当作一个线程使用
// 为了监听键盘事件，实现 KeyListener
public class MyPanel extends JPanel implements KeyListener, Runnable {
    // 定义我的坦克
    Hero hero = null;

    // 定义敌人坦克，放入到 Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    // 定义一个Vector，用于存放炸弹
    // 说明：当子弹击中坦克时，加入一个 Bomb 对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    // 定义三张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
        hero.setSpeed(10);
        // 初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            enemyTank.setDirection(2); // 设置方向
            // 给 enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            // 加入 enemyTank 的 Vector
            enemyTank.shots.add(shot);
            // 启动shot对象
            new Thread(shot).start();

            enemyTanks.add(enemyTank);
        }
        // 初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\haohao\\OneDrive\\document\\hspJava\\分享资料\\分享资料\\bomb_1.gif");
        image2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\haohao\\OneDrive\\document\\hspJava\\分享资料\\分享资料\\bomb_2.gif");
        image3 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\haohao\\OneDrive\\document\\hspJava\\分享资料\\分享资料\\bomb_3.gif");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        // 画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);

        // 画出 hero 射击的子弹
        if (hero.shot != null && hero.shot.isLive) {
            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        }

        // 如果 bombs 集合中有对象，就画出
        for(int i = 0; i < bombs.size(); i++) {
            // 取出炸弹
            Bomb bomb = bombs.get(i);
            // 根据当前这个 bomb 对象的 life 值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            // 让炸弹的生命值减少
            bomb.lifeDown();
            // 如果bomb 的life = 0， 就从 bombs 的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        // 画出敌人的坦克，遍历Vector
        for (EnemyTank enemyTank : enemyTanks) {
            // 判断当前坦克是否还存活
            if (enemyTank.isLive) { // 当敌人坦克存活才画出坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);
                // 画出 enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    // 取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    // 绘制
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        // 从 Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
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

    // 编写方法，判断我方的子弹是否击中敌人的坦克
    public void hitTank(Shot s, EnemyTank enemyTank) {
        // 判断 s 击中
        switch (enemyTank.getDirection()) {
            case 0: // 敌人坦克向上
            case 2: // 敌人坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1: // 坦克向右
            case 3: // 坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
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

        // 如果用户按下的是J，就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemyTank();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        // 每隔 100 毫秒重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 判断是否击中了敌人坦克
            if (hero.shot != null && hero.shot.isLive) {
                // 遍历敌人所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }

            }

            this.repaint();
        }
    }
}
