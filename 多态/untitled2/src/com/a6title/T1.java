package com.a6title;

public class T1 {
    private double balance;
    public T1(double initialBalance){
        this.balance = initialBalance;
    }
    public void A1(double amount){
        balance += amount;
    }
    public void A2(double amount){
        balance -=amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
