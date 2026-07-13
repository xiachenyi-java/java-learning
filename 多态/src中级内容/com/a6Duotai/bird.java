package com.a6Duotai;

public class bird extends animal{
    private String name;
    public bird(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("啾啾啾");
    }
    public void fly(){
        System.out.println("飞起来了");
    }
}
