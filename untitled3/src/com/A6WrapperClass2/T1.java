package com.A6WrapperClass2;

/**
 * 夏辰义
 * 2026/6/222:52
 */
public class T1 {
    public static void main(String[] args) {
        Integer n1 = 100;
        String N1 = 100 + "";//方法一：直接拼接空字符串（最常用）
        System.out.println(N1);
        String N2 = n1.toString();//方法二：调用 toString() 方法
        System.out.println(N2);
        String N3 = String.valueOf(n1);
        //使用 String.valueOf()（推荐，可处理 null）
        System.out.println(N3);
        Integer n2 = null;
        String N4 = String.valueOf(n2);
        System.out.println(N4);
        String N5 = String.format("%d",n1);//方法四：使用 String.format()
        System.out.println(N5);
    }
}
