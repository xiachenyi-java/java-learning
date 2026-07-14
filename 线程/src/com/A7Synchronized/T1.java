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

    @Override
    public  void run() {
        while (true) {
            synchronized (this){//同步线程
                if (num <= 0) break;  // ① 判断
                System.out.println(Thread.currentThread().getName() + " 卖出,还剩 " + num);  // ② 输出
                num--;  // ③ 减减
            }
            Thread.yield();//让出cpu
        }
    }
}
//之前卖票，一个线程在循环里永远抢票
//增加yield，让他们交替抢票
/*
一、互斥锁（Mutex / Mutual Exclusion）
核心概念
同一时刻，只有一个线程能访问被保护的代码或资源。
Java 中的实现方式
方式	语法	特点
synchronized 关键字	synchronized(对象) { }	自动加锁/释放，简单易用
synchronized 方法	public synchronized void m() { }	锁对象是当前实例 this
ReentrantLock	lock.lock() / lock.unlock()	更灵活，可中断、可超时
互斥锁的特性
特性	说明
互斥性	一个线程持有锁，其他线程阻塞等待
可重入性	同一线程可多次获取同一把锁（不会死锁）
自动释放	synchronized 在代码块结束或异常时自动释放
非公平性（默认）	新线程可能插队抢到锁，老线程等待更久
二、死锁（Deadlock）
定义
两个或多个线程互相等待对方释放锁，导致所有线程永远阻塞。
死锁的四个必要条件（同时满足才会发生）
条件	含义
互斥	资源一次只能被一个线程占用
占有且等待	线程持有锁A，同时请求锁B
不可抢占	不能强行剥夺其他线程的锁
循环等待	线程间形成等待环路（A等B，B等A）
死锁示例
java
// 线程1：先拿A，再拿B
synchronized(lockA) {
    synchronized(lockB) { 。。。 }
        }

// 线程2：先拿B，再拿A  ← 顺序相反，导致死锁
synchronized(lockB) {
synchronized(lockA) { 。。。}
        }
如何避免死锁
        表格
方法	具体做法
固定加锁顺序	所有线程都按 A→B 顺序加锁
减少锁嵌套	尽量只用一个锁
超时放弃	用 tryLock(3, TimeUnit.SECONDS)，超时不等待
使用并发工具类	ConcurrentHashMap、CopyOnWriteArrayList 等
三、释放锁（Lock Release）
释放时机
        表格
场景	是否释放
synchronized 代码块执行完毕	✅ 自动释放
synchronized 代码块内发生异常	✅ 自动释放
调用 wait()	✅ 释放锁，进入等待池
调用 ReentrantLock.unlock()	✅ 手动释放（必须在 finally 中）
线程被强制终止（stop()）	❌ 不推荐使用，可能导致锁不释放
        重要原则
谁加锁，谁释放；加锁必释放。
java
// synchronized：自动释放，无需关心
synchronized(obj) {
        // 代码...
        } // 这里自动释放

// ReentrantLock：必须手动释放，用 finally 保证
        lock.lock();
try {
        // 代码...
        } finally {
        lock.unlock();  // 必须写，否则异常时锁不释放
}
四、三者关系图
        plain
        ┌─────────────┐
                │   互斥锁     │  ← 工具/机制
        │  (保护资源)  │
        └──────┬──────┘
        │
        ┌──────┴──────┐
        │   释放锁     │  ← 正确使用：及时释放
        │  (避免阻塞)  │
        └──────┬──────┘
        │
        ┌──────┴──────┐
        │    死锁      │  ← 错误使用：锁未释放或循环等待
        │  (程序卡死)  │
        └─────────────┘
五、一句话总结
概念	一句话
互斥锁	保证同一时间只有一个线程干活
死锁	多个线程互相瞪眼，谁也别想动
释放锁	干完活赶紧交钥匙，别占着茅坑
 */