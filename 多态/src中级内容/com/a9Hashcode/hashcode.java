package com.a9Hashcode;

public class hashcode {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;
        System.out.println("a1的hashcode是" +a1.hashCode());
        System.out.println("a2的hashcode是" +a2.hashCode());
        System.out.println("a3的hashcode是" +a3.hashCode());
    }

}
class A{ }
/*
hashCode() 的设计确实是为了提高哈希结构容器的效率。
hashCode() 的默认实现
由于 class A 没有重写 hashCode()，它继承自 Object 类。默认实现是：
根据对象的内存地址生成一个整数
不同内存地址的对象 → 不同的 hashCode
相同内存地址的引用 → 相同的 hashCode
变量	引用对象	内存地址	hashCode
a1	第一个 A 实例	地址 X	基于 X 生成
a2	第二个 A 实例	地址 Y（不同）	基于 Y 生成（不同）
a3	第一个 A 实例	地址 X（同 a1）	基于 X 生成（同 a1
重要约定（契约）
如果未来你重写了 equals()，必须同时重写 hashCode()，遵循以下规则：
一致性：同一对象多次调用，hashCode 必须相同
相等性：如果 a.equals(b) 为 true，则 a.hashCode() == b.hashCode() 必须为 true
不等性：如果 a.equals(b) 为 false，hashCode 尽量不同（但允许冲突）
实际应用
HashMap/HashSet：依赖 hashCode 确定存储桶位置，再使用 equals 比较
如果两个不同对象 hashCode 相同（哈希冲突），会以链表/红黑树形式存储在同一桶
 */