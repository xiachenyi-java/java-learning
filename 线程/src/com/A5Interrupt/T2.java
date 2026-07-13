package com.A5Interrupt;

/**
 * 夏辰义
 * 2026/7/720:25
 */
public class T2 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(3000);
        worker.shutdown();  // 请求停止
    }
}

class Worker extends Thread {
    private volatile boolean running = true;  // 自己的停止标志

    @Override
    public void run() {
        while (running && !isInterrupted()) {  // 双重检查
            System.out.println("工作中...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("收到中断，准备退出");
                running = false;  // 设置自己的标志
            }
        }
        System.out.println("已停止");
    }

    public void shutdown() {
        running = false;
        interrupt();  // 如果正在 sleep，立刻唤醒
    }
}