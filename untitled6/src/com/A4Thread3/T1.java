package com.A4Thread3;

import java.util.concurrent.TimeUnit;

/**
* 夏辰义
*2026/7/717:37 
*/
public class T1 {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.start();
        try {
            dog.join();// 🔴 主线程在这里阻塞，直到 t1 执行完
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("主程序运行");
    }
}
class dog extends Thread{
    @Override
    public void run(){

        try {
            Thread.sleep(1000);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("恭喜你浪费了2秒");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i == 5) {
                Thread.yield();  // 让出 CPU，但可能立刻又被调度
            }//只是建议调度器让出，不保证一定生效
        }
    }
}
/*
start()	启动线程，JVM 调用 run()	只能调用一次！
run()	线程体（普通方法）	直接调用不会启动新线程
sleep(ms)	休眠指定毫秒	不释放锁，会抛 InterruptedException
特点：
- 不释放锁（如果持有锁，其他线程进不来）
- 会抛 InterruptedException（必须 try-catch）
- 休眠后进入 就绪态，不是立即执行
yield()	让出 CPU，进入就绪态	可能立刻又被调度
| 场景        | 说明               |
| --------- | ---------------- |
| **调试测试**  | 人为制造线程切换，暴露并发问题  |
| **避免忙等待** | 在循环中让出 CPU，降低占用率 |
| **提示调度器** | "我不急，先让别人"       |

join()	等待该线程执行完毕	会阻塞当前线程
interrupt()	中断线程（设置标志位）	不会强制停止！
isAlive()	判断线程是否存活	start() 后、run() 结束前为 true
setDaemon(true)	设置为守护线程	必须在 start() 前设置
setName() / getName()	设置/获取线程名
setPriority() / getPriority()	设置/获取优先级	1~10，默认5
 */