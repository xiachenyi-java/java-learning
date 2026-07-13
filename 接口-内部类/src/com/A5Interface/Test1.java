package com.A5Interface;

public class Test1 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        phone phone = new phone();
        Computer computer = new Computer();
        computer.work(phone);//把手机接入电脑
        System.out.println("======");
        computer.work(camera);//把相机接入电脑
    }
}
/*
一、接口是什么？
接口是一种"规范/契约"，只定义方法签名，不实现具体逻辑。
public interface UsbInterface {
    public void start();  // 只有声明，没有方法体
    public void stop();
}
类比：接口就像 USB 标准，规定了插头的形状和引脚定义，但不管里面接的是 U 盘、鼠标还是键盘。
二、接口 vs 抽象类
表格
特性	接口 (interface)	抽象类 (abstract class)
方法	传统上只能有抽象方法（JDK8+ 可有默认/静态方法）	可以有抽象方法和普通方法
变量	只能是 public static final 常量	可以有普通成员变量
继承	一个类可以实现多个接口	一个类只能单继承一个抽象类
设计目的	定义"能力/规范"（has-a）	定义"是什么"（is-a）
构造方法	❌ 没有	✅ 可以有
1. 定义接口
public interface 接口名 {
    // 常量（默认 public static final）
    int MAX_SIZE = 100;

    // 抽象方法（默认 public abstract）
    void method();

    // JDK8+ 默认方法（有实现，不强制重写）
    default void defaultMethod() {
        System.out.println("默认实现");
    }

    // JDK8+ 静态方法
    static void staticMethod() {
        System.out.println("静态方法");
    }
}
2. 实现接口
public class 类名 implements 接口1, 接口2, ... {
    @Override
    public void method() {
        // 必须实现所有抽象方法
    }
}
 */
