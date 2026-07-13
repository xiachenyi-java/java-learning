package com.a4Fengzhuang;

public class AccountTest {
    public static void main(String[] args) {
        Account Account1 = new Account();
        Account1.setName("夏");
        Account1.setBalance(9);
        Account1.setPassword(12000);
        Account1.getName();
        Account1.getBalance();
        Account1.getPassword();
    }
}
/*
一、封装的本质
封装就是把对象的属性藏起来，不让外部直接碰，只能通过规定的方法来访问和修改。
就像ATM机，你不能直接打开箱子拿钱，只能通过屏幕操作。
二、封装的三个步骤
第一步：属性私有化
把所有属性都用 private 修饰，这样外部代码无法直接访问。
第二步：提供公共的 getter 方法
用来获取属性的值。
第三步：提供公共的 setter 方法
用来设置属性的值，同时在方法里加校验逻辑。
修饰符	同类	同包	子类	任何地方
private	可以	不行	不行	不行
默认不写	可以	可以	不行	不行
protected	可以	可以	可以	不行
public	可以	可以	可以	可以
八、封装的好处总结
安全：外部不能直接改内部数据
可控：在 setter 里加任何校验逻辑
灵活：以后改内部实现，不影响别人调用
清晰：接口明确，该看的看，该藏的藏

 */
