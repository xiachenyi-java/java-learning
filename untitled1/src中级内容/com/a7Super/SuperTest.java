package com.a7Super;

public class SuperTest {
    public static void main(String[] args) {
        Super2 mySuper2 = new Super2();
        mySuper2.A1();
        mySuper2.A2();
        Super2 my1Super2 = new Super2(1,"夏辰义",2);
        my1Super2.A1();
        my1Super2.A2();
    }
}
/*
super()	调用父类无参构造器	默认自动加，可省略
super(参数)	调用父类有参构造器	父类没有无参时必须写
super.方法()	调用父类被重写的方法	在子类中使用
唯一规则：super() 必须是构造器第一行
方法重写 (Override)
条件	父子类之间，方法名+参数+返回值相同
目的	子类修改父类的行为
注解	加 @Override 防止写错
调用父类版本	用 super.方法名()
区分两个概念：
概念	发生位置	特点
重载 (Overload)	同一个类	方法名相同，参数不同
重写 (Override)	父子类之间	方法名+参数+返回值相同
创建子类对象时：
    1. 先执行父类构造器（super）
    2. 再执行子类构造器
容易混淆的错误
错误写法	原因
super() 不在第一行	编译错误
super() 和 this() 同时用	编译错误
父类只有有参构造，子类不写 super(参数)	编译错误（默认找无参找不到
super 找爸爸，重写换实现，构造先父后子。
子类重写的方法，访问权限只能 ≥ 父类，不能更严格
重写只许更宽，不许更严；private 不能重写。
 */