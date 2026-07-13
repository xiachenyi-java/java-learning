package com.a7Super;

public class Super2 extends Super1{
    int b;
    public Super2(){
        super();//调用父类的 Super1()
        b = 0;
        System.out.println("这是子类无参构造器" + b);
    }
    public Super2(int a,String name,int b){
        super(a,name);
        this.b = b;
        System.out.println("这是子类有参构造器" + b);
    }
    @Override  // 告诉编译器：这是重写的方法，写错会报错
    // 防止拼写错误（比如写成 public void A11() 编译器会提示）
    public void A1(){//这是方法重写
        System.out.println("我是子类的方法");
    }
    public void A2(){
        super.A1();
    }
}
