package com.A7WrapperClass3;

/**
 * 夏辰义
 * 2026/6/223:01
 */
public class T1 {
    public static void main(String[] args) {
        String num1 = "100";
        int Num1 = Integer.parseInt(num1);//方法一：Integer.parseInt()
        System.out.println(Num1);
        int Num2 = Integer.valueOf(num1);
        System.out.println(Num2);

    }
}
