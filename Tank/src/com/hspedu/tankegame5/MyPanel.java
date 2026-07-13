package com.hspedu.tankegame5;

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
@SuppressWarnings("all")
//为了监听键盘，实现KeyListener
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义我的坦克
    Hero hero = null;
    //敌人的坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义一个Vector，存炸弹
    Vector<Bomb> bombs = new Vector<>();
    int enemyTanksSize = 3;
    //定义三个炸弹的图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public MyPanel(){
        hero = new Hero(500,100);
        for (int i = 0;i < enemyTanksSize;i++){
            //创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i+1)),0);

            //设置方向
            enemyTank.setDirect(2);
            //启动敌人坦克线程
            new Thread(enemyTank).start();
            //加入子弹
            Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 50,enemyTank.getDirect());
            //加入Vector
            enemyTank.Enemyshots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
        //初始化图片
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom3.png"));
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形,默认黑色
        if (hero != null && hero.isLive){
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);

        }

        //画子弹
       for (int i = 0;i < hero.shots.size();i++){
           Shot shot = hero.shots.get(i);
           if (shot != null && shot.isLive){
               g.fill3DRect(shot.getX(),shot.getY(),3,3,false);
           }else {
               // 子弹死亡，从集合移除
               hero.shots.remove(shot);
               i--;  // 移除后索引回退
           }
       }
       //如果bombs集合里有对象，就画出
       for (int i = 0;i< bombs.size();i++){
           //取出炸弹
           Bomb bomb = bombs.get(i);
           //根据生命周期来画
           if (bomb.life > 6){
               g.drawImage(image1,bomb.getX(),bomb.getY(),60,60,this);
           }else if (bomb.life >3){
               g.drawImage(image2,bomb.getX(),bomb.getY(),60,60,this);
           }else {
               g.drawImage(image3,bomb.getX(),bomb.getY(),60,60,this);
           }
           //减少炸弹的生命
           bomb.lifeDown();
           if (bomb.life == 0){
               bombs.remove(bomb);
           }
       }
        //敌人的坦克
        for (int i = 0;i <enemyTanks.size();i++){
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断敌人坦克是不是活的
            if (enemyTank.isLive){
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
            for (int j = 0;j <enemyTank.Enemyshots.size(); j++){
                //取出子弹
                Shot shot =enemyTank.Enemyshots.get(j);
                if (shot.isLive){
                  g.setColor(Color.red);
                    g.fill3DRect(shot.getX(),shot.getY(),3,3,false);
                }else {
                    //从Vector移除
                    enemyTank.Enemyshots.remove(shot);
                    j--;
                }
            }
           }
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
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//按d
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//按s
            hero.setDirect(2);
            if (hero.getY() +60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//按a
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        //如果对象按下的是J，就发射
        if (e.getKeyCode() == KeyEvent.VK_J){
            hero.shotEnemyTank();
        }
        //重绘面板
        this.repaint();
    }

    //编写方法，判断我方子弹是否击中敌人坦克
    public  boolean hitTank(Shot s, Tank enemyTank){
        //判断击中坦克
        switch (enemyTank.getDirect()){
            case 0://上
            case 2://下
                if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() + 40
                && s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY() +60){
                    s.isLive = false;
                    enemyTank.isLive = false;
                    return true;
                    // 从集合中移除死去的坦克
                    //enemyTanks.remove(enemyTank);
                    //创建bmb对象，加入集合
                    //Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    //bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() +60 &&
                s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY()+60){
                    s.isLive = false;
                    enemyTank.isLive = false;
                    return true;
                    // 从集合中移除死去的坦克
                    //enemyTanks.remove(enemyTank);
                    //Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    //bombs.add(bomb);
                }
                break;
        }
        return false;
    }


    //放开键
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每个100毫秒，重绘
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //判断是否击中
            for (int i =0;i < hero.shots.size();i++){
                Shot shot = hero.shots.get(i);{
                    if (shot != null &&shot.isLive){
                        for (int j =0;j<enemyTanks.size();j++){
                            EnemyTank enemyTank = enemyTanks.get(j);
                            if (hitTank(shot,enemyTank)){
                                enemyTanks.remove(enemyTank);
                                bombs.add(new Bomb(enemyTank.getX(), enemyTank.getY()));
                            }
                        }
                    }
                }
            }
            // 2. 敌人子弹打 Hero（新增）
            for (int i = 0;i <enemyTanks.size();i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                for (int j = 0;j < enemyTank.Enemyshots.size();j++) {
                    Shot shot = enemyTank.Enemyshots.get(j);
                    if (hero.isLive && shot.isLive) {
                        if (hitTank(shot, hero)) {   // 复用 hitTank
                            // hero.isLive 已经被 hitTank 设为 false
                            // 创建爆炸，加入 bombs
                            bombs.add(new Bomb(hero.getX(), hero.getY()));
                        }
                    }
                }
            }
            this.repaint();
        }
    }
}
