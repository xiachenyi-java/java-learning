package com.a5Jicheng;

public class student {
    //
    public String name;
    public int age;
    private double score;
    //
    public void student1(){
        System.out.println("学生名字是" + name + "年龄" + age + "成绩是" + score);
    }

    public void setScore(double score) {
        this.score = score;
    }
}
