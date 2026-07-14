package com.A4Generics4;

import java.util.ArrayList;
import java.util.List;

/**
 * 夏辰义
 * 2026/7/1417:05
 */
//什么是类型擦除？
//类型擦除：泛型信息只在编译期存在，编译后会被"擦除"，替换为原始类型或边界类型。
//Java 泛型是"编译期的幻觉" —— 编译时严格检查，运行时就"消失"了。
//这是 Java 为了向后兼容做出的设计取舍，也是 Java 泛型与 C# 泛型最本质的区别。
public class T1 {
    public static void main(String[] args) {
        // 你写的代码
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        String s = strList.get(0);
        List<Integer> intList = new ArrayList<>();

        System.out.println(strList.getClass() == intList.getClass());
// true！运行时都是 ArrayList，没有 <String> 和 <Integer> 的区别
    }
}
/*
场景	擦除结果
无界类型参数 <T>	替换为 Object
有界类型参数 <T extends Number>	替换为边界 Number
通配符 <?>	替换为 Object
桥方法（Bridge Method）
问题：类型擦除后，子类重写的方法签名可能不匹配
编译器自动生成的桥方法
public class Limitations<T> {

    // ❌ 1. 不能实例化类型参数
    T obj = new T();  // 编译报错！运行时不知道 T 是什么

    // ❌ 2. 不能创建泛型数组
    T[] array = new T[10];  // 编译报错！

    // ❌ 3. 不能使用 instanceof 判断泛型类型
    if (obj instanceof T) { }  // 编译报错！
    if (obj instanceof List<T>) { }  // 也报错！

    // ❌ 4. 不能获取 Class 对象
    Class<T> clazz = T.class;  // 编译报错！

    // ❌ 5. 不能抛出/捕获泛型异常
    try {
        // ...
    } catch (T e) {  // 编译报错！
        // ...
    }

    // ❌ 6. 静态成员不能使用类型参数
    private static T staticField;  // 编译报错！
    public static void staticMethod(T param) { }  // 编译报错！
}
为什么有这些限制？
根本原因：运行时没有泛型信息
类型擦除 vs C# 真泛型
特性	Java（擦除）	C#（真泛型）
运行时保留类型信息	❌ 不保留	✅ 保留
List<String> vs List<Integer>	同一个 Class	不同 Class
能否 new T()	❌ 不能	✅ 可以（有约束时）
能否 T.class	❌ 不能	✅ 可以
向后兼容	✅ 兼容旧代码	❌ 需要 .NET 2.0+
代码膨胀	无	每个类型生成一份代码
一句话总结常见限制
限制	原因	解决方案
不能 new T()	擦除后不知道类型	传 Class<T> 用反射
不能 new T[10]	数组需要运行时类型	用 List<T> 或 Object[]
静态不能用 T	静态不依赖实例	静态方法用自己的 <E>
不能 catch T	异常需要确切类型	泛型异常类
不能重载 List<T>	擦除后签名相同	用不同方法名
instanceof T	运行时无泛型信息	用 instanceof List<?>
 */