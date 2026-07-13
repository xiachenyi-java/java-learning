package com.A13System;

import java.util.Scanner;

/**
 * 夏辰义
 * 2026/6/1916:56
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println();//System.out标准输出流（通常是控制台）
        new Scanner(System.in);//System.in标准输入流（通常是键盘）
        //System.err标准错误输出流（通常也是控制台，但可独立重定向）
        // 高效数组拷贝（底层是 native 方法，比循环快）
// 示例
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, 5);  // b = [1,2,3,4,5]
        // 返回当前时间的毫秒数（自1970-01-01 00:00:00 UTC）
        long start = System.currentTimeMillis();

// 更高精度的纳秒级计时（用于性能测试）
        long startNano = System.nanoTime();
// ... 执行代码
        long duration = System.nanoTime() - startNano;
        // 建议 JVM 进行垃圾回收（只是建议，不保证立即执行）
        System.gc();

// 强制调用已注册对象的 finalize() 方法（已废弃，不建议使用）
        //System.runFinalization();

// 终止 JVM，参数为退出状态码（0 表示正常退出）
        System.exit(0);
    }
}
/*
特性	说明
不可实例化	构造方法是 private，不能 new System()
全静态方法	所有成员都是 static，直接通过类名调用
native 方法	大量底层方法（如 arraycopy、currentTimeMillis）由 JNI 调用本地代码实现，性能极高
安全性	getenv() 和 getProperty() 受安全管理器控制，Applet/Web 环境下可能受限
System.out.println 线程安全：PrintStream 内部有 synchronized，但大量并发输出仍可能交错
不要滥用 System.gc()：现代 JVM 的 GC 策略很智能，频繁调用反而可能降低性能
System.exit() 会立即终止整个 JVM：包括所有正在运行的线程，谨慎使用
System.nanoTime() 与 currentTimeMillis() 区别：前者用于计时（与系统时间无关），后者获取 wall-clock 时间
 */