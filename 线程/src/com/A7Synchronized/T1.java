package com.A7Synchronized;

/**
 * 夏辰义
 * 2026/7/721:01
 */
public class T1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(ticket, "窗口1").start();
        new Thread(ticket, "窗口2").start();
        new Thread(ticket, "窗口3").start();
    }
}

class Ticket implements Runnable {
    private int num = 100;

    public  void m(){//同步方法，只有一个在有时间才能执行
        while (true) {
            synchronized (this){
            if (num <= 0) break;  // ① 判断
            System.out.println(Thread.currentThread().getName() + " 卖出,还剩 " + num);  // ② 输出
            num--;  // ③ 减减
        }
    }
    }

    @Override
    public  void run() {
        m();
    }
}