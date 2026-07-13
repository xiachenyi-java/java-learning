package com.hspedu.tankegame2;

import com.hspedu.tankegame2.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 夏辰义
 * 2026/7/322:01
 * 坦克的绘图区域
 */

//为了监听键盘，实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    com.hspedu.tankegame2.Hero hero = null;
    //敌人的坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize = 3;
    public MyPanel(){
        hero = new Hero(100,100);
        for (int i = 0;i < enemyTanksSize;i++){
            enemyTanks.add(new EnemyTank(100 * (i + 1),0));
        }
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形,默认黑色
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);

        for (int i = 0;i <enemyTanks.size();i++){
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,2,1);
        }
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
                g.fill3DRect(x + 10,y +10,20,40,false);//中间的盖子
                g.fillOval(x + 10,y +20,20,20);//炮筒
                g.drawLine(x + 20,y +30, x + 20,y);//炮管
                break;
            case 1://右
                g.fill3DRect(x,y,60,10,false);//左边的轮子
                g.fill3DRect(x ,y + 30,60,10,false);//右边的轮子
                g.fill3DRect(x + 10,y +10,40,20,false);//中间的盖子
                g.fillOval(x + 20,y +10,20,20);//炮筒
                g.drawLine(x + 30,y +20, x + 60,y +20);//炮管
                break;
            case 2://下
                g.fill3DRect(x,y,10,60,false);//左边的轮子
                g.fill3DRect(x + 30,y,10,60,false);//右边的轮子
                g.fill3DRect(x + 10,y +10,20,40,false);//中间的盖子
                g.fillOval(x + 10,y +20,20,20);//炮筒
                g.drawLine(x + 20,y +30, x + 20,y +60);//炮管
                break;
            case 3://左
                g.fill3DRect(x,y,60,10,false);//左边的轮子
                g.fill3DRect(x ,y + 30,60,10,false);//右边的轮子
                g.fill3DRect(x + 10,y + 10,40,20,false);//中间的盖子
                g.fillOval(x + 20,y +10,20,20);//炮筒
                g.drawLine(x + 30,y +20, x,y +20);//炮管
                break;
        }
    }
//字符触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa。按键
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下w
            //改变坦克的方向
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//按d
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//按s
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//按a
            hero.setDirect(3);
            hero.moveLeft();
        }
        //重绘面板
        this.repaint();
    }
    //放开键
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
