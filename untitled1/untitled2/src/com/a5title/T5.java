package com.a5title;

public class T5 extends T1{
    private double KS;
    public T5(double salary,double KS){
        super(salary);
        this.KS = KS;
    }
    @Override
    public void A1(){
        System.out.println(getSalary()+KS);
    }
}
