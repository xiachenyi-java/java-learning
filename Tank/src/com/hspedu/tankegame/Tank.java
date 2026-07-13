package com.hspedu.tankegame;

/**
 * 夏辰义
 * 2026/7/321:57
 * 坦克
 */
@SuppressWarnings("all")
public class Tank {
    private int x;//横坐标
    private int y;//纵坐标

    public Tank(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
