package com.A6LocallnnerClass;

public class StaticNestedClass {
    public static void main(String[] args) {
        new D.E().E1();
    }
}
class D{
    static private  int j;
    private int i;
    static class E{
        void E1(){
            System.out.println("静态内部类" + j);
        }
    }
}
/*
1. 本质：独立的类，只是嵌套在另一个类里
class Outer {
    static class Inner {
        // 编译器不生成 this$0
        // 不持有外部类引用
    }
}
和外部类的关系：能访问私有静态成员，但不依赖外部实例
2. 创建方式：直接 new，不需要外部实例
// 正确写法
Outer.Inner i = new Outer.Inner();

// 错误写法（这是成员内部类的）
Outer outer = new Outer();
Outer.Inner i = outer.new Inner();   // ❌ 编译错误！
3. 访问规则：只能访问外部类的静态成员
class Outer {
    private static int sx = 10;      // 静态私有
    private int x = 20;              // 非静态私有
    private static void sm() {}      // 静态私有方法

    static class Inner {
        void show() {
            System.out.println(sx);       // ✅ 可以
            System.out.println(Outer.sx);   // ✅ 明确指定
            sm();                           // ✅ 可以

            // System.out.println(x);       // ❌ 编译错误！
            // System.out.println(Outer.this.x); // ❌ 没有 Outer.this！
        }
    }
}
|              | 静态内部类 | 成员内部类 |
| ------------ | ----- | ----- |
| 访问外部非静态成员    | ❌ 不能  | ✅ 能   |
| 访问外部静态成员     | ✅ 能   | ✅ 能   |
| `Outer.this` | ❌ 不存在 | ✅ 存在  |
4. 可以有自己的静态成员
class Outer {
    static class Inner {
        static int count = 0;        // ✅ 可以有静态变量
        static void show() {}         // ✅ 可以有静态方法
        final static int MAX = 100;   // ✅ 可以有静态常量

        int num = 0;                  // ✅ 也可以有实例成员
    }
}
这是和成员内部类的关键区别：成员内部类 JDK 16 之前不能有静态声明。
8. 和成员内部类的核心区别总结
表格
特性	静态内部类	成员内部类
持有外部引用	❌ 没有 this$0	✅ 有 this$0
创建方式	new Outer.Inner()	outer.new Inner()
访问外部非静态	❌ 不能	✅ 能
访问外部静态	✅ 能	✅ 能
自己的静态成员	✅ 可以有	❌ JDK 16 前不行
内存泄漏风险	无	有
独立性	高（像普通类）	低（依赖外部实例
 */