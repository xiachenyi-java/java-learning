package com.a6Duotai;

public class master {
    private String name;
    public master(String name){
        this.name = name;
    }
    public void feed(animal animal,food food){
        System.out.println(name + "正在喂" +animal.getName()+ "...." );
        animal.eat(food);
        animal.makeSound();
        System.out.println("-------------------");
    }
}
