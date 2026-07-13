package com.hspedu.tankegame;

import javax.swing.*;

/**
 * 夏辰义
 * 2026/7/322:06
 */
public class HspTankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();

    }
    public HspTankGame01(){
        mp = new MyPanel();
        this.add(mp);//把面板加入
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
        this.setVisible(true);
    }
}
