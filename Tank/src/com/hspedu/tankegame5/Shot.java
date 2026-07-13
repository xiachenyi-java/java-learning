package com.hspedu.tankegame5;

/**
 * 夏辰义
 * 2026/7/721:26
 * 射击
 */
public class Shot implements Runnable{
    private int x;//x坐标
    private int y;//y坐标
    private int direct = 0;//方向
    private int speed = 20;//速度

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getDirect() {
        return direct;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public int getX() {
        return x;
    }

    Boolean isLive = true;//子弹还在吗

    public  Shot( int x, int y, int direct ){
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击行为
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct){
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <=750)){
                isLive = false;// 超出边界，标记死亡并退出
                break;
            }
        }
    }
}
