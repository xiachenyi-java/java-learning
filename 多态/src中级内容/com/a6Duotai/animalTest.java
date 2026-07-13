package com.a6Duotai;

public class animalTest {
    public static void main(String[] args) {
        animal animal1 = new dog("小白");// 运行时多态,父类引用指向子类对象
        animal animal2 = new cat("小黄");//向上转型
        animal animal3 = new bird("鸟鸟");
        master master1 = new master("夏辰义");
        food fish1 = new fish();
        food bone1 = new bone();
        food bug1 = new bug();
        //✅ 虽然引用类型是 animal，但实际执行的是 dog 和 cat 重写的方法——这就是动态绑定！
        animal1.makeSound();
        animal2.makeSound();
        System.out.println("-------------------");
        master1.feed(animal2,fish1);
        master1.feed(animal1,bone1);
        master1.feed(animal3,bug1);
        //animal3.fly();这是子类的独特方法在向上转型时不能调用
        bird bird = (bird) animal3;//向下转型，可以调用子类独特方法
        bird.fly();
    }
    /*
    // 推荐：先检查，再转型（避免 ClassCastException）
if (animal3 instanceof bird) {
    bird bird = (bird) animal3;
    // 现在可以安全调用 bird 特有的方法
    bird.fly();  // 假设 fly() 是 bird 类独有的方法
} else {
    // 处理类型不匹配的情况
    System.out.println("animal3 不是 bird 类型");
}
// 更现代、更简洁的语法
if (animal3 instanceof bird bird) {
    // 自动完成转型，bird 变量直接可用
    bird.fly();
}
     */
}
/*
多态的核心机制
概念	说明
继承	子类继承父类，建立"is-a"关系
重写	子类重新实现父类方法
向上转型	父类类型 变量 = new 子类对象()
动态绑定	JVM 在运行时根据实际对象类型决定调用哪个方法
这就是多态的威力：开闭原则——对扩展开放，对修改关闭！
知识点	你的掌握情况
运行时多态	✅ 父类引用指向子类对象 Animal a = new Dog()
方法重写（Override）	✅ 子类重新实现父类方法
动态绑定	✅ JVM运行时根据实际对象调用方法
向上转型	✅ 自动转换，安全
多态的应用场景	✅ 主人喂食案例，解耦代码
思想	理解程度
解耦	✅ 用抽象代替具体，降低依赖
开闭原则	✅ 对扩展开放，对修改关闭
代码复用	✅ 一个feed()处理所有动物
特性	向上转型	向下转型
方向	子 → 父	父 → 子
语法	自动，无需符号	强制，需要 (类型)
安全	✅ 总是安全	⚠️ 可能异常，需判断
目的	统一处理，多态	调用子类特有功能
使用场景	存入集合、方法参数	恢复子类功能
向下转型是"恢复身份"的过程 —— 向上转型时隐藏了子类特性，需要时再转回来调用特有功能。
切记先 instanceof 判断，避免 ClassCastException！
 */
/*
public class fish extends com.duotai.food {
    public fish(String food){   // ← 接收了参数 food
        super("鱼");            // ← 但直接忽略，固定传"鱼"
    }
}你的构造函数假装需要参数，实际没用，导致调用时被迫传参却无效。
建议：要么真用参数（方案B），要么去掉参数（方案A），不要"假装要"！
 */