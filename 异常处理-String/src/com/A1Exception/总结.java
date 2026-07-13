package com.A1Exception;

/**
 * 夏辰义
 * 2026/5/3017:40
 */
public class 总结 {
}
/*
空指针调方法，越界访数组，转换类型错，格式非数字，算术除零错
| 异常类型                               | 触发场景               | 示例代码                                 | 输出结果        |
| ---------------------------------- | ------------------ | ------------------------------------ | ----------- |
| **NullPointerException**           | 调用 `null` 对象的方法或属性 | `String name = null; name.length();` | `空指针异常`     |
| **ArrayIndexOutOfBoundsException** | 访问数组时索引超出范围        | `int[] a = {1,3,4}; a[3];`           | `数组越界异常`    |
| **ClassCastException**             | 强制类型转换不兼容          | `A b = new B(); C c = (C)b;`         | `类转换异常`     |
| **NumberFormatException**          | 字符串格式不符合数字要求       | `Integer.parseInt("夏辰义");`           | `数字格式异常`    |
| **ArithmeticException**            | 算术运算错误（如除以零）       | `int a = 100 / 0;`                   | `/ by zero` |

 */