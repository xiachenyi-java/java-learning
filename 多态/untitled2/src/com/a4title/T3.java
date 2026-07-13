package com.a4title;

public class T3 extends T1{
    public T3(String name,double salary,int days){
       super( name,salary, days);
    }
    @Override
    public void A1(){
        System.out.println(getSalary()*getDays()*1.2);
    }
}
