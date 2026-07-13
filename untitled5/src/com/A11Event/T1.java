package com.A11Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 夏辰义
 * 2026/7/519:47
 */
public class T1 extends JFrame {
    private myPanel mp;
    public static void main(String[] args) {
        T1 t1 = new T1();

    }
    public T1(){
        mp = new myPanel();
        this.add(mp);
        this.setSize(800,800);
        //JFrame 对象可以监听键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时退出程序
        this.setVisible(true);
    }
}
//KeyListener 是监听器，可以监听键盘事件
class myPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，把小球坐标设置为坐标
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(x,y,200,200);
    }
//有字符输出是，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
//当某键按下，方法触发
    @Override
    public void keyPressed(KeyEvent e) {

        //System.out.println((char)e.getKeyCode() + "被按下");
        //记得点一下窗口
        if (e.getKeyCode() == KeyEvent.VK_DOWN){//下键
            y += 10;
        }else if (e.getKeyCode() == KeyEvent.VK_UP){//上
            y -= 10;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){//左
            x -= 10;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){//右
            x +=10;
        }
        //面板重绘
        this.repaint();
    }
//当某键释放师，方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}

