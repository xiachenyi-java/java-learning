package com.A1Title;

@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        System.out.println(T1.getNum());
        System.out.println(T1.getNum());
        T1 t1 = new T1();
        T1 t2 = new T1();
        T1 t3 = new T1();
        System.out.println("序列号" + t1.getNum());
        System.out.println("序列号" + t2.getNum());
        System.out.println("序列号" + t3.getNum());
    }
}
