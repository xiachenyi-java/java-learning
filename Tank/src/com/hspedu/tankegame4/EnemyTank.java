package com.hspedu.tankegame4;

import java.util.Vector;

/**
 * 夏辰义
 * 2026/7/616:47
 * 敌人坦克
 */
public class EnemyTank extends Tank implements Runnable{
    //在敌人坦克类，用 Vector保存多个shot
     public Vector<Shot> Enemyshots = new Vector<>();
     boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){
            switch (getDirect()){
                case 0://上
                    for (int i =0;i < 20;i++){
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }  break;
                case 1://右
                    for (int i =0;i < 20;i++){
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }break;
                case 2://下
                    for (int i =0;i < 20;i++){
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } break;
                case 3://左
                    for (int i =0;i < 20;i++){
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }  break;
            }

            //改变敌人坦克的方向
            setDirect((int)( Math.random() * 4));
            if (!isLive){
                break;//退出线程
            }
        }
    }
}
