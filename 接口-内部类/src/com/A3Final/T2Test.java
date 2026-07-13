package com.A3Final;

/*
常见面试题
Q：final、finally、finalize 的区别？
final：关键字，修饰类/方法/变量
finally：异常处理块，始终执行
finalize()：Object 方法，GC 前调用（已废弃 @Deprecated since 9）
Q：final 变量存在哪里？
实例变量 → 堆内存（对象中）
静态变量 → 方法区/元空间
局部变量 → 栈内存
Q：为什么 String 是 final 的？
安全性：防止被恶意继承篡改
线程安全：不可变 = 线程安全
性能：字符串常量池复用
HashCode 缓存：计算一次，重复使用
 */
public class T2Test {
}
/*
1. final 修饰静态变量（常量）
class Constants {
    public static final double PI = 3.14159;  // 全局常量，全大写命名规范
    public static final int MAX_SIZE = 100;
}
细节：
static final 组合 = 编译期常量，JVM 会优化，直接嵌入代码中
命名规范：全大写 + 下划线分隔（SNAKE_CASE）
必须在声明时或静态代码块中初始化
 */
/*
2. final 修饰引用类型  容易混淆的重点 ⚠️
final StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");      // ✅ 可以！对象内部状态可以改变
// sb = new StringBuilder();  // ❌ 不可以！引用不能指向新对象

final int[] arr = {1, 2, 3};
arr[0] = 100;             // ✅ 可以！数组元素可以修改
// arr = new int[5];        // ❌ 不可以！引用不能重新赋值
核心区别：
基本类型 final	引用类型 final
变量值	不可变	引用地址不可变
对象内容	—	可以变
 */
/*
3. final 修饰方法参数
class Example {
    public void print(final String msg) {
        // msg = "new";  // ❌ 编译错误：不能修改参数
        System.out.println(msg);
    }

    public void process(final List<String> list) {
        list.add("item");      // ✅ 可以修改对象内容
        // list = new ArrayList<>();  // ❌ 不能修改引用
    }
}
用途：防止方法内部意外修改参数，增强代码安全性。
4. final 修饰实例变量的初始化时机（3种方式）
class Person {
    // 方式1：声明时直接初始化
    public final String name = "张三";

    // 方式2：构造方法中初始化（每个对象可以不同）
    public final int age;
    public Person(int age) {
        this.age = age;  // 只能赋值一次
    }

    // 方式3：构造代码块中初始化
    public final String gender;
    {
        gender = "男";
    }
}
规则：final 实例变量必须且只能被赋值一次。
5. final 与继承、多态的深层细节
final class A {}
// class B extends A {}  // ❌ 编译错误

class Parent {
    private final void secret() {}  // private + final = 冗余，
    private 本身就不可重写
}

class Child extends Parent {
    public void secret() {}  // ✅ 这不是重写！这是新方法（因为父类是 private）
}
注意：private 方法隐式就是 final 的，加 final 是多余的。
6. final 的内存语义（面试常考 🔥）
class SafePublication {
    final int x;
    int y;

    public SafePublication() {
        x = 10;      // 写 final 字段
        y = 20;      // 写普通字段
    }
}
关键细节：
final 字段在构造方法中初始化后，可以保证可见性（happens-before 规则）
其他线程读取对象时，一定能看到 final 字段的正确值
普通字段 y 则不保证（可能看到默认值 0）
这是 final 在并发编程中的重要作用
 */