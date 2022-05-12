package com.chapter16;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName DrawCircle
 * @Author Oliver
 * @Date 2022/5/12 10:40
 * Description      TODO
 * 演示如何在面板上画圆
 * @see
 */
public class DrawCircle extends JFrame{

    // 定义一个面板
    private Mypanel mp= null;

    public static void main(String[] args) {
        new DrawCircle();

    }

    public DrawCircle() { // 构造器
        // 初始化面板
        mp = new Mypanel();
        // 把面板放入到窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 当点击窗口的小 x，就退出程序
        this.setVisible(true); // 可以显示

    }
}

class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g) { // 绘图方法
        super.paint(g); // 调用父类的方法完成初始化
        System.out.println("print 方法被调用");
//        g.drawOval(10,10,100,100);

        // 演示绘制不同的图形
        // 画直线
//        g.drawLine(10, 10, 100,100);
        // 画举行边框
//        g.drawRect(10,10,100,100);
        // 填充矩形
        // 设置画笔颜色
//        g.setColor(Color.blue);
//        g.fillRect(10,10,120,120);

        //填充椭圆
        g.setColor(Color.red);
        g.fillOval(10,10,100,50);

        // 画图片
        // 1. 获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\haohao\\OneDrive\\document\\hhaoDocument\\照片.jpg");
//        g.drawImage(image,10,10,1720,2324,this);

        // 给画笔设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("楷书", Font.BOLD, 50));
        g.drawString("北京欢迎您", 100, 100); // 坐标是左上角
    }
}