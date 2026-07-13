package com.a5title;

public class T6 extends T1{
    private double NS;
    public T6(double salary,double NS){
        super(salary);
        this.NS = NS;
    }
    @Override
    public void A1(){
        System.out.println(getSalary()+NS);
    }
}
