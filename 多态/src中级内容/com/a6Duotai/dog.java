package com.a6Duotai;

public class dog extends animal {
    public dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("汪汪汪");
    }
}
