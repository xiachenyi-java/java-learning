package com.A6LocallnnerClass;

public class InternalClassOfMembers {
    public static void main(String[] args) {
        C c = new C();
        c.C1();
    }
}
class C{
    private int i;
    class D{
        int i = 1;
        public void D1(){
            System.out.println("直接访问" + i);
            System.out.println("明确访问" + C.this.i);
        }
    }
    public void C1(){
        D d = new D();
        d.D1();
    }
}
/*
1. 本质：绑定外部类实例
class Outer {
    private int x = 10;

    class Inner {           // 成员内部类
        // 编译器偷偷生成：final Outer this$0;
        // 每个 Inner 实例都持有外部类引用
    }
}
没有外部类实例，内部类实例就不存在。
2. 创建方式
表格
位置	写法
外部类内部	new Inner() 或 this.new Inner()
外部类静态方法	new Outer().new Inner()
外部其他类	outer.new Inner()
class Outer {
    class Inner {}

    void test() {
        Inner i1 = new Inner();        // ✅
        Inner i2 = this.new Inner();   // ✅ 等价
    }

    static void staticTest() {
        // Inner i = new Inner();      // ❌ 编译错误！静态方法没有 this
        Inner i = new Outer().new Inner();  // ✅
    }
}

// 外部类
class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // ✅ 必须依赖外部实例
    }
}
3. 访问规则
class Outer {
    private static int sx = 10;
    private int x = 20;

    class Inner {
        private int x = 30;   // 遮蔽外部类 x

        void show() {
            System.out.println(x);           // 30（自己的）
            System.out.println(this.x);      // 30（自己的）
            System.out.println(Outer.this.x); // 20（外部类的）
            System.out.println(sx);           // 10（静态的随便访问）
        }

        void visitPrivate() {
            // 外部类的私有成员？直接访问！
            Outer.this.privateMethod();  // ✅ 编译器会生成访问方法
        }
    }

    private void privateMethod() {}
}
4. 不能有静态声明（JDK 16 之前）
class Outer {
    class Inner {
        // static int count = 0;     // ❌ JDK 15 及之前报错
        // static void show() {}      // ❌

        final static int MAX = 100;   // ✅ 编译期常量可以
    }
}
JDK 16+ 放宽了限制，但通常不建议在成员内部类里放静态成员。
5. 外部类访问内部类
class Outer {
    class Inner {
        private int secret = 99;   // 内部类的私有成员
    }

    void test() {
        Inner i = new Inner();
        System.out.println(i.secret);  // ✅ 外部类可以直接访问内部类私有成员！
    }
}
双向透明：内部类访问外部类私有，外部类也访问内部类私有。编译器会生成桥接方法。
6. 字节码秘密
编译后生成两个文件：
Outer.class
Outer$Inner.class
Outer$Inner 构造方法：
// 编译器生成
Inner(Outer outer) {
    this.this$0 = outer;   // 持有外部类引用
}
7. 内存泄漏风险
java
复制
public class Activity {
    class Handler {   // 成员内部类持有 Activity 引用
        void doSomething() {}
    }

    // 如果 Handler 被外部长期持有，Activity 无法被 GC
}
解决：如果内部类不需要访问外部实例，改成静态内部类。
8. 四种内部类对比
表格
成员内部类	静态内部类	局部内部类	匿名内部类
位置	类中，方法外	类中，方法外	方法内	方法内/参数
static	❌	✅	❌	❌
依赖外部实例	✅ 必须	❌ 不依赖	✅ 必须	✅ 必须
访问外部非静态	✅	❌	✅	✅
访问外部局部变量	❌	❌	✅（effectively final）	✅（effectively final）
静态成员	❌ JDK16前	✅	❌ JDK16前	❌ JDK16前
9. 典型应用：迭代器模式
class ArrayList<E> {
    private Object[] elementData;   // 私有数组

    // 迭代器需要访问 elementData
    private class Itr implements Iterator<E> {
        int cursor;     // 当前位置

        public E next() {
            return (E) elementData[cursor++];  // 直接访问外部类私有成员
        }
    }

    public Iterator<E> iterator() {
        return new Itr();   // 返回内部类实例
    }
}
总结 checklist
[ ] 绑定外部实例，不能独立存在
[ ] 外部创建用 outer.new Inner()
[ ] 内部创建直接用 new Inner()
[ ] 变量遮蔽时用 Outer.this.x 区分
[ ] 双向访问私有成员
[ ] JDK 16 之前不能有静态成员
[ ] 不需要访问外部实例时，优先用静态内部类（防内存泄漏）
 */