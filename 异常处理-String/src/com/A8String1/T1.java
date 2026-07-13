package com.A8String1;

/**
 * 夏辰义
 * 2026/6/1620:15
 */
public class T1 {
    public static void main(String[] args) {
        String N1 = "abc";// 常量池创建"abc"，N1指向常量池
        String N2 = "abc";// N2直接指向常量池中的"abc"
        String N3 = new String("abc");// 堆中新建对象，但字符数组仍引用常量池的
        String N4 = N3.intern();// N4指向常量池中的"abc"
        System.out.println(N1 == N2);//T
        System.out.println(N1 == N3);//F
        System.out.println(N1.equals(N3));//T
        System.out.println(N1 == N4);//T
    }
}
/*
特性	说明
不可变性（Immutable）	字符串一旦创建，内容不可修改。任何"修改"操作都会创建新对象
final 类	public final class String，不可被继承
实现 CharSequence	支持字符序列操作
序列化支持	实现了 Serializable 接口
2. 不可变性的原因与影响
为什么设计为不可变？
安全性：作为网络连接、文件路径等参数时，内容不会被篡改
哈希缓存：hashCode() 只计算一次，适合作为 HashMap 的 Key
字符串常量池：相同字符串可共享，节省内存
线程安全：天然线程安全，无需同步
缺点：频繁修改字符串会产生大量临时对象，影响性能。
方式	位置	说明
String s = "a"	常量池	编译期确定，可能复用
new String("a")	堆	总是创建新对象，一般避免
new String(char[])	堆	根据字符数组创建
String.valueOf()	视情况	内部优化，推荐
 */