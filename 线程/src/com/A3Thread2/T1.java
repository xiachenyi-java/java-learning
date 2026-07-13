package com.A3Thread2;

/**
 * 夏辰义
 * 2026/7/716:35
 */
public class T1 {
    public static void main(String[] args) {
        dog dog = new dog();
        Thread thread = new Thread(dog);
        // 3 个线程共享同一个 dog 对象
        new Thread(dog).start();
        new Thread(dog).start();
        new Thread(dog).start();
        //thread.start();
        //thread.start();
        //thread.start();
        //为什么只能 start 一次？
        //// Thread.start() 源码逻辑：
        //public synchronized void start() {
        //    if (threadStatus != 0)  // 检查线程状态
        //        throw new IllegalThreadStateException();
        //    // ...
        //    start0();  // 调用 native 方法真正启动线程
        //}
        //线程状态一旦变成 RUNNABLE，就不能再次 start()。
    }
}

//为什么推荐 Runnable？
//原因 1：Java 只能单继承
class Animal{}
class dog extends Animal implements Runnable{
    private  int count = 3;

    @Override
    public void run() {
        while (true) {
     synchronized (this){
         System.out.println("狗叫");
         if (count < 0){
             break;
         }
         count--;
         try {
             Thread.sleep(10);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
        }
    }
}
/*
| 写法                         | count 共享？ | 输出次数         |
| -------------------------- | --------- | ------------ |
| `new Thread(dog)` ×3       | ✅ 共享      | 总共 4 次       |
| `new Thread(new dog())` ×3 | ❌ 不共享     | 各 4 次，共 12 次 |
继承 Thread（不共享）              实现 Runnable（共享）
┌──────────┐ ┌──────────┐        ┌──────────────────┐
│ Thread-0 │ │ Thread-1 │        │  TicketRunnable  │
│ ticket=100│ │ ticket=100│        │  ticket=100 ◄───┼── 3个线程共享
└──────────┘ └──────────┘        └──────────────────┘
   各卖各的                           Thread-0 Thread-1 Thread-2
   共300张票                           一起卖100张
 */