package com.AA3project;

public class 房屋出租系统第二版 {
    public static void main(String[] args) {
        new 房屋出租系统().Run();
    }
}
/*
问题一：数组只声明、没创建
错误写法：
java
复制
private String[] Name;  // 只声明了引用，没有分配内存
后果：使用时报 NullPointerException（空指针异常），程序直接崩溃。
正确做法：
java
复制
private String[] Name = new String[100];  // 声明的同时创建数组
核心概念：String[] Name 只是一个"引用"（可以理解为指针），new String[100] 才是真正在内存中开辟空间。没有 new，引用指向空，一用就崩。
问题二：Scanner 的 nextInt() / nextDouble() 和 nextLine() 混用
原因：nextInt() 只读取数字，不会读取数字后面的换行符 \n。这个 \n 留在输入缓冲区里，下一次 nextLine() 直接读到这个 \n，返回一个空字符串。
后果：用户输入电话（数字）后，地址直接变成空字符串，程序好像"跳过了"输入。
正确做法：每次 nextInt() 或 nextDouble() 后，加一行 MyScanner.nextLine(); 把残留的换行符吃掉。
问题三：for 循环条件写 counter + 1
错误写法：
java
复制
for (int j = 0; j < counter + 1; j++)
后果：多遍历一次，访问到还没有数据的数组位置，输出空值或垃圾数据。
正确做法：
java
复制
for (int j = 0; j < counter; j++)  // 只遍历已有数据
核心概念：counter 表示当前已经存了多少条数据，数组下标从 0 到 counter-1，所以条件是 < counter，不是 < counter + 1。
问题四：else 写在循环里面
错误写法：
java
复制
for (...) {
    if (找到) {
        // 处理
    } else {
        System.out.println("没有找到");
        return;  // 第一个不匹配就退出了！
    }
}
后果：
查找时：每查一个不匹配的就输出一次"没有"，重复输出很多次。
删除时：第一个数据不是要删的，直接进 else，后面的数据根本没查，只能删除第一条。
正确做法：else 拿到循环外面。循环里只负责"找"，找到就处理并返回。循环结束后如果还没返回，说明找遍了都没找到，再输出"没有找到"。
问题五：数组前移时漏了某个字段
错误：删除房屋时，只移动了姓名、电话、地址、月租、状态，漏了 ID。
后果：删除后，后面的房屋 ID 还是原来的，列表显示错乱。
正确做法：所有数组都要前移，包括 ID[a] = ID[a + 1]。
问题六：删除时前移循环越界
错误写法：
java
复制
for (int a = j; a < counter + 1; a++) {
    Name[a] = Name[a + 1];  // 当 a = counter 时，a+1 越界！
}
正确做法：
java
复制
for (int a = j; a < counter - 1; a++)  // 只需要移到倒数第二个
问题七：所有房屋 ID 都是 0
错误：
java
复制
ID[counter] = 0;  // 所有房屋ID一样，无法区分
正确做法：
java
复制
ID[counter] = counter + 1;  // 自动生成唯一ID，从1开始
问题八：主菜单只显示一次
错误：Menu() 和 nextInt() 写在 while 循环外面。
后果：用户只能选一次，之后循环里反复执行同一个功能，看不到菜单。
正确做法：把显示菜单和读取选择都放进 while 循环里面，每次循环都重新显示、重新读取。
问题九：无用导入
错误：
java
复制
import javax.lang.model.element.Name;  // 跟程序完全无关
后果：虽然不影响运行，但代码不整洁，而且如果类名冲突会编译报错。
正确做法：删掉，只导入实际用到的类（如 java.util.Scanner）。
问题十：修改时找不到没有提示
错误：修改功能里，如果输入的编号不存在，for 循环跑完什么都不输出，用户不知道是没找到还是成功了。
正确做法：和查找、删除一样，找到后 return，循环外输出"没有找到该房屋"。
核心知识点速查表
表格
知识点	要点
数组	声明后必须 new 创建
Scanner	nextInt() / nextDouble() 后要 nextLine() 清缓冲区
循环边界	遍历 counter 个元素，条件是 < counter
查找/删除逻辑	else 不要放循环里，用循环外判断或提前 return
数组前移	所有相关数组都要移，循环到 counter - 2
唯一ID	用计数器生成，不要固定写死
 */
