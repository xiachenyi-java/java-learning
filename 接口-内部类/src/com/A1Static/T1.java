package com.A1Static;

public class T1 {
    public static int i;
    public int j;

    public static void A1(){
        i++;
        System.out.println("我是静态方法");
    }

    public void  A2(){
        i++;j++;
        System.out.println("我是非静态方法"+i+j);
    }
}
