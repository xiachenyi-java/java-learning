package com.A2Title;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 夏辰义
 * 2026/6/2422:27
 */
public class T1 {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("亲输入5个整数");
        for (int i = 0;i < 5;i++){
            num.add(MyScanner.nextInt());
        }
        System.out.println(num);
    }
}
