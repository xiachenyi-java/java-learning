package com.A2Generics2;

import java.util.ArrayList;
import java.util.List;

/**
 * 夏辰义
 * 2026/7/1416:01
 */
public class T1 implements T2<String>{//参数类型已确定为 String
//实现方式二：实现类继续保持泛型
    public List<String> list = new ArrayList<>();

    @Override
    public void add(String t2) {
        list.add(t2);
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }
    //3. 泛型方法
    //关键点：泛型方法的类型参数独立于类的类型参数
    public <T> T A1(T t){//泛型方法：<T> 写在返回值前面
        return t;
    }

    public static void main(String[] args) {
        System.out.println(new T1().A1("葫芦娃"));
        System.out.println(new T1().A1(1));
        // 一句话：类的泛型是"户口"，方法的泛型是"临时身份证"，每次调用都可以换
    }
}
/*
字母	含义	典型使用场景
T	Type	通用类型
E	Element	集合元素（List、Set）
K	Key	Map 的键
V	Value	Map 的值
N	Number	数值类型
R	Result	方法返回值
S, U, V	2nd, 3rd, 4th Type	多个类型参数时
泛型数组的陷阱
❌ 不能直接创建泛型数组：
原因：类型擦除后 List<String>[] 变成 List[]，但数组在运行时要记录元素类型，两者冲突。
✅  workaround：使用 Object[] + 强制转换
✅ 更好的做法：使用 List<List<String>> 代替数组
泛型与可变参数（Varargs）
❌ 直接传泛型可变参数有警告：
原因：可变参数本质是数组 T[]，和泛型数组问题一样。
✅ 解决方案：@SafeVarargs
@SafeVarargs  // 告诉编译器"我知道自己在做什么"
public final <T> void printAll(T... items) {
    for (T item : items) {
        System.out.println(item);
    }
}

// 使用
printAll("a", "b", "c");
printAll(1, 2, 3);
⚠️ @SafeVarargs 只能用于 static、final 或 private 方法
泛型嵌套
泛型里面套泛型：
 泛型与继承的关系
重要结论：List<String> 不是 List<Object> 的子类！
原因：如果允许赋值，就能往 objList 里加 Integer，破坏 strList 的类型安全。
 通配符 ? 的引入
既然 List<String> 不是 List<Object> 的子类，那如何写通用方法？
✅ 用无界通配符 ?：
? 表示"某种未知类型"，编译器不知道具体是什么，所以不允许写入。
7. 三种通配符对比
通配符	写法	含义	读	写
无界	List<?>	任意类型	Object	null  only
上界	List<? extends Number>	Number 或其子类	Number	❌ 不能写
下界	List<? super Integer>	Integer 或其父类	Object	Integer 及其子类
 */