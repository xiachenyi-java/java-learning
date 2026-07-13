package com.A2CodeBlock;

public class T2 extends T1{
    public int j;
    static {
        System.out.println("子类的静态代码块被调用");
    }

    {
        System.out.println("子类前面的普通代码块被调用");
    }

    {
        System.out.println("子类后面的普通代码块被调用");
    }


    public T2(){
        System.out.println("这是子类的无参构造器");
    }

    public T2(int i, int j){
        super(i);
        this.j = j;
        System.out.println("这是子类的有参构造器");
    }
}
