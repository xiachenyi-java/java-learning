package com.a7title;

public class T3 extends T1{
    private String name;
    private String sey;
    private int age;
    private int work_age;

    public T3(){

    }

    public T3(String name, String sey, int age, int work_age){
            this.age = age;
            this.name = name;
            this.sey = sey;
            this.work_age = work_age;
    }

    @Override
    public void A1(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String A2(){
        return name + "爱玩象棋";
    }

    @Override
    public String toString(){
        return "名字是" + name + "年龄是" + age + "性别是" + sey + "工龄是" + work_age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public void setName(String name) {
            this.name = name;
    }

    public void setSey(String sey) {
            this.sey = sey;
    }

    public void setWork_age(int work_age) {
            this.work_age = work_age;
    }

    public String getSey() {
            return sey;
    }

    public int getAge() {
            return age;
    }

    public String getName() {
            return name;
    }

    public int getWork_age() {
            return work_age;
    }
}

