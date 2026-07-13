package com.hspedu.tankegame3;

import java.util.Vector;

/**
 * 夏辰义
 * 2026/7/321:57
 * 自己的坦克
 */
public class Hero extends Tank {
    //定义一个Shot对象，表示射击行为
    Shot shot = null;

    // 用 Vector 存储多颗子弹
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y){
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
        //创建 shotEnemyTank 对象，根据hero对象的位置和方向创建shot
        switch (getDirect()){
            case 0://上
                shot = new Shot(getX() +20,getY(),0);break;
            case 1://右
                shot = new Shot(getX() + 60,getY() + 20,1);break;
            case 2://下
                shot = new Shot(getX() + 20,getY() + 60,2);break;
            case 3://左
                shot = new Shot(getX(),getY() + 20,3);break;
        }
        //启动线程
        shots.add(shot);
        new Thread(shot).start();
    }
}
