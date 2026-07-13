package com.AA2project;

import java.time.LocalDateTime;
import java.util.Scanner;

public class A1 {
    public int i1;
    public int i3 = 0;
    public int i2 = 0;
    public double money = 0;
    public LocalDateTime[] time2 = new LocalDateTime[50];
    public LocalDateTime[] time3 = new LocalDateTime[50];
    public double revenue[] = new double[50];
    public double consumption[] = new double[50];
    public String ShopName[] = new String[50];
    public Scanner MyScanner = new Scanner(System.in);

    public void A0(){
        System.out.println("----------------零钱通菜单--------------");
        System.out.println("           1零钱通明细");
        System.out.println("           2收益入账");
        System.out.println("           3消费");
        System.out.println("           4退    出");
    }

    public void A1(){
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
    public double A2(){
        System.out.println("请输入收益入账多少钱：");
        revenue[i2] = MyScanner.nextDouble();
        MyScanner.nextLine();
        money +=  revenue[i2];
        time2[i2] = LocalDateTime.now();
        return money;
    }
    public double A3(){
        System.out.println("请输入消费多少钱：");
        consumption[i3] = MyScanner.nextDouble();
        MyScanner.nextLine();
        money -= consumption[i3];
        System.out.println("在哪里消费：");
        ShopName[i3] = MyScanner.nextLine();
        time3[i3] = LocalDateTime.now();
        return money;
    }
}
