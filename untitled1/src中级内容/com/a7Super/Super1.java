package com.a7Super;

public class Super1 {
    int a;
    String name;
    public Super1(){
        a = 0;
        name = "空";
        System.out.println("这是父类无参构造器年龄是" + a + "名字是" + name);
    }
    public Super1(int a,String name){
        this.a = a;
        this.name = name;
        System.out.println("这是父类有参构造器年龄是" + a + "名字是" + name);
    }//果父类没有无参构造函数，子类必须显式调用父类的有参构造函数。
    public void A1(){
        System.out.println("我是父类的方法");
    }
}
