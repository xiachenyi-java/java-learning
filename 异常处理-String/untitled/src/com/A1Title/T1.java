package com.A1Title;

import java.util.Scanner;

/**
 * 夏辰义
 * 2026/5/3022:40
 */
public class T1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean b = true;
        do {
            int a;
            System.out.println("请输入整数");
            try {
                a = myScanner.nextInt();
                b = false;
            }catch (Exception e){
                System.out.println("输入的不是整数");
                myScanner.nextLine();
            }
        }while (b);
    }
}
