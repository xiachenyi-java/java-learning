package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:28
 */
public class ClassCast {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B)b;
        try {
            C c2 = (C)b;
        } catch (Exception e) {
            System.out.println("这是类转换异常");
        }
    }
}
class A{}
class B extends A{}
class C extends A{}