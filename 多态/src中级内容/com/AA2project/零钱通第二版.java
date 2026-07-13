package com.AA2project;

public class 零钱通第二版 {
    public void A2FangFa(){
        A1 a1 = new A1();
        a1.A0();
        while (true){
            System.out.println("请输入(1-4):");
            a1.i1 = a1.MyScanner.nextInt();
            a1.MyScanner.nextLine();
            switch (a1.i1){
                case 1:
                    a1.A1();
                    break;
                case 2:
                    a1.money = a1.A2();
                    a1.i2++;
                    break;
                case 3:
                    a1.money = a1.A3();
                    a1.i3++;
                    break;
                case 4:
                    return;
                default:
                    System.out.println("请重新输入(1-4)");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new 零钱通第二版().A2FangFa();
    }
}





/*
总结：第一版是 C 语言思维（数据 + 函数），第二版是 Java 思维（对象自治）。你的第一版代码功能上能跑，
但余额显示逻辑需要修复；第二版结构更优，但需要跨过"静态/非静态"这个初学门槛。
第一版（你刚发的）：过程式风格
核心特征：数据在 main 里定义，通过参数传给工具方法处理。
表格
优点	缺点
数据所有权清晰，main 掌控一切	方法参数冗长（A1() 有 8 个参数）
没有 this 困扰，逻辑直白	余额显示仍是 bug：所有历史记录显示最终 money
方法无状态，可随意复用	数组和索引分离管理，容易传错（i2 和 revenue 不绑定）
没有类名方法名冲突	扩展困难：加字段要改所有方法签名
致命问题：A1() 打印时用的 money 是最终余额，不是当时的余额。入账 100 再入账 200，两条都显示余额 300。
第二版（之前改的）：面向对象风格
核心特征：数据封装在对象内部，方法操作自己的状态。
表格
优点	缺点
参数极简，方法只处理逻辑	需要理解 this 和实例化
数据自包含，不会传错索引	静态/非静态容易搞混（初学常见坑）
余额可以正确记录历史值（加 balanceRecord 数组）	方法直接修改对象状态，调试时追踪稍难
极易扩展：多开几个钱包互不影响（new A1() 即可）
符合 Java 设计哲学
刚学 Java，理解语法为主	第一版（过程式）更直观
学面向对象思想、准备写大项目	第二版（对象式）是正道
需要多个钱包、多用户	必须用第二版，第一版无法扩展
 */