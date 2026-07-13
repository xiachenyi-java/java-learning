package com.A9Annotation;

@SuppressWarnings("all")
public class T1 {
    public static void main(String[] args) {
        new A().A1();
        new B().A1();
        new C().C1();
    }
}
/*
元注解	    核心功能
@Retention	控制注解生命周期
@Target	    限制注解使用位置
@Documented	是否写入 Javadoc
@Inherited	是否允许子类继承
@Repeatable	是否允许重复标注
 */
//重写就加 @Override，弃用就标 @Deprecated，抑制警告要具体参数。
class A{
    public void A1(){
        System.out.println("这是父类方法");
    }
}
/*
一、@Override — 方法重写标记
作用： 告诉编译器"这是重写父类的方法"，编译器会帮你检查是否真的覆盖了父类方法。
为什么要用：
class B extends A {
    @Override
    public void A1() { ... }   // ✓ 正确，确实重写了父类的 A1()

    @Override
    public void a1() { ... }   // ✗ 编译报错！父类没有 a1()，你拼写错了
}
不加 @Override 时，拼写错误会变成"新建一个无关方法"，编译通过但逻辑错误，很难排查。
记忆口诀： 重写必加，防手滑。
 */
class B extends A{
    @Override
    public void A1(){
        System.out.println("这是子类重写方法");
    }
}
/*
二、@Deprecated — 过时标记
作用： 标记方法/类已弃用，编译器发出警告，但程序仍能运行。
使用场景：
旧 API 有缺陷或有更好的替代方案
保留旧方法保证兼容性，但引导用户迁移
java
复制
class C {
    @Deprecated
    public void oldMethod() { }   // 调用处会出现删除线（IDE中）和编译警告
}

// 调用方
new C().oldMethod();  // ⚠️ 警告：oldMethod() 已过时
配合 Javadoc 说明替代方案：
/**
 * @deprecated 请使用 {@link #newMethod()} 替代，本方法将在 v3.0 移除
 *//*
@Deprecated
public void oldMethod() { }
记忆口诀： 旧方法打标记，警告但不拦，引导用新的。
 */
@SuppressWarnings("all")
class C{
    @Deprecated
    public void C1(){
        System.out.println("这是弃用方法");
    }
}
/*
三、@SuppressWarnings — 抑制警告
作用： 告诉编译器"我知道有风险，别报警告了"。
常用参数：
表格
参数	解决什么警告	典型场景
"unchecked"	泛型强转不安全	List 转 List<String>
"deprecation"	使用了 @Deprecated 方法	调用旧 API
"rawtypes"	使用原始泛型类型	List list = new ArrayList()
"unused"	变量/方法未使用	预留接口、调试代码
"all"	所有警告	❌ 不推荐，掩盖问题
精准用法示例：
// 只抑制这一处，范围最小
public void test() {
    @SuppressWarnings("unchecked")
    List<String> list = (List<String>) obj;  // 确认安全后再抑制
}
错误示范 vs 正确示范：
@SuppressWarnings("all")           // ❌ 太粗暴，隐藏所有问题
public void bad() { ... }

@SuppressWarnings("unchecked")     // ✓ 精准，只关闭已确认安全的警告
public void good() { ... }
记忆口诀： 警告能抑制，但要指名道姓，别用 "all" 偷懒。

 */