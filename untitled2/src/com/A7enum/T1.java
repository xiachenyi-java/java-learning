package com.A7enum;

public class T1 {
    public static void main(String[] args) {
       System.out.println(A.spring);
       System.out.println(A.summer);
    }
}
enum A{
    spring("春天","舒适"),
    summer("夏天","炎热");
    private String name;
    private String description;

    private A(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        return name + description;
    }
}
/*
一、枚举的本质：特殊的类
enum Season { SPRING, SUMMER }
编译后本质上是：
final class Season extends Enum<Season> {
    public static final Season SPRING = new Season("SPRING", 0);
    public static final Season SUMMER = new Season("SUMMER", 1);
    // ...
}
关键特性：
隐式继承 java.lang.Enum，不能再继承其他类（但可以实现接口）
隐式被 final 修饰（除非包含抽象方法，见下文）
构造方法强制为 private
 */