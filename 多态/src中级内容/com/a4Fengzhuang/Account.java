package com.a4Fengzhuang;

public class Account {//账号
    public String name;
    private double balance;//余额
    private int password;//密码

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20，默认值为0");
            this.balance = 0;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        if (1 < name.length() && name.length() < 5){
            this.name = name;
        }else {
            System.out.println("名字长度只能在2到4，默认值为夏辰义");
            this.name = "夏辰义";
        }

    }

    public String getName() {
        return name;
    }

    public void setPassword(int password) {
        if (100000 <= password && password <= 999999){
            this.password = password;
        }else {
            System.out.println("密码必须为6位，默认值为0");
            this.password = 0;
        }

    }

    public int getPassword() {
        return password;
    }
}
