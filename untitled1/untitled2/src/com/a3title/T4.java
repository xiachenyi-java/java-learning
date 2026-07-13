package com.a3title;

public class T4 extends T1{
    @Override
    public void A1(){
        System.out.println("姓名是" + getName() + "年龄是" + getAge() + "工资是" + getSalary() * 1.1 + "职称是" +getPost());
    }
}
