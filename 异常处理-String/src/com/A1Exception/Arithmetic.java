package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:23
 */
public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        //int team = num1 / num2;
        //会直接报错，然后程序直接退出
        try {
            int team = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //快捷键 Ctrl + alt + t
        //包围感觉有问题的代码让代码继续执行
        System.out.println("程序继续运行");
    }
}
