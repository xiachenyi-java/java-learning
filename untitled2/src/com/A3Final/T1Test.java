package com.A3Final;

public class T1Test {
    public static void main(String[] args) {
        E e1 = new E();
        //e1.TAX_RATE = 2;
        //final不可以让类的属性被修改
    }
}

final class A{ }
//class B extends A{}
//final不能被其他类继承
class C{
    public final void C1(){
        System.out.println("这是C1方法");
    }
}
class D extends C{
    // public final void C1(){
    // System.out.println("这是D1方法");
}
//final可以让父类的一个方法不能被重写

class E{
    public final double TAX_RATE = 0.8;
}

class F{
    public void A1(){
        final double A1 = 1;
        //A1 = 2;
        //可以让局部变量被修改
    }
}