package com.a6title;

public class T2 extends T1{
    public T2(double initialBalance){
        super(initialBalance);
    }
    @Override
    public void A1(double amount){
        super.A1(amount-1);
    }
    @Override
    public void A2(double amount){
      super.A2(amount+1);
    }
}
