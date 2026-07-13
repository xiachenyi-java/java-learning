package com.a6Duotai;

public class animal {
    private String name;
    public animal(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("动物的叫声");
    }
    public void eat(food food){
        System.out.println(name + "吃" +food.getFood());
    }

}
