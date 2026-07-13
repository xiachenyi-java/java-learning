package com.A1CpuNums;

/**
 * 夏辰义
 * 2026/7/617:00
 */
public class T1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums =runtime.availableProcessors();
        //获取CPU的数量
        System.out.println(cpuNums);
    }
}
