package com.A2Thread;

/**
 * 夏辰义
 * 2026/7/617:14
 */
public class T1 {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.start();//启动线程
        //run是能跑通的，但是run只是一个方法
        //不是线程，所以他会最先结算完成后再进行后面的程序
        System.out.println("之后的程序");
    }
}
//当一个类继承Thread，这个类就能当线程
//重写run方法，写上自己的业务代码
//run Thread类实现了Runnable
class cat extends Thread{
    int times = 0;

    @Override
    public void run(){
        while (true) {
            System.out.println("我是一个猫" + times);
            try {
                times++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 10){
                break;//线程退出
            }
        }
    }
}
/*
 进程 vs 线程 对比表
表格
对比项	进程	线程
定义	程序的执行实例	进程内的执行单元
资源占用	独立地址空间，资源多	共享进程资源，资源少
通信方式	IPC（管道、套接字、共享内存等）	直接读写共享变量
切换开销	大（需要切换页表）	小（只需保存寄存器）
安全性	一个崩溃不影响其他	一个崩溃可能导致整个进程崩溃
创建速度	慢	快
数量	一个程序至少一个进程	一个进程至少一个线程（主线程）

cat cat = new cat();

cat.start();  // ✅ 启动新线程，JVM 开辟新的执行路径
              //    结果：主线程和子线程并行执行

cat.run();    // ❌ 普通方法调用，仍在主线程中执行
              //    结果：串行执行，先执行完 run()，主线程才继续
 */