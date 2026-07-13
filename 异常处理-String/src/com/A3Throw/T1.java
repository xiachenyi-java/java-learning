package com.A3Throw;

/**
 * 夏辰义
 * 2026/5/3121:06
 */
public class T1 {
    public static void main(String[] args) {

            System.out.println("开始");
            throw new RuntimeException("出错");  // ← 程序在这里中断！
            //System.out.println("结束");           // ❌ 永远不会执行
    }
}
/*
throw 是"扔炸弹"（实际动手），
throws 是"挂警示牌"（提前告知）
 */