package com.A6LocallnnerClass;

public class InternalClass {
    public static void main(String[] args) {
        A a = new A();
        a.A1();
        System.out.println(a.getI());
    }
}
class A{
    private int i = 0;

    public void A1(){
        class B{
            public void B1(){
                int i = 1;
                A.this.i = 22;// // ✅ 可以改！因为 i 是外部类的成员变量，
                // 不是局部变量
                System.out.println("内部类的方法，调用私密属性" + A.this.i +
                        "这是局部变量" + i);
            }
        }
        B b = new B();
        b.B1();
    }

    public int getI() {
        return i;
    }
}
/*
. 局部内部类不能加访问修饰符
public void A1(){
    public class B {}   // ❌ 报错！不能加 public/private/protected
    static class B {}    // ❌ 报错！也不能加 static

    class B {}           // ✅ 只能这样，什么都不加
}
因为作用域只在该方法内，修饰符没有意义
2. 局部内部类访问外部方法的局部变量 —— 必须是 final 或 effectively final
public void A1(){
    int num = 10;           // 局部变量
    // num = 20;            // ❌ 如果修改了，下面会报错！

    class B {
        public void show() {
            System.out.println(num);  // ✅ 可以读
            // num = 30;              // ❌ 绝对不能改！
        }
    }
}
规则：局部内部类只能读取外部方法的局部变量，不能修改。这个变量必须是 final 或
 实际上的 final（effectively final，即赋值后不再变）。
Java 8 之前必须显式写 final int num = 10;，Java 8+ 编译器自动推断。
局部内部类只在定义它的代码块内可见
public void A1() {
    if (true) {
        class B {}      // B 只在这个 if 块里能用
        B b = new B();  // ✅
    }
    // B b2 = new B();  // ❌ 这里找不到 B
}

public void A2() {
    // B b = new B();   // ❌ 另一个方法里也没有 B
}
局部内部类不能有静态声明（JDK 16 之前）
class B {
    static int x = 10;   // ❌ JDK 15 及之前报错！不能有静态成员
    static void m() {}   // ❌ 也不能有静态方法

    int y = 20;          // ✅ 实例成员可以
    void f() {}          // ✅ 实例方法可以
 */