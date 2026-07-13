package com.A5Interrupt;

/**
 * 夏辰义
 * 2026/7/718:59
 */
public class T1 {
    public static void main(String[] args) throws Exception{
        A a = new A();
        Thread thread =new Thread(a);
        thread.start();
        //必须等子线程运行起来再中断，不然就直接退出
        Thread.sleep(3000);
        thread.interrupt();
    }
}
class A implements Runnable{

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // 正常工作
                System.out.println("工作");

                // 如果有阻塞操作，要处理异常
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // 阻塞时被中断，标志位已被清除
            System.out.println("阻塞中断，清理资源...");
            // 重新设置中断标志（可选）
            Thread.currentThread().interrupt();
        } finally {
            // 必须执行的清理
            System.out.println("清理");
        }
    }
}

/*
interrupt() 中断机制
核心认知
interrupt() ≠ 强制停止线程
interrupt() = 发送一个"中断请求"信号
              线程可以选择：响应、忽略、或延迟处理
              | 方法                     | 作用     | 是否清除标志     |
| ---------------------- | ------ | ---------- |
| `interrupt()`          | 设置中断标志 | —          |
| `isInterrupted()`      | 检查标志   | ❌ 不清除      |
| `Thread.interrupted()` | 检查标志   | ✅ 清除（静态方法） |
┌─────────────────────────────────────────┐
│  interrupt() 只是"请求"，不是"命令"      │
│                                         │
│  正确做法：                             │
│  1. 定期检查 isInterrupted()             │
│  2. 阻塞时 catch InterruptedException    │
│  3. 清理资源后退出                       │
│                                         │
│  错误做法：                             │
│  1. 不检查标志，interrupt 无效            │
│  2. catch 后 continue，继续跑            │
│  3. 用 stop()（已废弃，不安全）          │
└─────────────────────────────────────────┘
 */