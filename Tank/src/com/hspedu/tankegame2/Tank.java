package com.hspedu.tankegame2;

/**
 * 夏辰义
 * 2026/7/321:57
 * 坦克
 */
@SuppressWarnings("all")
public class Tank {
    private int x;//横坐标
    private int y;//纵坐标
    private int direct;//坦克的方向，0上1右2下3左

    //上右下左移动
    public void moveUp(){//上
        y -= 10;
    }
    public void moveRight(){//右
        x += 10;
    }
    public void moveDown(){//下
        y += 10;
    }
    public void moveLeft(){//左
        x -= 10;
    }


    public Tank(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setDirect(int direct) {
        this.direct = direct;
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

    public int getDirect() {
        return direct;
    }
}
