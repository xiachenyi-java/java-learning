package com.a7title;

public class T2 extends T1 {
    private String name;
    private String sey;
    private int age;
    private int sut_id;

    public T2(){

    }

    public T2(String name, String sey, int age, int sut_id){
        this.age = age;
        this.name = name;
        this.sey = sey;
        this.sut_id = sut_id;
    }

    @Override
    public void A1(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String A2(){
        return name + "爱玩足球";
    }

    @Override
    public String toString(){
        return "名字是" + name + "年龄是" + age + "性别是" + sey + "学号是" + sut_id;
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

    public void setSut_id(int sut_id) {
        this.sut_id = sut_id;
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

    public int getSut_id() {
        return sut_id;
    }
}
