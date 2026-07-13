package com.a6Duotai;

public class cat extends animal{
    public cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("喵喵喵");
    }
}
