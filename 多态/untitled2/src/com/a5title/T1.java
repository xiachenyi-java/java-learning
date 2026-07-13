package com.a5title;

public class T1 {
    private double salary;

    public T1(){

    }

    public T1(double salary){
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void A1(){
        System.out.println(salary);
    }
}
