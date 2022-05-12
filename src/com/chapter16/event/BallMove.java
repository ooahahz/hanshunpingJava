package com.chapter16.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @ClassName BallMove
 * @Author Oliver
 * @Date 2022/5/12 15:32
 * Description      TODO
 * 演示小球通过键盘控制上下左右移动
 * 讲解java事件控制
 * @see
 */
public class BallMove extends JFrame { // 窗口
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        // 窗口JFrame对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// 画板，可以画小球
// KeyListener 是一个监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {

    // 为了让小球可以移动，把它的左上角的坐标设置为变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    // 有字符输出时，该方法就会出发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 当某个键按下，该方法就会出触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyChar() + "被按下。。。");

        // 根据用户按下的不同键，来处理小球的移动 (上下左右)
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y+=2;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y-=2;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x-=2;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x+=2;
        }

        // 让面板重绘
        this.repaint();

    }

    // 当某个键释放，该方法就会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}