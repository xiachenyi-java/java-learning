package com.A4abstrac;

public abstract class T1 {
    private String name;
    private int ID;
    private double salary;

    public T1(){

    }
    public T1(String name,int ID,double salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }
}
