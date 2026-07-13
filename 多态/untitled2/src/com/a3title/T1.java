package com.a3title;

public class T1 {
    private String name;
    private int age;
    private String post;
    private double salary;

    public T1() {

    }

    public T1(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getPost() {
        return post;
    }

    public void A1() {
        System.out.println("姓名是" + name + "年龄是" + age + "工资是" + salary + "职称是" + post);
    }

    @Override
    public String toString() {
        return name + age + salary + post;
    }
}

