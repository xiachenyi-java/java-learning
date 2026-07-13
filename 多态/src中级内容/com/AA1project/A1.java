package com.AA1project;

import java.time.LocalDateTime;

import java.util.Scanner;

public  class A1 {

    public  void A1(double money,LocalDateTime[] time2,double[] revenue,int i2,LocalDateTime[] time3,double[] consumption,int i3,String[] ShopName){
        System.out.println("----------------零钱通明细--------------");
        if (i2 == 0 && i3 == 0){
            System.out.println("没有记录");
            return;
        }
        for (int i = 0;i<i2;i++){
            System.out.printf("收益入账    +%.2f    %s    余额%.2f%n", revenue[i], time2[i], money);
        }
        for (int i = 0; i < i3; i++) {
            System.out.printf("%s    -%.2f    %s    余额%.2f%n", ShopName[i], consumption[i], time3[i], money);
        }
    }
    public double A2(double money,LocalDateTime[] time,double[] revenue,Scanner MyScanner,int i){
        System.out.println("请输入收益入账多少钱：");
        revenue[i] = MyScanner.nextDouble();
        MyScanner.nextLine();
        money +=  revenue[i];
        time[i] = LocalDateTime.now();
        return money;
    }
    public double A3(double money, LocalDateTime[] time, double[] consumption,String[] ShopName,Scanner MyScanner,int i){
        System.out.println("请输入消费多少钱：");
        consumption[i] = MyScanner.nextDouble();
        MyScanner.nextLine();
        money -= consumption[i];
        System.out.println("在哪里消费：");
        ShopName[i] = MyScanner.nextLine();
        time[i] = LocalDateTime.now();
        return money;
    }
}
