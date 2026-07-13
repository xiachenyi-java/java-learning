package com.a4title;

public class T1 {
    private String name;
    private double salary;
    private int days;

    public T1(){

    }

    public T1( String name,double salary,int days){
        this.salary = salary;
        this.name = name;
        this.days = days;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void A1(){
        System.out.println(salary*days);
    }
}
