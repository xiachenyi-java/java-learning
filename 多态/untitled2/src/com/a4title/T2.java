package com.a4title;

public class T2 extends T1{
    public T2(String name,double salary,int days){
        setName(name);
        setDays(days);
        setSalary(salary);
    }//笨方法直接super调用就可以了
    @Override
    public void A1(){
        System.out.println(getSalary()*getDays()*1.0);
    }
}
