package com.A6Daemon;

/**
 * 夏辰义
 * 2026/7/720:33
 */
public class T1 {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(()->{
            while (true){
                System.out.println("后台监控中");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }});
        thread.setDaemon(true);//✅ 必须在 start() 前设置！
        thread.start();
        // 主线程（用户线程）2 秒后结束
        Thread.sleep(2000);
        System.out.println("主线程结束");
        // 守护线程自动停止，不会无限打印
    }
}
/*
┌─────────────────────────────────────────┐
│  守护线程特点：                          │
│  1. 后台运行，不阻止 JVM 退出            │
│  2. 所有用户线程结束，守护线程自动停止    │
│  3. 适合做辅助工作（监控、日志、心跳）    │
│                                         │
│  注意：                                  │
│  1. setDaemon 必须在 start 前           │
│  2. 不要持有重要资源                      │
│  3. 不能做需要保证完成的操作              │
└─────────────────────────────────────────┘
 */
