package com.A1Generics;

/**
 * 夏辰义
 * 2026/7/1415:51
 */
//泛型 = 编译期的"类型警察" + 运行时的"透明人"
public class T1 {
    public static void main(String[] args) {
        A<String> stringA = new A<String>("xcy");//创建实例时指定具体类型
        System.out.println(stringA.a);
    }
}
class A<T>{
    T a;// // 用 T 作为字段类型
    public A(T t){
        a = t;//用 T 作为参数类型
    }
    public T A1 (){// // 用 T 作为返回类型
        return a;
    }
}
/*
泛型（Generics）是 Java 在 JDK 5 引入的特性，它允许你在定义类、接口或方法时，将类型作为参数传递。
简单说：类型参数化——把"类型"当作变量来使用。
编译期类型检查	写错类型直接编译报错，问题早发现
自动类型推断	取出时无需强制转换，代码更简洁
代码复用	一套逻辑适配多种类型
类型参数	Type Parameter	定义时的占位符，如 T、E
实际类型参数	Type Argument	使用时的具体类型，如 String、Integer
泛型类	Generic Class	class Box<T> { }
泛型方法	Generic Method	<T> void method(T param)
原始类型	Raw Type	不带泛型的旧写法，如 List（不推荐）
类型擦除（Type Erasure）：泛型信息只在编译期存在，运行时被擦除。
 */