package com.AA1project;

import java.time.LocalDateTime;
import java.util.Scanner;

public class 零钱通 {
    public static void main(String[] args) {
        int i1, i2, i3;
        i3 = 0;
        i2 = 0;
        double money = 0;
        LocalDateTime[] time2 = new LocalDateTime[50];
        LocalDateTime[] time3 = new LocalDateTime[50];
        double revenue[] = new double[50];
        double consumption[] = new double[50];
        String ShopName[] = new String[50];
        System.out.println("----------------零钱通菜单--------------");
        System.out.println("           1零钱通明细");
        System.out.println("           2收益入账");
        System.out.println("           3消费");
        System.out.println("           4退    出");
        Scanner MyScanner = new Scanner(System.in);
        A1 a1 = new A1();
        while (true) {
            System.out.println("请输入(1-4):");
            i1 = MyScanner.nextInt();
            MyScanner.nextLine();
            switch (i1) {
                case 1:
                    a1.A1(money, time2, revenue, i2, time3, consumption, i3, ShopName);
                    break;
                case 2:
                    money = a1.A2(money, time2, revenue, MyScanner, i2);
                    i2++;
                    break;
                case 3:
                    money = a1.A3(money, time3, consumption, ShopName, MyScanner, i3);
                    i3++;
                    break;
                case 4:
                    return;
                default:
                    System.out.println("请重新输入(1-4)");
                    break;
            }
        }
    }
}
/*
问题	具体表现	正确做法
索引每次重置为 0	i2 = 0 写在 case 里面	计数器放到循环外面，只初始化一次
索引忘记自增	case 3 里 i3++ 漏了	每次操作后 i3++，否则永远覆盖第 0 条
死循环理解错误	以为 switch 里的 break 能跳出 while	break 只跳出 switch，while(true) 继续循环
条件判断用错	if (i2 == 0 || i3 == 0)	两个都没记录才显示"没有"，用 &&
问题	具体表现	正确做法
用数组传单个值	double[] money = new double[1]	单个值直接用 double money，返回值带回
数组与元素混淆	time2 直接给 %s，没加 [i]	数组要取元素 time2[i]，再格式化
数组类型写错	String ShopName 参数写成单个	应该是 String[] ShopName
时间数组共用覆盖	收益和消费都用同一个 time[]	分开 time2[] 和 time3[]
问题	具体表现	正确做法
创建多个 Scanner	主类 2 个，A 类里又 new	只创建一个，通过参数传递
缓存没清	nextInt() / nextDouble() 后不换行符残留	后面加 sc.nextLine() 吃掉换行符
next() vs nextLine()	商家名用 next()，空格后读不到	用 nextLine() 读整行
没做输入验证	输入 abc 给 int 直接崩溃	用 hasNextInt() 判断再读取
概念	你的误区	正确理解
引用传递 vs 值传递	以为数组传参才能"带回来"	Java 对象传引用、基本类型传值；单个值用返回值更干净
break 作用域	以为能跳出多层循环	只能跳出当前 switch 或 for/while，多层用标签或变量控制
数组是对象	time2 直接给 %s	数组变量存的是地址，要 [i] 取元素
nextLine() 读什么	以为和 next() 一样	nextLine() 读一整行（含空格），next() 读到空格停
Scanner 缓存问题 是新手高频错误，记住：数字输入后必加 nextLine()
数组和元素 要分清：声明是 []，用的时候要 [i]
方法返回值 比数组引用更直观，单个值优先用 return
写代码前先画流程图，想清楚数据怎么存、怎么传
遇到报错先看行号，从下往上读错误信息，Google 关键词
 */
