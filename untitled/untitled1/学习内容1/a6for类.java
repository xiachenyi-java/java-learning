public class a6for类 {
    public static void main(String[] args) {
        // 打印 1~5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        //System.out.println(i);  // 错误：找不到符号 i
        //原因：变量 i 是在 for 循环的初始化语句中声明的（int i = 1）
        // ，它的作用域仅限于 for 循环体内部。循环结束后，i 就会被销毁，
        // 所以在循环外部访问 i 会导致编译错误。
    }//声明位置	作用域范围	循环后能否访问
     //for (int i = ...)	仅循环体内部	❌ 不能
    //循环外部声明 int i	从声明处到代码块结束	✅ 能
}
/*
for (初始化; 条件判断; 迭代语句) {
    // 循环体
}
     初始化 int i = 1
只在循环开始时执行一次。
作用域仅限于这个 for 循环（出了大括号就失效）。
      条件判断 i <= 5
每次进入循环体之前都会检查。
一旦结果为 false，立即跳出循环。
     迭代语句 i++
每次循环体执行完后立即执行。
可以写成 ++i、i += 2、i-- 等任意合法表达式。
      死循环写法
for (;;) { ... }   // 永远为真
      在循环体里可提前退出
  if (i == 3) break;     // 直接跳出整个 for
 if (i == 2) continue;  // 跳过本次剩余语句，进入下一次循环
     同时定义多个变量
     for (int i = 0, j = 10; i < j; i++, j--) { ... }
     增强型 for（foreach）— 遍历数组/集合
     int[] arr = {7, 8, 9};
for (int value : arr) {把 : 想象成 "从...里面逐个取出"：
    System.out.println(value);
}
 */