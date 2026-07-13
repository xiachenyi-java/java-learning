package com.a7title;

public class T1 {
    private String name;
    private String sey;
    private int age;

    public T1(){

    }
    public T1(String name, String sey, int age){
            this.age = age;
            this.name = name;
            this.sey = sey;
    }

    public void A1(){
        System.out.println("我是父类方法1");
    }

    public String A2(){
        return name + "我是父类方法2" ;
    }

    @Override
    public String toString(){
        return "名字是" + name + "年龄是" + age + "性别是" + sey;
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


    public String getSey() {
            return sey;
    }

    public int getAge() {
            return age;
    }

    public String getName() {
            return name;
    }

}



