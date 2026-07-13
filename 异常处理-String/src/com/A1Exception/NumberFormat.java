package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:33
 */
public class NumberFormat {
    public static void main(String[] args) {
        String name = "夏辰义";
        try {
            int num = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println("这是数字格式异常");
        }
    }
}
