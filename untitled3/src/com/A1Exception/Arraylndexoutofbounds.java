package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:25
 */
public class Arraylndexoutofbounds {
    public static void main(String[] args) {
        int[] a = {1,3,4};
        try {
            for (int i = 0; i <= a.length ;i++){
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("数组越界异常");
        }
    }
}
