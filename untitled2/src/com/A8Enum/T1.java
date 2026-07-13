package com.A8Enum;

public class T1 {
    public static void main(String[] args) {
        A a =A.spring;
        System.out.println(a.name());
        //返回常量名
        System.out.println(a.ordinal());
        //声明循序从0开始
        System.out.println(a.toString());
        //和nema一样
        System.out.println(a.compareTo(A.spring));
        //按顺序比较
        System.out.println(a.getDeclaringClass());
        //找到文件位置
        for (A a1 :A.values()){
            System.out.println(a1);
        }//增强for循环
        //历遍enum
        System.out.println(a == A.spring);
        //推荐==不推荐equals
        A spring = A.valueOf("spring");
        System.out.println(spring);
        //找到这个常量，不是就报错
    }
}
enum A{
    spring("春天");

    private String Name;

    private A(String Name){
        this.Name = Name;
    }
}
/*
枚举 = 固定实例的单例集合，用 == 比较，用 values() 遍历，
用 valueOf() 查找，用自定义字段替代 ordinal()。
// 形式1：简单枚举
enum Season { SPRING, SUMMER, AUTUMN, WINTER }

// 形式2：带参数（最常用）
enum Status {
    SUCCESS(200, "成功"),    // 常量列表，逗号分隔
    ERROR(500, "错误");      // 最后一个分号结束

    private final int code;
    private final String msg;

    Status(int code, String msg) {   // 构造方法默认 private
        this.code = code;
        this.msg = msg;
    }
}

// 形式3：带抽象方法（策略模式）
enum Operation {
    ADD { public double apply(double a, double b) { return a + b; } },
    SUB { public double apply(double a, double b) { return a - b; } };
    abstract double apply(double a, double b);
}
| 方法                | 作用                | 示例                                |
| ----------------- | ----------------- | --------------------------------- |
| `name()`          | 返回常量名（不可重写）       | `SPRING.name()` → `"SPRING"`      |
| `ordinal()`       | 返回声明顺序（从0）        | `SPRING.ordinal()` → `0`          |
| `toString()`      | 默认同name()，**可重写** | 重写后改变输出                           |
| `values()`        | 返回所有常量数组          | `for(Season s : Season.values())` |
| `valueOf(String)` | 根据名称获取常量          | `Season.valueOf("SPRING")`        |
| `compareTo(E)`    | 按ordinal比较顺序      | `SUMMER.compareTo(SPRING)` → `1`  |
1. 构造方法只能是 private（可省略不写）
2. 常量名必须全大写，用下划线分隔：SUCCESS_CODE
3. valueOf("SPRING") 必须大小写完全匹配，找不到抛异常
4. 枚举比较用 ==，不要用 equals
5. 不要用 ordinal() 做业务逻辑（顺序会变）
6. values() 每次调用返回新数组（频繁用要缓存）
 */