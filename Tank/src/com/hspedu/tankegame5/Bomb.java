package com.hspedu.tankegame5;

/**
 * 夏辰义
 * 2026/7/816:47
 * 爆炸
 */
public class Bomb {
    private int x;//横坐标
    private int y;//纵坐标
    int life = 9;//生命周期
    boolean isLive = true;//是否存活

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Bomb(int x, int y) {
        this.y = y;
        this.x = x;
    }
    //减少生命值
    public void lifeDown(){//配合炸弹的爆炸
        if (life > 0){
            life--;
        }else {
            isLive = false;
        }
    }
}
