package com.a5Jicheng;

public class sutdentTest {
    public static void main(String[] args) {
        CollegeStudent MyCollegeStudent = new CollegeStudent();
        MyCollegeStudent.name = "夏辰义";
        MyCollegeStudent.age = 18;
        MyCollegeStudent.setScore(99);
        MyCollegeStudent.student1();
        MyCollegeStudent.CollegeStudent1();

        PrimarySchoolStudent MyPrimarySchoolStudent = new PrimarySchoolStudent();
        MyPrimarySchoolStudent.name = "廖玉麒";
        MyPrimarySchoolStudent.age = 20;
        MyPrimarySchoolStudent.setScore(66);
        MyPrimarySchoolStudent.student1();
        MyPrimarySchoolStudent.PrimarySchoolStudent1();
    }
}
/*
使用构造器初始化：
public Student(String name, int age, double score) {
    this.name = name;
    this.age = age;
    this.score = score;
}
一、继承的基本语法
// 父类（基类/超类）
public class 父类名 {
    // 成员变量、方法、构造器
}

// 子类（派生类）
public class 子类名 extends 父类名 {
    // 继承父类，可以添加自己的特性
}
关键点：Java 是单继承，一个类只能直接继承一个父类。
继承能继承什么？
成员类型	能否继承	说明
public 成员	✅	完全继承，随意访问
protected 成员	✅	继承，同包或子类中可访问
默认(无修饰符)成员	✅	同包下继承，不同包不能
private 成员	❌	不继承，但可通过父类公共方法访问
构造器	❌	不继承，但子类构造器会调用父类构造器
静态成员	✅	继承，但属于类不属于对象

 */
