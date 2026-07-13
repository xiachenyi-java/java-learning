package com.hspedu.tankegame;

import javax.swing.*;
import java.awt.*;

/**
 * 夏辰义
 * 2026/7/322:01
 * 坦克的绘图区域
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形,默认黑色
        drawTank(hero.getX(),hero.getY(),g,1,0);
    }

    //画出坦克

    /**注释
     *
     * @param x，坦克的左上角x坐标
     * @param y  坦克的左上角y坐标
     * @param g  画笔
     * @param direct  坦克方向
     * @param type   坦克类型
     */
    public void drawTank(int x, int y,Graphics g, int direct,int type){
        switch (type){
            case 0://玩家的坦克
                g.setColor(Color.cyan);//坦克的颜色
                break;
            case 1://电脑的坦克
                g.setColor(Color.red);//坦克的颜色
                break;
        }
        //根据坦克的方向4，来画坦克
        switch (direct){
            case 0://上
                g.fill3DRect(x,y,10,60,false);//左边的轮子
                g.fill3DRect(x + 30,y,10,60,false);//右边的轮子
                g.fill3DRect(x + 10,y +20,20,20,false);//中间的盖子
                g.fillOval(x + 10,y +20,20,20);//炮筒
                g.drawLine(x + 20,y +30, x + 20,y);//炮管
                break;
        }
    }
}
