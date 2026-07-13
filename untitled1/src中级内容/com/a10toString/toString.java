package com.a10toString;

public class toString {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("toString是" + a1.toString());
        System.out.println("toString是" + a1);//自动调用
    }
}
class A{
    String name = "夏辰义";
    int age = 18;
    // 重写 toString() 方法
    @Override
    public String toString() {
        return "A{name='" + name + "', age=" + age + "}";

    }
}
/*
toString() 是 Object 类 的方法，所有 Java 类都继承它。用于返回对象的字符串表示形式。
// Object 类的默认实现（在 java.lang.Object 中）
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
@Override
public String toString() {
    return "类名{字段1=" + 字段1 + ", 字段2=" + 字段2 + "}";
}
要点	内容
来源	java.lang.Object 类
作用	返回对象的字符串表示
必须重写吗	不是必须，但强烈建议
何时重写	需要查看对象内容时（几乎总是）
最佳实践	使用 IDE 生成或 Lombok
💡 记住：好的 toString() 能让调试效率提升 10 倍！
以下情况会自动调用 toString()：
A a = new A();

// 1. 字符串拼接
String s = "对象：" + a;  // 自动调用 a.toString()

// 2. System.out.println()
System.out.println(a);     // 自动调用 a.toString()

// 3. 断言或日志
logger.info("当前用户：{}", a);  // 自动调用
 */

