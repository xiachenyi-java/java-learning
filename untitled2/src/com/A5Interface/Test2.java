package com.A5Interface;

public class Test2 {
}
/*
"接口是规范，实现是能力；
多态调方法，解耦靠接口；
单继承多实现，向上转型灵活用。"
四、接口的三大特性（重点！）
特性1：多态性
接口引用指向实现类对象
UsbInterface usb = new Phone();  // 向上转型
usb.start();  // 实际执行 Phone 的 start()
你的代码中 computer.work(phone) 就是多态的应用
特性2：多实现
一个类可以实现多个接口
public class SmartPhone implements UsbInterface, Bluetooth, Wifi {
    // 同时拥有三种能力
}
特性3：接口继承接口
public interface Usb3 extends UsbInterface {
    void fastCharge();  // 在 UsbInterface 基础上扩展
}
五、接口的设计意义（为什么用接口？）
表格
意义	解释
解耦	调用方只依赖接口，不依赖具体实现
扩展性	新增功能只需新增实现类，不改原有代码
规范化	强制实现类遵循统一的方法签名
多态	同一套代码处理不同类型的对象
你的 Computer 例子完美诠释了解耦：电脑只认 USB 标准，不管插进来的是手机还是相机。

 */