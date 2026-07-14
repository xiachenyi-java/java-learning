//package com;

/**
 * 夏辰义
 * 2026/7/1415:47
 */
public class 总纲 {
}
/*
Java 泛型学习总纲
一、泛型基础概念
什么是泛型：参数化类型，将类型作为参数传递
为什么需要泛型：类型安全、消除强制类型转换、代码复用
泛型的历史：JDK 5 引入，兼容旧代码（类型擦除机制）
二、泛型的基本语法
泛型类：class Box<T> { }
泛型接口：interface List<E> { }
泛型方法：<T> void method(T param)
类型参数命名约定：T（Type）、E（Element）、K/V（Key/Value）、N（Number）
三、泛型的使用方式
泛型类实例化：Box<String> box = new Box<>()
菱形运算符（JDK 7+）：类型推断 new Box<>()
原始类型（Raw Type）：兼容旧代码，但不推荐
四、类型边界（Bounded Type Parameters）
上界通配符：? extends T（协变，只读）
下界通配符：? super T（逆变，只写）
无界通配符：?（任意类型）
多重边界：<T extends Number & Comparable>
五、类型擦除（Type Erasure）
编译时擦除：泛型信息在编译后被擦除，替换为边界或 Object
桥方法（Bridge Method）：编译器自动生成的兼容方法
运行时限制：无法使用 instanceof T、new T()、T.class
六、泛型的限制与陷阱
不能创建泛型数组：new T[10] 非法
不能实例化类型参数：new T() 非法
静态成员不能使用类型参数：static T field 非法
异常处理限制：不能 catch T，不能 throw 泛型异常
1. 泛型与 Object 的区别
答：泛型在编译期做类型检查，消除了强制转换，更安全、更简洁。Object 是运行时的通用类型，需要手动转换且容易出错。
2.List<?> 与 List<Object> 的区别
答：List<?> 表示"某种未知类型的 List"，编译器不知道具体类型，所以不允许写入（除了 null）
。List<Object> 是明确类型的 List，可以写入任意对象。List<?> 可以接收任意 List<T>，
但 List<Object> 只能接收 List<Object>。
3. 类型擦除的优缺点
优点是完全向后兼容，JVM 无需修改，无代码膨胀。缺点是运行时丢失类型信息，导致不能实例化类型参数、
不能创建泛型数组、不能用 instanceof 判断泛型类型等限制。
4. 为什么 Java 泛型不支持基本类型？
答：因为类型擦除后泛型参数替换为 Object，而基本类型（int、double 等）不是 Object 的子类
。Java 通过自动装箱/拆箱机制，用包装类（Integer、Double 等）间接支持。
5. List<String> 是 List<Object> 的子类吗？
答：不是。如果允许赋值，就能通过 List<Object> 往 List<String> 里添加非 String 类型，
破坏类型安全。Java 泛型不支持协变
7. 什么是桥方法？
答：桥方法是编译器为了兼容类型擦除而自动生成的方法。当子类实现泛型接口时，接口方法擦除后的签名与子类实现的方法签名不一致，
编译器会生成桥方法来转发调用。可以通过反射 method.isBridge() 判断。
8. 为什么 new T() 和 new T[10] 不行？
答：因为类型擦除后 T 变成 Object 或边界类型，new T() 等价于 new Object()，通常不是期望的行为。
而数组在运行时需要记录元素类型，与擦除机制冲突，所以不能创建泛型数组。
9. 如何获取泛型的实际类型？
答：由于类型擦除，运行时无法直接获取泛型参数。但可以通过定义子类（匿名类），
利用 getGenericSuperclass() 获取父类中的泛型信息。Gson 的 TypeToken 就是基于这个原理
| 问题                                  | 一句话答案                            |
| ----------------------------------- | -------------------------------- |
| 泛型 vs Object                        | 编译期检查 vs 运行期检查                   |
| `List<?>` vs `List<Object>`         | 未知类型只读 vs 任意类型可写                 |
| 类型擦除优缺点                             | 兼容性好，但运行时丢类型信息                   |
| 不支持基本类型                             | 擦除后变 Object，int 不是 Object        |
| `List<String>` 是 `List<Object>` 子类？ | 不是！类型安全                          |
| PECS                                | Producer-Extends, Consumer-Super |
| 桥方法                                 | 编译器生成的兼容方法                       |
| 获取泛型类型                              | 匿名子类 + getGenericSuperclass()    |

 */