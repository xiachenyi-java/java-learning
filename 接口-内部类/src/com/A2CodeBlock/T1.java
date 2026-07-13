package com.A2CodeBlock;

public class T1 {
    public int i;
    static {
        System.out.println("父类的静态代码块被调用");
    }

    {
        System.out.println("父类前面的普通代码块被调用");
    }

    {
        System.out.println("父类后面的普通代码块被调用");
    }

    public T1(){
        System.out.println("这是父类的无参构造器");
    }

    public T1(int i){
        this.i = i;
        System.out.println("这是父类的有参构造器");
    }
}
