package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:10
 */
public class Nullpointer {
    public static void main(String[] args) {
        String  name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("空指针异常");
        }
    }
}
