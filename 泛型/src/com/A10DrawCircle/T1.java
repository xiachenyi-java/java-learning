package com.A10DrawCircle;

import javax.swing.*;
import java.awt.*;

/**
 * 夏辰义
 * 2026/7/317:22
 * 画圆
 */
@SuppressWarnings("all")
public class T1 extends JFrame{//JFrame对应窗口

    private  MyPanel mp = null;
    public static void main(String[] args) {
        new T1();


    }
    public T1(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时退出程序
        this.setVisible(true);
    }
}
//1.先定义一个MyPanel，继承JPanel类，画图形在面板上
@SuppressWarnings("all")
class MyPanel extends JPanel{//面板
    @Override
    public void paint(Graphics g){
        super.paint(g);//调用父类的方法完成初始化
        //直线从 (x1,y1) 画到 (x2,y2)
        //g.drawLine(10,10,300,500);
        //矩形,空心矩形
        //g.drawRect(10,10,100,100);
        //空心矩形（填充）
        //g.setColor(Color.RED);
        //g.drawRect(10,10,300,300);
        //字符串
        //g.drawString("你好",100,100);
        //圆和椭圆
        //g.drawOval(200,200,200,200);
        // 设置颜色
        //g.setColor(Color.RED);
        //g.setColor(new Color(255, 0, 0));  // RGB自定义颜色
        // 设置字体
        //g.setFont(new Font("宋体", Font.BOLD, 20));
        // 参数：字体名、样式（PLAIN/BOLD/ITALIC）、字号
        //图片,/是从根目录里找
        //Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/xcyTP.png"));
        // g.drawImage(image,10,10,500,500,this);
    }
}