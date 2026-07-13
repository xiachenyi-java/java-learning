package com.A6LocallnnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new B(){
            @Override
            public void B1(){
                System.out.println("无名吃东西");
            }
        }.B1();
    }
}
class B{

    public void B1(){
        System.out.println("吃东西");
    }
}
/*
1. 本质：没有名字的子类/实现类
java
复制
new 父类/接口() {
    // 重写方法 或 实现方法
};
编译后 JVM 会偷偷生成 外部类$1.class 这样的文件，所以它有真实类文件，只是你没写名字。
2. 三种使用场景
表格
场景	示例
继承普通类	new Animal() { @Override void eat() {} }
继承抽象类	new Person() { @Override void work() {} }
实现接口	new Runnable() { @Override void run() {} }
3. 语法规则
java
复制
// ✅ 正确：实现接口
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("跑");
    }
};

// ❌ 错误：不能写构造方法（没类名怎么写？）
new Runnable() {
    public Runnable() {}   // 编译错误！
};

// ✅ 替代：用实例初始化块
new Runnable() {
    {  // 构造代码块，代替构造方法
        System.out.println("初始化");
    }
    @Override
    public void run() {}
};
4. 访问外部变量 —— 和局部内部类一样
java
复制
class A {
    private int x = 10;          // 外部类成员变量 ✅ 可访问、可修改

    public void test() {
        final int y = 20;        // 局部变量 ✅ 可访问、不可修改
        int z = 30;              // effectively final ✅ 可访问、不可修改
        // z = 40;               // 一旦修改，下面报错！

        new Object() {
            void show() {
                System.out.println(x);   // 10
                x = 100;                  // ✅ 可以改！
                System.out.println(y);   // 20
                // y = 200;             // ❌ 编译错误！不能改局部变量
            }
        }.show();
    }
}
规则：局部内部类、匿名内部类共享同一套变量访问规则。
5. 不能用 abstract，也不能有 static 成员
java
复制
new Runnable() {
    // ❌ 不能有静态声明（JDK 16 之前严格禁止）
    static int count = 0;

    // ✅ 可以有实例变量
    int num = 0;

    @Override
    public void run() {}
};
6. this 的坑
java
复制
class Outer {
    int x = 10;

    public void test() {
        int x = 20;  // 局部变量遮蔽

        new Object() {
            int x = 30;  // 匿名类自己的成员

            void show() {
                System.out.println(x);        // 30（自己的）
                System.out.println(this.x);   // 30（自己的）
                System.out.println(Outer.this.x);  // 10（外部类的）
                // ❌ 拿不到 test() 方法的局部变量 x（20），被遮蔽了
            }
        }.show();
    }
}
7. 和 Lambda 的关系
表格
匿名内部类	Lambda
语法	new Runnable() { void run() {} }	() -> {}
类型	生成真实类文件	不生成类，用 invokedynamic
限制	任何接口/类都能用	只能用于函数式接口（只有一个抽象方法）
this 指向	匿名类自己	外部类
java
复制
// 匿名内部类
Runnable r1 = new Runnable() {
    @Override
    public void run() {
        System.out.println(this);  // 打印匿名类实例
    }
};

// Lambda
Runnable r2 = () -> {
    System.out.println(this);  // 打印外部类实例！
};
8. 常见陷阱
陷阱 1：以为 new B() 和 new B(){} 一样
java
复制
// 这是普通 B 实例
new B().B1();        // 调用 B 的原始方法

// 这是匿名子类实例，可能重写了方法
new B(){}.B1();      // 调用 B 的原始方法（没重写）
new B(){ @Override B1() }.B1();  // 调用重写后的方法
陷阱 2：接口里只能有 public 方法
java
复制
interface IA {
    void show();
}

new IA() {
    @Override
    public void show() {}   // ✅ 必须是 public！接口方法默认 public
    void show() {}           // ❌ 编译错误！缩小了访问权限
};
总结 checklist
[ ] 没有名字，只能用一次（除非用父类/接口引用接收）
[ ] 不能写构造方法，用 {} 实例初始化块代替
[ ] 可以访问外部类所有成员，局部变量必须 effectively final
[ ] this 指向匿名类自己，外部类用 外部类.this
[ ] 函数式接口优先用 Lambda，更简洁
 */