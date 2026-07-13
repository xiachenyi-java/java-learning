package com.hspedu.tankegame5;

import javax.swing.*;

/**
 * 夏辰义
 * 2026/7/322:06
 */
public class HspTankGame05 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        HspTankGame05 hspTankGame02 = new HspTankGame05();

    }
    public HspTankGame05(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
;        this.add(mp);//把面板加入
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
        this.setVisible(true);
    }
}
