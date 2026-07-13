package com.A4abstrac;

public class T1Test {
    public static void main(String[] args) {
        T2 t2 = new T2();
        t2.work();
    }
}
/*
要点	说明
抽象类	用 abstract 修饰的类，不能直接实例化
抽象方法	用 abstract 修饰，只有声明没有方法体
语法格式	public abstract class 类名 { ... }
① 不能 new	抽象类不能直接创建对象
② 子类必须重写	普通子类必须实现所有抽象方法，否则编译报错
③ 可有构造方法	供子类 super() 调用，初始化父类成员
④ 可有成员变量/普通方法	不是只能写抽象方法
⑤ 抽象方法不能 private/static/final	这三个关键字与抽象机制冲突
普通子类，全部重写	class Dog extends Animal { @Override void eat() {...} }
抽象子类，部分/不实现	abstract class Cat extends Animal { }
子类继续添加抽象方法	abstract class Bird extends Animal { abstract void fly(); }
四、抽象类 vs 接口
对比项	抽象类	接口
关键字	extends（单继承）	implements（多实现）
构造方法	✅ 有	❌ 无
成员变量	普通变量	默认 public static final
方法	抽象 + 具体方法	JDK8前仅抽象；JDK8+支持 default/static
设计目的	"is-a" 是什么	"has-a" 能做什么
五、使用场景
场景	示例
代码复用	抽取多个子类的公共代码
强制规范	抽象方法强制子类必须实现
模板方法模式	定义算法骨架，子类填充具体步骤

 */